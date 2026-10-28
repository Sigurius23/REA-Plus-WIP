.class public abstract Lws/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/crypto/tink/internal/f0;

.field public static final b:Lcom/google/crypto/tink/internal/f0;

.field public static final c:Lcom/google/crypto/tink/internal/o;

.field public static final d:Lcom/google/crypto/tink/internal/p;

.field public static final e:Lcom/google/crypto/tink/internal/s;

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lts/b;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lts/b;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lws/r;

    const-class v3, Lfs/m;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lws/t;->a:Lcom/google/crypto/tink/internal/f0;

    new-instance v0, Lts/b;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lts/b;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lws/s;

    const-class v4, Lfs/n;

    invoke-direct {v1, v2, v4, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lws/t;->b:Lcom/google/crypto/tink/internal/f0;

    invoke-static {}, Lvs/o4;->S()Lcom/google/crypto/tink/shaded/protobuf/v0;

    const-string v0, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey"

    invoke-static {v3, v0}, Lcom/google/crypto/tink/internal/p;->a(Ljava/lang/Class;Ljava/lang/String;)Lcom/google/crypto/tink/internal/o;

    move-result-object v0

    sput-object v0, Lws/t;->c:Lcom/google/crypto/tink/internal/o;

    invoke-static {}, Lvs/q4;->K()Lcom/google/crypto/tink/shaded/protobuf/v0;

    new-instance v0, Lcom/google/crypto/tink/internal/p;

    const-string v1, "type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey"

    sget-object v2, Lvs/l3;->E:Lvs/l3;

    invoke-direct {v0, v1, v4, v2}, Lcom/google/crypto/tink/internal/p;-><init>(Ljava/lang/String;Ljava/lang/Class;Lvs/l3;)V

    sput-object v0, Lws/t;->d:Lcom/google/crypto/tink/internal/p;

    new-instance v0, Lcom/google/crypto/tink/internal/s;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/internal/s;-><init>(I)V

    sput-object v0, Lws/t;->e:Lcom/google/crypto/tink/internal/s;

    const/4 v0, 0x2

    sput v0, Lws/t;->f:I

    return-void
.end method
