.class public final Lwc/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lve/f;


# instance fields
.field public final E:Ljava/lang/String;

.field public final F:Lpf/a;

.field public final G:Lvg/n;

.field public final H:Lug/a;

.field public final I:Lwc/x0;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpf/a;Lvg/n;I)V
    .locals 1

    and-int/lit8 p8, p8, 0x10

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p5, v0

    :cond_0
    const-string p8, "accountId"

    invoke-static {p1, p8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p8, "roleName"

    invoke-static {p2, p8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p8, "startUrl"

    invoke-static {p3, p8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p8, "ssoRegion"

    invoke-static {p4, p8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc/p0;->w:Ljava/lang/String;

    iput-object p2, p0, Lwc/p0;->x:Ljava/lang/String;

    iput-object p3, p0, Lwc/p0;->y:Ljava/lang/String;

    iput-object p4, p0, Lwc/p0;->z:Ljava/lang/String;

    iput-object p5, p0, Lwc/p0;->E:Ljava/lang/String;

    iput-object p6, p0, Lwc/p0;->F:Lpf/a;

    iput-object p7, p0, Lwc/p0;->G:Lvg/n;

    move-object p2, p5

    move-object p5, p6

    move-object p6, p7

    sget-object p7, Lug/a;->a:Lug/a;

    iput-object p7, p0, Lwc/p0;->H:Lug/a;

    if-eqz p2, :cond_1

    new-instance p1, Lwc/x0;

    invoke-direct/range {p1 .. p7}, Lwc/x0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpf/a;Lvg/n;Lug/a;)V

    move-object v0, p1

    :cond_1
    iput-object v0, p0, Lwc/p0;->I:Lwc/x0;

    return-void
.end method


# virtual methods
.method public final a(Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lwc/n0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lwc/n0;

    iget v1, v0, Lwc/n0;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/n0;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/n0;

    invoke-direct {v0, p0, p1}, Lwc/n0;-><init>(Lwc/p0;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lwc/n0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/n0;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lwc/n0;->y:I

    iget-object p1, p0, Lwc/p0;->y:Ljava/lang/String;

    iget-object v2, p0, Lwc/p0;->G:Lvg/n;

    invoke-static {p1, v2, v0}, Lwc/z0;->d(Ljava/lang/String;Lvg/n;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lwc/q0;

    iget-object v0, p0, Lwc/p0;->H:Lug/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v0

    iget-object v1, p1, Lwc/q0;->b:Lug/b;

    invoke-virtual {v0, v1}, Lug/b;->a(Lug/b;)I

    move-result v0

    if-gtz v0, :cond_4

    return-object p1

    :cond_4
    new-instance p1, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    const-string v0, "The SSO session has expired. To refresh this SSO session run `aws sso login` with the corresponding profile."

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public final b(Lgf/b;Ls83/c;)Ljava/lang/Object;
    .locals 13

    move-object v1, p2

    instance-of v2, v1, Lwc/o0;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lwc/o0;

    iget v3, v2, Lwc/o0;->F:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lwc/o0;->F:I

    goto :goto_0

    :cond_0
    new-instance v2, Lwc/o0;

    invoke-direct {v2, p0, p2}, Lwc/o0;-><init>(Lwc/p0;Ls83/c;)V

    :goto_0
    iget-object v1, v2, Lwc/o0;->z:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lwc/o0;->F:I

    const/4 v5, 0x4

    const/4 v6, 0x3

    iget-object v7, p0, Lwc/p0;->I:Lwc/x0;

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v4, :cond_5

    if-eq v4, v9, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v2, v2, Lwc/o0;->y:Led/a;

    :try_start_0
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_7

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :catch_0
    move-exception v0

    goto/16 :goto_8

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v0, v2, Lwc/o0;->x:Lwc/q0;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    iget-object v0, v2, Lwc/o0;->w:Lgf/b;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    iget-object v0, v2, Lwc/o0;->w:Lgf/b;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v1

    const-class v4, Lwc/p0;

    sget-object v11, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v11, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-interface {v4}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_f

    invoke-static {v1, v4}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object v1

    if-eqz v7, :cond_7

    new-instance v4, Lvv1/c;

    const/16 v8, 0xa

    invoke-direct {v4, p0, v8}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v10, v4}, Lgm/r;->s(Ljava/lang/Throwable;Lc93/a;)V

    iput-object p1, v2, Lwc/o0;->w:Lgf/b;

    iput v9, v2, Lwc/o0;->F:I

    invoke-virtual {v7, p1, v2}, Lwc/x0;->b(Lgf/b;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    goto :goto_6

    :cond_6
    move-object v0, p1

    :goto_1
    check-cast v1, Lwc/q0;

    :goto_2
    move-object v12, v1

    move-object v1, v0

    move-object v0, v12

    goto :goto_4

    :cond_7
    new-instance v4, Lw91/l;

    const/16 v9, 0x12

    invoke-direct {v4, v9}, Lw91/l;-><init>(I)V

    invoke-virtual {v1, v10, v4}, Lgm/r;->s(Ljava/lang/Throwable;Lc93/a;)V

    iput-object p1, v2, Lwc/o0;->w:Lgf/b;

    iput v8, v2, Lwc/o0;->F:I

    invoke-virtual {p0, v2}, Lwc/p0;->a(Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    goto :goto_6

    :cond_8
    move-object v0, p1

    :goto_3
    check-cast v1, Lwc/q0;

    goto :goto_2

    :goto_4
    invoke-interface {v2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v4

    invoke-static {v4}, Lbp/b;->w(Lq83/j;)Lmg/h;

    move-result-object v4

    new-instance v8, Ls90/f;

    const/16 v9, 0x1c

    invoke-direct {v8, p0, v4, v1, v9}, Ls90/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v10, v2, Lwc/o0;->w:Lgf/b;

    iput-object v0, v2, Lwc/o0;->x:Lwc/q0;

    iput v6, v2, Lwc/o0;->F:I

    sget-object v1, Led/d;->b:Led/d;

    invoke-virtual {v1, v8, v2}, Lvo/b;->p(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_9

    goto :goto_6

    :cond_9
    :goto_5
    check-cast v1, Led/a;

    :try_start_1
    new-instance v4, Lcd/a;

    const/4 v6, 0x2

    invoke-direct {v4, v6}, Lcd/a;-><init>(I)V

    iget-object v6, p0, Lwc/p0;->w:Ljava/lang/String;

    iput-object v6, v4, Lcd/a;->c:Ljava/lang/String;

    iget-object v6, p0, Lwc/p0;->x:Ljava/lang/String;

    iput-object v6, v4, Lcd/a;->d:Ljava/lang/String;

    iget-object v0, v0, Lwc/q0;->a:Ljava/lang/String;

    iput-object v0, v4, Lcd/a;->b:Ljava/lang/String;

    new-instance v0, Lid/a;

    invoke-direct {v0, v4}, Lid/a;-><init>(Lcd/a;)V

    iput-object v10, v2, Lwc/o0;->w:Lgf/b;

    iput-object v10, v2, Lwc/o0;->x:Lwc/q0;

    iput-object v1, v2, Lwc/o0;->y:Led/a;

    iput v5, v2, Lwc/o0;->F:I

    invoke-virtual {v1, v0, v2}, Led/a;->b(Lid/a;Lwc/o0;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v3, :cond_a

    :goto_6
    return-object v3

    :cond_a
    move-object v2, v1

    move-object v1, v0

    :goto_7
    :try_start_2
    check-cast v1, Lid/b;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v2}, Led/a;->close()V

    iget-object v0, v1, Lid/b;->a:Lid/c;

    if-eqz v0, :cond_e

    iget-object v1, v0, Lid/c;->a:Ljava/lang/String;

    if-eqz v1, :cond_d

    iget-object v2, v0, Lid/c;->c:Ljava/lang/String;

    if-eqz v2, :cond_c

    iget-object v3, v0, Lid/c;->d:Ljava/lang/String;

    sget-object v4, Lug/b;->x:Lt9/p;

    iget-wide v5, v0, Lid/c;->b:J

    invoke-static {v4, v5, v6}, Lug/c;->a(Lt9/p;J)Lug/b;

    move-result-object v4

    const-string v5, "SSO"

    iget-object v6, p0, Lwc/p0;->w:Ljava/lang/String;

    invoke-static/range {v1 .. v6}, Ls93/h;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Ljava/lang/String;Ljava/lang/String;)Lve/e;

    move-result-object v0

    if-eqz v7, :cond_b

    sget-object v1, Lie/a;->M:Lie/a;

    invoke-static {v0, v1}, Ldc/a;->R(Lve/e;Lbf/a;)Lve/e;

    move-result-object v0

    return-object v0

    :cond_b
    sget-object v1, Lie/a;->O:Lie/a;

    invoke-static {v0, v1}, Ldc/a;->R(Lve/e;Lbf/a;)Lve/e;

    move-result-object v0

    return-object v0

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected secretAccessKey in SSO roleCredentials response"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected accessKeyId in SSO roleCredentials response"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    const-string v1, "Expected SSO roleCredentials to not be null"

    invoke-direct {v0, v10, v1}, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    move-object v2, v1

    goto :goto_9

    :catch_1
    move-exception v0

    move-object v2, v1

    :goto_8
    :try_start_3
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/CredentialsNotLoadedException;

    const-string v3, "GetRoleCredentials operation failed"

    invoke-direct {v1, v3, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_9
    invoke-virtual {v2}, Led/a;->close()V

    throw v0

    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "logger<T> cannot be used on an anonymous object"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Ls9/f;->w(Lve/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
