.class public abstract Lwe/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/a;

.field public static final b:Lgf/a;

.field public static final c:Lgf/a;

.field public static final d:Lgf/a;

.field public static final e:Lgf/a;

.field public static final f:Lgf/a;

.field public static final g:Lgf/a;

.field public static final h:Lgf/a;

.field public static final i:Lgf/a;

.field public static final j:Lgf/a;

.field public static final k:Lgf/a;

.field public static final l:Lgf/a;

.field public static final m:Lgf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "aws.smithy.kotlin.signing#Signer"

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin.signing#AwsSigningRegion"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/f;->a:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin.signing#AwsSigningRegionSet"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/f;->b:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin.signing#ConfigSigningRegionSet"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/f;->c:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin.signing#AwsSigningService"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/f;->d:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin.signing#SigningDate"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/f;->e:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin.signing#CredentialsProvider"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/f;->f:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin.signing#HashSpecification"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/f;->g:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin.signing#SignedBodyHeader"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/f;->h:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin.signing#RequestSignature"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/f;->i:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin.signing#UseDoubleUriEncode"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/f;->j:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin.signing#NormalizeUriPath"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/f;->k:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin.signing#EnableAwsChunked"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/f;->l:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin.signing#OmitSessionToken"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/f;->m:Lgf/a;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "AttributeKey name must not be blank"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a()Lgf/a;
    .locals 1

    sget-object v0, Lwe/f;->c:Lgf/a;

    return-object v0
.end method

.method public static b()Lgf/a;
    .locals 1

    sget-object v0, Lwe/f;->f:Lgf/a;

    return-object v0
.end method

.method public static c()Lgf/a;
    .locals 1

    sget-object v0, Lwe/f;->l:Lgf/a;

    return-object v0
.end method

.method public static d()Lgf/a;
    .locals 1

    sget-object v0, Lwe/f;->g:Lgf/a;

    return-object v0
.end method

.method public static e()Lgf/a;
    .locals 1

    sget-object v0, Lwe/f;->k:Lgf/a;

    return-object v0
.end method

.method public static f()Lgf/a;
    .locals 1

    sget-object v0, Lwe/f;->m:Lgf/a;

    return-object v0
.end method

.method public static g()Lgf/a;
    .locals 1

    sget-object v0, Lwe/f;->i:Lgf/a;

    return-object v0
.end method

.method public static h()Lgf/a;
    .locals 1

    sget-object v0, Lwe/f;->h:Lgf/a;

    return-object v0
.end method

.method public static i()Lgf/a;
    .locals 1

    sget-object v0, Lwe/f;->e:Lgf/a;

    return-object v0
.end method

.method public static j()Lgf/a;
    .locals 1

    sget-object v0, Lwe/f;->a:Lgf/a;

    return-object v0
.end method

.method public static k()Lgf/a;
    .locals 1

    sget-object v0, Lwe/f;->b:Lgf/a;

    return-object v0
.end method

.method public static l()Lgf/a;
    .locals 1

    sget-object v0, Lwe/f;->d:Lgf/a;

    return-object v0
.end method

.method public static m()Lgf/a;
    .locals 1

    sget-object v0, Lwe/f;->j:Lgf/a;

    return-object v0
.end method
