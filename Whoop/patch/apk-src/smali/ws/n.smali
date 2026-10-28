.class public final Lws/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ljava/math/BigInteger;

.field public static final f:Ljava/math/BigInteger;


# instance fields
.field public a:Ljava/lang/Integer;

.field public b:Ljava/math/BigInteger;

.field public c:Lws/o;

.field public d:Lws/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0x2

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lws/n;->e:Ljava/math/BigInteger;

    const/16 v1, 0x100

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->pow(I)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lws/n;->f:Ljava/math/BigInteger;

    return-void
.end method


# virtual methods
.method public final a()Lws/q;
    .locals 5

    iget-object v0, p0, Lws/n;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_8

    iget-object v1, p0, Lws/n;->b:Ljava/math/BigInteger;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lws/n;->c:Lws/o;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lws/n;->d:Lws/p;

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x800

    if-lt v0, v1, :cond_4

    iget-object v0, p0, Lws/n;->b:Ljava/math/BigInteger;

    sget-object v1, Lws/q;->e:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    if-ltz v1, :cond_3

    sget-object v1, Lws/n;->e:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    sget-object v2, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lws/n;->f:Ljava/math/BigInteger;

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v0

    if-gtz v0, :cond_1

    :goto_0
    new-instance v0, Lws/q;

    iget-object v1, p0, Lws/n;->a:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lws/n;->b:Ljava/math/BigInteger;

    iget-object v3, p0, Lws/n;->d:Lws/p;

    iget-object v4, p0, Lws/n;->c:Lws/o;

    invoke-direct {v0, v1, v2, v3, v4}, Lws/q;-><init>(ILjava/math/BigInteger;Lws/p;Lws/o;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "Public exponent cannot be larger than 2^256."

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "Invalid public exponent"

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    const-string v1, "Public exponent must be at least 65537."

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    iget-object v1, p0, Lws/n;->a:Ljava/lang/Integer;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Invalid key size in bytes %d; must be at least 2048 bits"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "variant is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "hash type is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "publicExponent is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "key size is not set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
