.class public final Lu93/u;
.super Lu93/k;
.source "SourceFile"


# instance fields
.field public final G:Llb3/i;

.field public final H:Lu93/t;

.field public final I:Lkb3/l;

.field public final J:Ls93/i;


# direct methods
.method public constructor <init>(Lkb3/n;Lr93/e;Llb3/c0;Lva3/h;Lkb3/l;Ls93/i;Lr93/s0;)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    if-eqz p2, :cond_3

    if-eqz p3, :cond_2

    if-eqz p4, :cond_1

    if-eqz p5, :cond_0

    invoke-direct {p0, p1, p2, p4, p7}, Lu93/k;-><init>(Lkb3/n;Lr93/k;Lva3/h;Lr93/s0;)V

    iput-object p6, p0, Lu93/u;->J:Ls93/i;

    new-instance p2, Llb3/i;

    sget-object p4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-static {p3}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p3

    invoke-direct {p2, p0, p4, p3, p1}, Llb3/i;-><init>(Lu93/c0;Ljava/util/List;Ljava/util/Collection;Lkb3/n;)V

    iput-object p2, p0, Lu93/u;->G:Llb3/i;

    new-instance p2, Lu93/t;

    invoke-direct {p2, p0, p1}, Lu93/t;-><init>(Lu93/u;Lkb3/n;)V

    iput-object p2, p0, Lu93/u;->H:Lu93/t;

    iput-object p5, p0, Lu93/u;->I:Lkb3/l;

    return-void

    :cond_0
    const/16 p1, 0xa

    invoke-static {p1}, Lu93/u;->E(I)V

    throw v0

    :cond_1
    const/16 p1, 0x9

    invoke-static {p1}, Lu93/u;->E(I)V

    throw v0

    :cond_2
    const/16 p1, 0x8

    invoke-static {p1}, Lu93/u;->E(I)V

    throw v0

    :cond_3
    const/4 p1, 0x7

    invoke-static {p1}, Lu93/u;->E(I)V

    throw v0

    :cond_4
    const/4 p1, 0x6

    invoke-static {p1}, Lu93/u;->E(I)V

    throw v0
.end method

.method public static synthetic E(I)V
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

    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor"

    const/4 v4, 0x0

    packed-switch p0, :pswitch_data_2

    :pswitch_2
    const-string v5, "storageManager"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_3
    aput-object v3, v2, v4

    goto :goto_2

    :pswitch_4
    const-string v5, "kotlinTypeRefiner"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_5
    const-string v5, "supertype"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_6
    const-string v5, "containingClass"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_7
    const-string v5, "source"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_8
    const-string v5, "annotations"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_9
    const-string v5, "enumMemberNames"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_a
    const-string v5, "name"

    aput-object v5, v2, v4

    goto :goto_2

    :pswitch_b
    const-string v5, "enumClass"

    aput-object v5, v2, v4

    :goto_2
    const-string v4, "getUnsubstitutedMemberScope"

    const/4 v5, 0x1

    packed-switch p0, :pswitch_data_3

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_c
    const-string v3, "getSealedSubclasses"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_d
    const-string v3, "getDeclaredTypeParameters"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_e
    const-string v3, "getAnnotations"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_f
    const-string v3, "getVisibility"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_10
    const-string v3, "getModality"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_11
    const-string v3, "getKind"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_12
    const-string v3, "getTypeConstructor"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_13
    const-string v3, "getConstructors"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_14
    const-string v3, "getStaticScope"

    aput-object v3, v2, v5

    goto :goto_3

    :pswitch_15
    aput-object v4, v2, v5

    :goto_3
    packed-switch p0, :pswitch_data_4

    const-string v3, "create"

    aput-object v3, v2, v1

    goto :goto_4

    :pswitch_16
    aput-object v4, v2, v1

    goto :goto_4

    :pswitch_17
    const-string v3, "<init>"

    aput-object v3, v2, v1

    :goto_4
    :pswitch_18
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    packed-switch p0, :pswitch_data_5

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :pswitch_19
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
        :pswitch_0
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
    .packed-switch 0xe
        :pswitch_1
        :pswitch_1
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
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_2
        :pswitch_6
        :pswitch_5
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0xe
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x6
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_17
        :pswitch_16
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_18
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0xe
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
        :pswitch_19
    .end packed-switch
.end method

.method public static X(Lkb3/n;Lr93/e;Lva3/h;Lkb3/i;Ls93/i;Lr93/s0;)Lu93/u;
    .locals 9

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    if-eqz p1, :cond_2

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    invoke-interface {p1}, Lr93/e;->i()Llb3/c0;

    move-result-object v4

    new-instance v1, Lu93/u;

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, Lu93/u;-><init>(Lkb3/n;Lr93/e;Llb3/c0;Lva3/h;Lkb3/l;Ls93/i;Lr93/s0;)V

    return-object v1

    :cond_0
    const/4 p0, 0x3

    invoke-static {p0}, Lu93/u;->E(I)V

    throw v0

    :cond_1
    const/4 p0, 0x2

    invoke-static {p0}, Lu93/u;->E(I)V

    throw v0

    :cond_2
    const/4 p0, 0x1

    invoke-static {p0}, Lu93/u;->E(I)V

    throw v0

    :cond_3
    const/4 p0, 0x0

    invoke-static {p0}, Lu93/u;->E(I)V

    throw v0
.end method


# virtual methods
.method public final I()Lr93/y0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final L()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final N()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final Q()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final U()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final V()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;

    return-object v0
.end method

.method public final e()Llb3/q0;
    .locals 1

    iget-object v0, p0, Lu93/u;->G:Llb3/i;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x11

    invoke-static {v0}, Lu93/u;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getAnnotations()Ls93/i;
    .locals 1

    iget-object v0, p0, Lu93/u;->J:Ls93/i;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x15

    invoke-static {v0}, Lu93/u;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getConstructors()Ljava/util/Collection;
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x10

    invoke-static {v0}, Lu93/u;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getKind()Lr93/f;
    .locals 1

    sget-object v0, Lr93/f;->z:Lr93/f;

    return-object v0
.end method

.method public final getVisibility()Lr93/r;
    .locals 1

    sget-object v0, Lr93/q;->e:Lr93/p;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x14

    invoke-static {v0}, Lu93/u;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final isInline()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isInner()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final isValue()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j()Ljava/util/List;
    .locals 1

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x16

    invoke-static {v0}, Lu93/u;->E(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final k()Lr93/a0;
    .locals 1

    sget-object v0, Lr93/a0;->x:Lr93/a0;

    return-object v0
.end method

.method public final l(Lmb3/f;)Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 0

    iget-object p1, p0, Lu93/u;->H:Lu93/t;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const/16 p1, 0xe

    invoke-static {p1}, Lu93/u;->E(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final o0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final s()Lu93/j;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "enum entry "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lu93/b;->getName()Lva3/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
