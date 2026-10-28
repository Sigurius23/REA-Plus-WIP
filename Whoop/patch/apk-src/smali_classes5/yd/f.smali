.class public abstract Lyd/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljf/a;

.field public static final b:Ljf/a;

.field public static final c:Ljf/a;

.field public static final d:Ljf/a;

.field public static final e:Ljf/a;

.field public static final f:Ljf/f;

.field public static final g:Ljf/a;

.field public static final h:Ljf/a;

.field public static final i:Ljf/a;

.field public static final j:Ljf/a;

.field public static final k:Ljf/a;

.field public static final l:Ljf/a;

.field public static final m:Ljf/a;

.field public static final n:Ljf/a;

.field public static final o:Ljf/a;

.field public static final p:Ljf/a;

.field public static final q:Ljf/a;

.field public static final r:Ljf/a;

.field public static final s:Ljf/a;

.field public static final t:Ljf/a;

.field public static final u:Ljf/a;

.field public static final v:Ljf/a;

.field public static final w:Ljf/a;

.field public static final x:Ljf/a;

.field public static final y:Ljf/a;

.field public static final z:Ljf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    sget-object v0, Ljf/e;->d:Lg1/a7;

    const-string v1, "aws.accessKeyId"

    const-string v2, "AWS_ACCESS_KEY_ID"

    invoke-virtual {v0, v1, v2}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljf/a;

    sput-object v1, Lyd/f;->a:Ljf/a;

    const-string v1, "aws.secretAccessKey"

    const-string v2, "AWS_SECRET_ACCESS_KEY"

    invoke-virtual {v0, v1, v2}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljf/a;

    sput-object v1, Lyd/f;->b:Ljf/a;

    const-string v1, "aws.sessionToken"

    const-string v2, "AWS_SESSION_TOKEN"

    invoke-virtual {v0, v1, v2}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljf/a;

    sput-object v1, Lyd/f;->c:Ljf/a;

    const-string v1, "aws.region"

    const-string v2, "AWS_REGION"

    invoke-virtual {v0, v1, v2}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljf/a;

    sput-object v1, Lyd/f;->d:Ljf/a;

    const-string v1, "aws.accountId"

    const-string v2, "AWS_ACCOUNT_ID"

    invoke-virtual {v0, v1, v2}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljf/a;

    sput-object v1, Lyd/f;->e:Ljf/a;

    const-string v1, "aws.userAgentAppId"

    const-string v2, "AWS_SDK_UA_APP_ID"

    invoke-virtual {v0, v1, v2}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljf/a;

    const-string v2, "sdk.ua.appId"

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v1, v2}, Ljf/e;->e(Ljf/a;Ljava/util/List;)Ljf/f;

    move-result-object v1

    sput-object v1, Lyd/f;->f:Ljf/f;

    const-string v1, "aws.configFile"

    const-string v2, "AWS_CONFIG_FILE"

    invoke-virtual {v0, v1, v2}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljf/a;

    sput-object v1, Lyd/f;->g:Ljf/a;

    const-string v1, "aws.sharedCredentialsFile"

    const-string v2, "AWS_SHARED_CREDENTIALS_FILE"

    invoke-virtual {v0, v1, v2}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljf/a;

    sput-object v1, Lyd/f;->h:Ljf/a;

    const-string v1, "aws.executionEnvironment"

    const-string v2, "AWS_EXECUTION_ENV"

    invoke-virtual {v0, v1, v2}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "aws.profile"

    const-string v2, "AWS_PROFILE"

    invoke-virtual {v0, v1, v2}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljf/a;

    iget-object v2, v1, Ljf/a;->a:Lkotlin/jvm/functions/Function1;

    iget-object v3, v1, Ljf/a;->b:Ljava/lang/String;

    iget-object v1, v1, Ljf/a;->c:Ljava/lang/String;

    const-string v4, "parse"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "sysProp"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "envVar"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ljf/a;

    const-string v8, "default"

    invoke-direct {v7, v2, v3, v1, v8}, Ljf/a;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    sput-object v7, Lyd/f;->i:Ljf/a;

    sget-object v1, Ljf/e;->a:Lg1/a7;

    const-string v2, "aws.disableEc2Metadata"

    const-string v3, "AWS_EC2_METADATA_DISABLED"

    invoke-virtual {v1, v2, v3}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljf/a;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v7, v2, Ljf/a;->a:Lkotlin/jvm/functions/Function1;

    iget-object v8, v2, Ljf/a;->b:Ljava/lang/String;

    iget-object v2, v2, Ljf/a;->c:Ljava/lang/String;

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljf/a;

    invoke-direct {v4, v7, v8, v2, v3}, Ljf/a;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    sput-object v4, Lyd/f;->j:Ljf/a;

    const-string v2, "aws.ec2MetadataServiceEndpoint"

    const-string v3, "AWS_EC2_METADATA_SERVICE_ENDPOINT"

    invoke-virtual {v0, v2, v3}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljf/a;

    sput-object v2, Lyd/f;->k:Ljf/a;

    const-string v2, "aws.ec2MetadataServiceEndpointMode"

    const-string v3, "AWS_EC2_METADATA_SERVICE_ENDPOINT_MODE"

    invoke-virtual {v0, v2, v3}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljf/a;

    sput-object v2, Lyd/f;->l:Ljf/a;

    const-string v2, "aws.roleArn"

    const-string v3, "AWS_ROLE_ARN"

    invoke-virtual {v0, v2, v3}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljf/a;

    sput-object v2, Lyd/f;->m:Ljf/a;

    const-string v2, "aws.roleSessionName"

    const-string v3, "AWS_ROLE_SESSION_NAME"

    invoke-virtual {v0, v2, v3}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljf/a;

    sput-object v2, Lyd/f;->n:Ljf/a;

    const-string v2, "aws.webIdentityTokenFile"

    const-string v3, "AWS_WEB_IDENTITY_TOKEN_FILE"

    invoke-virtual {v0, v2, v3}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljf/a;

    sput-object v2, Lyd/f;->o:Ljf/a;

    const-string v2, "aws.containerCredentialsPath"

    const-string v3, "AWS_CONTAINER_CREDENTIALS_RELATIVE_URI"

    invoke-virtual {v0, v2, v3}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljf/a;

    sput-object v2, Lyd/f;->p:Ljf/a;

    const-string v2, "aws.containerCredentialsFullUri"

    const-string v3, "AWS_CONTAINER_CREDENTIALS_FULL_URI"

    invoke-virtual {v0, v2, v3}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljf/a;

    sput-object v2, Lyd/f;->q:Ljf/a;

    const-string v2, "aws.containerAuthorizationToken"

    const-string v3, "AWS_CONTAINER_AUTHORIZATION_TOKEN"

    invoke-virtual {v0, v2, v3}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljf/a;

    sput-object v2, Lyd/f;->r:Ljf/a;

    const-string v2, "aws.containerAuthorizationTokenFile"

    const-string v3, "AWS_CONTAINER_AUTHORIZATION_TOKEN_FILE"

    invoke-virtual {v0, v2, v3}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljf/a;

    sput-object v2, Lyd/f;->s:Ljf/a;

    sget-object v2, Ljf/e;->b:Lg1/a7;

    const-string v3, "aws.maxAttempts"

    const-string v4, "AWS_MAX_ATTEMPTS"

    invoke-virtual {v2, v3, v4}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljf/a;

    sput-object v2, Lyd/f;->t:Ljf/a;

    sget-object v2, Lyd/e;->x:Lyd/e;

    new-instance v3, Ljf/a;

    const-string v4, "aws.retryMode"

    const-string v5, "AWS_RETRY_MODE"

    const/4 v6, 0x0

    invoke-direct {v3, v2, v4, v5, v6}, Ljf/a;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    sput-object v3, Lyd/f;->u:Ljf/a;

    const-string v2, "aws.useFipsEndpoint"

    const-string v3, "AWS_USE_FIPS_ENDPOINT"

    invoke-virtual {v1, v2, v3}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljf/a;

    sput-object v2, Lyd/f;->v:Ljf/a;

    const-string v2, "aws.useDualstackEndpoint"

    const-string v3, "AWS_USE_DUALSTACK_ENDPOINT"

    invoke-virtual {v1, v2, v3}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljf/a;

    sput-object v2, Lyd/f;->w:Ljf/a;

    new-instance v7, Lh3/i;

    const/4 v13, 0x0

    const/4 v14, 0x2

    const/4 v8, 0x1

    sget-object v9, Lcg/o;->i:Lcg/n;

    const-class v10, Lcg/n;

    const-string v11, "parse"

    const-string v12, "parse(Ljava/lang/String;Laws/smithy/kotlin/runtime/net/url/UrlEncoding;)Laws/smithy/kotlin/runtime/net/url/Url;"

    invoke-direct/range {v7 .. v14}, Lh3/i;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    new-instance v2, Ljf/a;

    const-string v3, "aws.endpointUrl"

    const-string v4, "AWS_ENDPOINT_URL"

    invoke-direct {v2, v7, v3, v4, v6}, Ljf/a;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    sput-object v2, Lyd/f;->x:Ljf/a;

    const-string v2, "aws.ignoreConfiguredEndpointUrls"

    const-string v3, "AWS_IGNORE_CONFIGURED_ENDPOINT_URLS"

    invoke-virtual {v1, v2, v3}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljf/a;

    sput-object v2, Lyd/f;->y:Ljf/a;

    const-string v2, "aws.disableRequestCompression"

    const-string v3, "AWS_DISABLE_REQUEST_COMPRESSION"

    invoke-virtual {v1, v2, v3}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Ljf/e;->c:Lg1/a7;

    const-string v3, "aws.requestMinCompressionSizeBytes"

    const-string v4, "AWS_REQUEST_MIN_COMPRESSION_SIZE_BYTES"

    invoke-virtual {v2, v3, v4}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "aws.sigV4aSigningRegionSet"

    const-string v3, "AWS_SIGV4A_SIGNING_REGION_SET"

    invoke-virtual {v0, v2, v3}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljf/a;

    const-string v3, "aws.sigv4a.signing.region.set"

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v3}, Ljf/e;->e(Ljf/a;Ljava/util/List;)Ljf/f;

    const-string v2, "aws.endpointDiscoveryEnabled"

    const-string v3, "AWS_ENABLE_ENDPOINT_DISCOVERY"

    invoke-virtual {v1, v2, v3}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lyd/e;->y:Lyd/e;

    new-instance v2, Ljf/a;

    const-string v3, "aws.requestChecksumCalculation"

    const-string v4, "AWS_REQUEST_CHECKSUM_CALCULATION"

    invoke-direct {v2, v1, v3, v4, v6}, Ljf/a;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v1, Lyd/e;->z:Lyd/e;

    new-instance v2, Ljf/a;

    const-string v3, "aws.responseChecksumValidation"

    const-string v4, "AWS_RESPONSE_CHECKSUM_VALIDATION"

    invoke-direct {v2, v1, v3, v4, v6}, Ljf/a;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "aws.authSchemePreference"

    const-string v2, "AWS_AUTH_SCHEME_PREFERENCE"

    invoke-virtual {v0, v1, v2}, Lg1/a7;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljf/a;

    sput-object v0, Lyd/f;->z:Ljf/a;

    return-void
.end method

.method public static a()Ljf/a;
    .locals 1

    sget-object v0, Lyd/f;->r:Ljf/a;

    return-object v0
.end method

.method public static b()Ljf/a;
    .locals 1

    sget-object v0, Lyd/f;->s:Ljf/a;

    return-object v0
.end method

.method public static c()Ljf/a;
    .locals 1

    sget-object v0, Lyd/f;->q:Ljf/a;

    return-object v0
.end method

.method public static d()Ljf/a;
    .locals 1

    sget-object v0, Lyd/f;->p:Ljf/a;

    return-object v0
.end method

.method public static e()Ljf/a;
    .locals 1

    sget-object v0, Lyd/f;->j:Ljf/a;

    return-object v0
.end method

.method public static f()Ljf/a;
    .locals 1

    sget-object v0, Lyd/f;->d:Ljf/a;

    return-object v0
.end method
