.class public abstract Lu93/b;
.super Lu93/c0;
.source "SourceFile"


# instance fields
.field public final w:Lva3/h;

.field public final x:Lkb3/i;

.field public final y:Lkb3/i;

.field public final z:Lkb3/i;


# direct methods
.method public constructor <init>(Lkb3/n;Lva3/h;)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lu93/b;->w:Lva3/h;

    new-instance p2, Lu93/a;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lu93/a;-><init>(Lu93/b;I)V

    check-cast p1, Lkb3/k;

    new-instance v0, Lkb3/i;

    invoke-direct {v0, p1, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v0, p0, Lu93/b;->x:Lkb3/i;

    new-instance p2, Lu93/a;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lu93/a;-><init>(Lu93/b;I)V

    new-instance v0, Lkb3/i;

    invoke-direct {v0, p1, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v0, p0, Lu93/b;->y:Lkb3/i;

    new-instance p2, Lu93/a;

    const/4 v0, 0x2

    invoke-direct {p2, p0, v0}, Lu93/a;-><init>(Lu93/b;I)V

    new-instance v0, Lkb3/i;

    invoke-direct {v0, p1, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v0, p0, Lu93/b;->z:Lkb3/i;

    return-void

    :cond_0
    const/4 p1, 0x1

    invoke-static {p1}, Lu93/b;->E(I)V

    throw v0

    :cond_1
    const/4 p1, 0x0

    invoke-static {p1}, Lu93/b;->E(I)V

    throw v0
.end method

.method public static synthetic E(I)V
    .locals 19

    move/from16 v0, p0

    const/16 v1, 0x14

    const/16 v2, 0x13

    const/16 v3, 0x11

    const/16 v4, 0x10

    const/16 v5, 0xe

    const/16 v6, 0xc

    const/16 v7, 0x9

    const/4 v8, 0x6

    const/4 v9, 0x5

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v12, 0x2

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

    move v14, v11

    goto :goto_1

    :cond_1
    move v14, v12

    :goto_1
    new-array v14, v14, [Ljava/lang/Object;

    const-string v15, "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor"

    const/16 v16, 0x0

    packed-switch v0, :pswitch_data_0

    const-string v17, "storageManager"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_0
    const-string v17, "substitutor"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_1
    const-string v17, "typeSubstitution"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_2
    const-string v17, "kotlinTypeRefiner"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_3
    const-string v17, "typeArguments"

    aput-object v17, v14, v16

    goto :goto_2

    :pswitch_4
    aput-object v15, v14, v16

    goto :goto_2

    :pswitch_5
    const-string v17, "name"

    aput-object v17, v14, v16

    :goto_2
    const-string v16, "getMemberScope"

    const-string v17, "substitute"

    const/16 v18, 0x1

    if-eq v0, v12, :cond_a

    if-eq v0, v11, :cond_9

    if-eq v0, v10, :cond_8

    if-eq v0, v9, :cond_7

    if-eq v0, v8, :cond_6

    if-eq v0, v7, :cond_5

    if-eq v0, v6, :cond_5

    if-eq v0, v5, :cond_5

    if-eq v0, v4, :cond_5

    if-eq v0, v3, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    aput-object v15, v14, v18

    goto :goto_3

    :cond_2
    const-string v15, "getDefaultType"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_3
    aput-object v17, v14, v18

    goto :goto_3

    :cond_4
    const-string v15, "getUnsubstitutedMemberScope"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_5
    aput-object v16, v14, v18

    goto :goto_3

    :cond_6
    const-string v15, "getContextReceivers"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_7
    const-string v15, "getThisAsReceiverParameter"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_8
    const-string v15, "getUnsubstitutedInnerClassesScope"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_9
    const-string v15, "getOriginal"

    aput-object v15, v14, v18

    goto :goto_3

    :cond_a
    const-string v15, "getName"

    aput-object v15, v14, v18

    :goto_3
    packed-switch v0, :pswitch_data_1

    const-string v15, "<init>"

    aput-object v15, v14, v12

    goto :goto_4

    :pswitch_6
    aput-object v17, v14, v12

    goto :goto_4

    :pswitch_7
    aput-object v16, v14, v12

    :goto_4
    :pswitch_8
    invoke-static {v13, v14}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    if-eq v0, v12, :cond_b

    if-eq v0, v11, :cond_b

    if-eq v0, v10, :cond_b

    if-eq v0, v9, :cond_b

    if-eq v0, v8, :cond_b

    if-eq v0, v7, :cond_b

    if-eq v0, v6, :cond_b

    if-eq v0, v5, :cond_b

    if-eq v0, v4, :cond_b

    if-eq v0, v3, :cond_b

    if-eq v0, v2, :cond_b

    if-eq v0, v1, :cond_b

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_6
        :pswitch_8
        :pswitch_8
    .end packed-switch
.end method


# virtual methods
.method public G(Llb3/a1;)Lr93/e;
    .locals 1

    if-eqz p1, :cond_1

    iget-object v0, p1, Llb3/a1;->a:Llb3/y0;

    invoke-virtual {v0}, Llb3/y0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lu93/b0;

    invoke-direct {v0, p0, p1}, Lu93/b0;-><init>(Lu93/c0;Llb3/a1;)V

    return-object v0

    :cond_1
    const/16 p1, 0x12

    invoke-static {p1}, Lu93/b;->E(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public H()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    iget-object v0, p0, Lu93/b;->y:Lkb3/i;

    invoke-virtual {v0}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x4

    invoke-static {v0}, Lu93/b;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public K()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    invoke-static {p0}, Lya3/f;->c(Lr93/k;)Lr93/b0;

    move-result-object v0

    invoke-static {v0}, Lcb3/e;->i(Lr93/b0;)V

    sget-object v0, Lmb3/f;->a:Lmb3/f;

    invoke-virtual {p0, v0}, Lu93/c0;->l(Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x11

    invoke-static {v0}, Lu93/b;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public M()Ljava/util/List;
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x6

    invoke-static {v0}, Lu93/b;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, Lr93/m;->visitClassDescriptor(Lr93/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a()Lr93/e;
    .locals 0

    .line 3
    return-object p0
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

.method public b(Llb3/y0;Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    invoke-virtual {p1}, Llb3/y0;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p2}, Lu93/c0;->l(Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const/16 p1, 0xc

    invoke-static {p1}, Lu93/b;->E(I)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    new-instance v0, Llb3/a1;

    invoke-direct {v0, p1}, Llb3/a1;-><init>(Llb3/y0;)V

    new-instance p1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;

    invoke-virtual {p0, p2}, Lu93/c0;->l(Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object p2

    invoke-direct {p1, p2, v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;-><init>(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Llb3/a1;)V

    return-object p1
.end method

.method public bridge synthetic d(Llb3/a1;)Lr93/l;
    .locals 0

    invoke-virtual {p0, p1}, Lu93/b;->G(Llb3/a1;)Lr93/e;

    move-result-object p1

    return-object p1
.end method

.method public final getName()Lva3/h;
    .locals 1

    iget-object v0, p0, Lu93/b;->w:Lva3/h;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x2

    invoke-static {v0}, Lu93/b;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final i()Llb3/c0;
    .locals 1

    iget-object v0, p0, Lu93/b;->x:Lkb3/i;

    invoke-virtual {v0}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/c0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x14

    invoke-static {v0}, Lu93/b;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final n(Llb3/y0;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    invoke-static {p0}, Lya3/f;->c(Lr93/k;)Lr93/b0;

    move-result-object v0

    invoke-static {v0}, Lcb3/e;->i(Lr93/b0;)V

    sget-object v0, Lmb3/f;->a:Lmb3/f;

    invoke-virtual {p0, p1, v0}, Lu93/b;->b(Llb3/y0;Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const/16 p1, 0x10

    invoke-static {p1}, Lu93/b;->E(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final q0()Lr93/q0;
    .locals 1

    iget-object v0, p0, Lu93/b;->z:Lkb3/i;

    invoke-virtual {v0}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/q0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x5

    invoke-static {v0}, Lu93/b;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method
