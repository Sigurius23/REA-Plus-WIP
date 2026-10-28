.class public abstract Lls/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/crypto/tink/internal/f0;

.field public static final b:Lcom/google/crypto/tink/internal/p;

.field public static final c:Lgs/h;

.field public static final d:Lcom/google/crypto/tink/internal/s;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/sentry/okhttp/b;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lio/sentry/okhttp/b;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lls/a;

    const-class v3, Lfs/c;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lls/b;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-static {}, Lvs/v0;->F()Lcom/google/crypto/tink/shaded/protobuf/v0;

    new-instance v0, Lcom/google/crypto/tink/internal/p;

    const-string v1, "type.googleapis.com/google.crypto.tink.AesSivKey"

    sget-object v2, Lvs/l3;->y:Lvs/l3;

    invoke-direct {v0, v1, v3, v2}, Lcom/google/crypto/tink/internal/p;-><init>(Ljava/lang/String;Ljava/lang/Class;Lvs/l3;)V

    sput-object v0, Lls/b;->b:Lcom/google/crypto/tink/internal/p;

    new-instance v0, Lgs/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lls/b;->c:Lgs/h;

    new-instance v0, Lcom/google/crypto/tink/internal/s;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/internal/s;-><init>(I)V

    sput-object v0, Lls/b;->d:Lcom/google/crypto/tink/internal/s;

    return-void
.end method

.method public static a(Lls/d;)V
    .locals 3

    iget v0, p0, Lls/d;->a:I

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid key size: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p0, p0, Lls/d;->a:I

    const-string v2, ". Valid keys must have 64 bytes."

    invoke-static {v1, p0, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
