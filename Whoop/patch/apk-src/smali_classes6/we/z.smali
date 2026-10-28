.class public final Lwe/z;
.super Lwe/x;
.source "SourceFile"


# static fields
.field public static final b:Lwe/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwe/z;

    const-string v1, "STREAMING-AWS4-HMAC-SHA256-PAYLOAD-TRAILER"

    invoke-direct {v0, v1}, Lwe/x;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/z;->b:Lwe/z;

    return-void
.end method
