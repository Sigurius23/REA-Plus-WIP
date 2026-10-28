.class public abstract Ldd/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luf/h;


# direct methods
.method public static b(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/AliasExistsException;
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
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/AliasExistsException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static c(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/CodeDeliveryFailureException;
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
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CodeDeliveryFailureException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static d(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/CodeMismatchException;
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
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/CodeMismatchException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static e(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ExpiredCodeException;
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
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/ExpiredCodeException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static f(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/ForbiddenException;
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
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/ForbiddenException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static g(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InternalErrorException;
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
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/InternalErrorException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->x:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static h(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidEmailRoleAccessPolicyException;
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
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidEmailRoleAccessPolicyException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static i(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidLambdaResponseException;
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
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidLambdaResponseException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static j(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;
    .locals 6

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "call"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/seon/androidsdk/service/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_4

    new-instance p1, Ljg/b;

    invoke-direct {p1, p2}, Ljg/b;-><init>([B)V

    new-instance p2, Lhg/i;

    sget-object v0, Lhg/l;->i:Lhg/l;

    new-instance v1, Ljg/e;

    const-string v2, "message"

    invoke-direct {v1, v2}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x1

    new-array v3, v2, [Lhg/d;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    invoke-static {v3}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {p2, v0, v1, v4}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v1, Lhg/i;

    new-instance v3, Ljg/e;

    const-string v5, "reasonCode"

    invoke-direct {v3, v5}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v2, v2, [Lhg/d;

    aput-object v3, v2, v4

    invoke-static {v2}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, v0, v2, v4}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {p2, v1}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v0

    invoke-static {v0, p1}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v0

    iget v2, p2, Lhg/i;->b:I

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, v2, :cond_1

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/seon/androidsdk/service/c0;->a:Ljava/lang/String;

    goto :goto_0

    :cond_1
    :goto_1
    iget v2, v1, Lhg/i;->b:I

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/seon/androidsdk/service/c0;->b:Ljava/lang/String;

    goto :goto_0

    :cond_3
    :goto_2
    if-eqz v0, :cond_4

    invoke-interface {p1}, Lhg/c;->skipValue()V

    goto :goto_0

    :cond_4
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidParameterException;-><init>(Lio/seon/androidsdk/service/c0;)V

    return-object p1
.end method

.method public static k(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidPasswordException;
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
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidPasswordException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static l(Ldg/a;Lrf/l;[B)Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidSmsRoleAccessPolicyException;
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
    new-instance p1, Laws/sdk/kotlin/services/cognitoidentityprovider/model/InvalidSmsRoleAccessPolicyException;

    invoke-direct {p1, p0}, Laws/sdk/kotlin/runtime/AwsServiceException;-><init>(Ljava/lang/String;)V

    iget-object p0, p1, Laws/sdk/kotlin/runtime/AwsServiceException;->y:Luc/a;

    iget-object p0, p0, Lte/c;->a:Lgf/c;

    sget-object p2, Lte/e;->g:Lgf/a;

    sget-object v0, Lte/f;->w:Lte/f;

    invoke-virtual {p0, p2, v0}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    return-object p1
.end method
