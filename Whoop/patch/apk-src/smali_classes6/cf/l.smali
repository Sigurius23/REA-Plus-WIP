.class public abstract Lcf/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/a;

.field public static final b:Lgf/a;

.field public static final c:Lgf/a;

.field public static final d:Lgf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#OperationName"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcf/l;->a:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#ServiceName"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcf/l;->b:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#ClientName"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcf/l;->c:Lgf/a;

    const-string v0, "aws.smithy.kotlin#IdempotencyTokenProvider"

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "AttributeKey name must not be blank"

    if-nez v0, :cond_1

    new-instance v0, Lgf/a;

    const-string v2, "aws.smithy.kotlin#LogMode"

    invoke-direct {v0, v2}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcf/l;->d:Lgf/a;

    const-string v0, "aws.smithy.kotlin#EndpointDiscoveryEnabled"

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a()Lgf/a;
    .locals 1

    sget-object v0, Lcf/l;->c:Lgf/a;

    return-object v0
.end method

.method public static b()Lgf/a;
    .locals 1

    sget-object v0, Lcf/l;->d:Lgf/a;

    return-object v0
.end method

.method public static c()Lgf/a;
    .locals 1

    sget-object v0, Lcf/l;->a:Lgf/a;

    return-object v0
.end method
