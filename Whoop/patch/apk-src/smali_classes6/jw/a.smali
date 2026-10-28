.class public abstract Ljw/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/util/Set;


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:Ljava/util/Set;

.field public final c:Lmw/a;

.field public final d:Ljavax/crypto/SecretKey;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/HashSet;

    const-string v1, "AES"

    const-string v2, "ChaCha20"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ljw/a;->e:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;Ljava/util/Set;Ljavax/crypto/SecretKey;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lmw/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lla/b;-><init>(I)V

    iput-object v0, p0, Ljw/a;->c:Lmw/a;

    if-eqz p1, :cond_3

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ljw/a;->a:Ljava/util/Set;

    if-eqz p2, :cond_2

    iput-object p2, p0, Ljw/a;->b:Ljava/util/Set;

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    const/4 p2, 0x1

    if-le p1, p2, :cond_1

    invoke-interface {p3}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object p1, Ljw/a;->e:Ljava/util/Set;

    invoke-interface {p3}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The algorithm of the content encryption key (CEK) must be AES or ChaCha20"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p3, p0, Ljw/a;->d:Ljavax/crypto/SecretKey;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The supported encryption methods must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The supported JWE algorithm set must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final b(Lgw/f;)Ljavax/crypto/SecretKey;
    .locals 3

    iget-object v0, p0, Ljw/a;->d:Ljavax/crypto/SecretKey;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    if-nez p1, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    sget-object v1, Ljw/b;->a:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget p1, p1, Lgw/f;->y:I

    div-int/lit8 p1, p1, 0x8

    new-array p1, p1, [B

    invoke-virtual {v0, p1}, Ljava/security/SecureRandom;->nextBytes([B)V

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object v0

    :cond_2
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    invoke-static {p1, v1}, Ljw/e;->k(Lgw/f;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0
.end method
