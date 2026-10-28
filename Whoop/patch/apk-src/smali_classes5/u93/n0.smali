.class public final Lu93/n0;
.super Lu93/k0;
.source "SourceFile"

# interfaces
.implements Lr93/o0;


# instance fields
.field public N:Llb3/y;

.field public final O:Lr93/o0;


# direct methods
.method public constructor <init>(Lr93/n0;Ls93/i;Lr93/a0;Lr93/r;ZZZILr93/o0;Lr93/s0;)V
    .locals 12

    const/4 v0, 0x0

    if-eqz p1, :cond_6

    if-eqz p2, :cond_5

    if-eqz p3, :cond_4

    if-eqz p4, :cond_3

    if-eqz p8, :cond_2

    if-eqz p10, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<get-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ">"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lva3/h;->g(Ljava/lang/String;)Lva3/h;

    move-result-object v6

    move-object v1, p0

    move-object v4, p1

    move-object v5, p2

    move-object v2, p3

    move-object/from16 v3, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lu93/k0;-><init>(Lr93/a0;Lr93/r;Lr93/n0;Ls93/i;Lva3/h;ZZZILr93/s0;)V

    if-eqz p9, :cond_0

    move-object/from16 p1, p9

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    iput-object p1, p0, Lu93/n0;->O:Lr93/o0;

    return-void

    :cond_1
    const/4 p1, 0x5

    invoke-static {p1}, Lu93/n0;->r0(I)V

    throw v0

    :cond_2
    const/4 p1, 0x4

    invoke-static {p1}, Lu93/n0;->r0(I)V

    throw v0

    :cond_3
    const/4 p1, 0x3

    invoke-static {p1}, Lu93/n0;->r0(I)V

    throw v0

    :cond_4
    const/4 p1, 0x2

    invoke-static {p1}, Lu93/n0;->r0(I)V

    throw v0

    :cond_5
    const/4 p1, 0x1

    invoke-static {p1}, Lu93/n0;->r0(I)V

    throw v0

    :cond_6
    const/4 p1, 0x0

    invoke-static {p1}, Lu93/n0;->r0(I)V

    throw v0
.end method

.method public static synthetic r0(I)V
    .locals 9

    const/16 v0, 0x8

    const/4 v1, 0x7

    const/4 v2, 0x6

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

    const-string v6, "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl"

    const/4 v7, 0x0

    packed-switch p0, :pswitch_data_0

    const-string v8, "correspondingProperty"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_0
    aput-object v6, v5, v7

    goto :goto_2

    :pswitch_1
    const-string v8, "source"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_2
    const-string v8, "kind"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_3
    const-string v8, "visibility"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_4
    const-string v8, "modality"

    aput-object v8, v5, v7

    goto :goto_2

    :pswitch_5
    const-string v8, "annotations"

    aput-object v8, v5, v7

    :goto_2
    const/4 v7, 0x1

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    aput-object v6, v5, v7

    goto :goto_3

    :cond_2
    const-string v6, "getOriginal"

    aput-object v6, v5, v7

    goto :goto_3

    :cond_3
    const-string v6, "getValueParameters"

    aput-object v6, v5, v7

    goto :goto_3

    :cond_4
    const-string v6, "getOverriddenDescriptors"

    aput-object v6, v5, v7

    :goto_3
    if-eq p0, v2, :cond_5

    if-eq p0, v1, :cond_5

    if-eq p0, v0, :cond_5

    const-string v6, "<init>"

    aput-object v6, v5, v4

    :cond_5
    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    if-eq p0, v2, :cond_6

    if-eq p0, v1, :cond_6

    if-eq p0, v0, :cond_6

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_4
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final bridge synthetic I0()Lr93/l;
    .locals 1

    invoke-virtual {p0}, Lu93/n0;->L0()Lr93/o0;

    move-result-object v0

    return-object v0
.end method

.method public final L0()Lr93/o0;
    .locals 1

    iget-object v0, p0, Lu93/n0;->O:Lr93/o0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x8

    invoke-static {v0}, Lu93/n0;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final M0(Llb3/y;)V
    .locals 0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lu93/k0;->J0()Lr93/n0;

    move-result-object p1

    invoke-interface {p1}, Lr93/z0;->getType()Llb3/y;

    move-result-object p1

    :cond_0
    iput-object p1, p0, Lu93/n0;->N:Llb3/y;

    return-void
.end method

.method public final T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, Lr93/m;->visitPropertyGetterDescriptor(Lr93/o0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic a()Lr93/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lu93/n0;->L0()Lr93/o0;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a()Lr93/c;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lu93/n0;->L0()Lr93/o0;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a()Lr93/k;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lu93/n0;->L0()Lr93/o0;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic a()Lr93/w;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lu93/n0;->L0()Lr93/o0;

    move-result-object v0

    return-object v0
.end method

.method public final getReturnType()Llb3/y;
    .locals 1

    iget-object v0, p0, Lu93/n0;->N:Llb3/y;

    return-object v0
.end method

.method public final h()Ljava/util/Collection;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lu93/k0;->K0(Z)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final v()Ljava/util/List;
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x7

    invoke-static {v0}, Lu93/n0;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method
