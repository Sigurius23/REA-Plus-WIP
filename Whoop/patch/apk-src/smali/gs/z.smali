.class public abstract Lgs/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/crypto/tink/internal/p;

.field public static final b:Lcom/google/crypto/tink/internal/s;

.field public static final c:Lcom/google/crypto/tink/internal/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Lvs/e4;->F()Lcom/google/crypto/tink/shaded/protobuf/v0;

    new-instance v0, Lcom/google/crypto/tink/internal/p;

    const-string v1, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"

    const-class v2, Lfs/a;

    sget-object v3, Lvs/l3;->y:Lvs/l3;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/crypto/tink/internal/p;-><init>(Ljava/lang/String;Ljava/lang/Class;Lvs/l3;)V

    sput-object v0, Lgs/z;->a:Lcom/google/crypto/tink/internal/p;

    new-instance v0, Lcom/google/crypto/tink/internal/s;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/internal/s;-><init>(I)V

    sput-object v0, Lgs/z;->b:Lcom/google/crypto/tink/internal/s;

    new-instance v0, Lb23/h;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lb23/h;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v3, Lgs/e0;

    invoke-direct {v1, v3, v2, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lgs/z;->c:Lcom/google/crypto/tink/internal/f0;

    return-void
.end method
