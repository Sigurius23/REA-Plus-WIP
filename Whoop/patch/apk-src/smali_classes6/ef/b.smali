.class public abstract Lef/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lgf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgf/a;

    const-string v1, "aws.smithy.kotlin#endpointAuthSchemes"

    invoke-direct {v0, v1}, Lgf/a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lef/b;->a:Lgf/a;

    return-void
.end method
