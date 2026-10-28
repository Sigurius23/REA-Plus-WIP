.class public final Lwc/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lve/c;


# instance fields
.field public final w:Lvg/n;

.field public final x:Lbg/b;

.field public final y:Z

.field public final z:Lpf/a;


# direct methods
.method public constructor <init>(Lvg/n;Lpf/a;)V
    .locals 1

    sget-object v0, Lbg/g;->a:Lbg/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lbg/b;->b:Lbg/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc/i;->w:Lvg/n;

    iput-object v0, p0, Lwc/i;->x:Lbg/b;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lwc/i;->y:Z

    iput-object p2, p0, Lwc/i;->z:Lpf/a;

    return-void
.end method


# virtual methods
.method public final b(Lgf/b;Ls83/c;)Ljava/lang/Object;
    .locals 9

    const-string p1, "http://169.254.170.2"

    instance-of v0, p2, Lwc/g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwc/g;

    iget v1, v0, Lwc/g;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/g;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/g;

    invoke-direct {v0, p0, p2}, Lwc/g;-><init>(Lwc/i;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lwc/g;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/g;->E:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lwc/g;->w:Log/g;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception p2

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lwc/g;->x:Ljava/lang/String;

    iget-object v2, v0, Lwc/g;->w:Log/g;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget-object v2, v0, Lwc/g;->w:Log/g;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    const-class v2, Lwc/i;

    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v6, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-static {p2, v2}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object p2

    iput-object p2, v0, Lwc/g;->w:Log/g;

    iput v5, v0, Lwc/g;->E:I

    invoke-virtual {p0, v0}, Lwc/i;->h(Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto/16 :goto_4

    :cond_5
    move-object v8, v2

    move-object v2, p2

    move-object p2, v8

    :goto_1
    check-cast p2, Ljava/lang/String;

    invoke-static {}, Lyd/f;->d()Ljf/a;

    move-result-object v5

    iget-object v6, p0, Lwc/i;->w:Lvg/n;

    invoke-static {v5, v6}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {}, Lyd/f;->c()Ljf/a;

    move-result-object v7

    invoke-static {v7, v6}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v5, :cond_6

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_6

    :try_start_1
    sget-object v4, Lcg/o;->i:Lcg/n;

    invoke-virtual {p1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception p1

    new-instance p2, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    const-string v0, "Invalid relativeUri `"

    const/16 v1, 0x60

    invoke-static {v1, v0, v5}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_6
    if-eqz v6, :cond_a

    invoke-static {v6}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_a

    iput-object v2, v0, Lwc/g;->w:Log/g;

    iput-object p2, v0, Lwc/g;->x:Ljava/lang/String;

    iput v4, v0, Lwc/g;->E:I

    invoke-virtual {p0, v6, v0}, Lwc/i;->k(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_4

    :cond_7
    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    :goto_2
    check-cast p2, Lcg/o;

    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    :goto_3
    new-instance v4, Lev/i;

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v6, Ll83/a0;

    invoke-virtual {v5, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    const-class v7, Lve/e;

    invoke-virtual {v5, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-direct {v4, v6, v5}, Lev/i;-><init>(Lj93/d;Lj93/d;)V

    new-instance v5, Lwc/k;

    invoke-direct {v5, p2}, Lwc/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lev/i;->j(Luf/l;)V

    new-instance p2, Ldd/b;

    const/16 v5, 0xe

    invoke-direct {p2, v5}, Ldd/b;-><init>(I)V

    invoke-virtual {v4, p2}, Lev/i;->h(Luf/h;)V

    const-string p2, "EcsCredentialsProvider"

    invoke-virtual {v4, p2}, Lev/i;->i(Ljava/lang/String;)V

    const-string p2, "EcsContainerMetadata"

    invoke-virtual {v4, p2}, Lev/i;->k(Ljava/lang/String;)V

    invoke-virtual {v4}, Lev/i;->e()Lio/sentry/android/replay/video/d;

    move-result-object p2

    new-instance v5, Lty/c;

    const/16 v6, 0x11

    invoke-direct {v5, p1, v6}, Lty/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, v5}, Lio/sentry/android/replay/video/d;->l(Luf/f;)V

    invoke-virtual {v4}, Lev/i;->a()Lm63/d;

    move-result-object p1

    new-instance p2, Lw91/l;

    const/16 v4, 0xc

    invoke-direct {p2, v4}, Lw91/l;-><init>(I)V

    invoke-static {v2, p2}, Log/g;->m(Log/g;Lc93/a;)V

    new-instance p2, Lmf/u;

    iget-object v4, p0, Lwc/i;->z:Lpf/a;

    invoke-direct {p2, v4}, Lmf/u;-><init>(Lpf/a;)V

    :try_start_2
    sget-object v4, Ll83/a0;->a:Ll83/a0;

    iput-object v2, v0, Lwc/g;->w:Log/g;

    const/4 v5, 0x0

    iput-object v5, v0, Lwc/g;->x:Ljava/lang/String;

    iput v3, v0, Lwc/g;->E:I

    invoke-static {p1, p2, v4, v0}, Ls/s;->w(Lm63/d;Lyf/e;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-ne p2, v1, :cond_8

    :goto_4
    return-object v1

    :cond_8
    move-object p1, v2

    :goto_5
    :try_start_3
    check-cast p2, Lve/e;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    new-instance v0, Lvv1/c;

    const/4 v1, 0x6

    invoke-direct {v0, p2, v1}, Lvv1/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v0}, Log/g;->m(Log/g;Lc93/a;)V

    sget-object p1, Lie/a;->R:Lie/a;

    invoke-static {p2, p1}, Ldc/a;->R(Lve/e;Lbf/a;)Lve/e;

    move-result-object p1

    return-object p1

    :catch_2
    move-exception p2

    move-object p1, v2

    :goto_6
    new-instance v0, Lw91/l;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lw91/l;-><init>(I)V

    invoke-static {p1, v0}, Log/g;->m(Log/g;Lc93/a;)V

    instance-of p1, p2, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    if-eqz p1, :cond_9

    goto :goto_7

    :cond_9
    new-instance p1, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    const-string v0, "Failed to get credentials from container metadata service"

    invoke-direct {p1, p2, v0}, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    move-object p2, p1

    :goto_7
    throw p2

    :cond_a
    new-instance p1, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    const-string p2, "Container credentials URI not set"

    invoke-direct {p1, p2}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "logger<T> cannot be used on an anonymous object"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 1

    iget-boolean v0, p0, Lwc/i;->y:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwc/i;->z:Lpf/a;

    invoke-static {v0}, Lyf/j;->b(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final h(Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lwc/e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lwc/e;

    iget v1, v0, Lwc/e;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/e;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/e;

    invoke-direct {v0, p0, p1}, Lwc/e;-><init>(Lwc/i;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lwc/e;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/e;->y:I

    iget-object v3, p0, Lwc/i;->w:Lvg/n;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Lyd/f;->b()Ljf/a;

    move-result-object p1

    invoke-static {p1, v3}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_4

    iput v4, v0, Lwc/e;->y:I

    invoke-virtual {p0, p1, v0}, Lwc/i;->i(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_5

    :cond_4
    invoke-static {}, Lyd/f;->a()Ljf/a;

    move-result-object p1

    invoke-static {p1, v3}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_5

    const/4 p1, 0x0

    return-object p1

    :cond_5
    const-string v0, "\r\n"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_6

    return-object p1

    :cond_6
    new-instance p1, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    const-string v0, "Token contains illegal line break sequence."

    invoke-direct {p1, v0}, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lwc/f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwc/f;

    iget v1, v0, Lwc/f;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/f;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/f;

    invoke-direct {v0, p0, p2}, Lwc/f;-><init>(Lwc/i;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lwc/f;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/f;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lwc/f;->y:I

    iget-object p2, p0, Lwc/i;->w:Lvg/n;

    check-cast p2, Lvg/r;

    invoke-virtual {p2, p1, v0}, Lvg/r;->d(Ljava/lang/String;Ls83/c;)Ljava/io/Serializable;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, [B

    if-eqz p2, :cond_4

    invoke-static {p2}, Lyb3/y;->A([B)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    const-string p2, "Could not read token file."

    invoke-direct {p1, p2}, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lwc/h;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwc/h;

    iget v1, v0, Lwc/h;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/h;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/h;

    invoke-direct {v0, p0, p2}, Lwc/h;-><init>(Lwc/i;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lwc/h;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/h;->E:I

    const/4 v3, 0x1

    const-string v4, "The container credentials full URI ("

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lwc/h;->x:Lcg/o;

    iget-object v1, v0, Lwc/h;->w:Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, p2

    move-object p2, p1

    move-object p1, v1

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    sget-object p2, Lcg/o;->i:Lcg/n;

    invoke-static {p2, p1}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    iget-object v2, p2, Lcg/o;->b:Lbg/e;

    iget-object v5, p2, Lcg/o;->a:Lbg/l;

    sget-object v6, Lbg/l;->c:Lbg/l;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_1

    :cond_3
    instance-of v5, v2, Lbg/d;

    if-eqz v5, :cond_5

    invoke-static {}, Lwc/j;->a()Ljava/util/Set;

    move-result-object v0

    check-cast v2, Lbg/d;

    iget-object v1, v2, Lbg/d;->a:Landroidx/room/c1;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_1
    return-object p2

    :cond_4
    new-instance p2, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    const-string v0, ") has an invalid host. Host can only be one of ["

    invoke-static {v4, p1, v0}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {}, Lwc/j;->a()Ljava/util/Set;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    const/4 v5, 0x0

    const/16 v6, 0x3f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "]."

    invoke-static {v0, v1, p1}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    instance-of v5, v2, Lbg/c;

    if-eqz v5, :cond_a

    :try_start_2
    iget-object v5, p0, Lwc/i;->x:Lbg/b;

    check-cast v2, Lbg/c;

    iget-object v2, v2, Lbg/c;->a:Ljava/lang/String;

    iput-object p1, v0, Lwc/h;->w:Ljava/lang/String;

    iput-object p2, v0, Lwc/h;->x:Lcg/o;

    iput v3, v0, Lwc/h;->E:I

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lbc3/q0;->a:Lkc3/e;

    sget-object v3, Lkc3/d;->w:Lkc3/d;

    new-instance v5, Lbg/a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct {v5, v7, v2, v6}, Lbg/a;-><init>(ILjava/lang/String;Lq83/d;)V

    invoke-static {v3, v5, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_6

    return-object v1

    :cond_6
    :goto_2
    check-cast v0, Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_7

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_4

    :cond_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbg/f;

    invoke-virtual {v1}, Lbg/f;->a()Landroidx/room/c1;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/room/c1;->C()Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_3

    :cond_8
    :goto_4
    return-object p2

    :cond_9
    new-instance p2, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    const-string v0, ") is specified via a hostname whose IP address(es) do not resolve to the loopback device."

    invoke-static {v4, p1, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;)V

    throw p2

    :catchall_1
    move-exception v0

    move-object p2, v0

    move-object v1, p1

    move-object p1, p2

    :goto_5
    new-instance p2, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    const-string v0, ") is specified via a hostname whose IP address(es) could not be resolved. "

    invoke-static {v4, v1, v0}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :catch_0
    move-exception v0

    move-object p2, v0

    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    const-string v1, "Invalid fullUri `"

    const/16 v2, 0x60

    invoke-static {v2, v1, p1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Ls9/f;->w(Lve/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
