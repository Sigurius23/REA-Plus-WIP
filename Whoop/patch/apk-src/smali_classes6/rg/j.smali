.class public abstract Lrg/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx30/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 14

    move-object v1, p1

    move/from16 v13, p3

    const-string v0, "element"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p2

    check-cast v10, Lp1/q;

    const v0, 0x4b027928    # 8550696.0f

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v10, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v13

    invoke-virtual {v10, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x20

    goto :goto_1

    :cond_1
    const/16 v2, 0x10

    :goto_1
    or-int/2addr v0, v2

    and-int/lit8 v2, v0, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_3

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v10}, Lp1/q;->X()V

    goto :goto_3

    :cond_3
    :goto_2
    iget-object v2, p0, Lx30/e;->b:Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const v3, 0x7f140fb5

    invoke-static {v3, v2, v10}, Lq83/g;->X(I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v10}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v3

    iget-wide v3, v3, Ld40/n;->e:J

    invoke-static {v10}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v5

    iget-object v5, v5, Lg1/h9;->j:Ll3/v0;

    and-int/lit8 v11, v0, 0x70

    const/16 v12, 0x1e4

    move-object v0, v2

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v0 .. v12}, Lup/d;->d(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLl3/v0;ZLl3/m0;ILc93/a;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v2, Lpp2/o;

    const/16 v3, 0x1d

    invoke-direct {v2, p0, p1, v13, v3}, Lpp2/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public static b(II)V
    .locals 2

    if-ltz p0, :cond_1

    if-lt p0, p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "index"

    if-ltz p0, :cond_3

    if-gez p1, :cond_2

    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "negative size: "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v1, p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s (%s) must be less than size (%s)"

    invoke-static {p1, p0}, Lrj/j;->o(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {v1, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s (%s) must not be negative"

    invoke-static {p1, p0}, Lrj/j;->o(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    :goto_1
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final c(Landroid/net/ConnectivityManager;Lkotlin/jvm/functions/Function1;)V
    .locals 4

    :try_start_0
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    sget-object p1, Lb23/i;->a:Lb23/i;

    sget-object p1, Lb23/i;->d:Lb23/e;

    sget-object v0, Lb23/g;->F:Lb23/g;

    const-string v1, "ConnectivityManager"

    invoke-interface {p1, v0, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lb23/i;->c:Lb23/j;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "SecurityException occurred. This is a known bug on Android 11. We log and prevent the app from crashing. Cause: "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2, p0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static d(III)V
    .locals 1

    if-ltz p0, :cond_1

    if-lt p1, p0, :cond_1

    if-le p1, p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    if-ltz p0, :cond_4

    if-gt p0, p2, :cond_4

    if-ltz p1, :cond_3

    if-le p1, p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "end index (%s) must not be less than start index (%s)"

    invoke-static {p1, p0}, Lrj/j;->o(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_3
    :goto_1
    const-string p0, "end index"

    invoke-static {p1, p2, p0}, Lrg/j;->e(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_4
    const-string p1, "start index"

    invoke-static {p0, p2, p1}, Lrg/j;->e(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_2
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static e(IILjava/lang/String;)Ljava/lang/String;
    .locals 0

    if-gez p0, :cond_0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p2, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s (%s) must not be negative"

    invoke-static {p1, p0}, Lrj/j;->o(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    if-ltz p1, :cond_1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p2, p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s (%s) must not be greater than size (%s)"

    invoke-static {p1, p0}, Lrj/j;->o(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p2, "negative size: "

    invoke-static {p1, p2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static f(ILjava/lang/String;IZ)I
    .locals 4

    :goto_0
    if-ge p0, p2, :cond_7

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_5

    :cond_0
    const/16 v1, 0x7f

    if-ge v0, v1, :cond_5

    const/16 v1, 0x30

    const/16 v3, 0x3a

    if-gt v1, v0, :cond_1

    if-ge v0, v3, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0x61

    if-gt v1, v0, :cond_2

    const/16 v1, 0x7b

    if-ge v0, v1, :cond_2

    goto :goto_1

    :cond_2
    const/16 v1, 0x41

    if-gt v1, v0, :cond_3

    const/16 v1, 0x5b

    if-ge v0, v1, :cond_3

    goto :goto_1

    :cond_3
    if-ne v0, v3, :cond_4

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    move v0, v2

    :goto_2
    xor-int/lit8 v1, p3, 0x1

    if-ne v0, v1, :cond_6

    return p0

    :cond_6
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_7
    return p2
.end method

.method public static final g(Ljg/b;)Lrj/j;
    .locals 18

    new-instance v0, Lhg/i;

    sget-object v1, Lhg/l;->i:Lhg/l;

    new-instance v2, Ljg/e;

    const-string v3, "Code"

    invoke-direct {v2, v3}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x1

    new-array v4, v3, [Lhg/d;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    invoke-static {v4}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {v0, v1, v2, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v2, Lhg/i;

    new-instance v4, Ljg/e;

    const-string v6, "AccessKeyId"

    invoke-direct {v4, v6}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v6, v3, [Lhg/d;

    aput-object v4, v6, v5

    invoke-static {v6}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v1, v4, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    new-instance v6, Ljg/e;

    const-string v7, "SecretAccessKey"

    invoke-direct {v6, v7}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v7, v3, [Lhg/d;

    aput-object v6, v7, v5

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-direct {v4, v1, v6, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v6, Lhg/i;

    new-instance v7, Ljg/e;

    const-string v8, "Token"

    invoke-direct {v7, v8}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v3, [Lhg/d;

    aput-object v7, v8, v5

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    invoke-direct {v6, v1, v7, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v7, Lhg/i;

    sget-object v8, Lhg/l;->k:Lhg/l;

    new-instance v9, Ljg/e;

    const-string v10, "Expiration"

    invoke-direct {v9, v10}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v10, v3, [Lhg/d;

    aput-object v9, v10, v5

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    invoke-direct {v7, v8, v9, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v8, Lhg/i;

    new-instance v9, Ljg/e;

    const-string v10, "AccountId"

    invoke-direct {v9, v10}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v10, v3, [Lhg/d;

    aput-object v9, v10, v5

    invoke-static {v10}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    invoke-direct {v8, v1, v9, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v9, Lhg/i;

    new-instance v10, Ljg/e;

    const-string v11, "Message"

    invoke-direct {v10, v11}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v3, v3, [Lhg/d;

    aput-object v10, v3, v5

    invoke-static {v3}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v9, v1, v3, v5}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v1, Lxl/a;

    const/16 v3, 0xd

    invoke-direct {v1, v3}, Lxl/a;-><init>(I)V

    invoke-virtual {v1, v0}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v1, v2}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v1, v4}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v1, v6}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v1, v7}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v1, v8}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v1, v9}, Lxl/a;->p(Lhg/i;)V

    new-instance v3, Lhg/j;

    invoke-direct {v3, v1}, Lhg/j;-><init>(Lxl/a;)V

    move-object/from16 v1, p0

    :try_start_0
    invoke-virtual {v1, v3}, Ljg/b;->d(Lhg/j;)Lhg/c;

    move-result-object v1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_0
    invoke-interface {v1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v12

    iget v3, v0, Lhg/i;->b:I

    if-nez v12, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v3, :cond_1

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v10

    :goto_1
    const/4 v5, 0x0

    goto :goto_0

    :cond_1
    :goto_2
    iget v3, v2, Lhg/i;->b:I

    if-nez v12, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v3, :cond_3

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v13

    goto :goto_1

    :cond_3
    :goto_3
    iget v3, v4, Lhg/i;->b:I

    if-nez v12, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v3, :cond_5

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v14

    goto :goto_1

    :cond_5
    :goto_4
    iget v3, v6, Lhg/i;->b:I

    if-nez v12, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v3, :cond_7

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v15

    goto :goto_1

    :cond_7
    :goto_5
    iget v3, v7, Lhg/i;->b:I

    if-nez v12, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v3, :cond_9

    sget-object v3, Lug/b;->x:Lt9/p;

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt9/p;->p(Ljava/lang/String;)Lug/b;

    move-result-object v16

    goto :goto_1

    :cond_9
    :goto_6
    iget v3, v8, Lhg/i;->b:I

    if-nez v12, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v3, :cond_b

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v17

    goto :goto_1

    :cond_b
    :goto_7
    iget v3, v9, Lhg/i;->b:I

    if-nez v12, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v3, :cond_d

    invoke-interface {v1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v11

    goto :goto_1

    :cond_d
    :goto_8
    if-eqz v12, :cond_e

    invoke-interface {v1}, Lhg/c;->skipValue()V
    :try_end_0
    .catch Laws/smithy/kotlin/runtime/serde/DeserializationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_e
    if-eqz v10, :cond_f

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v10, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v0, "toLowerCase(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_9

    :cond_f
    const/4 v3, 0x0

    :goto_9
    const-string v0, "success"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    if-nez v3, :cond_10

    goto :goto_a

    :cond_10
    new-instance v0, Lwc/t;

    invoke-direct {v0, v10, v11}, Lwc/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_11
    :goto_a
    if-eqz v13, :cond_15

    if-eqz v14, :cond_14

    if-eqz v15, :cond_13

    if-eqz v16, :cond_12

    new-instance v12, Lwc/u;

    invoke-direct/range {v12 .. v17}, Lwc/u;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Ljava/lang/String;)V

    return-object v12

    :cond_12
    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;

    const-string v1, "missing field `Expiration`"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_13
    const/4 v2, 0x0

    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;

    const-string v1, "missing field `Token`"

    invoke-direct {v0, v1, v2}, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_14
    const/4 v2, 0x0

    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;

    const-string v1, "missing field `SecretAccessKey`"

    invoke-direct {v0, v1, v2}, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_15
    const/4 v2, 0x0

    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;

    const-string v1, "missing field `AccessKeyId`"

    invoke-direct {v0, v1, v2}, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;-><init>(Ljava/lang/String;I)V

    throw v0

    :catch_0
    move-exception v0

    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;

    const-string v2, "invalid JSON credentials response"

    invoke-direct {v1, v2, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static h(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne p0, p1, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    goto :goto_2

    :cond_1
    move v1, v2

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v3, v4, :cond_2

    goto :goto_1

    :cond_2
    or-int/lit8 v3, v3, 0x20

    add-int/lit8 v3, v3, -0x61

    int-to-char v3, v3

    const/16 v5, 0x1a

    if-ge v3, v5, :cond_3

    or-int/lit8 v4, v4, 0x20

    add-int/lit8 v4, v4, -0x61

    int-to-char v4, v4

    if-ne v3, v4, :cond_3

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return v2

    :cond_4
    :goto_3
    const/4 p0, 0x1

    return p0
.end method

.method public static i(I)Landroid/graphics/PorterDuff$Mode;
    .locals 0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Le4/p;->e(I)I

    move-result p0

    packed-switch p0, :pswitch_data_0

    :goto_0
    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->LIGHTEN:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_1
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DARKEN:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_2
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->OVERLAY:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_3
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SCREEN:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_4
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_5
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->ADD:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_6
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->XOR:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_7
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST_ATOP:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_8
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_9
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_a
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_OUT:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_b
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_c
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_d
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST_OVER:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_e
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_f
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_10
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_11
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static j(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    const-string v0, "UNKNOWN ("

    const-string v1, ")"

    invoke-static {p0, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_0
    const-string p0, "OPERATION FAILED"

    return-object p0

    :pswitch_1
    const-string p0, "INVALID CRC ERROR"

    return-object p0

    :pswitch_2
    const-string p0, "DATA SIZE EXCEEDS LIMIT"

    return-object p0

    :pswitch_3
    const-string p0, "NOT SUPPORTED"

    return-object p0

    :pswitch_4
    const-string p0, "INVALID STATE"

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x102
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static k(Lud3/e0;Lud3/d0;)Ljava/util/List;
    .locals 36

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "url"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "headers"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "Set-Cookie"

    invoke-virtual {v0, v2}, Lud3/d0;->j(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v5, 0x0

    move v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v6, v3, :cond_20

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    const-string v0, "setCookie"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    const/16 v11, 0x3b

    const/4 v12, 0x6

    invoke-static {v8, v11, v5, v5, v12}, Lwd3/f;->g(Ljava/lang/String;CIII)I

    move-result v0

    const/4 v13, 0x2

    const/16 v14, 0x3d

    invoke-static {v8, v14, v5, v0, v13}, Lwd3/f;->g(Ljava/lang/String;CIII)I

    move-result v13

    if-ne v13, v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v5, v13, v8}, Lwd3/f;->r(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v15

    if-nez v15, :cond_1

    goto :goto_1

    :cond_1
    invoke-static/range {v16 .. v16}, Lwd3/f;->i(Ljava/lang/String;)I

    move-result v15

    const/4 v4, -0x1

    if-eq v15, v4, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v13, v13, 0x1

    invoke-static {v13, v0, v8}, Lwd3/f;->r(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lwd3/f;->i(Ljava/lang/String;)I

    move-result v13

    if-eq v13, v4, :cond_3

    :goto_1
    const/4 v15, 0x0

    goto/16 :goto_c

    :cond_3
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v4

    const-wide/16 v18, -0x1

    const-wide v20, 0xe677d21fdbffL

    move/from16 v25, v5

    move/from16 v27, v25

    move/from16 v31, v27

    move-wide/from16 v22, v18

    move-wide/from16 v29, v20

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v24, 0x1

    const/16 v26, 0x1

    const/16 v28, 0x0

    :goto_2
    const-wide v32, 0x7fffffffffffffffL

    const-wide/high16 v34, -0x8000000000000000L

    if-ge v0, v4, :cond_11

    invoke-static {v11, v0, v4, v8}, Lwd3/f;->e(CIILjava/lang/String;)I

    move-result v12

    invoke-static {v14, v0, v12, v8}, Lwd3/f;->e(CIILjava/lang/String;)I

    move-result v11

    invoke-static {v0, v11, v8}, Lwd3/f;->r(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-ge v11, v12, :cond_4

    add-int/lit8 v11, v11, 0x1

    invoke-static {v11, v12, v8}, Lwd3/f;->r(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v11

    goto :goto_3

    :cond_4
    const-string v11, ""

    :goto_3
    const-string v14, "expires"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_6

    :try_start_0
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0, v11}, Lrg/j;->l(ILjava/lang/String;)J

    move-result-wide v29
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    :cond_5
    :goto_4
    move/from16 v27, v24

    goto/16 :goto_5

    :cond_6
    const-string v14, "max-age"

    invoke-virtual {v0, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_9

    :try_start_1
    invoke-static {v11}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v22
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    const-wide/16 v32, 0x0

    cmp-long v0, v22, v32

    if-gtz v0, :cond_5

    move-wide/from16 v22, v34

    goto :goto_4

    :catch_0
    move-exception v0

    :try_start_2
    const-string v14, "-?\\d+"

    invoke-static {v14}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v14

    const-string v5, "compile(...)"

    invoke-static {v14, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v14, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/regex/Matcher;->matches()Z

    move-result v5

    if-eqz v5, :cond_8

    const-string v0, "-"

    const/4 v5, 0x0

    invoke-static {v11, v0, v5}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_7

    move-wide/from16 v32, v34

    :cond_7
    move-wide/from16 v22, v32

    goto :goto_4

    :cond_8
    throw v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    :cond_9
    const-string v5, "domain"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_c

    :try_start_3
    const-string v0, "."

    const/4 v5, 0x0

    invoke-static {v11, v0, v5}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v14

    if-nez v14, :cond_b

    invoke-static {v11, v0}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwd3/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    move-object v15, v0

    const/16 v26, 0x0

    goto :goto_5

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_b
    const-string v0, "Failed requirement."

    new-instance v5, Ljava/lang/IllegalArgumentException;

    invoke-direct {v5, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v5
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1

    :cond_c
    const-string v5, "path"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_d

    move-object v13, v11

    goto :goto_5

    :cond_d
    const-string v5, "secure"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_e

    move/from16 v31, v24

    goto :goto_5

    :cond_e
    const-string v5, "httponly"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_f

    move/from16 v25, v24

    goto :goto_5

    :cond_f
    const-string v5, "samesite"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    move-object/from16 v28, v11

    :catch_1
    :cond_10
    :goto_5
    add-int/lit8 v0, v12, 0x1

    const/4 v5, 0x0

    const/16 v11, 0x3b

    const/4 v12, 0x6

    const/16 v14, 0x3d

    goto/16 :goto_2

    :cond_11
    cmp-long v0, v22, v34

    if-nez v0, :cond_12

    move-wide/from16 v18, v34

    goto :goto_7

    :cond_12
    cmp-long v0, v22, v18

    if-eqz v0, :cond_16

    const-wide v4, 0x20c49ba5e353f7L

    cmp-long v0, v22, v4

    if-gtz v0, :cond_13

    const/16 v0, 0x3e8

    int-to-long v4, v0

    mul-long v32, v22, v4

    :cond_13
    add-long v32, v9, v32

    cmp-long v0, v32, v9

    if-ltz v0, :cond_15

    cmp-long v0, v32, v20

    if-lez v0, :cond_14

    goto :goto_6

    :cond_14
    move-wide/from16 v18, v32

    goto :goto_7

    :cond_15
    :goto_6
    move-wide/from16 v18, v20

    goto :goto_7

    :cond_16
    move-wide/from16 v18, v29

    :goto_7
    iget-object v0, v1, Lud3/e0;->d:Ljava/lang/String;

    if-nez v15, :cond_17

    move-object v15, v0

    goto :goto_8

    :cond_17
    invoke-static {v0, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_18

    goto :goto_8

    :cond_18
    const/4 v5, 0x0

    invoke-static {v0, v15, v5}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v5

    sub-int/2addr v4, v5

    add-int/lit8 v4, v4, -0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x2e

    if-ne v4, v5, :cond_19

    sget-object v4, Lwd3/e;->a:Lyb3/p;

    sget-object v4, Lwd3/e;->a:Lyb3/p;

    invoke-virtual {v4, v0}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_19

    :goto_8
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v4

    if-eq v0, v4, :cond_1a

    sget-object v0, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->d:Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;

    invoke-virtual {v0, v15}, Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1a

    :cond_19
    const/4 v5, 0x0

    goto/16 :goto_1

    :cond_1a
    const-string v0, "/"

    const/4 v5, 0x0

    if-eqz v13, :cond_1c

    invoke-static {v13, v0, v5}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-nez v4, :cond_1b

    goto :goto_a

    :cond_1b
    :goto_9
    move-object/from16 v21, v13

    move-object/from16 v20, v15

    goto :goto_b

    :cond_1c
    :goto_a
    invoke-virtual {v1}, Lud3/e0;->b()Ljava/lang/String;

    move-result-object v4

    const/16 v8, 0x2f

    const/4 v9, 0x6

    invoke-static {v4, v8, v5, v9}, Lyb3/r;->k0(Ljava/lang/CharSequence;CII)I

    move-result v8

    if-eqz v8, :cond_1d

    invoke-virtual {v4, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v4, "substring(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1d
    move-object v13, v0

    goto :goto_9

    :goto_b
    new-instance v15, Lud3/s;

    move/from16 v23, v25

    move/from16 v25, v26

    move/from16 v24, v27

    move-object/from16 v26, v28

    move/from16 v22, v31

    invoke-direct/range {v15 .. v26}, Lud3/s;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)V

    :goto_c
    if-nez v15, :cond_1e

    goto :goto_d

    :cond_1e
    if-nez v7, :cond_1f

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    :cond_1f
    invoke-interface {v7, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_d
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_20
    if-eqz v7, :cond_21

    invoke-static {v7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    const-string v0, "unmodifiableList(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_e

    :cond_21
    const/4 v4, 0x0

    :goto_e
    if-nez v4, :cond_22

    sget-object v4, Lm83/y;->w:Lm83/y;

    :cond_22
    return-object v4
.end method

.method public static l(ILjava/lang/String;)J
    .locals 14

    const/4 v0, 0x0

    invoke-static {v0, p1, p0, v0}, Lrg/j;->f(ILjava/lang/String;IZ)I

    move-result v1

    sget-object v2, Lud3/s;->n:Ljava/util/regex/Pattern;

    invoke-virtual {v2, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    const/4 v3, -0x1

    move v4, v3

    move v5, v4

    move v6, v5

    move v7, v6

    move v8, v7

    move v9, v8

    :goto_0
    const/4 v10, 0x2

    const/4 v11, 0x1

    if-ge v1, p0, :cond_4

    add-int/lit8 v12, v1, 0x1

    invoke-static {v12, p1, p0, v11}, Lrg/j;->f(ILjava/lang/String;IZ)I

    move-result v12

    invoke-virtual {v2, v1, v12}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    const-string v1, "group(...)"

    if-ne v5, v3, :cond_0

    sget-object v13, Lud3/s;->n:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v13}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v13

    invoke-virtual {v13}, Ljava/util/regex/Matcher;->matches()Z

    move-result v13

    if-eqz v13, :cond_0

    invoke-virtual {v2, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v2, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    const/4 v9, 0x3

    invoke-virtual {v2, v9}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    goto :goto_1

    :cond_0
    if-ne v6, v3, :cond_1

    sget-object v10, Lud3/s;->m:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v10}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-virtual {v2, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    goto :goto_1

    :cond_1
    if-ne v7, v3, :cond_2

    sget-object v10, Lud3/s;->l:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v10}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v13

    invoke-virtual {v13}, Ljava/util/regex/Matcher;->matches()Z

    move-result v13

    if-eqz v13, :cond_2

    invoke-virtual {v2, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v11, "US"

    const-string v13, "toLowerCase(...)"

    invoke-static {v1, v11, v7, v1, v13}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object v7

    const-string v10, "pattern(...)"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v10, 0x6

    invoke-static {v7, v1, v0, v0, v10}, Lyb3/r;->g0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v1

    div-int/lit8 v7, v1, 0x4

    goto :goto_1

    :cond_2
    if-ne v4, v3, :cond_3

    sget-object v10, Lud3/s;->k:Ljava/util/regex/Pattern;

    invoke-virtual {v2, v10}, Ljava/util/regex/Matcher;->usePattern(Ljava/util/regex/Pattern;)Ljava/util/regex/Matcher;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/regex/Matcher;->matches()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-virtual {v2, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    :cond_3
    :goto_1
    add-int/lit8 v12, v12, 0x1

    invoke-static {v12, p1, p0, v0}, Lrg/j;->f(ILjava/lang/String;IZ)I

    move-result v1

    goto/16 :goto_0

    :cond_4
    const/16 p0, 0x46

    if-gt p0, v4, :cond_5

    const/16 p1, 0x64

    if-ge v4, p1, :cond_5

    add-int/lit16 v4, v4, 0x76c

    :cond_5
    if-ltz v4, :cond_6

    if-ge v4, p0, :cond_6

    add-int/lit16 v4, v4, 0x7d0

    :cond_6
    const/16 p0, 0x641

    const-string p1, "Failed requirement."

    if-lt v4, p0, :cond_c

    if-eq v7, v3, :cond_b

    if-gt v11, v6, :cond_a

    const/16 p0, 0x20

    if-ge v6, p0, :cond_a

    if-ltz v5, :cond_9

    const/16 p0, 0x18

    if-ge v5, p0, :cond_9

    if-ltz v8, :cond_8

    const/16 p0, 0x3c

    if-ge v8, p0, :cond_8

    if-ltz v9, :cond_7

    if-ge v9, p0, :cond_7

    new-instance p0, Ljava/util/GregorianCalendar;

    sget-object p1, Lwd3/h;->a:Ljava/util/TimeZone;

    invoke-direct {p0, p1}, Ljava/util/GregorianCalendar;-><init>(Ljava/util/TimeZone;)V

    invoke-virtual {p0, v0}, Ljava/util/Calendar;->setLenient(Z)V

    invoke-virtual {p0, v11, v4}, Ljava/util/Calendar;->set(II)V

    sub-int/2addr v7, v11

    invoke-virtual {p0, v10, v7}, Ljava/util/Calendar;->set(II)V

    const/4 p1, 0x5

    invoke-virtual {p0, p1, v6}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xb

    invoke-virtual {p0, p1, v5}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1, v8}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xd

    invoke-virtual {p0, p1, v9}, Ljava/util/Calendar;->set(II)V

    const/16 p1, 0xe

    invoke-virtual {p0, p1, v0}, Ljava/util/Calendar;->set(II)V

    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide p0

    return-wide p0

    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final m(Lrg/h;Ljava/lang/Exception;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-interface {v0}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    :cond_0
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const-string v2, "error"

    invoke-static {p0, v2, v1}, Lrg/j;->n(Lrg/h;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v3, "exception.message"

    invoke-static {p0, v3, v2}, Lrg/j;->n(Lrg/h;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    if-eqz v0, :cond_2

    const-string v2, "exception.type"

    invoke-static {p0, v2, v0}, Lrg/j;->n(Lrg/h;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    const-string v0, "exception.stacktrace"

    invoke-static {p1}, Lpf/c;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v0, v2}, Lrg/j;->n(Lrg/h;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_3

    const-string v0, "exception.cause"

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, v0, p1}, Lrg/j;->n(Lrg/h;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    const-string p1, "exception.escaped"

    invoke-static {p0, p1, v1}, Lrg/j;->n(Lrg/h;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static final n(Lrg/h;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "value"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "AttributeKey name must not be blank"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static o(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x41

    if-lt v2, v3, :cond_2

    const/16 v4, 0x5a

    if-gt v2, v4, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :goto_1
    if-ge v1, v0, :cond_1

    aget-char v2, p0, v1

    if-lt v2, v3, :cond_0

    if-gt v2, v4, :cond_0

    xor-int/lit8 v2, v2, 0x20

    int-to-char v2, v2

    aput-char v2, p0, v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-static {p0}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object p0
.end method

.method public static p(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x61

    if-lt v2, v3, :cond_2

    const/16 v4, 0x7a

    if-gt v2, v4, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    :goto_1
    if-ge v1, v0, :cond_1

    aget-char v2, p0, v1

    if-lt v2, v3, :cond_0

    if-gt v2, v4, :cond_0

    xor-int/lit8 v2, v2, 0x20

    int-to-char v2, v2

    aput-char v2, p0, v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    invoke-static {p0}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object p0
.end method

.method public static q(Ljava/lang/Boolean;)B
    .locals 0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static r(B)Ljava/lang/Boolean;
    .locals 1

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method
