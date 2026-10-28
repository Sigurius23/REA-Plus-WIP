.class public final Lwc/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lve/f;


# instance fields
.field public final w:Lve/f;

.field public final x:Lwc/a;

.field public final y:Ljava/lang/String;

.field public final z:Lpf/a;


# direct methods
.method public constructor <init>(Lve/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpf/a;)V
    .locals 8

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v0, 0x384

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v6

    const-string v0, "bootstrapCredentialsProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "roleArn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lwc/a;

    move-object v3, p2

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v2 .. v7}, Lwc/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc/d1;->w:Lve/f;

    iput-object v2, p0, Lwc/d1;->x:Lwc/a;

    iput-object p3, p0, Lwc/d1;->y:Ljava/lang/String;

    iput-object p6, p0, Lwc/d1;->z:Lpf/a;

    return-void
.end method


# virtual methods
.method public final b(Lgf/b;Ls83/c;)Ljava/lang/Object;
    .locals 14

    move-object/from16 v0, p2

    const-string v1, "STS is not activated in the requested region ("

    instance-of v2, v0, Lwc/c1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lwc/c1;

    iget v3, v2, Lwc/c1;->F:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lwc/c1;->F:I

    goto :goto_0

    :cond_0
    new-instance v2, Lwc/c1;

    invoke-direct {v2, p0, v0}, Lwc/c1;-><init>(Lwc/d1;Ls83/c;)V

    :goto_0
    iget-object v0, v2, Lwc/c1;->z:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lwc/c1;->F:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object p1, v2, Lwc/c1;->y:Lqd/a;

    iget-object v2, v2, Lwc/c1;->w:Log/g;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :catch_0
    move-exception v0

    goto/16 :goto_8

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v2, Lwc/c1;->x:Lwc/d1;

    iget-object v4, v2, Lwc/c1;->w:Log/g;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    const-class v4, Lwc/d1;

    sget-object v8, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v8, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-interface {v4}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-static {v0, v4}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object v0

    new-instance v4, Lw91/l;

    const/16 v8, 0x13

    invoke-direct {v4, v8}, Lw91/l;-><init>(I)V

    invoke-virtual {v0, v7, v4}, Lgm/r;->u(Ljava/lang/Throwable;Lc93/a;)V

    invoke-interface {v2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v4

    invoke-static {v4}, Lbp/b;->w(Lq83/j;)Lmg/h;

    move-result-object v4

    new-instance v8, Ls90/f;

    const/16 v9, 0x1d

    invoke-direct {v8, p0, v4, p1, v9}, Ls90/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v0, v2, Lwc/c1;->w:Log/g;

    iput-object p0, v2, Lwc/c1;->x:Lwc/d1;

    iput v6, v2, Lwc/c1;->F:I

    sget-object p1, Lqd/d;->b:Lqd/d;

    invoke-virtual {p1, v8, v2}, Lvo/b;->p(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_4

    goto/16 :goto_5

    :cond_4
    move-object v4, v0

    move-object v0, p1

    move-object p1, p0

    :goto_1
    move-object v6, v0

    check-cast v6, Lqd/a;

    :try_start_1
    new-instance v0, La30/w0;

    const/16 v8, 0x10

    invoke-direct {v0, v8}, La30/w0;-><init>(I)V

    iget-object p1, p1, Lwc/d1;->x:Lwc/a;

    iget-object v8, p1, Lwc/a;->a:Ljava/lang/String;

    iput-object v8, v0, La30/w0;->E:Ljava/lang/Object;

    iget-object v8, p1, Lwc/a;->c:Ljava/lang/String;

    iput-object v8, v0, La30/w0;->z:Ljava/lang/Object;

    iget-object v8, p1, Lwc/a;->b:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    if-nez v8, :cond_5

    :try_start_2
    sget-object v8, Lvg/n;->a:Lvg/m;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, Lvg/m;->b:Lvg/r;

    invoke-static {v8}, Lrs/b;->g(Lvg/l;)Ljava/lang/String;

    move-result-object v8
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object p1, v0

    move-object v0, p1

    goto :goto_2

    :catch_1
    move-exception v0

    move-object p1, v0

    move-object v0, p1

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object p1, v0

    :goto_2
    move-object p1, v6

    goto/16 :goto_9

    :catch_2
    move-exception v0

    move-object p1, v0

    :goto_3
    move-object v2, v4

    move-object p1, v6

    goto/16 :goto_8

    :cond_5
    :goto_4
    :try_start_4
    iput-object v8, v0, La30/w0;->F:Ljava/lang/Object;

    iget-wide v8, p1, Lwc/a;->d:J

    invoke-static {v8, v9}, Lkotlin/time/Duration;->getInWholeSeconds-impl(J)J

    move-result-wide v8
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    long-to-int v8, v8

    :try_start_5
    new-instance v9, Ljava/lang/Integer;

    invoke-direct {v9, v8}, Ljava/lang/Integer;-><init>(I)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    iput-object v9, v0, La30/w0;->x:Ljava/lang/Object;

    iget-object v8, p1, Lwc/a;->e:Ljava/util/ArrayList;

    iput-object v8, v0, La30/w0;->y:Ljava/lang/Object;

    iget-object p1, p1, Lwc/a;->f:Ljava/util/ArrayList;

    iput-object p1, v0, La30/w0;->G:Ljava/lang/Object;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :try_start_7
    new-instance p1, Lud/a;

    invoke-direct {p1, v0}, Lud/a;-><init>(La30/w0;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    iput-object v4, v2, Lwc/c1;->w:Log/g;

    iput-object v7, v2, Lwc/c1;->x:Lwc/d1;

    iput-object v6, v2, Lwc/c1;->y:Lqd/a;

    iput v5, v2, Lwc/c1;->F:I

    invoke-virtual {v6, p1, v2}, Lqd/a;->b(Lud/a;Lwc/c1;)Ljava/lang/Object;

    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    if-ne v0, v3, :cond_6

    :goto_5
    return-object v3

    :cond_6
    move-object v2, v4

    move-object p1, v6

    :goto_6
    :try_start_9
    check-cast v0, Lud/b;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    invoke-virtual {p1}, Lqd/a;->close()V

    iget-object p1, v0, Lud/b;->b:Lud/f;

    if-eqz p1, :cond_8

    iget-object v0, v0, Lud/b;->a:Lud/e;

    if-eqz v0, :cond_7

    iget-object v0, v0, Lud/e;->a:Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-static {v0}, Ls4/b;->x(Ljava/lang/String;)Lvc/a;

    move-result-object v0

    iget-object v0, v0, Lvc/a;->d:Ljava/lang/String;

    move-object v13, v0

    goto :goto_7

    :cond_7
    move-object v13, v7

    :goto_7
    new-instance v0, Lwc/b1;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lwc/b1;-><init>(Lud/f;I)V

    invoke-interface {v2, v7, v0}, Log/g;->u(Ljava/lang/Throwable;Lc93/a;)V

    iget-object v8, p1, Lud/f;->a:Ljava/lang/String;

    iget-object v9, p1, Lud/f;->c:Ljava/lang/String;

    iget-object v10, p1, Lud/f;->d:Ljava/lang/String;

    iget-object v11, p1, Lud/f;->b:Lug/b;

    const-string v12, "AssumeRoleProvider"

    invoke-static/range {v8 .. v13}, Ls93/h;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Ljava/lang/String;Ljava/lang/String;)Lve/e;

    move-result-object p1

    sget-object v0, Lie/a;->F:Lie/a;

    invoke-static {p1, v0}, Ldc/a;->R(Lve/e;Lbf/a;)Lve/e;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    const-string v0, "STS credentials must not be null"

    invoke-direct {p1, v7, v0}, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw p1

    :catchall_3
    move-exception v0

    goto :goto_2

    :catch_3
    move-exception v0

    goto :goto_3

    :goto_8
    :try_start_a
    new-instance v3, Lw91/l;

    const/16 v4, 0x14

    invoke-direct {v3, v4}, Lw91/l;-><init>(I)V

    invoke-interface {v2, v7, v3}, Log/g;->u(Ljava/lang/Throwable;Lc93/a;)V

    instance-of v2, v0, Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/RegionDisabledException;

    if-eqz v2, :cond_9

    new-instance v2, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p1, Lqd/a;->w:Lqd/f;

    iget-object v1, v1, Lqd/f;->z:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "). Please check your configuration and activate STS in the target region if necessary"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_9
    new-instance v1, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    const-string v2, "failed to assume role from STS"

    invoke-direct {v1, v2, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :goto_9
    invoke-virtual {p1}, Lqd/a;->close()V

    throw v0

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "logger<T> cannot be used on an anonymous object"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Ls9/f;->w(Lve/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
