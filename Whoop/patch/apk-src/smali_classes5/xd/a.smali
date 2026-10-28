.class public abstract Lxd/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/a;

.field public static final b:Lgf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#AwsRegion"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lxd/a;->a:Lgf/a;

    new-instance v0, Lgf/a;

    const-string v1, "aws.sdk.kotlin#AccountId"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lxd/a;->b:Lgf/a;

    return-void
.end method
