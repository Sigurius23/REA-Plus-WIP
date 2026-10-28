.class public final Lxw/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljavax/crypto/SecretKey;


# instance fields
.field public final synthetic w:Ljavax/crypto/SecretKey;


# direct methods
.method public constructor <init>(Ljavax/crypto/SecretKey;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxw/e;->w:Ljavax/crypto/SecretKey;

    return-void
.end method


# virtual methods
.method public final getAlgorithm()Ljava/lang/String;
    .locals 1

    const-string v0, "AES"

    return-object v0
.end method

.method public final getEncoded()[B
    .locals 1

    iget-object v0, p0, Lxw/e;->w:Ljavax/crypto/SecretKey;

    invoke-interface {v0}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    return-object v0
.end method

.method public final getFormat()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxw/e;->w:Ljavax/crypto/SecretKey;

    invoke-interface {v0}, Ljava/security/Key;->getFormat()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
