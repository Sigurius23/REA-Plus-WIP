.class public final Lq30/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Ljava/util/ArrayList;

.field public final c:Ln30/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZLjava/util/ArrayList;Ln30/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lq30/e0;->a:Z

    iput-object p2, p0, Lq30/e0;->b:Ljava/util/ArrayList;

    iput-object p3, p0, Lq30/e0;->c:Ln30/c;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 7

    const-string v0, "jws"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lgw/g;->a(Ljava/lang/String;)[Lxw/b;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-ne v0, v1, :cond_8

    new-instance v0, Lgw/p;

    aget-object v1, p1, v2

    const/4 v3, 0x1

    aget-object v3, p1, v3

    const/4 v4, 0x2

    aget-object p1, p1, v4

    invoke-direct {v0, v1, v3, p1}, Lgw/p;-><init>(Lxw/b;Lxw/b;Lxw/b;)V

    iget-boolean p1, p0, Lq30/e0;->a:Z

    const-string v1, "Could not validate JWS"

    if-nez p1, :cond_6

    iget-object p1, v0, Lgw/p;->x:Lgw/n;

    iget-object v3, p1, Lgw/c;->L:Ljava/util/List;

    check-cast v3, Ljava/util/Collection;

    if-eqz v3, :cond_5

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_2

    :cond_0
    iget-object p1, p1, Lgw/c;->L:Ljava/util/List;

    const-string v3, "getX509CertChain(...)"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lxw/a;

    iget-object v4, v4, Lxw/a;->w:Ljava/lang/String;

    const-string v5, "toString(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Ly83/c;->f:Ly83/a;

    const/4 v6, 0x6

    invoke-static {v5, v4, v2, v6}, Ly83/c;->a(Ly83/c;Ljava/lang/CharSequence;II)[B

    move-result-object v4

    new-instance v5, Ljava/io/ByteArrayInputStream;

    invoke-direct {v5, v4}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    const-string v4, "X.509"

    invoke-static {v4}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v4

    instance-of v5, v4, Ljava/security/cert/X509Certificate;

    if-eqz v5, :cond_2

    check-cast v4, Ljava/security/cert/X509Certificate;

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_1

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p0, v0, v3}, Lq30/e0;->b(Lgw/p;Ljava/util/ArrayList;)Z

    move-result p1

    if-eqz p1, :cond_4

    new-instance p1, Lorg/json/JSONObject;

    iget-object v0, v0, Lgw/g;->w:Lgw/r;

    invoke-virtual {v0}, Lgw/r;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    new-instance p1, Lorg/json/JSONObject;

    iget-object v0, v0, Lgw/g;->w:Lgw/r;

    invoke-virtual {v0}, Lgw/r;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_6
    iget-object p1, p0, Lq30/e0;->b:Ljava/util/ArrayList;

    invoke-virtual {p0, v0, p1}, Lq30/e0;->b(Lgw/p;Ljava/util/ArrayList;)Z

    move-result p1

    if-eqz p1, :cond_7

    new-instance p1, Lorg/json/JSONObject;

    iget-object v0, v0, Lgw/g;->w:Lgw/r;

    invoke-virtual {v0}, Lgw/r;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/text/ParseException;

    const-string v0, "Unexpected number of Base64URL parts, must be three"

    invoke-direct {p1, v0, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p1
.end method

.method public final b(Lgw/p;Ljava/util/ArrayList;)Z
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    iget-object v0, v2, Lgw/p;->x:Lgw/n;

    iget-object v0, v0, Lgw/c;->H:Lnw/d;

    if-eqz v0, :cond_0

    iget-object v0, v1, Lq30/e0;->c:Ln30/c;

    new-instance v3, Ljava/lang/IllegalArgumentException;

    iget-object v4, v2, Lgw/p;->x:Lgw/n;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Encountered a JWK in "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ln30/c;->c(Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, v2, Lgw/p;->x:Lgw/n;

    const-string v3, "getHeader(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v0, Lgw/c;->w:Lgw/a;

    move-object v5, v3

    check-cast v5, Lgw/m;

    iget-object v3, v5, Lgw/a;->w:Ljava/lang/String;

    sget-object v4, Lgw/a;->x:Lgw/a;

    iget-object v4, v4, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    iget-object v6, v0, Lgw/c;->x:Lgw/h;

    iget-object v7, v0, Lgw/c;->y:Ljava/lang/String;

    iget-object v8, v0, Lgw/c;->z:Ljava/util/Set;

    iget-object v9, v0, Lgw/c;->G:Ljava/net/URI;

    iget-object v11, v0, Lgw/c;->I:Ljava/net/URI;

    iget-object v12, v0, Lgw/c;->J:Lxw/b;

    iget-object v13, v0, Lgw/c;->K:Lxw/b;

    iget-object v14, v0, Lgw/c;->L:Ljava/util/List;

    iget-object v15, v0, Lgw/c;->M:Ljava/lang/String;

    iget-boolean v3, v0, Lgw/n;->O:Z

    iget-object v0, v0, Lgw/c;->E:Ljava/util/Map;

    new-instance v4, Lgw/n;

    const/4 v10, 0x0

    const/16 v18, 0x0

    move-object/from16 v17, v0

    move/from16 v16, v3

    invoke-direct/range {v4 .. v18}, Lgw/n;-><init>(Lgw/m;Lgw/h;Ljava/lang/String;Ljava/util/Set;Ljava/net/URI;Lnw/d;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/List;Ljava/lang/String;ZLjava/util/Map;Lxw/b;)V

    iget-object v0, v4, Lgw/c;->L:Ljava/util/List;

    :try_start_0
    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    if-eqz v3, :cond_2

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    move-object/from16 v3, p2

    invoke-static {v0, v3}, Lng3/o;->f(Ljava/util/List;Ljava/util/ArrayList;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_1
    const-string v0, "Root certificates are empty"

    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_2
    const-string v0, "JWSHeader\'s X.509 certificate chain is null or empty"

    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-object v5, v1, Lq30/e0;->c:Ln30/c;

    invoke-virtual {v5, v3}, Ln30/c;->c(Ljava/lang/Throwable;)V

    :cond_3
    instance-of v0, v0, Ll83/m;

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    return v0

    :cond_4
    new-instance v0, Liw/a;

    invoke-direct {v0}, Liw/a;-><init>()V

    iget-object v0, v0, Liw/a;->a:Lla/b;

    iget-object v3, v4, Lgw/c;->w:Lgw/a;

    check-cast v3, Lgw/m;

    sget-object v5, Lgw/m;->I:Lgw/m;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v3, "SHA256withECDSA"

    goto :goto_2

    :cond_5
    const-string v3, "SHA256withRSA"

    :goto_2
    invoke-static {v3}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v3

    invoke-virtual {v3}, Ljava/security/Signature;->getProvider()Ljava/security/Provider;

    move-result-object v3

    iput-object v3, v0, Lla/b;->x:Ljava/lang/Object;

    iget-object v3, v4, Lgw/c;->L:Ljava/util/List;

    const-string v5, "getX509CertChain(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxw/a;

    invoke-virtual {v3}, Lxw/a;->a()[B

    move-result-object v3

    invoke-static {v3}, Ls2/h;->k([B)Ljava/security/cert/X509Certificate;

    move-result-object v3

    invoke-virtual {v3}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v3

    const-string v5, "getPublicKey(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Ljw/f;->e:Ljava/util/Set;

    iget-object v4, v4, Lgw/c;->w:Lgw/a;

    check-cast v4, Lgw/m;

    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    instance-of v4, v3, Ljavax/crypto/SecretKey;

    if-eqz v4, :cond_6

    check-cast v3, Ljavax/crypto/SecretKey;

    new-instance v4, Lhw/d;

    invoke-direct {v4, v3}, Lhw/d;-><init>(Ljavax/crypto/SecretKey;)V

    goto :goto_3

    :cond_6
    new-instance v0, Lcom/nimbusds/jose/KeyTypeException;

    const-class v2, Ljavax/crypto/SecretKey;

    invoke-direct {v0, v2}, Lcom/nimbusds/jose/KeyTypeException;-><init>(Ljava/lang/Class;)V

    throw v0

    :cond_7
    sget-object v5, Ljw/h;->d:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    instance-of v4, v3, Ljava/security/interfaces/RSAPublicKey;

    if-eqz v4, :cond_8

    check-cast v3, Ljava/security/interfaces/RSAPublicKey;

    new-instance v4, Lhw/f;

    invoke-direct {v4, v3}, Lhw/f;-><init>(Ljava/security/interfaces/RSAPublicKey;)V

    goto :goto_3

    :cond_8
    new-instance v0, Lcom/nimbusds/jose/KeyTypeException;

    const-class v2, Ljava/security/interfaces/RSAPublicKey;

    invoke-direct {v0, v2}, Lcom/nimbusds/jose/KeyTypeException;-><init>(Ljava/lang/Class;)V

    throw v0

    :cond_9
    sget-object v5, Ljw/d;->d:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    instance-of v4, v3, Ljava/security/interfaces/ECPublicKey;

    if-eqz v4, :cond_d

    check-cast v3, Ljava/security/interfaces/ECPublicKey;

    new-instance v4, Lhw/c;

    invoke-direct {v4, v3}, Lhw/c;-><init>(Ljava/security/interfaces/ECPublicKey;)V

    :goto_3
    iget-object v3, v4, Lb3/b;->c:Ljava/lang/Object;

    check-cast v3, Lla/b;

    iget-object v0, v0, Lla/b;->x:Ljava/lang/Object;

    check-cast v0, Ljava/security/Provider;

    iput-object v0, v3, Lla/b;->x:Ljava/lang/Object;

    monitor-enter p1

    :try_start_1
    iget-object v0, v2, Lgw/p;->E:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lgw/o;->w:Lgw/o;

    if-eq v3, v5, :cond_b

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Lgw/o;->x:Lgw/o;

    if-ne v0, v3, :cond_a

    goto :goto_4

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "The JWS object must be in a signed or verified state"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_b
    :goto_4
    :try_start_2
    iget-object v0, v2, Lgw/p;->x:Lgw/n;

    iget-object v3, v2, Lgw/p;->y:Ljava/lang/String;

    sget-object v5, Lxw/f;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    iget-object v5, v2, Lgw/p;->z:Lxw/b;

    invoke-interface {v4, v0, v3, v5}, Lgw/q;->e(Lgw/n;[BLxw/b;)Z

    move-result v0
    :try_end_2
    .catch Lcom/nimbusds/jose/JOSEException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v0, :cond_c

    :try_start_3
    iget-object v3, v2, Lgw/p;->E:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v4, Lgw/o;->x:Lgw/o;

    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_8

    :cond_c
    :goto_5
    monitor-exit p1

    return v0

    :catch_0
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v0

    goto :goto_7

    :goto_6
    :try_start_4
    new-instance v3, Lcom/nimbusds/jose/JOSEException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :goto_7
    throw v0

    :goto_8
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0

    :cond_d
    new-instance v0, Lcom/nimbusds/jose/KeyTypeException;

    const-class v2, Ljava/security/interfaces/ECPublicKey;

    invoke-direct {v0, v2}, Lcom/nimbusds/jose/KeyTypeException;-><init>(Ljava/lang/Class;)V

    throw v0

    :cond_e
    new-instance v0, Lcom/nimbusds/jose/JOSEException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unsupported JWS algorithm: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "The JWS algorithm \"alg\" cannot be \"none\""

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
