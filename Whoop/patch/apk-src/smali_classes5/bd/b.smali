.class public final Lbd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luf/f;
.implements Luf/c;
.implements Lxf/f;


# instance fields
.field public final w:Lyc/f;


# direct methods
.method public constructor <init>(Lyc/f;I)V
    .locals 0

    packed-switch p2, :pswitch_data_0

    const-string p2, "config"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbd/b;->w:Lyc/f;

    return-void

    :pswitch_0
    const-string p2, "config"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbd/b;->w:Lyc/f;

    return-void

    :pswitch_1
    const-string p2, "config"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbd/b;->w:Lyc/f;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public c(Luf/w;Lq83/d;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Lbd/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lbd/a;

    iget v1, v0, Lbd/a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbd/a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbd/a;

    check-cast p2, Ls83/c;

    invoke-direct {v0, p0, p2}, Lbd/a;-><init>(Lbd/b;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lbd/a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbd/a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lbd/a;->w:Luf/w;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    const-string p2, "config"

    iget-object v2, p0, Lbd/b;->w:Lyc/f;

    invoke-static {v2, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "request"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v4, v2, Lyc/f;->z:Ljava/lang/String;

    iget-boolean v5, v2, Lyc/f;->O:Z

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iget-boolean v6, v2, Lyc/f;->P:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    iget-object v7, v2, Lyc/f;->J:Lcg/o;

    if-eqz v7, :cond_3

    iget-object v7, v7, Lcg/o;->h:Ljava/lang/String;

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    :goto_1
    iget-object v8, p1, Luf/w;->a:Ldg/a;

    sget-object v9, Lcf/l;->a:Lgf/a;

    invoke-static {v8, v9}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    iget-object v2, v2, Lyc/f;->I:Lkr/e;

    iput-object p1, v0, Lbd/a;->w:Luf/w;

    iput v3, v0, Lbd/a;->z:I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lcg/o;->i:Lcg/n;

    if-eqz v7, :cond_6

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {v0, v7}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    sget-object v3, Lbf/b;->c:Lgf/a;

    const-string v4, "<this>"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3, p2}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    new-instance p2, Lef/a;

    invoke-direct {p2, v0, v2}, Lef/a;-><init>(Lcg/o;Lgf/b;)V

    goto/16 :goto_2

    :cond_4
    new-instance p1, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string p2, "Invalid Configuration: Dualstack and custom endpoint are not supported"

    invoke-direct {p1, p2}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string p2, "Invalid Configuration: FIPS and custom endpoint are not supported"

    invoke-direct {p1, p2}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    if-eqz v4, :cond_15

    sget-object v2, Lbd/c;->a:Ljava/util/List;

    invoke-static {v4, v2}, Ltx/f;->X(Ljava/lang/String;Ljava/util/List;)Lfe/b;

    move-result-object v2

    if-eqz v2, :cond_15

    iget-object v3, v2, Lfe/b;->b:Ljava/lang/String;

    iget-object v7, v2, Lfe/b;->c:Ljava/lang/String;

    iget-object v8, v2, Lfe/b;->e:Ljava/lang/Boolean;

    iget-object v9, v2, Lfe/b;->d:Ljava/lang/Boolean;

    iget-object v2, v2, Lfe/b;->a:Ljava/lang/String;

    const-string v10, "aws"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    const-string v11, "https://"

    if-eqz v10, :cond_7

    invoke-static {v6, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    new-instance p2, Lef/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".signin.aws.amazon.com"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    invoke-direct {p2, v0}, Lef/a;-><init>(Lcg/o;)V

    goto/16 :goto_2

    :cond_7
    const-string v10, "aws-cn"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-static {v6, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    new-instance p2, Lef/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".signin.amazonaws.cn"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    invoke-direct {p2, v0}, Lef/a;-><init>(Lcg/o;)V

    goto/16 :goto_2

    :cond_8
    const-string v10, "aws-us-gov"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {v6, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    new-instance p2, Lef/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".signin.amazonaws-us-gov.com"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    invoke-direct {p2, v0}, Lef/a;-><init>(Lcg/o;)V

    goto/16 :goto_2

    :cond_9
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    const-string v11, "https://signin-fips."

    const/16 v12, 0x2e

    if-eqz v10, :cond_b

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-virtual {v2, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_a

    new-instance p2, Lef/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    invoke-direct {p2, v0}, Lef/a;-><init>(Lcg/o;)V

    goto/16 :goto_2

    :cond_a
    new-instance p1, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string p2, "FIPS and DualStack are enabled, but this partition does not support one or both"

    invoke-direct {p1, p2}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_c

    new-instance p2, Lef/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    invoke-direct {p2, v0}, Lef/a;-><init>(Lcg/o;)V

    goto :goto_2

    :cond_c
    new-instance p1, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string p2, "FIPS is enabled but this partition does not support FIPS"

    invoke-direct {p1, p2}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    invoke-static {v6, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    const-string v6, "https://signin."

    if-eqz p2, :cond_f

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_f

    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_e

    new-instance p2, Lef/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    invoke-direct {p2, v0}, Lef/a;-><init>(Lcg/o;)V

    goto :goto_2

    :cond_e
    new-instance p1, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string p2, "DualStack is enabled but this partition does not support DualStack"

    invoke-direct {p1, p2}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    new-instance p2, Lef/a;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object v0

    invoke-direct {p2, v0}, Lef/a;-><init>(Lcg/o;)V

    :goto_2
    if-ne p2, v1, :cond_10

    return-object v1

    :cond_10
    :goto_3
    check-cast p2, Lef/a;

    iget-object v0, p2, Lef/a;->b:Lgf/b;

    sget-object v1, Lbf/b;->c:Lgf/a;

    invoke-interface {v0, v1}, Lgf/b;->d(Lgf/a;)Z

    move-result v1

    if-eqz v1, :cond_11

    iget-object v1, p1, Luf/w;->a:Ldg/a;

    sget-object v2, Lbf/c;->z:Lbf/c;

    invoke-static {v1, v2}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_11
    sget-object v1, Lbf/b;->b:Lgf/a;

    invoke-interface {v0, v1}, Lgf/b;->d(Lgf/a;)Z

    move-result v1

    if-eqz v1, :cond_12

    iget-object v1, p1, Luf/w;->a:Ldg/a;

    sget-object v2, Lbf/c;->E:Lbf/c;

    invoke-static {v1, v2}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_12
    sget-object v1, Lwe/f;->d:Lgf/a;

    invoke-interface {v0, v1}, Lgf/b;->d(Lgf/a;)Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-static {v0, v1}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "s3express"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p1, Luf/w;->a:Ldg/a;

    sget-object v1, Lie/b;->x:Lie/b;

    invoke-static {v0, v1}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_13
    iget-object v0, p1, Luf/w;->c:Lxf/a;

    invoke-interface {v0}, Lxf/a;->getAttributes()Lgf/b;

    move-result-object v0

    sget-object v1, Lxd/a;->b:Lgf/a;

    invoke-interface {v0, v1}, Lgf/b;->d(Lgf/a;)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object p1, p1, Luf/w;->a:Ldg/a;

    sget-object v0, Lbf/c;->G:Lbf/c;

    invoke-static {p1, v0}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_14
    return-object p2

    :cond_15
    new-instance p1, Laws/smithy/kotlin/runtime/client/endpoints/EndpointProviderException;

    const-string p2, "Invalid Configuration: Missing Region"

    invoke-direct {p1, p2}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Luf/u;Luf/a;)Ljava/lang/Object;
    .locals 1

    iget-object p1, p1, Luf/u;->a:Ldg/a;

    sget-object p2, Lcf/l;->a:Lgf/a;

    invoke-static {p1, p2}, Ljc/x;->J(Lgf/b;Lgf/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object p2, p0, Lbd/b;->w:Lyc/f;

    iget-object p2, p2, Lyc/f;->R:Lfd/a;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p2, Lfd/a;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p2, Lfd/a;->c:Ljava/util/List;

    :cond_0
    check-cast p1, Ljava/util/List;

    iget-object p2, p2, Lfd/a;->a:Ljava/util/List;

    if-eqz p2, :cond_1

    invoke-static {p2, p1}, Lds/p;->P(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public j(Ljava/lang/String;)Lxf/c;
    .locals 3

    const-string v0, "schemeId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aws.auth#sigv4"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lbd/b;->w:Lyc/f;

    iget-object p1, p1, Lyc/f;->H:Lve/f;

    return-object p1

    :cond_0
    const-string v0, "smithy.api#noAuth"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lnf/d;->w:Lnf/d;

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "auth scheme "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lue/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " not configured for client"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
