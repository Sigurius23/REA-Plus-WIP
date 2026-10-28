.class public abstract Lya3/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lbd3/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbd3/e0;

    const-string v1, "ResolutionAnchorProvider"

    invoke-direct {v0, v1}, Lbd3/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lya3/p;->a:Lbd3/e0;

    return-void
.end method

.method public static synthetic a(I)V
    .locals 11

    const/16 v0, 0x19

    const/16 v1, 0x17

    const/16 v2, 0xc

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v3, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v3, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v4, 0x2

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    const/4 v5, 0x3

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory"

    const/4 v7, 0x0

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v8, "propertyDescriptor"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_1
    const-string v8, "owner"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_2
    const-string v8, "descriptor"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_3
    const-string v8, "enumClass"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_4
    const-string v8, "source"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_5
    const-string v8, "containingClass"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_6
    aput-object v6, v5, v7

    goto :goto_2

    :pswitch_7
    const-string v8, "visibility"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_8
    const-string v8, "sourceElement"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_9
    const-string v8, "parameterAnnotations"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_a
    const-string v8, "annotations"

    aput-object v8, v5, v7

    :goto_2
    const-string v7, "createSetter"

    const-string v8, "createEnumValuesMethod"

    const-string v9, "createEnumValueOfMethod"

    const/4 v10, 0x1

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    aput-object v6, v5, v10

    goto :goto_3

    :cond_2
    aput-object v9, v5, v10

    goto :goto_3

    :cond_3
    aput-object v8, v5, v10

    goto :goto_3

    :cond_4
    aput-object v7, v5, v10

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v6, "createDefaultSetter"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_b
    const-string v6, "createContextReceiverParameterForClass"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_c
    const-string v6, "createContextReceiverParameterForCallable"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_d
    const-string v6, "createExtensionReceiverParameterForCallable"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_e
    const-string v6, "isEnumSpecialMethod"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_f
    const-string v6, "isEnumValueOfMethod"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_10
    const-string v6, "isEnumValuesMethod"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_11
    const-string v6, "createEnumEntriesProperty"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_12
    aput-object v9, v5, v4

    goto :goto_4

    :pswitch_13
    aput-object v8, v5, v4

    goto :goto_4

    :pswitch_14
    const-string v6, "createPrimaryConstructorForObject"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_15
    const-string v6, "createGetter"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_16
    const-string v6, "createDefaultGetter"

    aput-object v6, v5, v4

    goto :goto_4

    :pswitch_17
    aput-object v7, v5, v4

    :goto_4
    :pswitch_18
    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    if-eq p0, v2, :cond_5

    if-eq p0, v1, :cond_5

    if-eq p0, v0, :cond_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_7
        :pswitch_8
        :pswitch_6
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_a
        :pswitch_0
        :pswitch_a
        :pswitch_8
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_6
        :pswitch_3
        :pswitch_6
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_a
        :pswitch_1
        :pswitch_a
        :pswitch_1
        :pswitch_a
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_18
        :pswitch_16
        :pswitch_16
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_14
        :pswitch_14
        :pswitch_13
        :pswitch_18
        :pswitch_12
        :pswitch_18
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
    .end packed-switch
.end method

.method public static d(Lr93/b;Llb3/y;Lva3/h;Ls93/i;I)Lu93/p0;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    if-eqz p3, :cond_1

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lu93/p0;

    new-instance v1, Lfb3/a;

    invoke-direct {v1, p0, p1, p2}, Lfb3/a;-><init>(Lr93/b;Llb3/y;Lva3/h;)V

    invoke-static {p4}, Lva3/i;->a(I)Lva3/h;

    move-result-object p1

    invoke-direct {v0, p0, v1, p3, p1}, Lu93/p0;-><init>(Lr93/k;La2/a;Ls93/i;Lva3/h;)V

    return-object v0

    :cond_1
    const/16 p0, 0x21

    invoke-static {p0}, Lya3/p;->a(I)V

    throw v0

    :cond_2
    const/16 p0, 0x20

    invoke-static {p0}, Lya3/p;->a(I)V

    throw v0
.end method

.method public static e(Lr93/n0;Ls93/i;)Lu93/n0;
    .locals 2

    if-eqz p0, :cond_0

    const/4 v0, 0x1

    invoke-interface {p0}, Lr93/l;->getSource()Lr93/s0;

    move-result-object v1

    invoke-static {p0, p1, v0, v1}, Lya3/p;->k(Lr93/n0;Ls93/i;ZLr93/s0;)Lu93/n0;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 p0, 0xd

    invoke-static {p0}, Lya3/p;->a(I)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static f(Lr93/n0;Ls93/i;)Lu93/o0;
    .locals 7

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-interface {p0}, Lr93/l;->getSource()Lr93/s0;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-interface {p0}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v5

    sget-object v3, Ls93/g;->a:Ls93/f;

    const/4 v4, 0x1

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Lya3/p;->l(Lr93/n0;Ls93/i;Ls93/i;ZLr93/r;Lr93/s0;)Lu93/o0;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x6

    invoke-static {p0}, Lya3/p;->a(I)V

    throw v0

    :cond_1
    const/4 p0, 0x0

    invoke-static {p0}, Lya3/p;->a(I)V

    throw v0
.end method

.method public static g(Lu93/b;)Lu93/m0;
    .locals 15

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-static {p0}, Lya3/f;->c(Lr93/k;)Lr93/b0;

    move-result-object v1

    invoke-static {v1}, Lya3/r;->d(Lr93/b0;)Lya3/b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lya3/b;->a(Lr93/b0;)Lr93/e;

    move-result-object v1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    sget-object v3, Lr93/a0;->x:Lr93/a0;

    sget-object v4, Lr93/q;->e:Lr93/p;

    sget-object v6, Lo93/n;->b:Lva3/h;

    invoke-interface {p0}, Lr93/l;->getSource()Lr93/s0;

    move-result-object v8

    const/4 v5, 0x0

    const/4 v7, 0x4

    move-object v2, p0

    invoke-static/range {v2 .. v8}, Lu93/m0;->K0(Lr93/k;Lr93/a0;Lr93/r;ZLva3/h;ILr93/s0;)Lu93/m0;

    move-result-object v9

    new-instance v2, Lu93/n0;

    const/4 v11, 0x0

    invoke-interface {p0}, Lr93/l;->getSource()Lr93/s0;

    move-result-object v12

    move-object v6, v4

    sget-object v4, Ls93/g;->a:Ls93/f;

    move v10, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, v3

    move-object v3, v9

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v12}, Lu93/n0;-><init>(Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZZZILr93/o0;Lr93/s0;)V

    invoke-virtual {v3, v2, v0, v0, v0}, Lu93/m0;->N0(Lu93/n0;Lu93/o0;Lu93/v;Lu93/v;)V

    sget-object v0, Llb3/k0;->x:Lwe/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Llb3/k0;->y:Llb3/k0;

    invoke-interface {v1}, Lr93/h;->e()Llb3/q0;

    move-result-object v1

    new-instance v4, Llb3/v0;

    invoke-virtual {p0}, Lu93/b;->i()Llb3/c0;

    move-result-object p0

    invoke-direct {v4, p0}, Llb3/v0;-><init>(Llb3/y;)V

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const-string v4, "attributes"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "constructor"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "arguments"

    invoke-static {p0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-static {p0, v0, v1, v4}, Llb3/o;->i(Ljava/util/List;Llb3/k0;Llb3/q0;Z)Llb3/c0;

    move-result-object v10

    sget-object v11, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v14, v11

    move-object v9, v3

    invoke-virtual/range {v9 .. v14}, Lu93/m0;->Q0(Llb3/y;Ljava/util/List;Lr93/q0;Lu93/p0;Ljava/util/List;)V

    invoke-virtual {v3}, Lu93/m0;->getReturnType()Llb3/y;

    move-result-object p0

    invoke-virtual {v2, p0}, Lu93/n0;->M0(Llb3/y;)V

    return-object v3

    :cond_1
    const/16 p0, 0x1a

    invoke-static {p0}, Lya3/p;->a(I)V

    throw v0
.end method

.method public static h(Lu93/b;)Lu93/q0;
    .locals 15

    if-eqz p0, :cond_0

    sget-object v0, Lo93/n;->c:Lva3/h;

    const/4 v1, 0x4

    invoke-interface {p0}, Lr93/l;->getSource()Lr93/s0;

    move-result-object v2

    invoke-static {p0, v0, v1, v2}, Lu93/q0;->U0(Lr93/e;Lva3/h;ILr93/s0;)Lu93/q0;

    move-result-object v3

    move-object v4, v3

    new-instance v3, Lu93/w0;

    const-string v0, "value"

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v8

    invoke-static {p0}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object v0

    invoke-virtual {v0}, Lo93/h;->v()Llb3/c0;

    move-result-object v9

    const/4 v13, 0x0

    invoke-interface {p0}, Lr93/l;->getSource()Lr93/s0;

    move-result-object v14

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget-object v7, Ls93/g;->a:Ls93/f;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v3 .. v14}, Lu93/w0;-><init>(Lr93/b;Lr93/a1;ILs93/i;Lva3/h;Llb3/y;ZZZLlb3/y;Lr93/s0;)V

    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-virtual {p0}, Lu93/b;->i()Llb3/c0;

    move-result-object v9

    sget-object v10, Lr93/a0;->x:Lr93/a0;

    sget-object v11, Lr93/q;->e:Lr93/p;

    move-object v3, v4

    const/4 v4, 0x0

    move-object v7, v6

    invoke-virtual/range {v3 .. v11}, Lu93/q0;->W0(Lr93/q0;Lr93/q0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Llb3/y;Lr93/a0;Lr93/r;)Lu93/q0;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 p0, 0x18

    invoke-static {p0}, Lya3/p;->a(I)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static i(Lu93/b;)Lu93/q0;
    .locals 12

    if-eqz p0, :cond_0

    sget-object v0, Lo93/n;->a:Lva3/h;

    const/4 v1, 0x4

    invoke-interface {p0}, Lr93/l;->getSource()Lr93/s0;

    move-result-object v2

    invoke-static {p0, v0, v1, v2}, Lu93/q0;->U0(Lr93/e;Lva3/h;ILr93/s0;)Lu93/q0;

    move-result-object v3

    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {p0}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object v0

    sget-object v1, Llb3/g1;->y:Llb3/g1;

    invoke-virtual {p0}, Lu93/b;->i()Llb3/c0;

    move-result-object p0

    invoke-virtual {v0, p0}, Lo93/h;->h(Llb3/y;)Llb3/c0;

    move-result-object v9

    sget-object v10, Lr93/a0;->x:Lr93/a0;

    sget-object v11, Lr93/q;->e:Lr93/p;

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v7, v6

    move-object v8, v6

    invoke-virtual/range {v3 .. v11}, Lu93/q0;->W0(Lr93/q0;Lr93/q0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Llb3/y;Lr93/a0;Lr93/r;)Lu93/q0;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 p0, 0x16

    invoke-static {p0}, Lya3/p;->a(I)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static j(Lr93/b;Llb3/y;Ls93/i;)Lu93/p0;
    .locals 2

    if-nez p1, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lu93/p0;

    new-instance v1, Lfb3/b;

    invoke-direct {v1, p0, p1}, Lfb3/b;-><init>(Lr93/b;Llb3/y;)V

    invoke-direct {v0, p0, v1, p2}, Lu93/p0;-><init>(Lr93/k;La2/a;Ls93/i;)V

    return-object v0
.end method

.method public static k(Lr93/n0;Ls93/i;ZLr93/s0;)Lu93/n0;
    .locals 12

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    if-eqz p1, :cond_1

    if-eqz p3, :cond_0

    new-instance v1, Lu93/n0;

    invoke-interface {p0}, Lr93/z;->k()Lr93/a0;

    move-result-object v4

    invoke-interface {p0}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v5

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, p1

    move v6, p2

    move-object v11, p3

    invoke-direct/range {v1 .. v11}, Lu93/n0;-><init>(Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZZZILr93/o0;Lr93/s0;)V

    return-object v1

    :cond_0
    const/16 p0, 0x13

    invoke-static {p0}, Lya3/p;->a(I)V

    throw v0

    :cond_1
    const/16 p0, 0x12

    invoke-static {p0}, Lya3/p;->a(I)V

    throw v0

    :cond_2
    const/16 p0, 0x11

    invoke-static {p0}, Lya3/p;->a(I)V

    throw v0
.end method

.method public static l(Lr93/n0;Ls93/i;Ls93/i;ZLr93/r;Lr93/s0;)Lu93/o0;
    .locals 12

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    if-eqz p1, :cond_3

    if-eqz p2, :cond_2

    if-eqz p4, :cond_1

    if-eqz p5, :cond_0

    new-instance v1, Lu93/o0;

    invoke-interface {p0}, Lr93/z;->k()Lr93/a0;

    move-result-object v4

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, p1

    move v6, p3

    move-object/from16 v5, p4

    move-object/from16 v11, p5

    invoke-direct/range {v1 .. v11}, Lu93/o0;-><init>(Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZZZILr93/p0;Lr93/s0;)V

    invoke-interface {p0}, Lr93/z0;->getType()Llb3/y;

    move-result-object p0

    invoke-static {v1, p0, p2}, Lu93/o0;->L0(Lu93/o0;Llb3/y;Ls93/i;)Lu93/w0;

    move-result-object p0

    iput-object p0, v1, Lu93/o0;->N:Lr93/a1;

    return-object v1

    :cond_0
    const/16 p0, 0xb

    invoke-static {p0}, Lya3/p;->a(I)V

    throw v0

    :cond_1
    const/16 p0, 0xa

    invoke-static {p0}, Lya3/p;->a(I)V

    throw v0

    :cond_2
    const/16 p0, 0x9

    invoke-static {p0}, Lya3/p;->a(I)V

    throw v0

    :cond_3
    const/16 p0, 0x8

    invoke-static {p0}, Lya3/p;->a(I)V

    throw v0

    :cond_4
    const/4 p0, 0x7

    invoke-static {p0}, Lya3/p;->a(I)V

    throw v0
.end method

.method public static m(Lr93/w;)Z
    .locals 2

    invoke-interface {p0}, Lr93/c;->getKind()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object p0

    sget v0, Lya3/f;->a:I

    sget-object v0, Lr93/f;->y:Lr93/f;

    invoke-static {p0, v0}, Lya3/f;->l(Lr93/k;Lr93/f;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public abstract b(Lr93/c;)V
.end method

.method public abstract c(Lr93/c;Lr93/c;)V
.end method

.method public n(Lr93/c;Ljava/util/Collection;)V
    .locals 1

    const-string v0, "member"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lr93/c;->g0(Ljava/util/Collection;)V

    return-void
.end method
