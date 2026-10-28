.class public abstract Lu93/i;
.super Lu93/o;
.source "SourceFile"

# interfaces
.implements Lr93/x0;


# instance fields
.field public final F:Llb3/g1;

.field public final G:Z

.field public final H:I

.field public final I:Lkb3/i;

.field public final J:Lkb3/i;

.field public final K:Lkb3/k;


# direct methods
.method public constructor <init>(Lkb3/n;Lr93/k;Ls93/i;Lva3/h;Llb3/g1;ZILr93/v0;)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    if-eqz p2, :cond_4

    if-eqz p3, :cond_3

    if-eqz p4, :cond_2

    if-eqz p5, :cond_1

    if-eqz p8, :cond_0

    sget-object v0, Lr93/s0;->q:Lr93/v0;

    invoke-direct {p0, p2, p3, p4, v0}, Lu93/o;-><init>(Lr93/k;Ls93/i;Lva3/h;Lr93/s0;)V

    iput-object p5, p0, Lu93/i;->F:Llb3/g1;

    iput-boolean p6, p0, Lu93/i;->G:Z

    iput p7, p0, Lu93/i;->H:I

    new-instance p2, Ljb3/o;

    invoke-direct {p2, p0, p1, p8}, Ljb3/o;-><init>(Lu93/i;Lkb3/n;Lr93/v0;)V

    check-cast p1, Lkb3/k;

    new-instance p3, Lkb3/i;

    invoke-direct {p3, p1, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p3, p0, Lu93/i;->I:Lkb3/i;

    new-instance p2, Lce3/p;

    const/16 p3, 0x8

    invoke-direct {p2, p3, p0, p4}, Lce3/p;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p3, Lkb3/i;

    invoke-direct {p3, p1, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object p3, p0, Lu93/i;->J:Lkb3/i;

    iput-object p1, p0, Lu93/i;->K:Lkb3/k;

    return-void

    :cond_0
    const/4 p1, 0x6

    invoke-static {p1}, Lu93/i;->r0(I)V

    throw v0

    :cond_1
    const/4 p1, 0x4

    invoke-static {p1}, Lu93/i;->r0(I)V

    throw v0

    :cond_2
    const/4 p1, 0x3

    invoke-static {p1}, Lu93/i;->r0(I)V

    throw v0

    :cond_3
    const/4 p1, 0x2

    invoke-static {p1}, Lu93/i;->r0(I)V

    throw v0

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Lu93/i;->r0(I)V

    throw v0

    :cond_5
    const/4 p1, 0x0

    invoke-static {p1}, Lu93/i;->r0(I)V

    throw v0
.end method

.method public static synthetic r0(I)V
    .locals 6

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

    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor"

    const/4 v4, 0x0

    packed-switch p0, :pswitch_data_2

    const-string v5, "storageManager"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_4
    const-string v5, "bounds"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_5
    aput-object v3, v2, v4

    goto :goto_2

    :pswitch_6
    const-string v5, "supertypeLoopChecker"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_7
    const-string v5, "source"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_8
    const-string v5, "variance"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_9
    const-string v5, "name"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_a
    const-string v5, "annotations"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_b
    const-string v5, "containingDeclaration"

    aput-object v5, v2, v4

    :goto_2
    const-string v4, "processBoundsWithoutCycles"

    const/4 v5, 0x1

    packed-switch p0, :pswitch_data_3

    :pswitch_c
    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_d
    const-string v3, "getStorageManager"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_e
    aput-object v4, v2, v5

    goto :goto_3

    :pswitch_f
    const-string v3, "getOriginal"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_10
    const-string v3, "getDefaultType"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_11
    const-string v3, "getTypeConstructor"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_12
    const-string v3, "getUpperBounds"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_13
    const-string v3, "getVariance"

    aput-object v3, v2, v5

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v3, "<init>"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_14
    aput-object v4, v2, v1

    :goto_4
    :pswitch_15
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    packed-switch p0, :pswitch_data_5

    :pswitch_16
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :pswitch_17
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_5
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x7
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_c
        :pswitch_e
        :pswitch_d
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x7
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_15
        :pswitch_14
        :pswitch_15
        :pswitch_15
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x7
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_17
        :pswitch_17
    .end packed-switch
.end method


# virtual methods
.method public final D()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final I0()Lr93/l;
    .locals 0

    return-object p0
.end method

.method public J0(Ljava/util/List;)Ljava/util/List;
    .locals 0

    return-object p1
.end method

.method public abstract K0()Ljava/util/List;
.end method

.method public final T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, Lr93/m;->visitTypeParameterDescriptor(Lr93/x0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a()Lr93/h;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final a()Lr93/k;
    .locals 0

    .line 2
    return-object p0
.end method

.method public final a()Lr93/x0;
    .locals 0

    .line 3
    return-object p0
.end method

.method public final e()Llb3/q0;
    .locals 1

    iget-object v0, p0, Lu93/i;->I:Lkb3/i;

    invoke-virtual {v0}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/q0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x9

    invoke-static {v0}, Lu93/i;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getIndex()I
    .locals 1

    iget v0, p0, Lu93/i;->H:I

    return v0
.end method

.method public final getUpperBounds()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Lu93/i;->e()Llb3/q0;

    move-result-object v0

    check-cast v0, Lu93/h;

    invoke-virtual {v0}, Llb3/f;->h()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x8

    invoke-static {v0}, Lu93/i;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getVariance()Llb3/g1;
    .locals 1

    iget-object v0, p0, Lu93/i;->F:Llb3/g1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x7

    invoke-static {v0}, Lu93/i;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final i()Llb3/c0;
    .locals 1

    iget-object v0, p0, Lu93/i;->J:Lkb3/i;

    invoke-virtual {v0}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/c0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0xa

    invoke-static {v0}, Lu93/i;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final isReified()Z
    .locals 1

    iget-boolean v0, p0, Lu93/i;->G:Z

    return v0
.end method

.method public final z()Lkb3/n;
    .locals 1

    iget-object v0, p0, Lu93/i;->K:Lkb3/k;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0xe

    invoke-static {v0}, Lu93/i;->r0(I)V

    const/4 v0, 0x0

    throw v0
.end method
