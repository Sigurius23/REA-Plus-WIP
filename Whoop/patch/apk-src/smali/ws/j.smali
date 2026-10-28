.class public abstract Lws/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/crypto/tink/internal/f0;

.field public static final b:Lcom/google/crypto/tink/internal/f0;

.field public static final c:Lcom/google/crypto/tink/internal/o;

.field public static final d:Lcom/google/crypto/tink/internal/p;

.field public static final e:Lgs/h;

.field public static final f:Lcom/google/crypto/tink/internal/s;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lts/b;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lts/b;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lws/i;

    const-class v3, Lfs/m;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lws/j;->a:Lcom/google/crypto/tink/internal/f0;

    new-instance v0, Lts/b;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lts/b;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lws/k;

    const-class v4, Lfs/n;

    invoke-direct {v1, v2, v4, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lws/j;->b:Lcom/google/crypto/tink/internal/f0;

    invoke-static {}, Lvs/a2;->H()Lcom/google/crypto/tink/shaded/protobuf/v0;

    const-string v0, "type.googleapis.com/google.crypto.tink.Ed25519PrivateKey"

    invoke-static {v3, v0}, Lcom/google/crypto/tink/internal/p;->a(Ljava/lang/Class;Ljava/lang/String;)Lcom/google/crypto/tink/internal/o;

    move-result-object v0

    sput-object v0, Lws/j;->c:Lcom/google/crypto/tink/internal/o;

    invoke-static {}, Lvs/c2;->G()Lcom/google/crypto/tink/shaded/protobuf/v0;

    new-instance v0, Lcom/google/crypto/tink/internal/p;

    const-string v1, "type.googleapis.com/google.crypto.tink.Ed25519PublicKey"

    sget-object v2, Lvs/l3;->E:Lvs/l3;

    invoke-direct {v0, v1, v4, v2}, Lcom/google/crypto/tink/internal/p;-><init>(Ljava/lang/String;Ljava/lang/Class;Lvs/l3;)V

    sput-object v0, Lws/j;->d:Lcom/google/crypto/tink/internal/p;

    new-instance v0, Lgs/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lws/j;->e:Lgs/h;

    new-instance v0, Lcom/google/crypto/tink/internal/s;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/internal/s;-><init>(I)V

    sput-object v0, Lws/j;->f:Lcom/google/crypto/tink/internal/s;

    return-void
.end method
