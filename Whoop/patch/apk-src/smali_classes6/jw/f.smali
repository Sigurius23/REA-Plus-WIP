.class public abstract Ljw/f;
.super Lb3/b;
.source "SourceFile"


# static fields
.field public static final e:Ljava/util/Set;


# instance fields
.field public final d:Ljavax/crypto/SecretKey;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v1, Lgw/m;->y:Lgw/m;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v1, Lgw/m;->z:Lgw/m;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v1, Lgw/m;->E:Lgw/m;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ljw/f;->e:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljavax/crypto/SecretKey;)V
    .locals 5

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x100

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    array-length v0, v0

    mul-int/lit8 v0, v0, 0x8

    :goto_0
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    if-lt v0, v2, :cond_1

    sget-object v4, Lgw/m;->y:Lgw/m;

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    const/16 v4, 0x180

    if-lt v0, v4, :cond_2

    sget-object v4, Lgw/m;->z:Lgw/m;

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    const/16 v4, 0x200

    if-lt v0, v4, :cond_3

    sget-object v0, Lgw/m;->E:Lgw/m;

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    goto :goto_1

    :cond_4
    sget-object v0, Ljw/f;->e:Ljava/util/Set;

    :goto_1
    invoke-direct {p0, v0}, Lb3/b;-><init>(Ljava/util/Set;)V

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    array-length v0, v0

    mul-int/lit8 v1, v0, 0x8

    :goto_2
    if-lt v1, v2, :cond_6

    goto :goto_3

    :cond_6
    new-instance p1, Lcom/nimbusds/jose/KeyLengthException;

    const-string v0, "The secret length must be at least 256 bits"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_3
    iput-object p1, p0, Ljw/f;->d:Ljavax/crypto/SecretKey;

    return-void
.end method
