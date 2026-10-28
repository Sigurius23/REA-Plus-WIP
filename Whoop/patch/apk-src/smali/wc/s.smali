.class public final Lwc/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lve/c;


# instance fields
.field public E:Lug/b;

.field public final F:Lmc3/c;

.field public final w:Ll83/h;

.field public final x:Lvg/l;

.field public final y:Lug/a;

.field public z:Lve/e;


# direct methods
.method public constructor <init>(Ll83/p;Lvg/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwc/s;->w:Ll83/h;

    iput-object p2, p0, Lwc/s;->x:Lvg/l;

    sget-object p1, Lug/a;->a:Lug/a;

    iput-object p1, p0, Lwc/s;->y:Lug/a;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lwc/s;->F:Lmc3/c;

    return-void
.end method


# virtual methods
.method public final b(Lgf/b;Ls83/c;)Ljava/lang/Object;
    .locals 12

    const-string p1, "/latest/meta-data/iam/security-credentials/"

    instance-of v0, p2, Lwc/q;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwc/q;

    iget v1, v0, Lwc/q;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/q;->H:I

    :goto_0
    move-object p2, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lwc/q;

    invoke-direct {v0, p0, p2}, Lwc/q;-><init>(Lwc/s;Ls83/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, p2, Lwc/q;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p2, Lwc/q;->H:I

    iget-object v3, p0, Lwc/s;->F:Lmc3/c;

    iget-object v4, p0, Lwc/s;->y:Lug/a;

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v3, p2, Lwc/q;->E:Lmc3/c;

    iget-object p1, p2, Lwc/q;->z:Lve/e;

    iget-object v1, p2, Lwc/q;->y:Lve/e;

    iget-object v2, p2, Lwc/q;->x:Ljava/lang/Exception;

    check-cast v2, Ljava/lang/String;

    iget-object p2, p2, Lwc/q;->w:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_1
    iget-object p1, p2, Lwc/q;->x:Ljava/lang/Exception;

    iget-object p2, p2, Lwc/q;->w:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_2
    iget-object p1, p2, Lwc/q;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_8

    :pswitch_3
    iget-object p1, p2, Lwc/q;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Exception;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_4
    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_4

    :catch_1
    move-exception v0

    move-object p1, v0

    goto/16 :goto_a

    :pswitch_5
    iget-object v2, p2, Lwc/q;->w:Ljava/lang/Object;

    check-cast v2, Lmc3/a;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_6
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Lyd/f;->e()Ljf/a;

    move-result-object v0

    iget-object v2, p0, Lwc/s;->x:Lvg/l;

    invoke-static {v0, v2}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    iput-object v3, p2, Lwc/q;->w:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p2, Lwc/q;->H:I

    invoke-virtual {v3, p2}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_1

    goto/16 :goto_b

    :cond_1
    move-object v2, v3

    :goto_2
    :try_start_2
    iget-object v0, p0, Lwc/s;->z:Lve/e;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lwc/s;->E:Lug/b;

    if-eqz v0, :cond_3

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v6

    invoke-virtual {v6, v0}, Lug/b;->a(Lug/b;)I

    move-result v6

    if-gez v6, :cond_2

    goto :goto_3

    :cond_2
    move-object v0, v5

    :goto_3
    if-eqz v0, :cond_3

    iget-object p1, p0, Lwc/s;->z:Lve/e;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v2, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_d

    :cond_3
    invoke-interface {v2, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    :try_start_3
    iput-object v5, p2, Lwc/q;->w:Ljava/lang/Object;

    const/4 v0, 0x2

    iput v0, p2, Lwc/q;->H:I

    invoke-virtual {p0, p2}, Lwc/s;->h(Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_4

    goto/16 :goto_b

    :cond_4
    :goto_4
    check-cast v0, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :try_start_4
    iget-object v2, p0, Lwc/s;->w:Ll83/h;

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbe/m;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object v5, p2, Lwc/q;->w:Ljava/lang/Object;

    const/4 v0, 0x4

    iput v0, p2, Lwc/q;->H:I

    check-cast v2, Lbe/g;

    invoke-virtual {v2, p1, p2}, Lbe/g;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_5

    goto/16 :goto_b

    :cond_5
    :goto_5
    check-cast v0, Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    new-instance p1, Ljg/b;

    invoke-static {v0}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v0

    invoke-direct {p1, v0}, Ljg/b;-><init>([B)V

    invoke-static {p1}, Lrg/j;->g(Ljg/b;)Lrj/j;

    move-result-object p1

    instance-of v0, p1, Lwc/u;

    if-eqz v0, :cond_9

    check-cast p1, Lwc/u;

    invoke-virtual {p1}, Lwc/u;->C()Lug/b;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lwc/u;->C()Lug/b;

    move-result-object v0

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v2

    invoke-virtual {v0, v2}, Lug/b;->a(Lug/b;)I

    move-result v0

    if-gez v0, :cond_7

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    new-instance v2, Lw91/l;

    const/16 v6, 0xf

    invoke-direct {v2, v6}, Lw91/l;-><init>(I)V

    sget-object v6, Log/b;->x:Log/b;

    const-class v7, Lwc/s;

    sget-object v8, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v8, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-interface {v7}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_6

    invoke-static {v0, v6, v7, v5, v2}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v0

    sget-object v2, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v2, 0x384

    sget-object v4, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v2, v4}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Lug/b;->d(J)Lug/b;

    move-result-object v0

    goto :goto_6

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "log<T> cannot be used on an anonymous object"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    move-object v0, v5

    :goto_6
    iput-object v0, p0, Lwc/s;->E:Lug/b;

    invoke-virtual {p1}, Lwc/u;->B()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lwc/u;->D()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lwc/u;->E()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lwc/u;->C()Lug/b;

    move-result-object v9

    const/4 v10, 0x0

    const/16 v11, 0x20

    invoke-static/range {v6 .. v11}, Lve/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Lgf/b;I)Lve/e;

    move-result-object p1

    sget-object v0, Lie/a;->S:Lie/a;

    invoke-static {p1, v0}, Ldc/a;->R(Lve/e;Lbf/a;)Lve/e;

    move-result-object p1

    iput-object v5, p2, Lwc/q;->w:Ljava/lang/Object;

    iput-object v5, p2, Lwc/q;->x:Ljava/lang/Exception;

    iput-object p1, p2, Lwc/q;->y:Lve/e;

    iput-object p1, p2, Lwc/q;->z:Lve/e;

    iput-object v3, p2, Lwc/q;->E:Lmc3/c;

    const/4 v0, 0x6

    iput v0, p2, Lwc/q;->H:I

    invoke-virtual {v3, p2}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    goto/16 :goto_b

    :cond_8
    move-object v1, p1

    :goto_7
    :try_start_5
    iput-object p1, p0, Lwc/s;->z:Lve/e;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    invoke-interface {v3, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v1

    :catchall_1
    move-exception v0

    move-object p1, v0

    invoke-interface {v3, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1

    :cond_9
    instance-of p2, p1, Lwc/t;

    if-eqz p2, :cond_b

    check-cast p1, Lwc/t;

    invoke-virtual {p1}, Lwc/t;->B()Ljava/lang/String;

    move-result-object p2

    const-string v0, "AssumeRoleUnauthorizedAccess"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    new-instance p2, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Incorrect IMDS/IAM configuration: ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lwc/t;->B()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lwc/t;->C()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Hint: Does this role have a trust relationship with EC2?"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_a
    new-instance p2, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Error retrieving credentials from IMDS: code="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lwc/t;->B()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "; "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lwc/t;->C()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :goto_8
    iput-object v5, p2, Lwc/q;->w:Ljava/lang/Object;

    iput-object p1, p2, Lwc/q;->x:Ljava/lang/Exception;

    const/4 v0, 0x5

    iput v0, p2, Lwc/q;->H:I

    invoke-virtual {p0, p1, p2}, Lwc/s;->i(Ljava/lang/Exception;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_c

    goto :goto_b

    :cond_c
    :goto_9
    check-cast v0, Lve/e;

    if-eqz v0, :cond_d

    return-object v0

    :cond_d
    new-instance p2, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    const-string v0, "failed to load credentials"

    invoke-direct {p2, p1, v0}, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw p2

    :goto_a
    iput-object p1, p2, Lwc/q;->w:Ljava/lang/Object;

    const/4 v0, 0x3

    iput v0, p2, Lwc/q;->H:I

    invoke-virtual {p0, p1, p2}, Lwc/s;->i(Ljava/lang/Exception;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_e

    :goto_b
    return-object v1

    :cond_e
    :goto_c
    check-cast v0, Lve/e;

    if-eqz v0, :cond_f

    return-object v0

    :cond_f
    new-instance p2, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    const-string v0, "failed to load instance profile"

    invoke-direct {p2, p1, v0}, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw p2

    :goto_d
    invoke-interface {v2, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1

    :cond_10
    new-instance p1, Laws/sdk/kotlin/runtime/auth/credentials/CredentialsNotLoadedException;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Laws/sdk/kotlin/runtime/auth/credentials/CredentialsNotLoadedException;-><init>(I)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lwc/s;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbe/m;

    check-cast v0, Lbe/g;

    invoke-virtual {v0}, Lbe/g;->close()V

    :cond_0
    return-void
.end method

.method public final h(Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lwc/p;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lwc/p;

    iget v1, v0, Lwc/p;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/p;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/p;

    invoke-direct {v0, p0, p1}, Lwc/p;-><init>(Lwc/s;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lwc/p;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/p;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lwc/s;->w:Ll83/h;

    invoke-interface {p1}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbe/m;

    const-string v2, "/latest/meta-data/iam/security-credentials/"

    iput v3, v0, Lwc/p;->y:I

    check-cast p1, Lbe/g;

    invoke-virtual {p1, v2, v0}, Lbe/g;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/String;
    :try_end_1
    .catch Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    sget-object v1, Lmf/t;->c:Lmf/t;

    invoke-static {}, Lo73/a;->K()Lmf/t;

    move-result-object v1

    iget-object v2, p1, Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;->z:Lmf/t;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    new-instance v1, Lw91/l;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, Lw91/l;-><init>(I)V

    sget-object v2, Log/b;->y:Log/b;

    const-class v3, Lwc/s;

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-interface {v3}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_4

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "log<T> cannot be used on an anonymous object"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4, v1}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    :cond_5
    throw p1
.end method

.method public final i(Ljava/lang/Exception;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lwc/r;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwc/r;

    iget v1, v0, Lwc/r;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwc/r;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwc/r;

    invoke-direct {v0, p0, p2}, Lwc/r;-><init>(Lwc/s;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lwc/r;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwc/r;->z:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lwc/r;->w:Lmc3/c;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p2, p1, Ljava/io/IOException;

    if-nez p2, :cond_4

    instance-of p2, p1, Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;

    if-eqz p2, :cond_3

    check-cast p1, Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;

    iget-object p1, p1, Laws/sdk/kotlin/runtime/config/imds/EC2MetadataError;->z:Lmf/t;

    sget-object p2, Lmf/t;->c:Lmf/t;

    invoke-static {}, Lo73/a;->F()Lmf/t;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    return-object v4

    :cond_4
    :goto_1
    iget-object p1, p0, Lwc/s;->F:Lmc3/c;

    iput-object p1, v0, Lwc/r;->w:Lmc3/c;

    iput v3, v0, Lwc/r;->z:I

    invoke-virtual {p1, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    :try_start_0
    iget-object p2, p0, Lwc/s;->z:Lve/e;

    if-eqz p2, :cond_6

    iget-object v0, p0, Lwc/s;->y:Lug/a;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lug/b;->x:Lt9/p;

    invoke-static {}, Lt9/p;->t()Lug/b;

    move-result-object v0

    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    const/16 v2, 0x384

    invoke-static {v2, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lug/b;->d(J)Lug/b;

    move-result-object v0

    iput-object v0, p0, Lwc/s;->E:Lug/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p2

    goto :goto_4

    :cond_6
    move-object p2, v4

    :goto_3
    invoke-interface {p1, v4}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object p2

    :goto_4
    invoke-interface {p1, v4}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p2
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Ls9/f;->w(Lve/f;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
