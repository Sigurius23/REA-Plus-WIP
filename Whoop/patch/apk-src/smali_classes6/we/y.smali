.class public final Lwe/y;
.super Lwe/x;
.source "SourceFile"


# static fields
.field public static final b:Lwe/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwe/y;

    const-string v1, "STREAMING-AWS4-HMAC-SHA256-PAYLOAD"

    invoke-direct {v0, v1}, Lwe/x;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/y;->b:Lwe/y;

    return-void
.end method
