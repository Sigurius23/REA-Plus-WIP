.class public abstract Lse/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luf/h;


# direct methods
.method public static b(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/ExpiredTokenException;
    .locals 2

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p2, :cond_3

    invoke-static {p2}, Lvd/f;->Z([B)Lb9/b;

    move-result-object p1

    invoke-static {p1}, Ls40/e0;->j(Lb9/b;)Lb9/b;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lb9/b;->t()Lb9/b;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {p2}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v0

    const-string v1, "message"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-static {p2}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_1
    invoke-static {p0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    const-string p0, "expected (string: `com.amazonaws.sts#expiredIdentityTokenMessage`)"

    invoke-static {p0, v0}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_2
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p0, Ljava/lang/String;

    :cond_2
    invoke-virtual {p2}, Lb9/b;->j()V

    goto :goto_0

    :cond_3
    :goto_3
    new-instance p1, Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/ExpiredTokenException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static c(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/MalformedPolicyDocumentException;
    .locals 2

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p2, :cond_3

    invoke-static {p2}, Lvd/f;->Z([B)Lb9/b;

    move-result-object p1

    invoke-static {p1}, Ls40/e0;->j(Lb9/b;)Lb9/b;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lb9/b;->t()Lb9/b;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {p2}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v0

    const-string v1, "message"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-static {p2}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_1
    invoke-static {p0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    const-string p0, "expected (string: `com.amazonaws.sts#malformedPolicyDocumentMessage`)"

    invoke-static {p0, v0}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_2
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p0, Ljava/lang/String;

    :cond_2
    invoke-virtual {p2}, Lb9/b;->j()V

    goto :goto_0

    :cond_3
    :goto_3
    new-instance p1, Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/MalformedPolicyDocumentException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static d(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/PackedPolicyTooLargeException;
    .locals 2

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p2, :cond_3

    invoke-static {p2}, Lvd/f;->Z([B)Lb9/b;

    move-result-object p1

    invoke-static {p1}, Ls40/e0;->j(Lb9/b;)Lb9/b;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lb9/b;->t()Lb9/b;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {p2}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v0

    const-string v1, "message"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-static {p2}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_1
    invoke-static {p0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    const-string p0, "expected (string: `com.amazonaws.sts#packedPolicyTooLargeMessage`)"

    invoke-static {p0, v0}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_2
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p0, Ljava/lang/String;

    :cond_2
    invoke-virtual {p2}, Lb9/b;->j()V

    goto :goto_0

    :cond_3
    :goto_3
    new-instance p1, Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/PackedPolicyTooLargeException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static e(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/RegionDisabledException;
    .locals 2

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p2, :cond_3

    invoke-static {p2}, Lvd/f;->Z([B)Lb9/b;

    move-result-object p1

    invoke-static {p1}, Ls40/e0;->j(Lb9/b;)Lb9/b;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lb9/b;->t()Lb9/b;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_3

    :cond_0
    invoke-virtual {p2}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v0

    const-string v1, "message"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-static {p2}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_1
    invoke-static {p0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    const-string p0, "expected (string: `com.amazonaws.sts#regionDisabledMessage`)"

    invoke-static {p0, v0}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    :goto_2
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p0, Ljava/lang/String;

    :cond_2
    invoke-virtual {p2}, Lb9/b;->j()V

    goto :goto_0

    :cond_3
    :goto_3
    new-instance p1, Laws/sdk/kotlin/runtime/auth/credentials/internal/sts/model/RegionDisabledException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static f(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidSmsRoleTrustRelationshipException;
    .locals 4

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p2, :cond_2

    new-instance p1, Ljg/b;

    invoke-direct {p1, p2}, Ljg/b;-><init>([B)V

    new-instance p2, Lhg/i;

    sget-object v0, Lhg/l;->i:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "message"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lhg/d;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p2, v0, v1, v3}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p2}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v0

    invoke-static {v0, p1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v0

    iget v1, p2, Lhg/i;->b:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_1

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_2
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidSmsRoleTrustRelationshipException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static g(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidUserPoolConfigurationException;
    .locals 4

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p2, :cond_2

    new-instance p1, Ljg/b;

    invoke-direct {p1, p2}, Ljg/b;-><init>([B)V

    new-instance p2, Lhg/i;

    sget-object v0, Lhg/l;->i:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "message"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lhg/d;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p2, v0, v1, v3}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p2}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v0

    invoke-static {v0, p1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v0

    iget v1, p2, Lhg/i;->b:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_1

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_2
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidUserPoolConfigurationException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static h(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/LimitExceededException;
    .locals 4

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p2, :cond_2

    new-instance p1, Ljg/b;

    invoke-direct {p1, p2}, Ljg/b;-><init>([B)V

    new-instance p2, Lhg/i;

    sget-object v0, Lhg/l;->i:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "message"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lhg/d;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p2, v0, v1, v3}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p2}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v0

    invoke-static {v0, p1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v0

    iget v1, p2, Lhg/i;->b:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_1

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_2
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/LimitExceededException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static i(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/NotAuthorizedException;
    .locals 4

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p2, :cond_2

    new-instance p1, Ljg/b;

    invoke-direct {p1, p2}, Ljg/b;-><init>([B)V

    new-instance p2, Lhg/i;

    sget-object v0, Lhg/l;->i:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "message"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lhg/d;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p2, v0, v1, v3}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p2}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v0

    invoke-static {v0, p1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v0

    iget v1, p2, Lhg/i;->b:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_1

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_2
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/NotAuthorizedException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static j(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/PasswordHistoryPolicyViolationException;
    .locals 4

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p2, :cond_2

    new-instance p1, Ljg/b;

    invoke-direct {p1, p2}, Ljg/b;-><init>([B)V

    new-instance p2, Lhg/i;

    sget-object v0, Lhg/l;->i:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "message"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lhg/d;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p2, v0, v1, v3}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p2}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v0

    invoke-static {v0, p1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v0

    iget v1, p2, Lhg/i;->b:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_1

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_2
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/PasswordHistoryPolicyViolationException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static k(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/PasswordResetRequiredException;
    .locals 4

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p2, :cond_2

    new-instance p1, Ljg/b;

    invoke-direct {p1, p2}, Ljg/b;-><init>([B)V

    new-instance p2, Lhg/i;

    sget-object v0, Lhg/l;->i:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "message"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lhg/d;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p2, v0, v1, v3}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p2}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v0

    invoke-static {v0, p1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v0

    iget v1, p2, Lhg/i;->b:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_1

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_2
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/PasswordResetRequiredException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static l(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ResourceNotFoundException;
    .locals 4

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p2, :cond_2

    new-instance p1, Ljg/b;

    invoke-direct {p1, p2}, Ljg/b;-><init>([B)V

    new-instance p2, Lhg/i;

    sget-object v0, Lhg/l;->i:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "message"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lhg/d;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p2, v0, v1, v3}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p2}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v0

    invoke-static {v0, p1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v0

    iget v1, p2, Lhg/i;->b:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_1

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_2
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/ResourceNotFoundException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static m(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/TooManyRequestsException;
    .locals 4

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p2, :cond_2

    new-instance p1, Ljg/b;

    invoke-direct {p1, p2}, Ljg/b;-><init>([B)V

    new-instance p2, Lhg/i;

    sget-object v0, Lhg/l;->i:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "message"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lhg/d;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p2, v0, v1, v3}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p2}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v0

    invoke-static {v0, p1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v0

    iget v1, p2, Lhg/i;->b:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_1

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_2
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/TooManyRequestsException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static n(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UnexpectedLambdaException;
    .locals 4

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p2, :cond_2

    new-instance p1, Ljg/b;

    invoke-direct {p1, p2}, Ljg/b;-><init>([B)V

    new-instance p2, Lhg/i;

    sget-object v0, Lhg/l;->i:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "message"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lhg/d;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p2, v0, v1, v3}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p2}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v0

    invoke-static {v0, p1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v0

    iget v1, p2, Lhg/i;->b:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_1

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_2
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/UnexpectedLambdaException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static o(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UnsupportedOperationException;
    .locals 4

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p2, :cond_2

    new-instance p1, Ljg/b;

    invoke-direct {p1, p2}, Ljg/b;-><init>([B)V

    new-instance p2, Lhg/i;

    sget-object v0, Lhg/l;->i:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "message"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lhg/d;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p2, v0, v1, v3}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p2}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v0

    invoke-static {v0, p1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v0

    iget v1, p2, Lhg/i;->b:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_1

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_2
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/UnsupportedOperationException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static p(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserLambdaValidationException;
    .locals 4

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p2, :cond_2

    new-instance p1, Ljg/b;

    invoke-direct {p1, p2}, Ljg/b;-><init>([B)V

    new-instance p2, Lhg/i;

    sget-object v0, Lhg/l;->i:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "message"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lhg/d;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p2, v0, v1, v3}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p2}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v0

    invoke-static {v0, p1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v0

    iget v1, p2, Lhg/i;->b:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_1

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_2
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserLambdaValidationException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static q(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotConfirmedException;
    .locals 4

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p2, :cond_2

    new-instance p1, Ljg/b;

    invoke-direct {p1, p2}, Ljg/b;-><init>([B)V

    new-instance p2, Lhg/i;

    sget-object v0, Lhg/l;->i:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "message"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lhg/d;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p2, v0, v1, v3}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p2}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v0

    invoke-static {v0, p1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v0

    iget v1, p2, Lhg/i;->b:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_1

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_2
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotConfirmedException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static r(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotFoundException;
    .locals 4

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    if-eqz p2, :cond_2

    new-instance p1, Ljg/b;

    invoke-direct {p1, p2}, Ljg/b;-><init>([B)V

    new-instance p2, Lhg/i;

    sget-object v0, Lhg/l;->i:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "message"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v2, v2, [Lhg/d;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p2, v0, v1, v3}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p2}, Lhc3/i;->j(Lhg/i;)Lxl/a;

    move-result-object v0

    invoke-static {v0, p1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v0

    iget v1, p2, Lhg/i;->b:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_1

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_2
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/UserNotFoundException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method
