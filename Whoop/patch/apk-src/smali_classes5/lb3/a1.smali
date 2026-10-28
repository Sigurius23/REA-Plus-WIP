.class public final Llb3/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob3/n;


# static fields
.field public static final b:Llb3/a1;


# instance fields
.field public final a:Llb3/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb3/a1;

    sget-object v1, Llb3/y0;->a:Llb3/w0;

    invoke-direct {v0, v1}, Llb3/a1;-><init>(Llb3/y0;)V

    sput-object v0, Llb3/a1;->b:Llb3/a1;

    return-void
.end method

.method public constructor <init>(Llb3/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb3/a1;->a:Llb3/y0;

    return-void
.end method

.method public static synthetic a(I)V
    .locals 13

    const/16 v0, 0x25

    const/16 v1, 0x22

    const/16 v2, 0x8

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq p0, v4, :cond_0

    if-eq p0, v3, :cond_0

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    packed-switch p0, :pswitch_data_2

    packed-switch p0, :pswitch_data_3

    const-string v5, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    goto :goto_0

    :cond_0
    :pswitch_0
    const-string v5, "@NotNull method %s.%s must not return null"

    :goto_0
    if-eq p0, v4, :cond_1

    if-eq p0, v3, :cond_1

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    packed-switch p0, :pswitch_data_4

    packed-switch p0, :pswitch_data_5

    packed-switch p0, :pswitch_data_6

    packed-switch p0, :pswitch_data_7

    const/4 v6, 0x3

    goto :goto_1

    :cond_1
    :pswitch_1
    move v6, v3

    :goto_1
    new-array v6, v6, [Ljava/lang/Object;

    const-string v7, "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor"

    const/4 v8, 0x0

    packed-switch p0, :pswitch_data_8

    :pswitch_2
    const-string v9, "substitution"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_3
    const-string v9, "projectionKind"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_4
    const-string v9, "typeParameterVariance"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_5
    const-string v9, "annotations"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_6
    const-string v9, "substituted"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_7
    const-string v9, "originalType"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_8
    const-string v9, "originalProjection"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_9
    const-string v9, "typeProjection"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_a
    const-string v9, "howThisTypeIsUsed"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_b
    const-string v9, "type"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_c
    const-string v9, "context"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_d
    const-string v9, "substitutionContext"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_e
    const-string v9, "second"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_f
    const-string v9, "first"

    aput-object v9, v6, v8

    goto :goto_2

    :pswitch_10
    aput-object v7, v6, v8

    :goto_2
    const-string v8, "safeSubstitute"

    const-string v9, "unsafeSubstitute"

    const-string v10, "projectedTypeForConflictedTypeWithUnsafeVariance"

    const-string v11, "filterOutUnsafeVariance"

    const-string v12, "combine"

    if-eq p0, v4, :cond_6

    if-eq p0, v3, :cond_5

    if-eq p0, v2, :cond_4

    if-eq p0, v1, :cond_3

    if-eq p0, v0, :cond_2

    packed-switch p0, :pswitch_data_9

    packed-switch p0, :pswitch_data_a

    packed-switch p0, :pswitch_data_b

    packed-switch p0, :pswitch_data_c

    aput-object v7, v6, v4

    goto :goto_3

    :pswitch_11
    aput-object v10, v6, v4

    goto :goto_3

    :pswitch_12
    aput-object v9, v6, v4

    goto :goto_3

    :pswitch_13
    aput-object v8, v6, v4

    goto :goto_3

    :cond_2
    :pswitch_14
    aput-object v12, v6, v4

    goto :goto_3

    :cond_3
    aput-object v11, v6, v4

    goto :goto_3

    :cond_4
    const-string v7, "getSubstitution"

    aput-object v7, v6, v4

    goto :goto_3

    :cond_5
    const-string v7, "replaceWithContravariantApproximatingSubstitution"

    aput-object v7, v6, v4

    goto :goto_3

    :cond_6
    const-string v7, "replaceWithNonApproximatingSubstitution"

    aput-object v7, v6, v4

    :goto_3
    packed-switch p0, :pswitch_data_d

    :pswitch_15
    const-string v7, "create"

    aput-object v7, v6, v3

    goto :goto_4

    :pswitch_16
    aput-object v12, v6, v3

    goto :goto_4

    :pswitch_17
    aput-object v11, v6, v3

    goto :goto_4

    :pswitch_18
    aput-object v10, v6, v3

    goto :goto_4

    :pswitch_19
    aput-object v9, v6, v3

    goto :goto_4

    :pswitch_1a
    const-string v7, "substituteWithoutApproximation"

    aput-object v7, v6, v3

    goto :goto_4

    :pswitch_1b
    const-string v7, "substitute"

    aput-object v7, v6, v3

    goto :goto_4

    :pswitch_1c
    aput-object v8, v6, v3

    goto :goto_4

    :pswitch_1d
    const-string v7, "<init>"

    aput-object v7, v6, v3

    goto :goto_4

    :pswitch_1e
    const-string v7, "createChainedSubstitutor"

    aput-object v7, v6, v3

    :goto_4
    :pswitch_1f
    invoke-static {v5, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    if-eq p0, v4, :cond_7

    if-eq p0, v3, :cond_7

    if-eq p0, v2, :cond_7

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_7

    packed-switch p0, :pswitch_data_e

    packed-switch p0, :pswitch_data_f

    packed-switch p0, :pswitch_data_10

    packed-switch p0, :pswitch_data_11

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    :pswitch_20
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x13
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1d
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x28
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0xb
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x13
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x1d
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x28
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_8
    .packed-switch 0x1
        :pswitch_10
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_2
        :pswitch_10
        :pswitch_b
        :pswitch_a
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_7
        :pswitch_6
        :pswitch_8
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_10
        :pswitch_5
        :pswitch_10
        :pswitch_4
        :pswitch_9
        :pswitch_10
        :pswitch_4
        :pswitch_3
        :pswitch_10
        :pswitch_10
        :pswitch_10
    .end packed-switch

    :pswitch_data_9
    .packed-switch 0xb
        :pswitch_13
        :pswitch_13
        :pswitch_13
    .end packed-switch

    :pswitch_data_a
    .packed-switch 0x13
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
        :pswitch_12
    .end packed-switch

    :pswitch_data_b
    .packed-switch 0x1d
        :pswitch_11
        :pswitch_11
        :pswitch_11
        :pswitch_11
    .end packed-switch

    :pswitch_data_c
    .packed-switch 0x28
        :pswitch_14
        :pswitch_14
        :pswitch_14
    .end packed-switch

    :pswitch_data_d
    .packed-switch 0x1
        :pswitch_1f
        :pswitch_1f
        :pswitch_1e
        :pswitch_1e
        :pswitch_15
        :pswitch_15
        :pswitch_1d
        :pswitch_1f
        :pswitch_1c
        :pswitch_1c
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_18
        :pswitch_18
        :pswitch_18
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
        :pswitch_17
        :pswitch_1f
        :pswitch_16
        :pswitch_16
        :pswitch_1f
        :pswitch_16
        :pswitch_16
        :pswitch_1f
        :pswitch_1f
        :pswitch_1f
    .end packed-switch

    :pswitch_data_e
    .packed-switch 0xb
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch

    :pswitch_data_f
    .packed-switch 0x13
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch

    :pswitch_data_10
    .packed-switch 0x1d
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch

    :pswitch_data_11
    .packed-switch 0x28
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch
.end method

.method public static b(Llb3/g1;Llb3/g1;)Llb3/g1;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_7

    if-eqz p1, :cond_6

    sget-object v1, Llb3/g1;->y:Llb3/g1;

    if-ne p0, v1, :cond_1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const/16 p0, 0x28

    invoke-static {p0}, Llb3/a1;->a(I)V

    throw v0

    :cond_1
    if-ne p1, v1, :cond_3

    if-eqz p0, :cond_2

    return-object p0

    :cond_2
    const/16 p0, 0x29

    invoke-static {p0}, Llb3/a1;->a(I)V

    throw v0

    :cond_3
    if-ne p0, p1, :cond_5

    if-eqz p1, :cond_4

    return-object p1

    :cond_4
    const/16 p0, 0x2a

    invoke-static {p0}, Llb3/a1;->a(I)V

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Variance conflict: type parameter variance \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\' and projection kind \'"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\' cannot be combined"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_6
    const/16 p0, 0x27

    invoke-static {p0}, Llb3/a1;->a(I)V

    throw v0

    :cond_7
    const/16 p0, 0x26

    invoke-static {p0}, Llb3/a1;->a(I)V

    throw v0
.end method

.method public static c(Llb3/g1;Llb3/g1;)I
    .locals 2

    sget-object v0, Llb3/g1;->z:Llb3/g1;

    if-ne p0, v0, :cond_0

    sget-object v1, Llb3/g1;->E:Llb3/g1;

    if-ne p1, v1, :cond_0

    const/4 p0, 0x3

    return p0

    :cond_0
    sget-object v1, Llb3/g1;->E:Llb3/g1;

    if-ne p0, v1, :cond_1

    if-ne p1, v0, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static d(Llb3/y;)Llb3/a1;
    .locals 2

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object p0

    sget-object v1, Llb3/s0;->b:Llb3/d;

    invoke-virtual {v1, v0, p0}, Llb3/d;->f(Llb3/q0;Ljava/util/List;)Llb3/y0;

    move-result-object p0

    new-instance v0, Llb3/a1;

    invoke-direct {v0, p0}, Llb3/a1;-><init>(Llb3/y0;)V

    return-object v0

    :cond_0
    const/4 p0, 0x6

    invoke-static {p0}, Llb3/a1;->a(I)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static e(Llb3/y0;Llb3/y0;)Llb3/a1;
    .locals 1

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Llb3/y0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object p0, p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Llb3/y0;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Llb3/p;

    invoke-direct {v0, p0, p1}, Llb3/p;-><init>(Llb3/y0;Llb3/y0;)V

    move-object p0, v0

    :goto_0
    new-instance p1, Llb3/a1;

    invoke-direct {p1, p0}, Llb3/a1;-><init>(Llb3/y0;)V

    return-object p1

    :cond_2
    const/4 p0, 0x4

    invoke-static {p0}, Llb3/a1;->a(I)V

    throw v0

    :cond_3
    const/4 p0, 0x3

    invoke-static {p0}, Llb3/a1;->a(I)V

    throw v0
.end method

.method public static h(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lub3/j;->d(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "[Exception while computing toString(): "

    const-string v1, "]"

    invoke-static {v0, v1, p0}, Lvl/b;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0
.end method


# virtual methods
.method public final f()Llb3/y0;
    .locals 1

    iget-object v0, p0, Llb3/a1;->a:Llb3/y0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/16 v0, 0x8

    invoke-static {v0}, Llb3/a1;->a(I)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final g(Llb3/y;Llb3/g1;)Llb3/y;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    iget-object v1, p0, Llb3/a1;->a:Llb3/y0;

    invoke-virtual {v1}, Llb3/y0;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p1

    :cond_0
    :try_start_0
    new-instance v1, Llb3/v0;

    invoke-direct {v1, p1, p2}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    const/4 p1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Llb3/a1;->j(Llb3/u0;Lr93/x0;I)Llb3/u0;

    move-result-object p1

    invoke-virtual {p1}, Llb3/u0;->b()Llb3/y;

    move-result-object p1
    :try_end_0
    .catch Llb3/z0; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_1

    return-object p1

    :cond_1
    const/16 p1, 0xc

    invoke-static {p1}, Llb3/a1;->a(I)V

    throw v0

    :catch_0
    move-exception p1

    sget-object p2, Lnb3/k;->K:Lnb3/k;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object p1

    return-object p1

    :cond_2
    const/16 p1, 0x9

    invoke-static {p1}, Llb3/a1;->a(I)V

    throw v0
.end method

.method public final i(Llb3/y;Llb3/g1;)Llb3/y;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    if-eqz p2, :cond_3

    new-instance v1, Llb3/v0;

    invoke-virtual {p0}, Llb3/a1;->f()Llb3/y0;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Llb3/y0;->f(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    iget-object p1, p0, Llb3/a1;->a:Llb3/y0;

    invoke-virtual {p1}, Llb3/y0;->e()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :try_start_0
    invoke-virtual {p0, v1, v0, p2}, Llb3/a1;->j(Llb3/u0;Lr93/x0;I)Llb3/u0;

    move-result-object v1
    :try_end_0
    .catch Llb3/z0; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    :goto_0
    invoke-virtual {p1}, Llb3/y0;->a()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p1}, Llb3/y0;->b()Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Llb3/y0;->b()Z

    move-result p1

    invoke-static {v1, p1}, Ldp/d;->p(Llb3/u0;Z)Llb3/u0;

    move-result-object v1

    :goto_1
    if-nez v1, :cond_2

    return-object v0

    :cond_2
    invoke-virtual {v1}, Llb3/u0;->b()Llb3/y;

    move-result-object p1

    return-object p1

    :cond_3
    const/16 p1, 0xf

    invoke-static {p1}, Llb3/a1;->a(I)V

    throw v0

    :cond_4
    const/16 p1, 0xe

    invoke-static {p1}, Llb3/a1;->a(I)V

    throw v0
.end method

.method public final j(Llb3/u0;Lr93/x0;I)Llb3/u0;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    const/4 v3, 0x0

    if-eqz p1, :cond_27

    const/16 v4, 0x64

    iget-object v5, v0, Llb3/a1;->a:Llb3/y0;

    if-gt v2, v4, :cond_26

    invoke-virtual/range {p1 .. p1}, Llb3/u0;->c()Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_c

    :cond_0
    invoke-virtual/range {p1 .. p1}, Llb3/u0;->b()Llb3/y;

    move-result-object v4

    instance-of v6, v4, Llb3/e1;

    const/4 v7, 0x1

    if-eqz v6, :cond_2

    check-cast v4, Llb3/e1;

    invoke-interface {v4}, Llb3/e1;->G()Llb3/f1;

    move-result-object v3

    invoke-interface {v4}, Llb3/e1;->b()Llb3/y;

    move-result-object v4

    new-instance v5, Llb3/v0;

    invoke-virtual/range {p1 .. p1}, Llb3/u0;->a()Llb3/g1;

    move-result-object v6

    invoke-direct {v5, v3, v6}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    add-int/2addr v2, v7

    invoke-virtual {v0, v5, v1, v2}, Llb3/a1;->j(Llb3/u0;Lr93/x0;I)Llb3/u0;

    move-result-object v1

    invoke-virtual {v1}, Llb3/u0;->c()Z

    move-result v2

    if-eqz v2, :cond_1

    return-object v1

    :cond_1
    invoke-virtual/range {p1 .. p1}, Llb3/u0;->a()Llb3/g1;

    move-result-object v2

    invoke-virtual {v0, v4, v2}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v2

    invoke-virtual {v1}, Llb3/u0;->b()Llb3/y;

    move-result-object v3

    invoke-virtual {v3}, Llb3/y;->p0()Llb3/f1;

    move-result-object v3

    invoke-static {v3, v2}, Llb3/o;->p(Llb3/f1;Llb3/y;)Llb3/f1;

    move-result-object v2

    new-instance v3, Llb3/v0;

    invoke-virtual {v1}, Llb3/u0;->a()Llb3/g1;

    move-result-object v1

    invoke-direct {v3, v2, v1}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    return-object v3

    :cond_2
    invoke-static {v4}, Ldc/a;->F(Llb3/y;)V

    invoke-virtual {v4}, Llb3/y;->p0()Llb3/f1;

    move-result-object v6

    instance-of v6, v6, Lka3/h;

    if-eqz v6, :cond_3

    goto/16 :goto_c

    :cond_3
    invoke-virtual {v5, v4}, Llb3/y0;->d(Llb3/y;)Llb3/u0;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-virtual {v4}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v8

    sget-object v9, Lo93/m;->y:Lva3/e;

    invoke-interface {v8, v9}, Ls93/i;->J(Lva3/e;)Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {v6}, Llb3/u0;->b()Llb3/y;

    move-result-object v8

    invoke-virtual {v8}, Llb3/y;->i0()Llb3/q0;

    move-result-object v8

    instance-of v9, v8, Lmb3/i;

    if-nez v9, :cond_5

    goto :goto_0

    :cond_5
    check-cast v8, Lmb3/i;

    invoke-virtual {v8}, Lmb3/i;->b()Llb3/u0;

    move-result-object v8

    invoke-virtual {v8}, Llb3/u0;->a()Llb3/g1;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Llb3/u0;->a()Llb3/g1;

    move-result-object v10

    invoke-static {v10, v9}, Llb3/a1;->c(Llb3/g1;Llb3/g1;)I

    move-result v10

    const/4 v11, 0x3

    if-ne v10, v11, :cond_6

    new-instance v6, Llb3/v0;

    invoke-virtual {v8}, Llb3/u0;->b()Llb3/y;

    move-result-object v8

    invoke-direct {v6, v8}, Llb3/v0;-><init>(Llb3/y;)V

    goto :goto_0

    :cond_6
    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    invoke-interface {v1}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v10

    invoke-static {v10, v9}, Llb3/a1;->c(Llb3/g1;Llb3/g1;)I

    move-result v9

    if-ne v9, v11, :cond_9

    new-instance v6, Llb3/v0;

    invoke-virtual {v8}, Llb3/u0;->b()Llb3/y;

    move-result-object v8

    invoke-direct {v6, v8}, Llb3/v0;-><init>(Llb3/y;)V

    goto :goto_0

    :cond_8
    move-object v6, v3

    :cond_9
    :goto_0
    invoke-virtual/range {p1 .. p1}, Llb3/u0;->a()Llb3/g1;

    move-result-object v8

    if-nez v6, :cond_b

    invoke-static {v4}, Lds/p;->J(Llb3/y;)Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-static {v4}, Lkotlin/jvm/internal/j;->L(Llb3/y;)Z

    move-result v9

    if-nez v9, :cond_b

    invoke-static {v4}, Lds/p;->r(Llb3/y;)Llb3/r;

    move-result-object v3

    iget-object v4, v3, Llb3/r;->y:Llb3/c0;

    iget-object v3, v3, Llb3/r;->x:Llb3/c0;

    new-instance v5, Llb3/v0;

    invoke-direct {v5, v3, v8}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    add-int/2addr v2, v7

    invoke-virtual {v0, v5, v1, v2}, Llb3/a1;->j(Llb3/u0;Lr93/x0;I)Llb3/u0;

    move-result-object v5

    new-instance v6, Llb3/v0;

    invoke-direct {v6, v4, v8}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    invoke-virtual {v0, v6, v1, v2}, Llb3/a1;->j(Llb3/u0;Lr93/x0;I)Llb3/u0;

    move-result-object v1

    invoke-virtual {v5}, Llb3/u0;->a()Llb3/g1;

    move-result-object v2

    invoke-virtual {v5}, Llb3/u0;->b()Llb3/y;

    move-result-object v6

    if-ne v6, v3, :cond_a

    invoke-virtual {v1}, Llb3/u0;->b()Llb3/y;

    move-result-object v3

    if-ne v3, v4, :cond_a

    goto/16 :goto_c

    :cond_a
    invoke-virtual {v5}, Llb3/u0;->b()Llb3/y;

    move-result-object v3

    invoke-static {v3}, Lse/a;->t(Llb3/y;)Llb3/c0;

    move-result-object v3

    invoke-virtual {v1}, Llb3/u0;->b()Llb3/y;

    move-result-object v1

    invoke-static {v1}, Lse/a;->t(Llb3/y;)Llb3/c0;

    move-result-object v1

    invoke-static {v3, v1}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object v1

    new-instance v3, Llb3/v0;

    invoke-direct {v3, v1, v2}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    return-object v3

    :cond_b
    invoke-static {v4}, Lo93/h;->F(Llb3/y;)Z

    move-result v1

    if-nez v1, :cond_25

    invoke-static {v4}, Llb3/o;->e(Llb3/y;)Z

    move-result v1

    if-eqz v1, :cond_c

    goto/16 :goto_c

    :cond_c
    const/4 v1, 0x0

    const/4 v9, 0x2

    if-eqz v6, :cond_16

    invoke-virtual {v6}, Llb3/u0;->a()Llb3/g1;

    move-result-object v2

    invoke-static {v8, v2}, Llb3/a1;->c(Llb3/g1;Llb3/g1;)I

    move-result v2

    invoke-virtual {v4}, Llb3/y;->i0()Llb3/q0;

    move-result-object v10

    instance-of v10, v10, Lza3/b;

    if-nez v10, :cond_f

    invoke-static {v2}, Le4/p;->e(I)I

    move-result v10

    if-eq v10, v7, :cond_e

    if-eq v10, v9, :cond_d

    goto :goto_1

    :cond_d
    new-instance v1, Llb3/z0;

    const-string v2, "Out-projection in in-position"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    new-instance v1, Llb3/v0;

    sget-object v2, Llb3/g1;->E:Llb3/g1;

    invoke-virtual {v4}, Llb3/y;->i0()Llb3/q0;

    move-result-object v3

    invoke-interface {v3}, Llb3/q0;->c()Lo93/h;

    move-result-object v3

    invoke-virtual {v3}, Lo93/h;->p()Llb3/c0;

    move-result-object v3

    invoke-direct {v1, v3, v2}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    return-object v1

    :cond_f
    :goto_1
    invoke-static {v4}, Lkotlin/jvm/internal/j;->D(Llb3/y;)Llb3/j;

    move-result-object v10

    invoke-virtual {v6}, Llb3/u0;->c()Z

    move-result v11

    if-eqz v11, :cond_10

    return-object v6

    :cond_10
    if-eqz v10, :cond_11

    invoke-virtual {v6}, Llb3/u0;->b()Llb3/y;

    move-result-object v11

    invoke-interface {v10, v11}, Llb3/j;->l(Llb3/y;)Llb3/f1;

    move-result-object v10

    goto :goto_2

    :cond_11
    invoke-virtual {v6}, Llb3/u0;->b()Llb3/y;

    move-result-object v10

    invoke-virtual {v4}, Llb3/y;->k0()Z

    move-result v11

    invoke-static {v10, v11}, Llb3/d1;->h(Llb3/y;Z)Llb3/y;

    move-result-object v10

    :goto_2
    invoke-virtual {v4}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v11

    invoke-interface {v11}, Ls93/i;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_14

    invoke-virtual {v4}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v4

    invoke-virtual {v5, v4}, Llb3/y0;->c(Ls93/i;)Ls93/i;

    move-result-object v4

    if-eqz v4, :cond_13

    sget-object v3, Lo93/m;->y:Lva3/e;

    invoke-interface {v4, v3}, Ls93/i;->J(Lva3/e;)Z

    move-result v3

    if-nez v3, :cond_12

    goto :goto_3

    :cond_12
    new-instance v3, Ls93/n;

    new-instance v5, Llb3/w;

    invoke-direct {v5, v7}, Llb3/w;-><init>(I)V

    invoke-direct {v3, v4, v5}, Ls93/n;-><init>(Ls93/i;Llb3/w;)V

    move-object v4, v3

    :goto_3
    new-instance v3, Ls93/j;

    invoke-virtual {v10}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v5

    new-array v9, v9, [Ls93/i;

    aput-object v5, v9, v1

    aput-object v4, v9, v7

    invoke-direct {v3, v9}, Ls93/j;-><init>([Ls93/i;)V

    invoke-static {v10, v3}, Lio/sentry/config/a;->S(Llb3/y;Ls93/i;)Llb3/y;

    move-result-object v10

    goto :goto_4

    :cond_13
    const/16 v1, 0x21

    invoke-static {v1}, Llb3/a1;->a(I)V

    throw v3

    :cond_14
    :goto_4
    if-ne v2, v7, :cond_15

    invoke-virtual {v6}, Llb3/u0;->a()Llb3/g1;

    move-result-object v1

    invoke-static {v8, v1}, Llb3/a1;->b(Llb3/g1;Llb3/g1;)Llb3/g1;

    move-result-object v8

    :cond_15
    new-instance v1, Llb3/v0;

    invoke-direct {v1, v10, v8}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    return-object v1

    :cond_16
    invoke-virtual/range {p1 .. p1}, Llb3/u0;->b()Llb3/y;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Llb3/u0;->a()Llb3/g1;

    move-result-object v6

    invoke-virtual {v4}, Llb3/y;->i0()Llb3/q0;

    move-result-object v8

    invoke-interface {v8}, Llb3/q0;->d()Lr93/h;

    move-result-object v8

    instance-of v8, v8, Lr93/x0;

    if-eqz v8, :cond_17

    goto/16 :goto_c

    :cond_17
    invoke-virtual {v4}, Llb3/y;->p0()Llb3/f1;

    move-result-object v8

    instance-of v10, v8, Llb3/a;

    if-eqz v10, :cond_18

    check-cast v8, Llb3/a;

    goto :goto_5

    :cond_18
    move-object v8, v3

    :goto_5
    if-eqz v8, :cond_19

    invoke-virtual {v8}, Llb3/a;->z0()Llb3/c0;

    move-result-object v8

    goto :goto_6

    :cond_19
    move-object v8, v3

    :goto_6
    if-eqz v8, :cond_1c

    instance-of v3, v5, Llb3/u;

    if-eqz v3, :cond_1b

    move-object v3, v5

    check-cast v3, Llb3/u;

    iget-boolean v10, v3, Llb3/u;->d:Z

    if-nez v10, :cond_1a

    goto :goto_7

    :cond_1a
    new-instance v10, Llb3/a1;

    new-instance v11, Llb3/u;

    iget-object v12, v3, Llb3/u;->b:[Lr93/x0;

    iget-object v3, v3, Llb3/u;->c:[Llb3/u0;

    invoke-direct {v11, v12, v3, v1}, Llb3/u;-><init>([Lr93/x0;[Llb3/u0;Z)V

    invoke-direct {v10, v11}, Llb3/a1;-><init>(Llb3/y0;)V

    goto :goto_8

    :cond_1b
    :goto_7
    move-object v10, v0

    :goto_8
    sget-object v3, Llb3/g1;->y:Llb3/g1;

    invoke-virtual {v10, v8, v3}, Llb3/a1;->i(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v3

    :cond_1c
    invoke-virtual {v4}, Llb3/y;->i0()Llb3/q0;

    move-result-object v8

    invoke-interface {v8}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v4}, Llb3/y;->X()Ljava/util/List;

    move-result-object v10

    new-instance v11, Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    move v12, v1

    :goto_9
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v13

    if-ge v1, v13, :cond_22

    invoke-interface {v8, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lr93/x0;

    invoke-interface {v10, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Llb3/u0;

    add-int/lit8 v15, v2, 0x1

    invoke-virtual {v0, v14, v13, v15}, Llb3/a1;->j(Llb3/u0;Lr93/x0;I)Llb3/u0;

    move-result-object v15

    invoke-interface {v13}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v9

    invoke-virtual {v15}, Llb3/u0;->a()Llb3/g1;

    move-result-object v7

    invoke-static {v9, v7}, Llb3/a1;->c(Llb3/g1;Llb3/g1;)I

    move-result v7

    invoke-static {v7}, Le4/p;->e(I)I

    move-result v7

    if-eqz v7, :cond_1f

    const/4 v9, 0x1

    if-eq v7, v9, :cond_1d

    const/4 v9, 0x2

    if-eq v7, v9, :cond_1e

    goto :goto_a

    :cond_1d
    const/4 v9, 0x2

    :cond_1e
    invoke-static {v13}, Llb3/d1;->j(Lr93/x0;)Llb3/h0;

    move-result-object v15

    goto :goto_a

    :cond_1f
    const/4 v9, 0x2

    invoke-interface {v13}, Lr93/x0;->getVariance()Llb3/g1;

    move-result-object v7

    sget-object v13, Llb3/g1;->y:Llb3/g1;

    if-eq v7, v13, :cond_20

    invoke-virtual {v15}, Llb3/u0;->c()Z

    move-result v7

    if-nez v7, :cond_20

    new-instance v7, Llb3/v0;

    invoke-virtual {v15}, Llb3/u0;->b()Llb3/y;

    move-result-object v15

    invoke-direct {v7, v15, v13}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    move-object v15, v7

    :cond_20
    :goto_a
    if-eq v15, v14, :cond_21

    const/4 v12, 0x1

    :cond_21
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    const/4 v7, 0x1

    goto :goto_9

    :cond_22
    if-nez v12, :cond_23

    goto :goto_b

    :cond_23
    move-object v10, v11

    :goto_b
    invoke-virtual {v4}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v1

    invoke-virtual {v5, v1}, Llb3/y0;->c(Ls93/i;)Ls93/i;

    move-result-object v1

    invoke-static {v4, v10, v1}, Lse/a;->U(Llb3/y;Ljava/util/List;Ls93/i;)Llb3/y;

    move-result-object v1

    instance-of v2, v1, Llb3/c0;

    if-eqz v2, :cond_24

    instance-of v2, v3, Llb3/c0;

    if-eqz v2, :cond_24

    check-cast v1, Llb3/c0;

    check-cast v3, Llb3/c0;

    invoke-static {v1, v3}, Llb3/o;->o(Llb3/c0;Llb3/c0;)Llb3/c0;

    move-result-object v1

    :cond_24
    new-instance v2, Llb3/v0;

    invoke-direct {v2, v1, v6}, Llb3/v0;-><init>(Llb3/y;Llb3/g1;)V

    return-object v2

    :cond_25
    :goto_c
    return-object p1

    :cond_26
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Recursion too deep. Most likely infinite loop while substituting "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Llb3/a1;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "; substitution: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Llb3/a1;->h(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_27
    const/16 v1, 0x12

    invoke-static {v1}, Llb3/a1;->a(I)V

    throw v3
.end method
