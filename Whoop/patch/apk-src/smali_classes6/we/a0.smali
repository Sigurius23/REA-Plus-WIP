.class public final Lwe/a0;
.super Lwe/x;
.source "SourceFile"


# static fields
.field public static final b:Lwe/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwe/a0;

    const-string v1, "STREAMING-UNSIGNED-PAYLOAD-TRAILER"

    invoke-direct {v0, v1}, Lwe/x;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwe/a0;->b:Lwe/a0;

    return-void
.end method
