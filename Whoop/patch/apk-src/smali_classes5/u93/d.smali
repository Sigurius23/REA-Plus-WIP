.class public abstract Lu93/d;
.super Lu93/n;
.source "SourceFile"

# interfaces
.implements Lr93/q0;


# direct methods
.method public static synthetic r0(I)V
    .locals 6

    packed-switch p0, :pswitch_data_0

    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :pswitch_0
    const-string v0, "@NotNull method %s.%s must not return null"

    :goto_0
    const/4 v1, 0x2

    packed-switch p0, :pswitch_data_1

    const/4 v2, 0x3

    goto :goto_1

    :pswitch_1
    move v2, v1

    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor"

    const/4 v4, 0x0

    packed-switch p0, :pswitch_data_2

    const-string v5, "annotations"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_2
    aput-object v3, v2, v4

    goto :goto_2

    :pswitch_3
    const-string v5, "substitutor"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_4
    const-string v5, "name"

    aput-object v5, v2, v4

    :goto_2
    const/4 v4, 0x1

    packed-switch p0, :pswitch_data_3

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_5
    const-string v3, "getSource"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_6
    const-string v3, "getOriginal"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_7
    const-string v3, "getVisibility"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_8
    const-string v3, "getOverriddenDescriptors"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_9
    const-string v3, "getValueParameters"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_a
    const-string v3, "getType"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_b
    const-string v3, "getTypeParameters"

    aput-object v3, v2, v4

    goto :goto_3

    :pswitch_c
    const-string v3, "getContextReceiverParameters"

    aput-object v3, v2, v4

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v3, "<init>"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_d
    const-string v3, "substitute"

    aput-object v3, v2, v1

    :goto_4
    :pswitch_e
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    packed-switch p0, :pswitch_data_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :pswitch_f
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x4
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x3
        :pswitch_d
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_e
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x4
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_f
    .end packed-switch
.end method


# virtual methods
.method public final B()Lr93/q0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final I0(Llb3/a1;)Lu93/d;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    iget-object v1, p1, Llb3/a1;->a:Llb3/y0;

    invoke-virtual {v1}, Llb3/y0;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v1

    instance-of v1, v1, Lr93/e;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lu93/d;->getType()Llb3/y;

    move-result-object v1

    sget-object v2, Llb3/g1;->E:Llb3/g1;

    invoke-virtual {p1, v1, v2}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lu93/d;->getType()Llb3/y;

    move-result-object v1

    sget-object v2, Llb3/g1;->y:Llb3/g1;

    invoke-virtual {p1, v1, v2}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_2

    return-object v0

    :cond_2
    invoke-virtual {p0}, Lu93/d;->getType()Llb3/y;

    move-result-object v0

    if-ne p1, v0, :cond_3

    :goto_1
    return-object p0

    :cond_3
    new-instance v0, Lu93/p0;

    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v1

    new-instance v2, Lfb3/e;

    invoke-direct {v2, p1}, Lfb3/e;-><init>(Llb3/y;)V

    invoke-virtual {p0}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lu93/p0;-><init>(Lr93/k;La2/a;Ls93/i;)V

    return-object v0

    :cond_4
    const/4 p1, 0x3

    invoke-static {p1}, Lu93/d;->r0(I)V

    throw v0
.end method

.method public final S()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, Lr93/m;->visitReceiverParameterDescriptor(Lr93/q0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a()Lr93/b;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final a()Lr93/k;
    .locals 0

    .line 2
    return-object p0
.end method

.method public final bridge synthetic d(Llb3/a1;)Lr93/l;
    .locals 0

    invoke-virtual {p0, p1}, Lu93/d;->I0(Llb3/a1;)Lu93/d;

    move-result-object p1

    return-object p1
.end method

.method public final getReturnType()Llb3/y;
    .locals 1

    invoke-virtual {p0}, Lu93/d;->getType()Llb3/y;

    move-result-object v0

    return-object v0
.end method

.method public final getSource()Lr93/s0;
    .locals 1

    sget-object v0, Lr93/s0;->q:Lr93/v0;

    return-object v0
.end method

.method public final getType()Llb3/y;
    .locals 1

    invoke-interface {p0}, Lr93/q0;->getValue()Lfb3/d;

    move-result-object v0

    invoke-interface {v0}, Lfb3/d;->getType()Llb3/y;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x6

    invoke-static {v0}, Lu93/d;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x5

    invoke-static {v0}, Lu93/d;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getVisibility()Lr93/r;
    .locals 1

    sget-object v0, Lr93/q;->f:Lr93/p;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x9

    invoke-static {v0}, Lu93/d;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final h()Ljava/util/Collection;
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x8

    invoke-static {v0}, Lu93/d;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final v()Ljava/util/List;
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x7

    invoke-static {v0}, Lu93/d;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final y()Lr93/q0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
