.class public abstract Lls/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lls/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    :try_start_0
    invoke-static {}, Lls/d;->b()Lcom/google/crypto/tink/internal/l0;

    move-result-object v0

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/l0;->h0(I)V

    sget-object v1, Lls/c;->b:Lls/c;

    iput-object v1, v0, Lcom/google/crypto/tink/internal/l0;->y:Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/l0;->D()Lls/d;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sput-object v0, Lls/h;->a:Lls/d;

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/crypto/tink/internal/TinkBugException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
