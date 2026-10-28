.class public final Lu93/h;
.super Llb3/f;
.source "SourceFile"


# instance fields
.field public final y:Lr93/v0;

.field public final synthetic z:Lu93/i;


# direct methods
.method public constructor <init>(Lu93/i;Lkb3/n;Lr93/v0;)V
    .locals 0

    if-eqz p2, :cond_0

    iput-object p1, p0, Lu93/h;->z:Lu93/i;

    invoke-direct {p0, p2}, Llb3/f;-><init>(Lkb3/n;)V

    iput-object p3, p0, Lu93/h;->y:Lr93/v0;

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, Lu93/h;->k(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public static synthetic k(I)V
    .locals 11

    const/16 v0, 0x8

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eq p0, v5, :cond_0

    if-eq p0, v4, :cond_0

    if-eq p0, v3, :cond_0

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v6, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    const-string v6, "@NotNull method %s.%s must not return null"

    :goto_0
    if-eq p0, v5, :cond_1

    if-eq p0, v4, :cond_1

    if-eq p0, v3, :cond_1

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    move v7, v3

    goto :goto_1

    :cond_1
    move v7, v4

    :goto_1
    new-array v7, v7, [Ljava/lang/Object;

    const-string v8, "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor"

    const/4 v9, 0x0

    packed-switch p0, :pswitch_data_0

    const-string v10, "storageManager"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_0
    const-string v10, "classifier"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_1
    const-string v10, "supertypes"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_2
    const-string v10, "type"

    aput-object v10, v7, v9

    goto :goto_2

    :pswitch_3
    aput-object v8, v7, v9

    :goto_2
    const-string v9, "processSupertypesWithoutCycles"

    if-eq p0, v5, :cond_7

    if-eq p0, v4, :cond_6

    if-eq p0, v3, :cond_5

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    aput-object v8, v7, v5

    goto :goto_3

    :cond_2
    aput-object v9, v7, v5

    goto :goto_3

    :cond_3
    const-string v8, "getSupertypeLoopChecker"

    aput-object v8, v7, v5

    goto :goto_3

    :cond_4
    const-string v8, "getBuiltIns"

    aput-object v8, v7, v5

    goto :goto_3

    :cond_5
    const-string v8, "getDeclarationDescriptor"

    aput-object v8, v7, v5

    goto :goto_3

    :cond_6
    const-string v8, "getParameters"

    aput-object v8, v7, v5

    goto :goto_3

    :cond_7
    const-string v8, "computeSupertypes"

    aput-object v8, v7, v5

    :goto_3
    packed-switch p0, :pswitch_data_1

    const-string v8, "<init>"

    aput-object v8, v7, v4

    goto :goto_4

    :pswitch_4
    const-string v8, "isSameClassifier"

    aput-object v8, v7, v4

    goto :goto_4

    :pswitch_5
    aput-object v9, v7, v4

    goto :goto_4

    :pswitch_6
    const-string v8, "reportSupertypeLoopError"

    aput-object v8, v7, v4

    :goto_4
    :pswitch_7
    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    if-eq p0, v5, :cond_8

    if-eq p0, v4, :cond_8

    if-eq p0, v3, :cond_8

    if-eq p0, v2, :cond_8

    if-eq p0, v1, :cond_8

    if-eq p0, v0, :cond_8

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_7
        :pswitch_4
    .end packed-switch
.end method


# virtual methods
.method public final a()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lu93/h;->z:Lu93/i;

    invoke-virtual {v0}, Lu93/i;->K0()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    invoke-static {v0}, Lu93/h;->k(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final c()Lo93/h;
    .locals 1

    iget-object v0, p0, Lu93/h;->z:Lu93/i;

    invoke-static {v0}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x4

    invoke-static {v0}, Lu93/h;->k(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final d()Lr93/h;
    .locals 1

    iget-object v0, p0, Lu93/h;->z:Lu93/i;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x3

    invoke-static {v0}, Lu93/h;->k(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final e()Llb3/y;
    .locals 2

    sget-object v0, Lnb3/k;->G:Lnb3/k;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-static {v0, v1}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object v0

    return-object v0
.end method

.method public final f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final g()Lr93/v0;
    .locals 1

    iget-object v0, p0, Lu93/h;->y:Lr93/v0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x5

    invoke-static {v0}, Lu93/h;->k(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getParameters()Ljava/util/List;
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, Lu93/h;->k(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final i(Lr93/h;)Z
    .locals 4

    instance-of v0, p1, Lr93/x0;

    if-eqz v0, :cond_0

    check-cast p1, Lr93/x0;

    sget-object v0, Lya3/c;->x:Lya3/c;

    sget-object v1, Lya3/d;->a:Lya3/d;

    iget-object v2, p0, Lu93/h;->z:Lu93/i;

    const/4 v3, 0x1

    invoke-virtual {v1, v2, p1, v3, v0}, Lya3/d;->b(Lr93/x0;Lr93/x0;ZLc93/m;)Z

    move-result p1

    if-eqz p1, :cond_0

    return v3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final j(Ljava/util/List;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lu93/h;->z:Lu93/i;

    invoke-virtual {v0, p1}, Lu93/i;->J0(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const/16 p1, 0x8

    invoke-static {p1}, Lu93/h;->k(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu93/h;->z:Lu93/i;

    invoke-virtual {v0}, Lu93/n;->getName()Lva3/h;

    move-result-object v0

    iget-object v0, v0, Lva3/h;->w:Ljava/lang/String;

    return-object v0
.end method
