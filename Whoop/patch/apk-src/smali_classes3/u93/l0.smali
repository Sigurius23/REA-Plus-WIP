.class public final Lu93/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lr93/k;

.field public b:Lr93/a0;

.field public c:Lr93/r;

.field public d:Lr93/n0;

.field public e:I

.field public f:Llb3/y0;

.field public g:Z

.field public final h:Lr93/q0;

.field public final i:Lva3/h;

.field public final j:Llb3/y;

.field public final synthetic k:Lu93/m0;


# direct methods
.method public constructor <init>(Lu93/m0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu93/l0;->k:Lu93/m0;

    invoke-virtual {p1}, Lu93/o;->g()Lr93/k;

    move-result-object v0

    iput-object v0, p0, Lu93/l0;->a:Lr93/k;

    invoke-virtual {p1}, Lu93/m0;->k()Lr93/a0;

    move-result-object v0

    iput-object v0, p0, Lu93/l0;->b:Lr93/a0;

    invoke-virtual {p1}, Lu93/m0;->getVisibility()Lr93/r;

    move-result-object v0

    iput-object v0, p0, Lu93/l0;->c:Lr93/r;

    const/4 v0, 0x0

    iput-object v0, p0, Lu93/l0;->d:Lr93/n0;

    invoke-virtual {p1}, Lu93/m0;->getKind()I

    move-result v0

    iput v0, p0, Lu93/l0;->e:I

    sget-object v0, Llb3/y0;->a:Llb3/w0;

    iput-object v0, p0, Lu93/l0;->f:Llb3/y0;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu93/l0;->g:Z

    iget-object v0, p1, Lu93/m0;->U:Lr93/q0;

    iput-object v0, p0, Lu93/l0;->h:Lr93/q0;

    invoke-virtual {p1}, Lu93/n;->getName()Lva3/h;

    move-result-object v0

    iput-object v0, p0, Lu93/l0;->i:Lva3/h;

    invoke-virtual {p1}, Lu93/x0;->getType()Llb3/y;

    move-result-object p1

    iput-object p1, p0, Lu93/l0;->j:Llb3/y;

    return-void
.end method

.method public static synthetic a(I)V
    .locals 24

    move/from16 v0, p0

    const/16 v1, 0x11

    const/16 v2, 0x10

    const/16 v3, 0xe

    const/16 v4, 0xd

    const/16 v5, 0x13

    const/16 v6, 0xb

    const/16 v7, 0x9

    const/4 v8, 0x7

    const/4 v9, 0x5

    const/4 v10, 0x3

    const/4 v11, 0x2

    const/4 v12, 0x1

    if-eq v0, v12, :cond_0

    if-eq v0, v11, :cond_0

    if-eq v0, v10, :cond_0

    if-eq v0, v9, :cond_0

    if-eq v0, v8, :cond_0

    if-eq v0, v7, :cond_0

    if-eq v0, v6, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v3, :cond_0

    if-eq v0, v2, :cond_0

    if-eq v0, v1, :cond_0

    const-string v13, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v13, "@NotNull method %s.%s must not return null"

    :goto_0
    if-eq v0, v12, :cond_1

    if-eq v0, v11, :cond_1

    if-eq v0, v10, :cond_1

    if-eq v0, v9, :cond_1

    if-eq v0, v8, :cond_1

    if-eq v0, v7, :cond_1

    if-eq v0, v6, :cond_1

    if-eq v0, v5, :cond_1

    if-eq v0, v4, :cond_1

    if-eq v0, v3, :cond_1

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_1

    move v14, v10

    goto :goto_1

    :cond_1
    move v14, v11

    :goto_1
    new-array v14, v14, [Ljava/lang/Object;

    const-string v15, "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration"

    const/16 v16, 0x0

    packed-switch v0, :pswitch_data_0

    const-string v17, "owner"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_0
    const-string v17, "name"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_1
    const-string v17, "substitution"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_2
    const-string v17, "typeParameters"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_3
    const-string v17, "kind"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_4
    const-string v17, "visibility"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_5
    const-string v17, "modality"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_6
    const-string v17, "type"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_7
    aput-object v15, v14, v16

    :goto_2
    const-string v16, "setOwner"

    const-string v17, "setReturnType"

    const-string v18, "setModality"

    const-string v19, "setVisibility"

    const-string v20, "setKind"

    const-string v21, "setTypeParameters"

    const-string v22, "setSubstitution"

    const-string v23, "setName"

    if-eq v0, v12, :cond_d

    if-eq v0, v11, :cond_c

    if-eq v0, v10, :cond_b

    if-eq v0, v9, :cond_a

    if-eq v0, v8, :cond_9

    if-eq v0, v7, :cond_8

    if-eq v0, v6, :cond_7

    if-eq v0, v5, :cond_6

    if-eq v0, v4, :cond_5

    if-eq v0, v3, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    aput-object v15, v14, v12

    goto :goto_3

    :cond_2
    const-string v15, "setCopyOverrides"

    aput-object v15, v14, v12

    goto :goto_3

    :cond_3
    aput-object v22, v14, v12

    goto :goto_3

    :cond_4
    const-string v15, "setDispatchReceiverParameter"

    aput-object v15, v14, v12

    goto :goto_3

    :cond_5
    aput-object v21, v14, v12

    goto :goto_3

    :cond_6
    aput-object v23, v14, v12

    goto :goto_3

    :cond_7
    aput-object v20, v14, v12

    goto :goto_3

    :cond_8
    aput-object v19, v14, v12

    goto :goto_3

    :cond_9
    aput-object v18, v14, v12

    goto :goto_3

    :cond_a
    aput-object v17, v14, v12

    goto :goto_3

    :cond_b
    const-string v15, "setPreserveSourceElement"

    aput-object v15, v14, v12

    goto :goto_3

    :cond_c
    const-string v15, "setOriginal"

    aput-object v15, v14, v12

    goto :goto_3

    :cond_d
    aput-object v16, v14, v12

    :goto_3
    packed-switch v0, :pswitch_data_1

    aput-object v16, v14, v11

    goto :goto_4

    :pswitch_8
    aput-object v23, v14, v11

    goto :goto_4

    :pswitch_9
    aput-object v22, v14, v11

    goto :goto_4

    :pswitch_a
    aput-object v21, v14, v11

    goto :goto_4

    :pswitch_b
    aput-object v20, v14, v11

    goto :goto_4

    :pswitch_c
    aput-object v19, v14, v11

    goto :goto_4

    :pswitch_d
    aput-object v18, v14, v11

    goto :goto_4

    :pswitch_e
    aput-object v17, v14, v11

    :goto_4
    :pswitch_f
    invoke-static {v13, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    if-eq v0, v12, :cond_e

    if-eq v0, v11, :cond_e

    if-eq v0, v10, :cond_e

    if-eq v0, v9, :cond_e

    if-eq v0, v8, :cond_e

    if-eq v0, v7, :cond_e

    if-eq v0, v6, :cond_e

    if-eq v0, v5, :cond_e

    if-eq v0, v4, :cond_e

    if-eq v0, v3, :cond_e

    if-eq v0, v2, :cond_e

    if-eq v0, v1, :cond_e

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_5
        :pswitch_7
        :pswitch_4
        :pswitch_7
        :pswitch_3
        :pswitch_7
        :pswitch_2
        :pswitch_7
        :pswitch_7
        :pswitch_1
        :pswitch_7
        :pswitch_7
        :pswitch_0
        :pswitch_7
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_e
        :pswitch_f
        :pswitch_d
        :pswitch_f
        :pswitch_c
        :pswitch_f
        :pswitch_b
        :pswitch_f
        :pswitch_a
        :pswitch_f
        :pswitch_f
        :pswitch_9
        :pswitch_f
        :pswitch_f
        :pswitch_8
        :pswitch_f
    .end packed-switch
.end method


# virtual methods
.method public final b()Lu93/m0;
    .locals 19

    move-object/from16 v0, p0

    iget-object v2, v0, Lu93/l0;->a:Lr93/k;

    iget-object v3, v0, Lu93/l0;->b:Lr93/a0;

    iget-object v4, v0, Lu93/l0;->c:Lr93/r;

    iget-object v5, v0, Lu93/l0;->d:Lr93/n0;

    iget v6, v0, Lu93/l0;->e:I

    iget-object v7, v0, Lu93/l0;->i:Lva3/h;

    iget-object v1, v0, Lu93/l0;->k:Lu93/m0;

    invoke-virtual/range {v1 .. v7}, Lu93/m0;->L0(Lr93/k;Lr93/a0;Lr93/r;Lr93/n0;ILva3/h;)Lu93/m0;

    move-result-object v9

    invoke-virtual {v1}, Lu93/m0;->getTypeParameters()Ljava/util/List;

    move-result-object v2

    new-instance v10, Ljava/util/ArrayList;

    move-object v3, v2

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v10, v3}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v3, v0, Lu93/l0;->f:Llb3/y0;

    invoke-static {v2, v3, v9, v10}, Llb3/o;->m(Ljava/util/List;Llb3/y0;Lr93/k;Ljava/util/ArrayList;)Llb3/a1;

    move-result-object v2

    sget-object v3, Llb3/g1;->E:Llb3/g1;

    iget-object v4, v0, Lu93/l0;->j:Llb3/y;

    invoke-virtual {v2, v4, v3}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v3

    const/4 v5, 0x0

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    sget-object v6, Llb3/g1;->z:Llb3/g1;

    invoke-virtual {v2, v4, v6}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v9, v4}, Lu93/m0;->P0(Llb3/y;)V

    :cond_1
    iget-object v4, v0, Lu93/l0;->h:Lr93/q0;

    if-eqz v4, :cond_3

    check-cast v4, Lu93/d;

    invoke-virtual {v4, v2}, Lu93/d;->I0(Llb3/a1;)Lu93/d;

    move-result-object v4

    if-nez v4, :cond_2

    :goto_0
    return-object v5

    :cond_2
    move-object v11, v4

    goto :goto_1

    :cond_3
    move-object v11, v5

    :goto_1
    iget-object v4, v1, Lu93/m0;->V:Lr93/q0;

    if-eqz v4, :cond_5

    check-cast v4, Lu93/d;

    invoke-virtual {v4}, Lu93/d;->getType()Llb3/y;

    move-result-object v7

    invoke-virtual {v2, v7, v6}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v6

    if-nez v6, :cond_4

    move-object v7, v5

    goto :goto_2

    :cond_4
    new-instance v7, Lu93/p0;

    new-instance v8, Lfb3/b;

    invoke-interface {v4}, Lr93/q0;->getValue()Lfb3/d;

    invoke-direct {v8, v9, v6}, Lfb3/b;-><init>(Lr93/b;Llb3/y;)V

    invoke-virtual {v4}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v4

    invoke-direct {v7, v9, v8, v4}, Lu93/p0;-><init>(Lr93/k;La2/a;Ls93/i;)V

    :goto_2
    move-object v12, v7

    goto :goto_3

    :cond_5
    move-object v12, v5

    :goto_3
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, v1, Lu93/m0;->T:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr93/q0;

    check-cast v6, Lu93/d;

    invoke-virtual {v6}, Lu93/d;->getType()Llb3/y;

    move-result-object v7

    sget-object v8, Llb3/g1;->z:Llb3/g1;

    invoke-virtual {v2, v7, v8}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v7

    if-nez v7, :cond_7

    move-object v8, v5

    goto :goto_5

    :cond_7
    new-instance v8, Lu93/p0;

    new-instance v14, Lfb3/a;

    invoke-interface {v6}, Lr93/q0;->getValue()Lfb3/d;

    move-result-object v15

    check-cast v15, Lfb3/a;

    invoke-virtual {v15}, Lfb3/a;->Q()Lva3/h;

    move-result-object v15

    invoke-interface {v6}, Lr93/q0;->getValue()Lfb3/d;

    invoke-direct {v14, v9, v7, v15}, Lfb3/a;-><init>(Lr93/b;Llb3/y;Lva3/h;)V

    invoke-virtual {v6}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v6

    invoke-direct {v8, v9, v14, v6}, Lu93/p0;-><init>(Lr93/k;La2/a;Ls93/i;)V

    :goto_5
    if-eqz v8, :cond_6

    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    move-object v8, v9

    move-object v9, v3

    invoke-virtual/range {v8 .. v13}, Lu93/m0;->Q0(Llb3/y;Ljava/util/List;Lr93/q0;Lu93/p0;Ljava/util/List;)V

    move-object v9, v8

    iget-object v3, v1, Lu93/m0;->X:Lu93/n0;

    const/4 v4, 0x2

    sget-object v18, Lr93/s0;->q:Lr93/v0;

    if-nez v3, :cond_9

    move-object v3, v5

    goto :goto_8

    :cond_9
    new-instance v8, Lu93/n0;

    invoke-virtual {v3}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v10

    iget-object v11, v0, Lu93/l0;->b:Lr93/a0;

    iget-object v3, v1, Lu93/m0;->X:Lu93/n0;

    invoke-virtual {v3}, Lu93/k0;->getVisibility()Lr93/r;

    move-result-object v3

    iget v6, v0, Lu93/l0;->e:I

    if-ne v6, v4, :cond_a

    move-object v6, v3

    check-cast v6, Lr93/o;

    iget-object v6, v6, Lr93/o;->a:Lr93/m1;

    invoke-virtual {v6}, Lr93/m1;->c()Lr93/m1;

    move-result-object v6

    invoke-static {v6}, Lr93/q;->g(Lr93/m1;)Lr93/r;

    move-result-object v6

    invoke-static {v6}, Lr93/q;->e(Lr93/r;)Z

    move-result v6

    if-eqz v6, :cond_a

    sget-object v3, Lr93/q;->h:Lr93/p;

    :cond_a
    move-object v12, v3

    iget-object v3, v1, Lu93/m0;->X:Lu93/n0;

    iget-boolean v13, v3, Lu93/k0;->F:Z

    iget-boolean v14, v3, Lu93/k0;->G:Z

    iget-boolean v15, v3, Lu93/k0;->J:Z

    iget v3, v0, Lu93/l0;->e:I

    iget-object v6, v0, Lu93/l0;->d:Lr93/n0;

    if-nez v6, :cond_b

    move-object/from16 v17, v5

    :goto_6
    move/from16 v16, v3

    goto :goto_7

    :cond_b
    invoke-interface {v6}, Lr93/n0;->getGetter()Lu93/n0;

    move-result-object v6

    move-object/from16 v17, v6

    goto :goto_6

    :goto_7
    invoke-direct/range {v8 .. v18}, Lu93/n0;-><init>(Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZZZILr93/o0;Lr93/s0;)V

    move-object v3, v8

    :goto_8
    if-eqz v3, :cond_d

    iget-object v6, v1, Lu93/m0;->X:Lu93/n0;

    iget-object v7, v6, Lu93/n0;->N:Llb3/y;

    invoke-static {v2, v6}, Lu93/m0;->M0(Llb3/a1;Lr93/m0;)Lr93/w;

    move-result-object v6

    iput-object v6, v3, Lu93/k0;->M:Lr93/w;

    if-eqz v7, :cond_c

    sget-object v6, Llb3/g1;->E:Llb3/g1;

    invoke-virtual {v2, v7, v6}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v6

    goto :goto_9

    :cond_c
    move-object v6, v5

    :goto_9
    invoke-virtual {v3, v6}, Lu93/n0;->M0(Llb3/y;)V

    :cond_d
    iget-object v6, v1, Lu93/m0;->Y:Lr93/p0;

    if-nez v6, :cond_e

    move-object v11, v5

    goto :goto_c

    :cond_e
    new-instance v8, Lu93/o0;

    check-cast v6, Lal/a;

    invoke-virtual {v6}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v10

    iget-object v11, v0, Lu93/l0;->b:Lr93/a0;

    iget-object v6, v1, Lu93/m0;->Y:Lr93/p0;

    check-cast v6, Lu93/k0;

    invoke-virtual {v6}, Lu93/k0;->getVisibility()Lr93/r;

    move-result-object v6

    iget v7, v0, Lu93/l0;->e:I

    if-ne v7, v4, :cond_f

    move-object v4, v6

    check-cast v4, Lr93/o;

    iget-object v4, v4, Lr93/o;->a:Lr93/m1;

    invoke-virtual {v4}, Lr93/m1;->c()Lr93/m1;

    move-result-object v4

    invoke-static {v4}, Lr93/q;->g(Lr93/m1;)Lr93/r;

    move-result-object v4

    invoke-static {v4}, Lr93/q;->e(Lr93/r;)Z

    move-result v4

    if-eqz v4, :cond_f

    sget-object v6, Lr93/q;->h:Lr93/p;

    :cond_f
    move-object v12, v6

    iget-object v4, v1, Lu93/m0;->Y:Lr93/p0;

    check-cast v4, Lu93/k0;

    iget-boolean v13, v4, Lu93/k0;->F:Z

    iget-boolean v14, v4, Lu93/k0;->G:Z

    iget-boolean v15, v4, Lu93/k0;->J:Z

    iget v4, v0, Lu93/l0;->e:I

    iget-object v6, v0, Lu93/l0;->d:Lr93/n0;

    if-nez v6, :cond_10

    move-object/from16 v17, v5

    :goto_a
    move/from16 v16, v4

    goto :goto_b

    :cond_10
    invoke-interface {v6}, Lr93/n0;->getSetter()Lr93/p0;

    move-result-object v6

    move-object/from16 v17, v6

    goto :goto_a

    :goto_b
    invoke-direct/range {v8 .. v18}, Lu93/o0;-><init>(Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZZZILr93/p0;Lr93/s0;)V

    move-object v11, v8

    :goto_c
    if-eqz v11, :cond_14

    iget-object v4, v1, Lu93/m0;->Y:Lr93/p0;

    check-cast v4, Lu93/o0;

    invoke-virtual {v4}, Lu93/o0;->v()Ljava/util/List;

    move-result-object v12

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-object v13, v2

    invoke-static/range {v11 .. v16}, Lu93/x;->N0(Lr93/w;Ljava/util/List;Llb3/a1;ZZ[Z)Ljava/util/ArrayList;

    move-result-object v2

    const/4 v4, 0x0

    if-nez v2, :cond_11

    iget-object v2, v0, Lu93/l0;->a:Lr93/k;

    invoke-static {v2}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object v2

    invoke-virtual {v2}, Lo93/h;->o()Llb3/c0;

    move-result-object v2

    iget-object v6, v1, Lu93/m0;->Y:Lr93/p0;

    check-cast v6, Lu93/o0;

    invoke-virtual {v6}, Lu93/o0;->v()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lr93/a1;

    check-cast v6, Lal/a;

    invoke-virtual {v6}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v6

    invoke-static {v11, v2, v6}, Lu93/o0;->L0(Lu93/o0;Llb3/y;Ls93/i;)Lu93/w0;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    :cond_11
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_13

    iget-object v6, v1, Lu93/m0;->Y:Lr93/p0;

    invoke-static {v13, v6}, Lu93/m0;->M0(Llb3/a1;Lr93/m0;)Lr93/w;

    move-result-object v6

    iput-object v6, v11, Lu93/k0;->M:Lr93/w;

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr93/a1;

    if-eqz v2, :cond_12

    iput-object v2, v11, Lu93/o0;->N:Lr93/a1;

    goto :goto_d

    :cond_12
    const/4 v1, 0x6

    invoke-static {v1}, Lu93/o0;->r0(I)V

    throw v5

    :cond_13
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :cond_14
    move-object v13, v2

    :goto_d
    iget-object v2, v1, Lu93/m0;->Z:Lu93/v;

    if-nez v2, :cond_15

    move-object v4, v5

    goto :goto_e

    :cond_15
    new-instance v4, Lu93/v;

    invoke-virtual {v2}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v2

    invoke-direct {v4, v2, v9}, Lu93/v;-><init>(Ls93/i;Lu93/m0;)V

    :goto_e
    iget-object v2, v1, Lu93/m0;->a0:Lu93/v;

    if-nez v2, :cond_16

    goto :goto_f

    :cond_16
    new-instance v5, Lu93/v;

    invoke-virtual {v2}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v2

    invoke-direct {v5, v2, v9}, Lu93/v;-><init>(Ls93/i;Lu93/m0;)V

    :goto_f
    invoke-virtual {v9, v3, v11, v4, v5}, Lu93/m0;->N0(Lu93/n0;Lu93/o0;Lu93/v;Lu93/v;)V

    iget-boolean v2, v0, Lu93/l0;->g:Z

    if-eqz v2, :cond_18

    sget v2, Lub3/h;->y:I

    invoke-static {}, Lub3/j;->c()Lub3/h;

    move-result-object v2

    invoke-virtual {v1}, Lu93/m0;->h()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr93/n0;

    invoke-interface {v4, v13}, Lr93/n0;->d(Llb3/a1;)Lr93/n0;

    move-result-object v4

    invoke-virtual {v2, v4}, Lub3/h;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_17
    iput-object v2, v9, Lu93/m0;->L:Ljava/util/Collection;

    :cond_18
    invoke-virtual {v1}, Lu93/m0;->isConst()Z

    move-result v2

    if-eqz v2, :cond_19

    iget-object v2, v1, Lu93/m0;->I:Lc93/a;

    if-eqz v2, :cond_19

    iget-object v1, v1, Lu93/m0;->H:Lkb3/h;

    invoke-virtual {v9, v1, v2}, Lu93/m0;->O0(Lkb3/h;Lc93/a;)V

    :cond_19
    return-object v9
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu93/l0;->g:Z

    return-void
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lu93/l0;->e:I

    return-void
.end method

.method public final e(Lr93/a0;)V
    .locals 0

    iput-object p1, p0, Lu93/l0;->b:Lr93/a0;

    return-void
.end method

.method public final f(Lr93/n0;)V
    .locals 0

    iput-object p1, p0, Lu93/l0;->d:Lr93/n0;

    return-void
.end method

.method public final g(Lr93/k;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lu93/l0;->a:Lr93/k;

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, Lu93/l0;->a(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final h(Llb3/y0;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lu93/l0;->f:Llb3/y0;

    return-void

    :cond_0
    const/16 p1, 0xf

    invoke-static {p1}, Lu93/l0;->a(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final i(Lr93/r;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lu93/l0;->c:Lr93/r;

    return-void

    :cond_0
    const/16 p1, 0x8

    invoke-static {p1}, Lu93/l0;->a(I)V

    const/4 p1, 0x0

    throw p1
.end method
