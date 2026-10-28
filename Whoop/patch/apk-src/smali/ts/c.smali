.class public abstract Lts/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/crypto/tink/internal/f0;

.field public static final b:Lcom/google/crypto/tink/internal/p;

.field public static final c:Lcom/google/crypto/tink/internal/s;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lts/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lts/b;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lts/a;

    const-class v3, Lts/m;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lts/c;->a:Lcom/google/crypto/tink/internal/f0;

    invoke-static {}, Lvs/h;->F()Lcom/google/crypto/tink/shaded/protobuf/v0;

    new-instance v0, Lcom/google/crypto/tink/internal/p;

    const-string v1, "type.googleapis.com/google.crypto.tink.AesCmacPrfKey"

    sget-object v2, Lvs/l3;->y:Lvs/l3;

    invoke-direct {v0, v1, v3, v2}, Lcom/google/crypto/tink/internal/p;-><init>(Ljava/lang/String;Ljava/lang/Class;Lvs/l3;)V

    sput-object v0, Lts/c;->b:Lcom/google/crypto/tink/internal/p;

    new-instance v0, Lcom/google/crypto/tink/internal/s;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/internal/s;-><init>(I)V

    sput-object v0, Lts/c;->c:Lcom/google/crypto/tink/internal/s;

    return-void
.end method
