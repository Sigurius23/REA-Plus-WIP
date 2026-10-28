.class public final Lhw/a;
.super Ljw/c;
.source "SourceFile"


# instance fields
.field public final g:Lhm/d;


# direct methods
.method public constructor <init>([B)V
    .locals 2

    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-direct {p0, v0}, Ljw/c;-><init>(Ljavax/crypto/SecretKey;)V

    new-instance p1, Lhm/d;

    const/16 v0, 0x18

    invoke-direct {p1, v0}, Lhm/d;-><init>(I)V

    iput-object p1, p0, Lhw/a;->g:Lhm/d;

    return-void
.end method


# virtual methods
.method public final c(Lgw/k;Lxw/b;Lxw/b;Lxw/b;Lxw/b;[B)[B
    .locals 7

    iget-object v0, p1, Lgw/c;->w:Lgw/a;

    check-cast v0, Lgw/i;

    if-eqz v0, :cond_5

    sget-object v1, Lgw/i;->K:Lgw/i;

    invoke-virtual {v0, v1}, Lgw/a;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    if-nez p2, :cond_3

    if-eqz p3, :cond_2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lhw/a;->g:Lhm/d;

    invoke-virtual {p2, p1}, Lhm/d;->k(Lgw/c;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    :try_start_0
    invoke-virtual {p0, p2}, Ljw/a;->b(Lgw/f;)Ljavax/crypto/SecretKey;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-object v5, p2

    iget-object v6, p0, Ljw/a;->c:Lmw/a;

    move-object v0, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v1, p6

    invoke-static/range {v0 .. v6}, Ljw/b;->b(Lgw/k;[BLxw/b;Lxw/b;Lxw/b;Ljavax/crypto/SecretKey;Lmw/a;)[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    const-string p2, "Unsupported critical header parameter(s)"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    const-string p2, "Missing JWE authentication tag"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    const-string p2, "Unexpected present JWE initialization vector (IV)"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    const-string p2, "Unexpected present JWE encrypted key"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    sget-object p2, Ljw/c;->f:Ljava/util/Set;

    invoke-static {v0, p2}, Ljw/e;->l(Lgw/i;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Lcom/nimbusds/jose/JOSEException;

    const-string p2, "The algorithm \"alg\" header parameter must not be null"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method
