.class public abstract Ljw/c;
.super Ljw/a;
.source "SourceFile"


# static fields
.field public static final f:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ljw/b;->a:Ljava/util/Set;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v1, Lgw/i;->K:Lgw/i;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ljw/c;->f:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljavax/crypto/SecretKey;)V
    .locals 2

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    array-length v0, v0

    mul-int/lit8 v0, v0, 0x8

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Lgw/e;->w:Lgw/e;

    goto :goto_1

    :cond_1
    sget-object v1, Ljw/b;->b:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    if-eqz v0, :cond_2

    :goto_1
    sget-object v1, Ljw/c;->f:Ljava/util/Set;

    invoke-direct {p0, v1, v0, p1}, Ljw/a;-><init>(Ljava/util/Set;Ljava/util/Set;Ljavax/crypto/SecretKey;)V

    return-void

    :cond_2
    new-instance p1, Lcom/nimbusds/jose/KeyLengthException;

    const-string v0, "The Content Encryption Key length must be 128 bits (16 bytes), 192 bits (24 bytes), 256 bits (32 bytes), 384 bits (48 bytes) or 512 bites (64 bytes)"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method
