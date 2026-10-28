.class public abstract Lu93/x;
.super Lu93/o;
.source "SourceFile"

# interfaces
.implements Lr93/w;


# instance fields
.field public F:Ljava/util/List;

.field public G:Ljava/util/List;

.field public H:Llb3/y;

.field public I:Ljava/util/List;

.field public J:Lr93/q0;

.field public K:Lr93/q0;

.field public L:Lr93/a0;

.field public M:Lr93/r;

.field public N:Z

.field public O:Z

.field public P:Z

.field public Q:Z

.field public R:Z

.field public S:Z

.field public T:Z

.field public U:Z

.field public V:Z

.field public W:Z

.field public X:Z

.field public Y:Ljava/util/Collection;

.field public volatile Z:Lce/d;

.field public final a0:Lr93/w;

.field public final b0:I

.field public c0:Lr93/w;

.field public d0:Ljava/util/Map;


# direct methods
.method public constructor <init>(ILr93/k;Lr93/w;Lr93/s0;Ls93/i;Lva3/h;)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p2, :cond_5

    const/4 v2, 0x1

    if-eqz p5, :cond_4

    if-eqz p6, :cond_3

    if-eqz p1, :cond_2

    if-eqz p4, :cond_1

    invoke-direct {p0, p2, p5, p6, p4}, Lu93/o;-><init>(Lr93/k;Ls93/i;Lva3/h;Lr93/s0;)V

    sget-object p2, Lr93/q;->i:Lr93/p;

    iput-object p2, p0, Lu93/x;->M:Lr93/r;

    iput-boolean v1, p0, Lu93/x;->N:Z

    iput-boolean v1, p0, Lu93/x;->O:Z

    iput-boolean v1, p0, Lu93/x;->P:Z

    iput-boolean v1, p0, Lu93/x;->Q:Z

    iput-boolean v1, p0, Lu93/x;->R:Z

    iput-boolean v1, p0, Lu93/x;->S:Z

    iput-boolean v1, p0, Lu93/x;->T:Z

    iput-boolean v1, p0, Lu93/x;->U:Z

    iput-boolean v1, p0, Lu93/x;->V:Z

    iput-boolean v2, p0, Lu93/x;->W:Z

    iput-boolean v1, p0, Lu93/x;->X:Z

    iput-object v0, p0, Lu93/x;->Y:Ljava/util/Collection;

    iput-object v0, p0, Lu93/x;->Z:Lce/d;

    iput-object v0, p0, Lu93/x;->c0:Lr93/w;

    iput-object v0, p0, Lu93/x;->d0:Ljava/util/Map;

    if-nez p3, :cond_0

    move-object p3, p0

    :cond_0
    iput-object p3, p0, Lu93/x;->a0:Lr93/w;

    iput p1, p0, Lu93/x;->b0:I

    return-void

    :cond_1
    const/4 p1, 0x4

    invoke-static {p1}, Lu93/x;->r0(I)V

    throw v0

    :cond_2
    const/4 p1, 0x3

    invoke-static {p1}, Lu93/x;->r0(I)V

    throw v0

    :cond_3
    const/4 p1, 0x2

    invoke-static {p1}, Lu93/x;->r0(I)V

    throw v0

    :cond_4
    invoke-static {v2}, Lu93/x;->r0(I)V

    throw v0

    :cond_5
    invoke-static {v1}, Lu93/x;->r0(I)V

    throw v0
.end method

.method public static N0(Lr93/w;Ljava/util/List;Llb3/a1;ZZ[Z)Ljava/util/ArrayList;
    .locals 21

    move-object/from16 v0, p2

    const/4 v1, 0x0

    if-eqz p1, :cond_9

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr93/a1;

    move-object v5, v4

    check-cast v5, Lu93/x0;

    invoke-virtual {v5}, Lu93/x0;->getType()Llb3/y;

    move-result-object v6

    sget-object v7, Llb3/g1;->z:Llb3/g1;

    invoke-virtual {v0, v6, v7}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v14

    move-object v6, v4

    check-cast v6, Lu93/w0;

    iget-object v8, v6, Lu93/w0;->K:Llb3/y;

    if-nez v8, :cond_0

    move-object v7, v1

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v8, v7}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v7

    :goto_1
    if-nez v14, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {v5}, Lu93/x0;->getType()Llb3/y;

    move-result-object v5

    if-ne v14, v5, :cond_2

    if-eq v8, v7, :cond_3

    :cond_2
    if-eqz p5, :cond_3

    const/4 v5, 0x0

    const/4 v8, 0x1

    aput-boolean v8, p5, v5

    :cond_3
    instance-of v5, v4, Lu93/v0;

    if-eqz v5, :cond_4

    move-object v5, v4

    check-cast v5, Lu93/v0;

    iget-object v5, v5, Lu93/v0;->M:Ll83/p;

    invoke-virtual {v5}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    new-instance v8, Lna3/a;

    invoke-direct {v8, v5}, Lna3/a;-><init>(Ljava/util/List;)V

    move-object/from16 v20, v8

    goto :goto_2

    :cond_4
    move-object/from16 v20, v1

    :goto_2
    if-eqz p3, :cond_5

    move-object v10, v1

    goto :goto_3

    :cond_5
    move-object v10, v4

    :goto_3
    iget v11, v6, Lu93/w0;->G:I

    move-object v5, v4

    check-cast v5, Lal/a;

    invoke-virtual {v5}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v12

    move-object v5, v4

    check-cast v5, Lu93/n;

    invoke-virtual {v5}, Lu93/n;->getName()Lva3/h;

    move-result-object v13

    invoke-virtual {v6}, Lu93/w0;->J0()Z

    move-result v15

    iget-boolean v5, v6, Lu93/w0;->I:Z

    iget-boolean v6, v6, Lu93/w0;->J:Z

    if-eqz p4, :cond_6

    check-cast v4, Lu93/o;

    invoke-virtual {v4}, Lu93/o;->getSource()Lr93/s0;

    move-result-object v4

    goto :goto_4

    :cond_6
    sget-object v4, Lr93/s0;->q:Lr93/v0;

    :goto_4
    const-string v8, "annotations"

    invoke-static {v12, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "name"

    invoke-static {v13, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "source"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v20, :cond_7

    new-instance v8, Lu93/w0;

    move-object/from16 v9, p0

    move-object/from16 v19, v4

    move/from16 v16, v5

    move/from16 v17, v6

    move-object/from16 v18, v7

    invoke-direct/range {v8 .. v19}, Lu93/w0;-><init>(Lr93/b;Lr93/a1;ILs93/i;Lva3/h;Llb3/y;ZZZLlb3/y;Lr93/s0;)V

    goto :goto_5

    :cond_7
    move-object/from16 v19, v4

    move/from16 v16, v5

    move/from16 v17, v6

    move-object/from16 v18, v7

    new-instance v8, Lu93/v0;

    move-object/from16 v9, p0

    invoke-direct/range {v8 .. v20}, Lu93/v0;-><init>(Lr93/b;Lr93/a1;ILs93/i;Lva3/h;Llb3/y;ZZZLlb3/y;Lr93/s0;Lc93/a;)V

    :goto_5
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_8
    return-object v2

    :cond_9
    const/16 v0, 0x1e

    invoke-static {v0}, Lu93/x;->r0(I)V

    throw v1
.end method

.method public static synthetic r0(I)V
    .locals 7

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :pswitch_1
    const-string v0, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v1, 0x2

    packed-switch p0, :pswitch_data_1

    :pswitch_2
    const/4 v2, 0x3

    goto :goto_1

    :pswitch_3
    move v2, v1

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl"

    const/4 v4, 0x0

    packed-switch p0, :pswitch_data_2

    const-string v5, "containingDeclaration"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_4
    const-string v5, "configuration"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_5
    const-string v5, "substitutor"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_6
    const-string v5, "originalSubstitutor"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_7
    const-string v5, "overriddenDescriptors"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_8
    const-string v5, "extensionReceiverParameter"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_9
    const-string v5, "unsubstitutedReturnType"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_a
    aput-object v3, v2, v4

    goto :goto_2

    :pswitch_b
    const-string v5, "visibility"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_c
    const-string v5, "unsubstitutedValueParameters"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_d
    const-string v5, "typeParameters"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_e
    const-string v5, "contextReceiverParameters"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_f
    const-string v5, "source"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_10
    const-string v5, "kind"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_11
    const-string v5, "name"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_12
    const-string v5, "annotations"

    aput-object v5, v2, v4

    :goto_2
    const-string v4, "initialize"

    const-string v5, "newCopyBuilder"

    const/4 v6, 0x1

    packed-switch p0, :pswitch_data_3

    :pswitch_13
    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_14
    const-string v3, "getSourceToUseForCopy"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_15
    const-string v3, "copy"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_16
    aput-object v5, v2, v6

    goto :goto_3

    :pswitch_17
    const-string v3, "getKind"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_18
    const-string v3, "getOriginal"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_19
    const-string v3, "getValueParameters"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1a
    const-string v3, "getTypeParameters"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1b
    const-string v3, "getVisibility"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1c
    const-string v3, "getModality"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1d
    const-string v3, "getOverriddenDescriptors"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1e
    const-string v3, "getContextReceiverParameters"

    aput-object v3, v2, v6

    goto :goto_3

    :pswitch_1f
    aput-object v4, v2, v6

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v3, "<init>"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_20
    const-string v3, "getSubstitutedValueParameters"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_21
    const-string v3, "doSubstitute"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_22
    aput-object v5, v2, v1

    goto :goto_4

    :pswitch_23
    const-string v3, "substitute"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_24
    const-string v3, "setOverriddenDescriptors"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_25
    const-string v3, "setExtensionReceiverParameter"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_26
    const-string v3, "setReturnType"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_27
    const-string v3, "setVisibility"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_28
    aput-object v4, v2, v1

    :goto_4
    :pswitch_29
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    packed-switch p0, :pswitch_data_5

    :pswitch_2a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :pswitch_2b
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x9
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_b
        :pswitch_9
        :pswitch_8
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_7
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_6
        :pswitch_a
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_a
        :pswitch_c
        :pswitch_5
        :pswitch_c
        :pswitch_5
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x9
        :pswitch_1f
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_13
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_13
        :pswitch_16
        :pswitch_13
        :pswitch_13
        :pswitch_15
        :pswitch_14
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x5
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_29
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_29
        :pswitch_29
        :pswitch_29
        :pswitch_29
        :pswitch_24
        :pswitch_29
        :pswitch_29
        :pswitch_29
        :pswitch_29
        :pswitch_23
        :pswitch_29
        :pswitch_22
        :pswitch_21
        :pswitch_29
        :pswitch_29
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x9
        :pswitch_2b
        :pswitch_2a
        :pswitch_2a
        :pswitch_2a
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2a
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2a
        :pswitch_2b
        :pswitch_2a
        :pswitch_2a
        :pswitch_2b
        :pswitch_2b
    .end packed-switch
.end method


# virtual methods
.method public final B()Lr93/q0;
    .locals 1

    iget-object v0, p0, Lu93/x;->J:Lr93/q0;

    return-object v0
.end method

.method public final J0(Lr93/k;Lr93/a0;Lr93/r;)Lr93/w;
    .locals 1

    invoke-virtual {p0}, Lu93/x;->l0()Lr93/v;

    move-result-object v0

    invoke-interface {v0, p1}, Lr93/v;->l(Lr93/k;)Lr93/v;

    move-result-object p1

    invoke-interface {p1, p2}, Lr93/v;->p(Lr93/a0;)Lr93/v;

    move-result-object p1

    invoke-interface {p1, p3}, Lr93/v;->w(Lr93/r;)Lr93/v;

    move-result-object p1

    const/4 p2, 0x2

    invoke-interface {p1, p2}, Lr93/v;->f(I)Lr93/v;

    move-result-object p1

    invoke-interface {p1}, Lr93/v;->h()Lr93/v;

    move-result-object p1

    invoke-interface {p1}, Lr93/v;->build()Lr93/w;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const/16 p1, 0x1a

    invoke-static {p1}, Lu93/x;->r0(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public K0(Lr93/k;Lr93/a0;Lr93/r;)Lu93/q0;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lu93/x;->J0(Lr93/k;Lr93/a0;Lr93/r;)Lr93/w;

    move-result-object p1

    check-cast p1, Lu93/q0;

    return-object p1
.end method

.method public final L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract L0(ILr93/k;Lr93/w;Lr93/s0;Ls93/i;Lva3/h;)Lu93/x;
.end method

.method public M0(Lu93/w;)Lu93/x;
    .locals 20

    move-object/from16 v7, p1

    const/4 v8, 0x1

    new-array v9, v8, [Z

    iget-object v0, v7, Lu93/w;->S:Ls93/i;

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p0}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v0

    iget-object v1, v7, Lu93/w;->S:Ls93/i;

    invoke-static {v0, v1}, Ls93/k;->d(Ls93/i;Ls93/i;)Ls93/i;

    move-result-object v0

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object v2, v7, Lu93/w;->x:Lr93/k;

    iget-object v3, v7, Lu93/w;->E:Lr93/w;

    iget v1, v7, Lu93/w;->F:I

    iget-object v6, v7, Lu93/w;->L:Lva3/h;

    iget-boolean v0, v7, Lu93/w;->O:Z

    if-eqz v0, :cond_2

    if-eqz v3, :cond_1

    move-object v0, v3

    goto :goto_2

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lu93/x;->a()Lr93/w;

    move-result-object v0

    :goto_2
    check-cast v0, Lu93/o;

    invoke-virtual {v0}, Lu93/o;->getSource()Lr93/s0;

    move-result-object v0

    :goto_3
    move-object v4, v0

    goto :goto_4

    :cond_2
    sget-object v0, Lr93/s0;->q:Lr93/v0;

    goto :goto_3

    :goto_4
    const/4 v10, 0x0

    if-eqz v4, :cond_1e

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Lu93/x;->L0(ILr93/k;Lr93/w;Lr93/s0;Ls93/i;Lva3/h;)Lu93/x;

    move-result-object v11

    move-object v6, v0

    iget-object v0, v7, Lu93/w;->R:Lm83/y;

    if-nez v0, :cond_3

    invoke-virtual {v6}, Lu93/x;->getTypeParameters()Ljava/util/List;

    move-result-object v0

    :cond_3
    const/4 v12, 0x0

    aget-boolean v1, v9, v12

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v8

    or-int/2addr v1, v2

    aput-boolean v1, v9, v12

    new-instance v15, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, v7, Lu93/w;->w:Llb3/y0;

    invoke-static {v0, v1, v11, v15, v9}, Llb3/o;->n(Ljava/util/List;Llb3/y0;Lr93/k;Ljava/util/List;[Z)Llb3/a1;

    move-result-object v2

    if-nez v2, :cond_4

    goto/16 :goto_b

    :cond_4
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, v7, Lu93/w;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, v7, Lu93/w;->H:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v1, v12

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr93/q0;

    check-cast v3, Lu93/d;

    invoke-virtual {v3}, Lu93/d;->getType()Llb3/y;

    move-result-object v4

    sget-object v5, Llb3/g1;->z:Llb3/g1;

    invoke-virtual {v2, v4, v5}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v4

    if-nez v4, :cond_5

    goto/16 :goto_b

    :cond_5
    invoke-interface {v3}, Lr93/q0;->getValue()Lfb3/d;

    move-result-object v5

    check-cast v5, Lfb3/a;

    invoke-virtual {v5}, Lfb3/a;->Q()Lva3/h;

    move-result-object v5

    invoke-virtual {v3}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v13

    add-int/lit8 v16, v1, 0x1

    invoke-static {v11, v4, v5, v13, v1}, Lya3/p;->d(Lr93/b;Llb3/y;Lva3/h;Ls93/i;I)Lu93/p0;

    move-result-object v1

    invoke-virtual {v14, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    aget-boolean v1, v9, v12

    invoke-virtual {v3}, Lu93/d;->getType()Llb3/y;

    move-result-object v3

    if-eq v4, v3, :cond_6

    move v3, v8

    goto :goto_6

    :cond_6
    move v3, v12

    :goto_6
    or-int/2addr v1, v3

    aput-boolean v1, v9, v12

    move/from16 v1, v16

    goto :goto_5

    :cond_7
    iget-object v0, v7, Lu93/w;->I:Lr93/q0;

    if-eqz v0, :cond_a

    check-cast v0, Lu93/d;

    invoke-virtual {v0}, Lu93/d;->getType()Llb3/y;

    move-result-object v0

    sget-object v1, Llb3/g1;->z:Llb3/g1;

    invoke-virtual {v2, v0, v1}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v0

    if-nez v0, :cond_8

    goto/16 :goto_b

    :cond_8
    new-instance v1, Lu93/p0;

    new-instance v3, Lfb3/b;

    iget-object v4, v7, Lu93/w;->I:Lr93/q0;

    invoke-interface {v4}, Lr93/q0;->getValue()Lfb3/d;

    invoke-direct {v3, v11, v0}, Lfb3/b;-><init>(Lr93/b;Llb3/y;)V

    iget-object v4, v7, Lu93/w;->I:Lr93/q0;

    check-cast v4, Lal/a;

    invoke-virtual {v4}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v4

    invoke-direct {v1, v11, v3, v4}, Lu93/p0;-><init>(Lr93/k;La2/a;Ls93/i;)V

    aget-boolean v3, v9, v12

    iget-object v4, v7, Lu93/w;->I:Lr93/q0;

    check-cast v4, Lu93/d;

    invoke-virtual {v4}, Lu93/d;->getType()Llb3/y;

    move-result-object v4

    if-eq v0, v4, :cond_9

    move v0, v8

    goto :goto_7

    :cond_9
    move v0, v12

    :goto_7
    or-int/2addr v0, v3

    aput-boolean v0, v9, v12

    move v13, v12

    move-object v12, v1

    goto :goto_8

    :cond_a
    move v13, v12

    move-object v12, v10

    :goto_8
    iget-object v0, v7, Lu93/w;->J:Lr93/q0;

    if-eqz v0, :cond_d

    check-cast v0, Lu93/d;

    invoke-virtual {v0, v2}, Lu93/d;->I0(Llb3/a1;)Lu93/d;

    move-result-object v0

    if-nez v0, :cond_b

    goto :goto_b

    :cond_b
    aget-boolean v1, v9, v13

    iget-object v3, v7, Lu93/w;->J:Lr93/q0;

    if-eq v0, v3, :cond_c

    move v3, v8

    goto :goto_9

    :cond_c
    move v3, v13

    :goto_9
    or-int/2addr v1, v3

    aput-boolean v1, v9, v13

    move/from16 v16, v13

    move-object v13, v0

    goto :goto_a

    :cond_d
    move/from16 v16, v13

    move-object v13, v10

    :goto_a
    iget-object v1, v7, Lu93/w;->G:Ljava/util/List;

    iget-boolean v3, v7, Lu93/w;->P:Z

    iget-boolean v4, v7, Lu93/w;->O:Z

    move-object v5, v9

    move-object v0, v11

    invoke-static/range {v0 .. v5}, Lu93/x;->N0(Lr93/w;Ljava/util/List;Llb3/a1;ZZ[Z)Ljava/util/ArrayList;

    move-result-object v1

    if-nez v1, :cond_e

    goto :goto_b

    :cond_e
    iget-object v3, v7, Lu93/w;->K:Llb3/y;

    sget-object v4, Llb3/g1;->E:Llb3/g1;

    invoke-virtual {v2, v3, v4}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v3

    if-nez v3, :cond_f

    :goto_b
    return-object v10

    :cond_f
    aget-boolean v4, v5, v16

    iget-object v9, v7, Lu93/w;->K:Llb3/y;

    if-eq v3, v9, :cond_10

    move v9, v8

    goto :goto_c

    :cond_10
    move/from16 v9, v16

    :goto_c
    or-int/2addr v4, v9

    aput-boolean v4, v5, v16

    if-nez v4, :cond_11

    iget-boolean v4, v7, Lu93/w;->W:Z

    if-eqz v4, :cond_11

    return-object v6

    :cond_11
    iget-object v4, v7, Lu93/w;->y:Lr93/a0;

    iget-object v5, v7, Lu93/w;->z:Lr93/r;

    move-object v11, v0

    move-object/from16 v16, v1

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    invoke-virtual/range {v11 .. v19}, Lu93/x;->O0(Lr93/q0;Lr93/q0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Llb3/y;Lr93/a0;Lr93/r;)V

    iget-boolean v1, v6, Lu93/x;->N:Z

    iput-boolean v1, v0, Lu93/x;->N:Z

    iget-boolean v1, v6, Lu93/x;->O:Z

    iput-boolean v1, v0, Lu93/x;->O:Z

    iget-boolean v1, v6, Lu93/x;->P:Z

    iput-boolean v1, v0, Lu93/x;->P:Z

    iget-boolean v1, v6, Lu93/x;->Q:Z

    iput-boolean v1, v0, Lu93/x;->Q:Z

    iget-boolean v1, v6, Lu93/x;->R:Z

    iput-boolean v1, v0, Lu93/x;->R:Z

    iget-boolean v1, v6, Lu93/x;->V:Z

    iput-boolean v1, v0, Lu93/x;->V:Z

    iget-boolean v1, v6, Lu93/x;->S:Z

    iput-boolean v1, v0, Lu93/x;->S:Z

    iget-boolean v1, v6, Lu93/x;->W:Z

    invoke-virtual {v0, v1}, Lu93/x;->R0(Z)V

    iget-boolean v1, v7, Lu93/w;->Q:Z

    iput-boolean v1, v0, Lu93/x;->T:Z

    iget-boolean v1, v7, Lu93/w;->T:Z

    iput-boolean v1, v0, Lu93/x;->U:Z

    iget-object v1, v7, Lu93/w;->V:Ljava/lang/Boolean;

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_d

    :cond_12
    iget-boolean v1, v6, Lu93/x;->X:Z

    :goto_d
    invoke-virtual {v0, v1}, Lu93/x;->S0(Z)V

    iget-object v1, v7, Lu93/w;->U:Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_13

    iget-object v1, v6, Lu93/x;->d0:Ljava/util/Map;

    if-eqz v1, :cond_17

    :cond_13
    iget-object v1, v7, Lu93/w;->U:Ljava/util/LinkedHashMap;

    iget-object v3, v6, Lu93/x;->d0:Ljava/util/Map;

    if-eqz v3, :cond_15

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_14
    :goto_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v1, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_14

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_e

    :cond_15
    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v3

    if-ne v3, v8, :cond_16

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, v0, Lu93/x;->d0:Ljava/util/Map;

    goto :goto_f

    :cond_16
    iput-object v1, v0, Lu93/x;->d0:Ljava/util/Map;

    :cond_17
    :goto_f
    iget-boolean v1, v7, Lu93/w;->N:Z

    if-nez v1, :cond_18

    iget-object v1, v6, Lu93/x;->c0:Lr93/w;

    if-eqz v1, :cond_1a

    :cond_18
    iget-object v1, v6, Lu93/x;->c0:Lr93/w;

    if-eqz v1, :cond_19

    goto :goto_10

    :cond_19
    move-object v1, v6

    :goto_10
    invoke-interface {v1, v2}, Lr93/w;->d(Llb3/a1;)Lr93/w;

    move-result-object v1

    iput-object v1, v0, Lu93/x;->c0:Lr93/w;

    :cond_1a
    iget-boolean v1, v7, Lu93/w;->M:Z

    if-eqz v1, :cond_1d

    invoke-virtual {v6}, Lu93/x;->a()Lr93/w;

    move-result-object v1

    invoke-interface {v1}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1d

    iget-object v1, v7, Lu93/w;->w:Llb3/y0;

    invoke-virtual {v1}, Llb3/y0;->e()Z

    move-result v1

    if-eqz v1, :cond_1c

    iget-object v1, v6, Lu93/x;->Z:Lce/d;

    if-eqz v1, :cond_1b

    iput-object v1, v0, Lu93/x;->Z:Lce/d;

    return-object v0

    :cond_1b
    invoke-virtual {v6}, Lu93/x;->h()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Lu93/x;->g0(Ljava/util/Collection;)V

    return-object v0

    :cond_1c
    new-instance v1, Lce/d;

    invoke-direct {v1, v6, v2}, Lce/d;-><init>(Lu93/x;Llb3/a1;)V

    iput-object v1, v0, Lu93/x;->Z:Lce/d;

    :cond_1d
    return-object v0

    :cond_1e
    move-object/from16 v6, p0

    const/16 v0, 0x1b

    invoke-static {v0}, Lu93/x;->r0(I)V

    throw v10
.end method

.method public O0(Lr93/q0;Lr93/q0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Llb3/y;Lr93/a0;Lr93/r;)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p3, :cond_7

    if-eqz p4, :cond_6

    if-eqz p5, :cond_5

    if-eqz p8, :cond_4

    invoke-static {p4}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lu93/x;->F:Ljava/util/List;

    invoke-static {p5}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lu93/x;->G:Ljava/util/List;

    iput-object p6, p0, Lu93/x;->H:Llb3/y;

    iput-object p7, p0, Lu93/x;->L:Lr93/a0;

    iput-object p8, p0, Lu93/x;->M:Lr93/r;

    iput-object p1, p0, Lu93/x;->J:Lr93/q0;

    iput-object p2, p0, Lu93/x;->K:Lr93/q0;

    iput-object p3, p0, Lu93/x;->I:Ljava/util/List;

    const/4 p1, 0x0

    move p2, p1

    :goto_0
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p3

    const-string p6, " but position is "

    if-ge p2, p3, :cond_1

    invoke-interface {p4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lr93/x0;

    invoke-interface {p3}, Lr93/x0;->getIndex()I

    move-result p7

    if-ne p7, p2, :cond_0

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p5, " index is "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p3}, Lr93/x0;->getIndex()I

    move-result p3

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_1
    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result p2

    if-ge p1, p2, :cond_3

    invoke-interface {p5, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lr93/a1;

    move-object p3, p2

    check-cast p3, Lu93/w0;

    iget p4, p3, Lu93/w0;->G:I

    if-ne p4, p1, :cond_2

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    new-instance p4, Ljava/lang/IllegalStateException;

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "index is "

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p3, Lu93/w0;->G:I

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p4, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p4

    :cond_3
    return-void

    :cond_4
    const/16 p1, 0x8

    invoke-static {p1}, Lu93/x;->r0(I)V

    throw v0

    :cond_5
    const/4 p1, 0x7

    invoke-static {p1}, Lu93/x;->r0(I)V

    throw v0

    :cond_6
    const/4 p1, 0x6

    invoke-static {p1}, Lu93/x;->r0(I)V

    throw v0

    :cond_7
    const/4 p1, 0x5

    invoke-static {p1}, Lu93/x;->r0(I)V

    throw v0
.end method

.method public final P0(Llb3/a1;)Lu93/w;
    .locals 11

    if-eqz p1, :cond_0

    new-instance v0, Lu93/w;

    invoke-virtual {p1}, Llb3/a1;->f()Llb3/y0;

    move-result-object v2

    invoke-virtual {p0}, Lu93/o;->g()Lr93/k;

    move-result-object v3

    invoke-virtual {p0}, Lu93/x;->k()Lr93/a0;

    move-result-object v4

    invoke-virtual {p0}, Lu93/x;->getVisibility()Lr93/r;

    move-result-object v5

    invoke-virtual {p0}, Lu93/x;->getKind()I

    move-result v6

    invoke-virtual {p0}, Lu93/x;->v()Ljava/util/List;

    move-result-object v7

    invoke-virtual {p0}, Lu93/x;->c0()Ljava/util/List;

    move-result-object v8

    iget-object v9, p0, Lu93/x;->J:Lr93/q0;

    invoke-virtual {p0}, Lu93/x;->getReturnType()Llb3/y;

    move-result-object v10

    move-object v1, p0

    invoke-direct/range {v0 .. v10}, Lu93/w;-><init>(Lu93/x;Llb3/y0;Lr93/k;Lr93/a0;Lr93/r;ILjava/util/List;Ljava/util/List;Lr93/q0;Llb3/y;)V

    return-object v0

    :cond_0
    const/16 p1, 0x18

    invoke-static {p1}, Lu93/x;->r0(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final Q0(Lr93/a;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lu93/x;->d0:Ljava/util/Map;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lu93/x;->d0:Ljava/util/Map;

    :cond_0
    iget-object v0, p0, Lu93/x;->d0:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public R0(Z)V
    .locals 0

    iput-boolean p1, p0, Lu93/x;->W:Z

    return-void
.end method

.method public S()Z
    .locals 1

    iget-boolean v0, p0, Lu93/x;->X:Z

    return v0
.end method

.method public S0(Z)V
    .locals 0

    iput-boolean p1, p0, Lu93/x;->X:Z

    return-void
.end method

.method public T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, Lr93/m;->visitFunctionDescriptor(Lr93/w;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final T0(Llb3/c0;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lu93/x;->H:Llb3/y;

    return-void

    :cond_0
    const/16 p1, 0xb

    invoke-static {p1}, Lu93/x;->r0(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final U()Z
    .locals 1

    iget-boolean v0, p0, Lu93/x;->S:Z

    return v0
.end method

.method public final Z()Lr93/w;
    .locals 1

    iget-object v0, p0, Lu93/x;->c0:Lr93/w;

    return-object v0
.end method

.method public a()Lr93/w;
    .locals 1

    iget-object v0, p0, Lu93/x;->a0:Lr93/w;

    if-ne v0, p0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lr93/w;->a()Lr93/w;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const/16 v0, 0x14

    invoke-static {v0}, Lu93/x;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public bridge synthetic a0(Lr93/e;Lr93/a0;Lr93/o;)Lr93/c;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lu93/x;->K0(Lr93/k;Lr93/a0;Lr93/r;)Lu93/q0;

    move-result-object p1

    return-object p1
.end method

.method public final c0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lu93/x;->I:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0xd

    invoke-static {v0}, Lu93/x;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public bridge synthetic d(Llb3/a1;)Lr93/l;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lu93/x;->d(Llb3/a1;)Lr93/w;

    move-result-object p1

    return-object p1
.end method

.method public d(Llb3/a1;)Lr93/w;
    .locals 1

    if-eqz p1, :cond_1

    .line 2
    iget-object v0, p1, Llb3/a1;->a:Llb3/y0;

    .line 3
    invoke-virtual {v0}, Llb3/y0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 4
    :cond_0
    invoke-virtual {p0, p1}, Lu93/x;->P0(Llb3/a1;)Lu93/w;

    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lu93/x;->a()Lr93/w;

    move-result-object v0

    .line 6
    iput-object v0, p1, Lu93/w;->E:Lr93/w;

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p1, Lu93/w;->O:Z

    .line 8
    iput-boolean v0, p1, Lu93/w;->W:Z

    .line 9
    iget-object v0, p1, Lu93/w;->X:Lu93/x;

    invoke-virtual {v0, p1}, Lu93/x;->M0(Lu93/w;)Lu93/x;

    move-result-object p1

    return-object p1

    :cond_1
    const/16 p1, 0x16

    .line 10
    invoke-static {p1}, Lu93/x;->r0(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final f0()Z
    .locals 1

    iget-boolean v0, p0, Lu93/x;->T:Z

    return v0
.end method

.method public g0(Ljava/util/Collection;)V
    .locals 1

    if-eqz p1, :cond_2

    iput-object p1, p0, Lu93/x;->Y:Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/w;

    invoke-interface {v0}, Lr93/w;->j0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu93/x;->U:Z

    :cond_1
    return-void

    :cond_2
    const/16 p1, 0x11

    invoke-static {p1}, Lu93/x;->r0(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final getKind()I
    .locals 1

    iget v0, p0, Lu93/x;->b0:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    const/16 v0, 0x15

    invoke-static {v0}, Lu93/x;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public getReturnType()Llb3/y;
    .locals 1

    iget-object v0, p0, Lu93/x;->H:Llb3/y;

    return-object v0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lu93/x;->F:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "typeParameters == null for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getVisibility()Lr93/r;
    .locals 1

    iget-object v0, p0, Lu93/x;->M:Lr93/r;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x10

    invoke-static {v0}, Lu93/x;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public h()Ljava/util/Collection;
    .locals 2

    iget-object v0, p0, Lu93/x;->Z:Lce/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lce/d;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    iput-object v0, p0, Lu93/x;->Y:Ljava/util/Collection;

    iput-object v1, p0, Lu93/x;->Z:Lce/d;

    :cond_0
    iget-object v0, p0, Lu93/x;->Y:Ljava/util/Collection;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :goto_0
    if-eqz v0, :cond_2

    return-object v0

    :cond_2
    const/16 v0, 0xe

    invoke-static {v0}, Lu93/x;->r0(I)V

    throw v1
.end method

.method public h0(Lr93/a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu93/x;->d0:Ljava/util/Map;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isExternal()Z
    .locals 1

    iget-boolean v0, p0, Lu93/x;->P:Z

    return v0
.end method

.method public final isInfix()Z
    .locals 2

    iget-boolean v0, p0, Lu93/x;->O:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lu93/x;->a()Lr93/w;

    move-result-object v0

    invoke-interface {v0}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/w;

    invoke-interface {v1}, Lr93/w;->isInfix()Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public isInline()Z
    .locals 1

    iget-boolean v0, p0, Lu93/x;->Q:Z

    return v0
.end method

.method public final isOperator()Z
    .locals 2

    iget-boolean v0, p0, Lu93/x;->N:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lu93/x;->a()Lr93/w;

    move-result-object v0

    invoke-interface {v0}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/w;

    invoke-interface {v1}, Lr93/w;->isOperator()Z

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public isSuspend()Z
    .locals 1

    iget-boolean v0, p0, Lu93/x;->V:Z

    return v0
.end method

.method public final j0()Z
    .locals 1

    iget-boolean v0, p0, Lu93/x;->U:Z

    return v0
.end method

.method public final k()Lr93/a0;
    .locals 1

    iget-object v0, p0, Lu93/x;->L:Lr93/a0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0xf

    invoke-static {v0}, Lu93/x;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public l0()Lr93/v;
    .locals 1

    sget-object v0, Llb3/a1;->b:Llb3/a1;

    invoke-virtual {p0, v0}, Lu93/x;->P0(Llb3/a1;)Lu93/w;

    move-result-object v0

    return-object v0
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, Lu93/x;->R:Z

    return v0
.end method

.method public final v()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lu93/x;->G:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x13

    invoke-static {v0}, Lu93/x;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final y()Lr93/q0;
    .locals 1

    iget-object v0, p0, Lu93/x;->K:Lr93/q0;

    return-object v0
.end method
