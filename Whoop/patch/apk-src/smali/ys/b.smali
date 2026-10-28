.class public abstract Lys/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/crypto/tink/internal/f0;

.field public static final b:Lcom/google/crypto/tink/internal/s;

.field public static final c:Lcom/google/crypto/tink/internal/p;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lxs/a;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lxs/a;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lys/a;

    const-class v3, Lfs/q;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lys/b;->a:Lcom/google/crypto/tink/internal/f0;

    new-instance v0, Lcom/google/crypto/tink/internal/s;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/internal/s;-><init>(I)V

    sput-object v0, Lys/b;->b:Lcom/google/crypto/tink/internal/s;

    invoke-static {}, Lvs/p;->H()Lcom/google/crypto/tink/shaded/protobuf/v0;

    new-instance v0, Lcom/google/crypto/tink/internal/p;

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey"

    sget-object v2, Lvs/l3;->y:Lvs/l3;

    invoke-direct {v0, v1, v3, v2}, Lcom/google/crypto/tink/internal/p;-><init>(Ljava/lang/String;Ljava/lang/Class;Lvs/l3;)V

    sput-object v0, Lys/b;->c:Lcom/google/crypto/tink/internal/p;

    return-void
.end method
