.class public abstract Luf/i;
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


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#AttemptDuration"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Luf/i;->a:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#CallDuration"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Luf/i;->b:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#HostPrefix"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Luf/i;->c:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#HttpCallList"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Luf/i;->d:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#SdkInvocationId"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Luf/i;->e:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#OperationInput"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Luf/i;->f:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#OperationMetrics"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Luf/i;->g:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#OperationAttributes"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Luf/i;->h:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#ClockSkew"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Luf/i;->i:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#ClockSkewApproximateSigningTime"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Luf/i;->j:Lgf/a;

    const-string v0, "aws.smithy.kotlin#DefaultChecksumAlgorithm"

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "AttributeKey name must not be blank"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a()Lgf/a;
    .locals 1

    sget-object v0, Luf/i;->a:Lgf/a;

    return-object v0
.end method

.method public static b()Lgf/a;
    .locals 1

    sget-object v0, Luf/i;->b:Lgf/a;

    return-object v0
.end method

.method public static c()Lgf/a;
    .locals 1

    sget-object v0, Luf/i;->i:Lgf/a;

    return-object v0
.end method

.method public static d()Lgf/a;
    .locals 1

    sget-object v0, Luf/i;->j:Lgf/a;

    return-object v0
.end method
