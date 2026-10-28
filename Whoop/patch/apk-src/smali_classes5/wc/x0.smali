.class public final Lwc/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxf/c;


# instance fields
.field public final E:Lvg/n;

.field public final F:Lug/a;

.field public final G:Lab/h0;

.field public final w:Ljava/lang/String;

.field public final x:Ljava/lang/String;

.field public final y:J

.field public final z:Lpf/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpf/a;Lvg/n;Lug/a;)V
    .locals 3

    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v0, 0x12c

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v0

    const-string v2, "startUrl"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "ssoRegion"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc/x0;->w:Ljava/lang/String;

    iput-object p3, p0, Lwc/x0;->x:Ljava/lang/String;

    iput-wide v0, p0, Lwc/x0;->y:J

    iput-object p4, p0, Lwc/x0;->z:Lpf/a;

    iput-object p5, p0, Lwc/x0;->E:Lvg/n;

    iput-object p6, p0, Lwc/x0;->F:Lug/a;

    new-instance p1, Lab/h0;

    const/16 p2, 0x11

    const/4 p3, 0x0

    invoke-direct {p1, p2, p3}, Lab/h0;-><init>(IB)V

    iput-object p1, p0, Lwc/x0;->G:Lab/h0;

    return-void
.end method

.method public static final a(Lwc/x0;Ls83/c;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lwc/x0;->w:Ljava/lang/String;

    iget-object v1, p0, Lwc/x0;->F:Lug/a;

    instance-of v2, p1, Lwc/u0;

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, Lwc/u0;

    iget v3, v2, Lwc/u0;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lwc/u0;->y:I

    goto :goto_0

    :cond_0
    new-instance v2, Lwc/u0;

    invoke-direct {v2, p0, p1}, Lwc/u0;-><init>(Lwc/x0;Ls83/c;)V

    :goto_0
    iget-object p1, v2, Lwc/u0;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lwc/u0;->y:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lwc/x0;->E:Lvg/n;

    iput v6, v2, Lwc/u0;->y:I

    invoke-static {v0, p1, v2}, Lwc/z0;->d(Ljava/lang/String;Lvg/n;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lwc/q0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v1

    iget-object v4, p1, Lwc/q0;->b:Lug/b;

    iget-wide v6, p0, Lwc/x0;->y:J

    invoke-virtual {v4, v6, v7}, Lug/b;->c(J)Lug/b;

    move-result-object v4

    invoke-virtual {v1, v4}, Lug/b;->a(Lug/b;)I

    move-result v1

    const/4 v4, 0x0

    const-string v6, "log<T> cannot be used on an anonymous object"

    const-class v7, Lwc/x0;

    const/4 v8, 0x0

    if-gez v1, :cond_6

    invoke-interface {v2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    new-instance v1, Lwc/r0;

    invoke-direct {v1, p0, v4}, Lwc/r0;-><init>(Lwc/x0;I)V

    sget-object p0, Log/b;->z:Log/b;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v0, p0, v2, v8, v1}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    return-object p1

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    iget-object v1, p1, Lwc/q0;->d:Ljava/lang/String;

    if-eqz v1, :cond_8

    iget-object v1, p1, Lwc/q0;->e:Ljava/lang/String;

    if-eqz v1, :cond_8

    iget-object v1, p1, Lwc/q0;->c:Ljava/lang/String;

    if-eqz v1, :cond_8

    iput v5, v2, Lwc/u0;->y:I

    invoke-virtual {p0, p1, v2}, Lwc/x0;->c(Lwc/q0;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v3, :cond_7

    :goto_2
    return-object v3

    :cond_7
    return-object p0

    :cond_8
    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v1

    iget-object v3, p1, Lwc/q0;->b:Lug/b;

    invoke-virtual {v1, v3}, Lug/b;->a(Lug/b;)I

    move-result v1

    if-gez v1, :cond_9

    goto :goto_3

    :cond_9
    move-object p1, v8

    :goto_3
    if-eqz p1, :cond_b

    invoke-interface {v2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    new-instance v1, Lwc/s0;

    invoke-direct {v1, p1, p0, v4}, Lwc/s0;-><init>(Lwc/q0;Lwc/x0;I)V

    sget-object p0, Log/b;->z:Log/b;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-static {v0, p0, v2, v8, v1}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    return-object p1

    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    new-instance p0, Laws/sdk/kotlin/runtime/auth/credentials/InvalidSsoTokenException;

    const-string p1, "SSO token for sso-session: "

    const-string v1, " is expired"

    invoke-static {p1, v0, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v8}, Laws/sdk/kotlin/runtime/auth/credentials/InvalidSsoTokenException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method


# virtual methods
.method public final b(Lgf/b;Ls83/c;)Ljava/lang/Object;
    .locals 3

    new-instance v0, La33/c;

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-direct {v0, p0, p1, v1, v2}, La33/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iget-object p1, p0, Lwc/x0;->G:Lab/h0;

    invoke-virtual {p1, v0, p2}, Lab/h0;->v(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lwc/q0;Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Lwc/t0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwc/t0;

    iget v1, v0, Lwc/t0;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/t0;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/t0;

    invoke-direct {v0, p0, p2}, Lwc/t0;-><init>(Lwc/x0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lwc/t0;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/t0;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const-string v5, "log<T> cannot be used on an anonymous object"

    const-class v6, Lwc/x0;

    const/4 v7, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lwc/t0;->x:Ljava/lang/Object;

    iget-object v1, v0, Lwc/t0;->w:Lwc/q0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lwc/t0;->w:Lwc/q0;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    new-instance v2, Lwc/r0;

    invoke-direct {v2, p0, v4}, Lwc/r0;-><init>(Lwc/x0;I)V

    sget-object v8, Log/b;->z:Log/b;

    sget-object v9, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v9, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-interface {v9}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_b

    invoke-static {p2, v8, v9, v7, v2}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    :try_start_1
    iput-object p1, v0, Lwc/t0;->w:Lwc/q0;

    iput v4, v0, Lwc/t0;->E:I

    invoke-virtual {p0, p1, v0}, Lwc/x0;->d(Lwc/q0;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_5

    :cond_4
    :goto_1
    check-cast p2, Lwc/q0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    move-object v10, p2

    move-object p2, p1

    move-object p1, v10

    goto :goto_4

    :goto_3
    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    goto :goto_2

    :goto_4
    instance-of v2, p1, Ll83/m;

    if-nez v2, :cond_6

    move-object v2, p1

    check-cast v2, Lwc/q0;

    iput-object p2, v0, Lwc/t0;->w:Lwc/q0;

    iput-object p1, v0, Lwc/t0;->x:Ljava/lang/Object;

    iput v3, v0, Lwc/t0;->E:I

    invoke-virtual {p0, v2, v0}, Lwc/x0;->e(Lwc/q0;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    :goto_5
    return-object v1

    :cond_5
    move-object v1, p2

    :goto_6
    move-object p2, v1

    :cond_6
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    iget-object p1, p0, Lwc/x0;->F:Lug/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object p1

    iget-object v2, p2, Lwc/q0;->b:Lug/b;

    invoke-virtual {p1, v2}, Lug/b;->a(Lug/b;)I

    move-result p1

    if-ltz p1, :cond_9

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    new-instance p2, Lw91/l;

    const/16 v0, 0x11

    invoke-direct {p2, v0}, Lw91/l;-><init>(I)V

    sget-object v0, Log/b;->w:Log/b;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_8

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-static {p1, v0, v2, v1, p2}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    new-instance p1, Laws/sdk/kotlin/runtime/auth/credentials/InvalidSsoTokenException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "SSO token for sso-session: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lwc/x0;->w:Ljava/lang/String;

    const-string v2, " is expired"

    invoke-static {v0, v2, p2}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, v1}, Laws/sdk/kotlin/runtime/auth/credentials/InvalidSsoTokenException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_9
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    new-instance v0, Lwc/s0;

    invoke-direct {v0, p2, p0, v4}, Lwc/s0;-><init>(Lwc/q0;Lwc/x0;I)V

    sget-object v1, Log/b;->z:Log/b;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-static {p1, v1, v2, v7, v0}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    move-object p1, p2

    :goto_7
    return-object p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Lwc/q0;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lwc/v0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwc/v0;

    iget v1, v0, Lwc/v0;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/v0;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/v0;

    invoke-direct {v0, p0, p2}, Lwc/v0;-><init>(Lwc/x0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lwc/v0;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/v0;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lwc/v0;->x:Ljava/io/Closeable;

    iget-object v0, v0, Lwc/v0;->w:Lwc/q0;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p2

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lwc/v0;->w:Lwc/q0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    invoke-static {p2}, Lbp/b;->w(Lq83/j;)Lmg/h;

    move-result-object p2

    new-instance v2, Lum0/b;

    const/16 v5, 0x17

    invoke-direct {v2, v5, p0, p2}, Lum0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object p1, v0, Lwc/v0;->w:Lwc/q0;

    iput v4, v0, Lwc/v0;->E:I

    sget-object p2, Lkd/d;->b:Lkd/d;

    invoke-virtual {p2, v2, v0}, Lvo/b;->p(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Ljava/io/Closeable;

    :try_start_1
    move-object v2, p2

    check-cast v2, Lkd/a;

    new-instance v4, Ljk/d;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iget-object v5, p1, Lwc/q0;->d:Ljava/lang/String;

    iput-object v5, v4, Ljk/d;->a:Ljava/lang/String;

    iget-object v5, p1, Lwc/q0;->e:Ljava/lang/String;

    iput-object v5, v4, Ljk/d;->b:Ljava/lang/String;

    iget-object v5, p1, Lwc/q0;->c:Ljava/lang/String;

    iput-object v5, v4, Ljk/d;->d:Ljava/lang/String;

    const-string v5, "refresh_token"

    iput-object v5, v4, Ljk/d;->c:Ljava/lang/String;

    new-instance v5, Lod/d;

    invoke-direct {v5, v4}, Lod/d;-><init>(Ljk/d;)V

    iput-object p1, v0, Lwc/v0;->w:Lwc/q0;

    iput-object p2, v0, Lwc/v0;->x:Ljava/io/Closeable;

    iput v3, v0, Lwc/v0;->E:I

    invoke-virtual {v2, v5, v0}, Lkd/a;->b(Lod/d;Lwc/v0;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v6, v0

    move-object v0, p1

    move-object p1, p2

    move-object p2, v6

    :goto_3
    :try_start_2
    check-cast p2, Lod/e;

    iget-object v1, p0, Lwc/x0;->F:Lug/a;

    invoke-static {p2, v0, v1}, Lwc/z0;->a(Lod/e;Lwc/q0;Lug/a;)Lwc/q0;

    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    return-object p2

    :catchall_1
    move-exception p1

    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    :goto_4
    :try_start_3
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception p1

    invoke-static {p2, p1}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :goto_5
    throw p2
.end method

.method public final e(Lwc/q0;Ls83/c;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p2, Lwc/w0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwc/w0;

    iget v1, v0, Lwc/w0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/w0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/w0;

    invoke-direct {v0, p0, p2}, Lwc/w0;-><init>(Lwc/x0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lwc/w0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/w0;->z:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lwc/w0;->w:Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    :catch_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lwc/x0;->w:Ljava/lang/String;

    invoke-static {p2}, Lwc/z0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v2, "sso"

    const-string v5, "cache"

    const-string v6, "~"

    const-string v7, ".aws"

    filled-new-array {v6, v7, v2, v5, p2}, [Ljava/lang/String;

    move-result-object p2

    iget-object v2, p0, Lwc/x0;->E:Lvg/n;

    invoke-static {v2, p2}, Lwc/z0;->b(Lvg/n;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v2}, Lx30/s0;->z(Ljava/lang/String;Lvg/n;)Ljava/lang/String;

    move-result-object p2

    :try_start_1
    invoke-static {p1}, Lwc/z0;->e(Lwc/q0;)[B

    move-result-object p1

    iput-object p2, v0, Lwc/w0;->w:Ljava/lang/String;

    iput v4, v0, Lwc/w0;->z:I

    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    sget-object v2, Lkc3/d;->w:Lkc3/d;

    new-instance v4, Lo23/p;

    const/4 v5, 0x0

    const/16 v6, 0xc

    invoke-direct {v4, p2, p1, v5, v6}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v2, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    move-object p1, v3

    :goto_1
    if-ne p1, v1, :cond_4

    return-object v1

    :goto_2
    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_2

    :goto_3
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    new-instance v1, Lar0/a;

    const/16 v2, 0xd

    invoke-direct {v1, p1, v2}, Lar0/a;-><init>(Ljava/lang/String;I)V

    sget-object p1, Log/b;->z:Log/b;

    const-class v2, Lwc/x0;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v0, p1, v2, p2, v1}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    :cond_4
    :goto_4
    return-object v3

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "log<T> cannot be used on an anonymous object"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
