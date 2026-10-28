.class public final Lwc/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lve/f;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Lvg/n;

.field public final y:J

.field public final z:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lvg/n;->a:Lvg/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lvg/m;->b:Lvg/r;

    const-string v1, "credentialProcess"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "platformProvider"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc/i0;->w:Ljava/lang/String;

    iput-object v0, p0, Lwc/i0;->x:Lvg/n;

    const-wide/32 v0, 0x10000

    iput-wide v0, p0, Lwc/i0;->y:J

    const-wide/32 v0, 0xea60

    iput-wide v0, p0, Lwc/i0;->z:J

    return-void
.end method


# virtual methods
.method public final b(Lgf/b;Ls83/c;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    instance-of v2, v0, Lwc/h0;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lwc/h0;

    iget v3, v2, Lwc/h0;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lwc/h0;->z:I

    :goto_0
    move-object v9, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lwc/h0;

    invoke-direct {v2, v1, v0}, Lwc/h0;-><init>(Lwc/i0;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v9, Lwc/h0;->x:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v9, Lwc/h0;->z:I

    const/4 v10, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v10, :cond_1

    iget-object v2, v9, Lwc/h0;->w:Lgm/r;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto/16 :goto_c

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v9}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    const-class v3, Lwc/i0;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-interface {v3}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_18

    invoke-static {v0, v3}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object v0

    :try_start_1
    iget-object v3, v1, Lwc/i0;->w:Ljava/lang/String;

    iget-object v4, v1, Lwc/i0;->x:Lvg/n;

    iget-wide v5, v1, Lwc/i0;->y:J

    iget-wide v7, v1, Lwc/i0;->z:J

    iput-object v0, v9, Lwc/h0;->w:Lgm/r;

    iput v10, v9, Lwc/h0;->z:I

    invoke-static/range {v3 .. v9}, Lrg/a;->k(Ljava/lang/String;Lvg/n;JJLwc/h0;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_3

    return-object v2

    :cond_3
    move-object v2, v0

    move-object v0, v3

    :goto_2
    check-cast v0, Ll83/k;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    iget-object v3, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    iget-object v0, v0, Ll83/k;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const/4 v4, 0x0

    if-nez v3, :cond_17

    invoke-static {v0}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v0

    new-instance v2, Ljg/b;

    invoke-direct {v2, v0}, Ljg/b;-><init>([B)V

    new-instance v0, Lhg/i;

    sget-object v3, Lhg/l;->i:Lhg/l;

    new-instance v5, Ljg/e;

    const-string v6, "AccessKeyId"

    invoke-direct {v5, v6}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v6, v10, [Lhg/d;

    const/4 v7, 0x0

    aput-object v5, v6, v7

    invoke-static {v6}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-direct {v0, v3, v5, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v5, Lhg/i;

    new-instance v6, Ljg/e;

    const-string v8, "SecretAccessKey"

    invoke-direct {v6, v8}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v8, v10, [Lhg/d;

    aput-object v6, v8, v7

    invoke-static {v8}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v6

    invoke-direct {v5, v3, v6, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v6, Lhg/i;

    new-instance v8, Ljg/e;

    const-string v9, "SessionToken"

    invoke-direct {v8, v9}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v9, v10, [Lhg/d;

    aput-object v8, v9, v7

    invoke-static {v9}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v6, v3, v8, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v8, Lhg/i;

    sget-object v9, Lhg/l;->k:Lhg/l;

    new-instance v11, Ljg/e;

    const-string v12, "Expiration"

    invoke-direct {v11, v12}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v12, v10, [Lhg/d;

    aput-object v11, v12, v7

    invoke-static {v12}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    invoke-direct {v8, v9, v11, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v9, Lhg/i;

    new-instance v11, Ljg/e;

    const-string v12, "Version"

    invoke-direct {v11, v12}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v12, v10, [Lhg/d;

    aput-object v11, v12, v7

    invoke-static {v12}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    invoke-direct {v9, v3, v11, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v11, Lhg/i;

    new-instance v12, Ljg/e;

    const-string v13, "AccountId"

    invoke-direct {v12, v13}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v13, v10, [Lhg/d;

    aput-object v12, v13, v7

    invoke-static {v13}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v12

    invoke-direct {v11, v3, v12, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v3, Lxl/a;

    const/16 v12, 0xd

    invoke-direct {v3, v12}, Lxl/a;-><init>(I)V

    invoke-virtual {v3, v0}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v3, v5}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v3, v6}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v3, v8}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v3, v9}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v3, v11}, Lxl/a;->p(Lhg/i;)V

    new-instance v12, Lhg/j;

    invoke-direct {v12, v3}, Lhg/j;-><init>(Lxl/a;)V

    :try_start_2
    invoke-virtual {v2, v12}, Ljg/b;->d(Lhg/j;)Lhg/c;

    move-result-object v2

    move-object v3, v4

    move-object v12, v3

    move-object v13, v12

    move-object v14, v13

    move-object/from16 v17, v14

    :goto_3
    invoke-interface {v2}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v15

    iget v7, v0, Lhg/i;->b:I

    if-nez v15, :cond_4

    goto :goto_5

    :cond_4
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-ne v10, v7, :cond_5

    invoke-interface {v2}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v12

    :goto_4
    const/4 v7, 0x0

    const/4 v10, 0x1

    goto :goto_3

    :catch_1
    move-exception v0

    goto/16 :goto_b

    :cond_5
    :goto_5
    iget v7, v5, Lhg/i;->b:I

    if-nez v15, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-ne v10, v7, :cond_7

    invoke-interface {v2}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v13

    goto :goto_4

    :cond_7
    :goto_6
    iget v7, v6, Lhg/i;->b:I

    if-nez v15, :cond_8

    goto :goto_7

    :cond_8
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-ne v10, v7, :cond_9

    invoke-interface {v2}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v14

    goto :goto_4

    :cond_9
    :goto_7
    iget v7, v8, Lhg/i;->b:I

    if-nez v15, :cond_a

    goto :goto_8

    :cond_a
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-ne v10, v7, :cond_b

    sget-object v3, Lug/b;->x:Lt9/p;

    invoke-interface {v2}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lt9/p;->p(Ljava/lang/String;)Lug/b;

    move-result-object v3

    goto :goto_4

    :cond_b
    :goto_8
    iget v7, v9, Lhg/i;->b:I

    if-nez v15, :cond_c

    goto :goto_9

    :cond_c
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-ne v10, v7, :cond_d

    invoke-interface {v2}, Lhg/g;->h()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_4

    :cond_d
    :goto_9
    iget v7, v11, Lhg/i;->b:I

    if-nez v15, :cond_e

    goto :goto_a

    :cond_e
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-ne v10, v7, :cond_f

    invoke-interface {v2}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v17

    goto :goto_4

    :cond_f
    :goto_a
    if-eqz v15, :cond_10

    invoke-interface {v2}, Lhg/c;->skipValue()V
    :try_end_2
    .catch Laws/smithy/kotlin/runtime/serde/DeserializationException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :cond_10
    const/16 v2, 0x60

    const-string v7, "missing field `"

    if-eqz v12, :cond_16

    if-eqz v13, :cond_15

    if-eqz v14, :cond_14

    if-eqz v4, :cond_13

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_12

    if-nez v3, :cond_11

    sget-object v3, Lug/b;->F:Lug/b;

    :cond_11
    move-object v15, v3

    const-string v16, "Process"

    invoke-static/range {v12 .. v17}, Ls93/h;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Ljava/lang/String;Ljava/lang/String;)Lve/e;

    move-result-object v0

    sget-object v2, Lie/a;->Q:Lie/a;

    invoke-static {v0, v2}, Ldc/a;->R(Lve/e;Lbf/a;)Lve/e;

    move-result-object v0

    return-object v0

    :cond_12
    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "version "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " is not supported"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3}, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_13
    const/4 v3, 0x0

    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v9}, Lce/w;->P(Lhg/i;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_14
    const/4 v3, 0x0

    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v6}, Lce/w;->P(Lhg/i;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_15
    const/4 v3, 0x0

    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Lce/w;->P(Lhg/i;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_16
    const/4 v3, 0x0

    new-instance v4, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lce/w;->P(Lhg/i;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0, v3}, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;-><init>(Ljava/lang/String;I)V

    throw v4

    :goto_b
    new-instance v2, Laws/sdk/kotlin/runtime/auth/credentials/InvalidJsonCredentialsException;

    const-string v3, "invalid JSON credentials response"

    invoke-direct {v2, v3, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_17
    new-instance v5, Lio/getstream/chat/android/client/i;

    invoke-direct {v5, v3, v0}, Lio/getstream/chat/android/client/i;-><init>(ILjava/lang/String;)V

    invoke-interface {v2, v4, v5}, Log/g;->n(Ljava/lang/Throwable;Lc93/a;)V

    new-instance v2, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    const-string v5, "Command completed with nonzero exit code "

    const-string v6, ": "

    invoke-static {v3, v5, v6, v0}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v4, v0}, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v2

    :goto_c
    new-instance v2, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    const-string v3, "Failed to execute command"

    invoke-direct {v2, v3, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_18
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "logger<T> cannot be used on an anonymous object"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Ls9/f;->w(Lve/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
