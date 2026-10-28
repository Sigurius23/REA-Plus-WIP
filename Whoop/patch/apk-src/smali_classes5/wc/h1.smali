.class public final Lwc/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lve/f;


# instance fields
.field public final w:Lwc/b;

.field public final x:Ljava/lang/String;

.field public final y:Lvg/n;

.field public final z:Lpf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLvg/n;Lpf/a;)V
    .locals 7

    .line 1
    const-string v0, "roleArn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webIdentityTokenFilePath"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v1, Lwc/b;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p4

    move-wide v5, p5

    invoke-direct/range {v1 .. v6}, Lwc/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object v1, p0, Lwc/h1;->w:Lwc/b;

    .line 5
    iput-object p3, p0, Lwc/h1;->x:Ljava/lang/String;

    .line 6
    iput-object p7, p0, Lwc/h1;->y:Lvg/n;

    .line 7
    iput-object p8, p0, Lwc/h1;->z:Lpf/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvg/n;Lpf/a;)V
    .locals 11

    .line 8
    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v0, 0x384

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v7

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    .line 9
    invoke-direct/range {v2 .. v10}, Lwc/h1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLvg/n;Lpf/a;)V

    return-void
.end method


# virtual methods
.method public final b(Lgf/b;Ls83/c;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Lwc/g1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwc/g1;

    iget v1, v0, Lwc/g1;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/g1;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/g1;

    invoke-direct {v0, p0, p2}, Lwc/g1;-><init>(Lwc/h1;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lwc/g1;->G:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/g1;->I:I

    iget-object v3, p0, Lwc/h1;->y:Lvg/n;

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lwc/g1;->F:Lqd/a;

    iget-object v1, v0, Lwc/g1;->x:Log/g;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    move-object p2, v0

    goto/16 :goto_7

    :catch_0
    move-exception v0

    move-object p2, v0

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lwc/g1;->E:Ljava/lang/String;

    iget-object v2, v0, Lwc/g1;->z:Lwc/b;

    iget-object v5, v0, Lwc/g1;->x:Log/g;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget-object p1, v0, Lwc/g1;->z:Lwc/b;

    iget-object v2, v0, Lwc/g1;->y:Lwc/h1;

    iget-object v6, v0, Lwc/g1;->x:Log/g;

    iget-object v8, v0, Lwc/g1;->w:Lgf/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v2

    move-object v2, p1

    move-object p1, v8

    move-object v8, v6

    move-object v6, v12

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    const-class v2, Lwc/d1;

    sget-object v8, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v8, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-static {p2, v2}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object p2

    new-instance v2, Lw91/l;

    const/16 v8, 0x15

    invoke-direct {v2, v8}, Lw91/l;-><init>(I)V

    invoke-virtual {p2, v7, v2}, Lgm/r;->u(Ljava/lang/Throwable;Lc93/a;)V

    iget-object v2, p0, Lwc/h1;->w:Lwc/b;

    iget-object v8, v2, Lwc/b;->b:Ljava/lang/String;

    iput-object p1, v0, Lwc/g1;->w:Lgf/b;

    iput-object p2, v0, Lwc/g1;->x:Log/g;

    iput-object p0, v0, Lwc/g1;->y:Lwc/h1;

    iput-object v2, v0, Lwc/g1;->z:Lwc/b;

    iput v6, v0, Lwc/g1;->I:I

    move-object v6, v3

    check-cast v6, Lvg/r;

    invoke-virtual {v6, v8, v0}, Lvg/r;->d(Ljava/lang/String;Ls83/c;)Ljava/io/Serializable;

    move-result-object v6

    if-ne v6, v1, :cond_5

    goto/16 :goto_4

    :cond_5
    move-object v8, p2

    move-object p2, v6

    move-object v6, p0

    :goto_1
    check-cast p2, [B

    if-eqz p2, :cond_b

    invoke-static {p2}, Lyb3/y;->A([B)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v9

    invoke-static {v9}, Lbp/b;->w(Lq83/j;)Lmg/h;

    move-result-object v9

    new-instance v10, Lwc/e1;

    const/4 v11, 0x0

    invoke-direct {v10, v6, v9, p1, v11}, Lwc/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v7, v0, Lwc/g1;->w:Lgf/b;

    iput-object v8, v0, Lwc/g1;->x:Log/g;

    iput-object v7, v0, Lwc/g1;->y:Lwc/h1;

    iput-object v2, v0, Lwc/g1;->z:Lwc/b;

    iput-object p2, v0, Lwc/g1;->E:Ljava/lang/String;

    iput v5, v0, Lwc/g1;->I:I

    sget-object p1, Lqd/d;->b:Lqd/d;

    invoke-virtual {p1, v10, v0}, Lvo/b;->p(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    move-object v5, p2

    move-object p2, p1

    move-object p1, v5

    move-object v5, v8

    :goto_2
    check-cast p2, Lqd/a;

    :try_start_1
    new-instance v6, Lb30/m;

    const/16 v8, 0x13

    invoke-direct {v6, v8}, Lb30/m;-><init>(I)V

    iget-object v8, v2, Lwc/b;->a:Ljava/lang/String;

    iput-object v8, v6, Lb30/m;->z:Ljava/lang/Object;

    iput-object p1, v6, Lb30/m;->F:Ljava/lang/Object;

    iget-wide v8, v2, Lwc/b;->d:J

    invoke-static {v8, v9}, Lkotlin/time/Duration;->getInWholeSeconds-impl(J)J

    move-result-wide v8

    long-to-int p1, v8

    new-instance v8, Ljava/lang/Integer;

    invoke-direct {v8, p1}, Ljava/lang/Integer;-><init>(I)V

    iput-object v8, v6, Lb30/m;->x:Ljava/lang/Object;

    iget-object p1, v2, Lwc/b;->c:Ljava/lang/String;

    if-nez p1, :cond_7

    invoke-static {v3}, Lrs/b;->g(Lvg/l;)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object p1, v0

    move-object v12, p2

    move-object p2, p1

    move-object p1, v12

    goto/16 :goto_7

    :catch_1
    move-exception v0

    move-object p1, v0

    move-object v1, p2

    move-object p2, p1

    move-object p1, v1

    move-object v1, v5

    goto :goto_6

    :cond_7
    :goto_3
    iput-object p1, v6, Lb30/m;->E:Ljava/lang/Object;

    iget-object p1, v2, Lwc/b;->e:Ljava/util/ArrayList;

    iput-object p1, v6, Lb30/m;->y:Ljava/lang/Object;

    new-instance p1, Lud/c;

    invoke-direct {p1, v6}, Lud/c;-><init>(Lb30/m;)V

    iput-object v7, v0, Lwc/g1;->w:Lgf/b;

    iput-object v5, v0, Lwc/g1;->x:Log/g;

    iput-object v7, v0, Lwc/g1;->y:Lwc/h1;

    iput-object v7, v0, Lwc/g1;->z:Lwc/b;

    iput-object v7, v0, Lwc/g1;->E:Ljava/lang/String;

    iput-object p2, v0, Lwc/g1;->F:Lqd/a;

    iput v4, v0, Lwc/g1;->I:I

    invoke-virtual {p2, p1, v0}, Lqd/a;->h(Lud/c;Lwc/g1;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_8

    :goto_4
    return-object v1

    :cond_8
    move-object v1, p2

    move-object p2, p1

    move-object p1, v1

    move-object v1, v5

    :goto_5
    :try_start_2
    check-cast p2, Lud/d;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p1}, Lqd/a;->close()V

    iget-object p1, p2, Lud/d;->c:Lud/f;

    if-eqz p1, :cond_a

    new-instance v0, Lwc/b1;

    const/4 v2, 0x1

    invoke-direct {v0, p1, v2}, Lwc/b1;-><init>(Lud/f;I)V

    invoke-interface {v1, v7, v0}, Log/g;->u(Ljava/lang/Throwable;Lc93/a;)V

    iget-object p2, p2, Lud/d;->a:Lud/e;

    if-eqz p2, :cond_9

    iget-object p2, p2, Lud/e;->a:Ljava/lang/String;

    if-eqz p2, :cond_9

    invoke-static {p2}, Ls4/b;->x(Ljava/lang/String;)Lvc/a;

    move-result-object p2

    iget-object v7, p2, Lvc/a;->d:Ljava/lang/String;

    :cond_9
    move-object v5, v7

    iget-object v0, p1, Lud/f;->a:Ljava/lang/String;

    iget-object v1, p1, Lud/f;->c:Ljava/lang/String;

    iget-object v2, p1, Lud/f;->d:Ljava/lang/String;

    iget-object v3, p1, Lud/f;->b:Lug/b;

    const-string v4, "WebIdentityToken"

    invoke-static/range {v0 .. v5}, Ls93/h;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Ljava/lang/String;Ljava/lang/String;)Lve/e;

    move-result-object p1

    sget-object p2, Lie/a;->G:Lie/a;

    invoke-static {p1, p2}, Ldc/a;->R(Lve/e;Lbf/a;)Lve/e;

    move-result-object p1

    return-object p1

    :cond_a
    new-instance p1, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    const-string p2, "STS credentials must not be null"

    invoke-direct {p1, v7, p2}, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw p1

    :goto_6
    :try_start_3
    new-instance v0, Lw91/l;

    const/16 v2, 0x16

    invoke-direct {v0, v2}, Lw91/l;-><init>(I)V

    invoke-interface {v1, v7, v0}, Log/g;->u(Ljava/lang/Throwable;Lc93/a;)V

    new-instance v0, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    const-string v1, "STS failed to assume role from web identity"

    invoke-direct {v0, v1, p2}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_7
    invoke-virtual {p1}, Lqd/a;->close()V

    throw p2

    :cond_b
    new-instance p1, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "failed to read webIdentityToken from "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v2, Lwc/b;->b:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, v7, p2}, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "logger<T> cannot be used on an anonymous object"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Ls9/f;->w(Lve/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
