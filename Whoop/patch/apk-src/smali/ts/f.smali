.class public abstract Lts/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/crypto/tink/internal/f0;

.field public static final b:Lcom/google/crypto/tink/internal/f0;

.field public static final c:Lcom/google/crypto/tink/internal/p;

.field public static final d:Lcom/google/crypto/tink/internal/s;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lts/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lts/b;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v2, Lts/e;

    const-class v3, Lbt/c;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lts/f;->a:Lcom/google/crypto/tink/internal/f0;

    new-instance v0, Lts/b;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lts/b;-><init>(I)V

    new-instance v1, Lcom/google/crypto/tink/internal/f0;

    const-class v3, Lts/m;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/crypto/tink/internal/f0;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/crypto/tink/internal/g0;)V

    sput-object v1, Lts/f;->b:Lcom/google/crypto/tink/internal/f0;

    invoke-static {}, Lvs/i2;->H()Lcom/google/crypto/tink/shaded/protobuf/v0;

    new-instance v0, Lcom/google/crypto/tink/internal/p;

    const-string v1, "type.googleapis.com/google.crypto.tink.HkdfPrfKey"

    sget-object v2, Lvs/l3;->y:Lvs/l3;

    invoke-direct {v0, v1, v3, v2}, Lcom/google/crypto/tink/internal/p;-><init>(Ljava/lang/String;Ljava/lang/Class;Lvs/l3;)V

    sput-object v0, Lts/f;->c:Lcom/google/crypto/tink/internal/p;

    new-instance v0, Lcom/google/crypto/tink/internal/s;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/internal/s;-><init>(I)V

    sput-object v0, Lts/f;->d:Lcom/google/crypto/tink/internal/s;

    return-void
.end method

.method public static a(Lts/h;)V
    .locals 2

    iget v0, p0, Lts/h;->a:I

    const/16 v1, 0x20

    if-lt v0, v1, :cond_2

    iget-object p0, p0, Lts/h;->b:Lts/g;

    sget-object v0, Lts/g;->e:Lts/g;

    if-eq p0, v0, :cond_1

    sget-object v0, Lts/g;->g:Lts/g;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Hash type must be SHA256 or SHA512"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "Key size must be at least 32"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
