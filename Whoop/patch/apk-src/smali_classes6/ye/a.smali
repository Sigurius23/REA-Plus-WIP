.class public abstract Lye/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#AwsRegion"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lye/a;->a:Lgf/a;

    return-void
.end method

.method public static a()Lgf/a;
    .locals 1

    sget-object v0, Lye/a;->a:Lgf/a;

    return-object v0
.end method
