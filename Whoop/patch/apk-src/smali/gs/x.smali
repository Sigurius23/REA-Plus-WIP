.class public abstract Lgs/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/crypto/tink/internal/f0;

.field public static final b:Lcom/google/crypto/tink/internal/p;

.field public static final c:Lcom/google/crypto/tink/internal/s;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lb23/h;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lb23/h;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lgs/a0;

    const-class v3, Lfs/a;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lgs/x;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-static {}, Lvs/a4;->F()Lcom/google/crypto/tink/shaded/protobuf/v0;

    new-instance v0, Lcom/google/crypto/tink/internal/p;

    const-string v1, "type.googleapis.com/google.crypto.tink.KmsAeadKey"

    sget-object v2, Lvs/l3;->F:Lvs/l3;

    invoke-direct {v0, v1, v3, v2}, Lcom/google/crypto/tink/internal/p;-><init>(Ljava/lang/String;Ljava/lang/Class;Lvs/l3;)V

    sput-object v0, Lgs/x;->b:Lcom/google/crypto/tink/internal/p;

    new-instance v0, Lcom/google/crypto/tink/internal/s;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/internal/s;-><init>(I)V

    sput-object v0, Lgs/x;->c:Lcom/google/crypto/tink/internal/s;

    return-void
.end method
