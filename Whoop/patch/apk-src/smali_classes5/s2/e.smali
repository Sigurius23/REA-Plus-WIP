.class public abstract Ls2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static A(Lat/p;[B)Ljava/security/interfaces/ECPrivateKey;
    .locals 1

    invoke-static {p0}, Ls2/e;->z(Lat/p;)Ljava/security/spec/ECParameterSpec;

    move-result-object p0

    invoke-static {p1}, Lcom/google/crypto/tink/internal/a;->g([B)Ljava/math/BigInteger;

    move-result-object p1

    new-instance v0, Ljava/security/spec/ECPrivateKeySpec;

    invoke-direct {v0, p1, p0}, Ljava/security/spec/ECPrivateKeySpec;-><init>(Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)V

    sget-object p0, Lat/u;->g:Lat/u;

    const-string p1, "EC"

    iget-object p0, p0, Lat/u;->a:Lat/t;

    invoke-virtual {p0, p1}, Lat/t;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/security/KeyFactory;

    invoke-virtual {p0, v0}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object p0

    check-cast p0, Ljava/security/interfaces/ECPrivateKey;

    return-object p0
.end method

.method public static B(Lat/p;[B[B)Ljava/security/interfaces/ECPublicKey;
    .locals 2

    invoke-static {p0}, Ls2/e;->z(Lat/p;)Ljava/security/spec/ECParameterSpec;

    move-result-object p0

    new-instance v0, Ljava/math/BigInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance p1, Ljava/math/BigInteger;

    invoke-direct {p1, v1, p2}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance p2, Ljava/security/spec/ECPoint;

    invoke-direct {p2, v0, p1}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/google/crypto/tink/internal/e;->b(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    new-instance p1, Ljava/security/spec/ECPublicKeySpec;

    invoke-direct {p1, p2, p0}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    sget-object p0, Lat/u;->g:Lat/u;

    const-string p2, "EC"

    iget-object p0, p0, Lat/u;->a:Lat/t;

    invoke-virtual {p0, p2}, Lat/t;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/security/KeyFactory;

    invoke-virtual {p0, p1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p0

    check-cast p0, Ljava/security/interfaces/ECPublicKey;

    return-object p0
.end method

.method public static final D(Landroid/view/KeyEvent;)J
    .locals 2

    invoke-virtual {p0}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p0

    invoke-static {p0}, Ls2/h;->b(I)J

    move-result-wide v0

    return-wide v0
.end method

.method public static E()Ljava/security/spec/ECParameterSpec;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/internal/e;->a:Ljava/security/spec/ECParameterSpec;

    return-object v0
.end method

.method public static F()Ljava/security/spec/ECParameterSpec;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/internal/e;->b:Ljava/security/spec/ECParameterSpec;

    return-object v0
.end method

.method public static G()Ljava/security/spec/ECParameterSpec;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/internal/e;->c:Ljava/security/spec/ECParameterSpec;

    return-object v0
.end method

.method public static final synthetic H()Lr7/c0;
    .locals 3

    const/16 v0, 0x64

    int-to-double v0, v0

    new-instance v2, Lr7/c0;

    invoke-direct {v2, v0, v1}, Lr7/c0;-><init>(D)V

    return-object v2
.end method

.method public static final I(Lq20/y;)Ljava/lang/Boolean;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lq20/n;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p0, Lq20/n;

    iget-object p0, p0, Lq20/n;->F:Ly00/j5;

    instance-of v0, p0, Ly00/f5;

    if-eqz v0, :cond_0

    check-cast p0, Ly00/f5;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    iget-object p0, p0, Ly00/f5;->x:Ljava/lang/Boolean;

    return-object p0

    :cond_1
    return-object v1

    :cond_2
    instance-of v0, p0, Lq20/s;

    if-eqz v0, :cond_4

    check-cast p0, Lq20/s;

    iget-object p0, p0, Lq20/s;->J:Ly00/j5;

    instance-of v0, p0, Ly00/i5;

    if-eqz v0, :cond_3

    check-cast p0, Ly00/i5;

    goto :goto_1

    :cond_3
    move-object p0, v1

    :goto_1
    if-eqz p0, :cond_4

    iget-object p0, p0, Ly00/i5;->x:Ljava/lang/Boolean;

    return-object p0

    :cond_4
    return-object v1
.end method

.method public static final L(Landroid/view/KeyEvent;)I
    .locals 1

    invoke-virtual {p0}, Landroid/view/KeyEvent;->getAction()I

    move-result p0

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    return v0

    :cond_1
    const/4 p0, 0x2

    return p0
.end method

.method public static M(Lr93/c;)Z
    .locals 2

    const-string v0, "callableMemberDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lfa3/f;->d:Ljava/util/Set;

    invoke-interface {p0}, Lr93/k;->getName()Lva3/h;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lfa3/f;->c:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {p0}, Lcb3/e;->c(Lr93/l;)Lva3/e;

    move-result-object v1

    invoke-static {v0, v1}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lr93/b;->v()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lo93/h;->A(Lr93/k;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p0}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object p0

    const-string v0, "getOverriddenDescriptors(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/c;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Ls2/e;->M(Lr93/c;)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_5
    :goto_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final N(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/view/KeyEvent;->isCtrlPressed()Z

    move-result p0

    return p0
.end method

.method public static final O(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result p0

    return p0
.end method

.method public static P([B)Z
    .locals 11

    array-length v0, p0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    aget-byte v0, p0, v2

    const/16 v1, 0x30

    if-eq v0, v1, :cond_1

    return v2

    :cond_1
    const/4 v0, 0x1

    aget-byte v1, p0, v0

    and-int/lit16 v1, v1, 0xff

    const/16 v3, 0x81

    const/16 v4, 0x80

    const/4 v5, 0x2

    if-ne v1, v3, :cond_3

    aget-byte v1, p0, v5

    and-int/lit16 v1, v1, 0xff

    if-ge v1, v4, :cond_2

    return v2

    :cond_2
    move v3, v5

    goto :goto_0

    :cond_3
    if-eq v1, v4, :cond_10

    if-le v1, v3, :cond_4

    goto :goto_1

    :cond_4
    move v3, v0

    :goto_0
    array-length v6, p0

    sub-int/2addr v6, v0

    sub-int/2addr v6, v3

    if-eq v1, v6, :cond_5

    return v2

    :cond_5
    add-int/lit8 v1, v3, 0x1

    aget-byte v1, p0, v1

    if-eq v1, v5, :cond_6

    return v2

    :cond_6
    add-int/lit8 v1, v3, 0x2

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v6, v3, 0x3

    add-int/2addr v6, v1

    add-int/lit8 v7, v6, 0x1

    array-length v8, p0

    if-lt v7, v8, :cond_7

    return v2

    :cond_7
    if-nez v1, :cond_8

    return v2

    :cond_8
    add-int/lit8 v8, v3, 0x3

    aget-byte v9, p0, v8

    and-int/lit16 v10, v9, 0xff

    if-lt v10, v4, :cond_9

    return v2

    :cond_9
    if-le v1, v0, :cond_a

    if-nez v9, :cond_a

    add-int/lit8 v9, v3, 0x4

    aget-byte v9, p0, v9

    and-int/lit16 v9, v9, 0xff

    if-ge v9, v4, :cond_a

    return v2

    :cond_a
    add-int/2addr v8, v1

    aget-byte v8, p0, v8

    if-eq v8, v5, :cond_b

    return v2

    :cond_b
    aget-byte v7, p0, v7

    and-int/lit16 v7, v7, 0xff

    add-int/2addr v6, v5

    add-int/2addr v6, v7

    array-length v5, p0

    if-eq v6, v5, :cond_c

    return v2

    :cond_c
    if-nez v7, :cond_d

    return v2

    :cond_d
    add-int/lit8 v5, v3, 0x5

    add-int/2addr v5, v1

    aget-byte v5, p0, v5

    and-int/lit16 v6, v5, 0xff

    if-lt v6, v4, :cond_e

    return v2

    :cond_e
    if-le v7, v0, :cond_f

    if-nez v5, :cond_f

    add-int/lit8 v3, v3, 0x6

    add-int/2addr v3, v1

    aget-byte p0, p0, v3

    and-int/lit16 p0, p0, 0xff

    if-ge p0, v4, :cond_f

    return v2

    :cond_f
    return v0

    :cond_10
    :goto_1
    return v2
.end method

.method public static S(Ljava/lang/String;Ljava/lang/String;ZLio/sentry/v0;)Lxl/a;
    .locals 9

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    if-eqz p1, :cond_c

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "application/x-www-form-urlencoded"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    const-string p1, "UTF-8"

    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v3, "&"

    const/4 v4, -0x1

    invoke-virtual {p0, v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    array-length v3, p0

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_5

    aget-object v5, p0, v4

    const-string v6, "="

    invoke-virtual {v5, v6}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    if-lez v6, :cond_4

    invoke-virtual {v5, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, p1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    if-ge v6, v8, :cond_1

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v5, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p1}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_4

    :cond_1
    const-string v5, ""

    :goto_1
    invoke-virtual {v0, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v0, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    instance-of v8, v6, Ljava/util/List;

    if-eqz v8, :cond_2

    check-cast v6, Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v7, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    if-eqz p2, :cond_6

    sget-object p0, Lio/sentry/util/network/a;->TEXT_TRUNCATED:Lio/sentry/util/network/a;

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    goto :goto_3

    :cond_6
    move-object p0, v1

    :goto_3
    new-instance p1, Lxl/a;

    const/16 p2, 0x10

    invoke-direct {p1, p2, v0, p0}, Lxl/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_4
    sget-object p1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Failed to parse form data: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array p2, v2, [Ljava/lang/Object;

    invoke-interface {p3, p1, p0, p2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p0, Lxl/a;

    sget-object p1, Lio/sentry/util/network/a;->BODY_PARSE_ERROR:Lio/sentry/util/network/a;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/16 p2, 0x10

    invoke-direct {p0, p2, v1, p1}, Lxl/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_7
    const-string v0, "application/json"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_c

    :try_start_1
    new-instance p1, Lio/sentry/vendor/gson/stream/a;

    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lio/sentry/vendor/gson/stream/a;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    new-instance p0, Lhm/d;

    const/16 v0, 0xc

    invoke-direct {p0, v0}, Lhm/d;-><init>(I)V

    iget-object v0, p0, Lhm/d;->x:Ljava/lang/Object;

    check-cast v0, Lb5/d;

    invoke-virtual {p0, p1, v2}, Lhm/d;->l(Lio/sentry/vendor/gson/stream/a;I)Ljava/io/Serializable;

    move-result-object p0

    iput-object p0, v0, Lb5/d;->y:Ljava/lang/Object;

    if-nez p0, :cond_8

    if-nez p2, :cond_8

    iget-boolean v3, v0, Lb5/d;->x:Z

    if-nez v3, :cond_8

    iget-boolean v3, v0, Lb5/d;->w:Z

    if-nez v3, :cond_8

    new-instance p0, Lxl/a;

    const/16 p2, 0x10

    invoke-direct {p0, p2, v1, v1}, Lxl/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    return-object p0

    :catch_1
    move-exception p0

    goto :goto_9

    :catchall_0
    move-exception p0

    goto :goto_7

    :cond_8
    if-nez p2, :cond_b

    :try_start_4
    iget-boolean p2, v0, Lb5/d;->w:Z

    if-eqz p2, :cond_9

    goto :goto_5

    :cond_9
    iget-boolean p2, v0, Lb5/d;->x:Z

    if-eqz p2, :cond_a

    sget-object p2, Lio/sentry/util/network/a;->INVALID_JSON:Lio/sentry/util/network/a;

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    goto :goto_6

    :cond_a
    move-object p2, v1

    goto :goto_6

    :cond_b
    :goto_5
    sget-object p2, Lio/sentry/util/network/a;->JSON_TRUNCATED:Lio/sentry/util/network/a;

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    :goto_6
    new-instance v0, Lxl/a;

    const/16 v3, 0x10

    invoke-direct {v0, v3, p0, p2}, Lxl/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    return-object v0

    :goto_7
    :try_start_6
    invoke-virtual {p1}, Lio/sentry/vendor/gson/stream/a;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception p1

    :try_start_7
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw p0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    :goto_9
    sget-object p1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Failed to parse JSON: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0, p2}, Lb9/y;->k(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    new-array p2, v2, [Ljava/lang/Object;

    invoke-interface {p3, p1, p0, p2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p0, Lxl/a;

    sget-object p1, Lio/sentry/util/network/a;->INVALID_JSON:Lio/sentry/util/network/a;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const/16 p2, 0x10

    invoke-direct {p0, p2, v1, p1}, Lxl/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p0

    :cond_c
    if-eqz p2, :cond_d

    sget-object p1, Lio/sentry/util/network/a;->TEXT_TRUNCATED:Lio/sentry/util/network/a;

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    :cond_d
    new-instance p1, Lxl/a;

    const/16 p2, 0x10

    invoke-direct {p1, p2, p0, v1}, Lxl/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static T(Led3/a;)Ljava/util/ArrayList;
    .locals 29

    move-object/from16 v0, p0

    invoke-virtual {v0}, Led3/a;->y()I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    move-object/from16 v20, v2

    goto/16 :goto_c

    :cond_1
    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Led3/a;->L(I)V

    invoke-virtual {v0}, Led3/a;->i()I

    move-result v3

    const v4, 0x64666c38

    const/4 v5, 0x1

    if-ne v3, v4, :cond_3

    new-instance v3, Led3/a;

    invoke-direct {v3}, Led3/a;-><init>()V

    new-instance v4, Ljava/util/zip/Inflater;

    invoke-direct {v4, v5}, Ljava/util/zip/Inflater;-><init>(Z)V

    :try_start_0
    invoke-static {v0, v3, v4}, Llo/y;->w(Led3/a;Led3/a;Ljava/util/zip/Inflater;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_2

    invoke-virtual {v4}, Ljava/util/zip/Inflater;->end()V

    return-object v2

    :cond_2
    invoke-virtual {v4}, Ljava/util/zip/Inflater;->end()V

    move-object v0, v3

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v4}, Ljava/util/zip/Inflater;->end()V

    throw v0

    :cond_3
    const v4, 0x72617720

    if-eq v3, v4, :cond_4

    goto :goto_0

    :cond_4
    :goto_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget v4, v0, Led3/a;->b:I

    iget v6, v0, Led3/a;->c:I

    :goto_2
    if-ge v4, v6, :cond_13

    invoke-virtual {v0}, Led3/a;->i()I

    move-result v7

    add-int/2addr v7, v4

    if-le v7, v4, :cond_0

    if-le v7, v6, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {v0}, Led3/a;->i()I

    move-result v4

    const v8, 0x6d657368

    if-ne v4, v8, :cond_12

    invoke-virtual {v0}, Led3/a;->i()I

    move-result v4

    const/16 v8, 0x2710

    if-le v4, v8, :cond_6

    :goto_3
    move/from16 v16, v1

    move-object v1, v2

    move-object/from16 v20, v1

    move/from16 v17, v5

    goto/16 :goto_a

    :cond_6
    new-array v8, v4, [F

    const/4 v10, 0x0

    :goto_4
    if-ge v10, v4, :cond_7

    invoke-virtual {v0}, Led3/a;->i()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    aput v11, v8, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_7
    invoke-virtual {v0}, Led3/a;->i()I

    move-result v10

    const/16 v11, 0x7d00

    if-le v10, v11, :cond_8

    goto :goto_3

    :cond_8
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    invoke-static {v11, v12}, Ljava/lang/Math;->log(D)D

    move-result-wide v13

    move/from16 v16, v1

    move-object v15, v2

    int-to-double v1, v4

    mul-double/2addr v1, v11

    invoke-static {v1, v2}, Ljava/lang/Math;->log(D)D

    move-result-wide v1

    div-double/2addr v1, v13

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    new-instance v2, Llo/s;

    move/from16 v17, v5

    iget-object v5, v0, Led3/a;->a:[B

    array-length v9, v5

    move-wide/from16 v18, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct {v2, v5, v9, v11, v12}, Llo/s;-><init>([BIIB)V

    iget v5, v0, Led3/a;->b:I

    const/16 v9, 0x8

    mul-int/2addr v5, v9

    invoke-virtual {v2, v5}, Llo/s;->q(I)V

    mul-int/lit8 v5, v10, 0x5

    new-array v5, v5, [F

    const/4 v11, 0x5

    new-array v12, v11, [I

    move-object/from16 v20, v15

    const/4 v15, 0x0

    const/16 v21, 0x0

    :goto_5
    if-ge v15, v10, :cond_c

    const/4 v9, 0x0

    :goto_6
    if-ge v9, v11, :cond_b

    aget v23, v12, v9

    invoke-virtual {v2, v1}, Llo/s;->i(I)I

    move-result v24

    shr-int/lit8 v25, v24, 0x1

    and-int/lit8 v11, v24, 0x1

    neg-int v11, v11

    xor-int v11, v25, v11

    add-int v11, v11, v23

    if-ge v11, v4, :cond_a

    if-gez v11, :cond_9

    goto :goto_7

    :cond_9
    add-int/lit8 v23, v21, 0x1

    aget v24, v8, v11

    aput v24, v5, v21

    aput v11, v12, v9

    add-int/lit8 v9, v9, 0x1

    move/from16 v21, v23

    const/4 v11, 0x5

    goto :goto_6

    :cond_a
    :goto_7
    move-object/from16 v1, v20

    goto/16 :goto_a

    :cond_b
    add-int/lit8 v15, v15, 0x1

    const/16 v9, 0x8

    const/4 v11, 0x5

    goto :goto_5

    :cond_c
    invoke-virtual {v2}, Llo/s;->g()I

    move-result v1

    add-int/lit8 v1, v1, 0x7

    and-int/lit8 v1, v1, -0x8

    invoke-virtual {v2, v1}, Llo/s;->q(I)V

    const/16 v1, 0x20

    invoke-virtual {v2, v1}, Llo/s;->i(I)I

    move-result v4

    new-array v8, v4, [Lno/f;

    const/4 v9, 0x0

    :goto_8
    if-ge v9, v4, :cond_10

    const/16 v11, 0x8

    invoke-virtual {v2, v11}, Llo/s;->i(I)I

    move-result v22

    invoke-virtual {v2, v11}, Llo/s;->i(I)I

    move-result v25

    invoke-virtual {v2, v1}, Llo/s;->i(I)I

    move-result v12

    const v15, 0x1f400

    if-le v12, v15, :cond_d

    goto :goto_7

    :cond_d
    move-object v15, v2

    int-to-double v1, v10

    mul-double v1, v1, v18

    invoke-static {v1, v2}, Ljava/lang/Math;->log(D)D

    move-result-wide v1

    div-double/2addr v1, v13

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    mul-int/lit8 v2, v12, 0x3

    new-array v2, v2, [F

    mul-int/lit8 v11, v12, 0x2

    new-array v11, v11, [F

    move-object/from16 v23, v2

    const/4 v2, 0x0

    const/16 v21, 0x0

    :goto_9
    if-ge v2, v12, :cond_f

    invoke-virtual {v15, v1}, Llo/s;->i(I)I

    move-result v24

    shr-int/lit8 v26, v24, 0x1

    move/from16 v27, v1

    and-int/lit8 v1, v24, 0x1

    neg-int v1, v1

    xor-int v1, v26, v1

    add-int v1, v1, v21

    if-ltz v1, :cond_a

    if-lt v1, v10, :cond_e

    goto :goto_7

    :cond_e
    mul-int/lit8 v21, v2, 0x3

    mul-int/lit8 v24, v1, 0x5

    aget v26, v5, v24

    aput v26, v23, v21

    add-int/lit8 v26, v21, 0x1

    add-int/lit8 v28, v24, 0x1

    aget v28, v5, v28

    aput v28, v23, v26

    add-int/lit8 v21, v21, 0x2

    add-int/lit8 v26, v24, 0x2

    aget v26, v5, v26

    aput v26, v23, v21

    mul-int/lit8 v21, v2, 0x2

    add-int/lit8 v26, v24, 0x3

    aget v26, v5, v26

    aput v26, v11, v21

    add-int/lit8 v21, v21, 0x1

    add-int/lit8 v24, v24, 0x4

    aget v24, v5, v24

    aput v24, v11, v21

    add-int/lit8 v2, v2, 0x1

    move/from16 v21, v1

    move/from16 v1, v27

    goto :goto_9

    :cond_f
    new-instance v21, Lno/f;

    const/16 v26, 0x0

    move-object/from16 v24, v11

    invoke-direct/range {v21 .. v26}, Lno/f;-><init>(I[F[FII)V

    aput-object v21, v8, v9

    add-int/lit8 v9, v9, 0x1

    move-object v2, v15

    const/16 v1, 0x20

    goto/16 :goto_8

    :cond_10
    new-instance v1, Lno/e;

    invoke-direct {v1, v8}, Lno/e;-><init>([Lno/f;)V

    :goto_a
    if-nez v1, :cond_11

    goto :goto_c

    :cond_11
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_12
    move/from16 v16, v1

    move-object/from16 v20, v2

    move/from16 v17, v5

    :goto_b
    invoke-virtual {v0, v7}, Led3/a;->K(I)V

    move v4, v7

    move/from16 v1, v16

    move/from16 v5, v17

    move-object/from16 v2, v20

    goto/16 :goto_2

    :goto_c
    return-object v20

    :cond_13
    return-object v3
.end method

.method public static U(Landroid/animation/AnimatorSet;Ljava/util/ArrayList;)V
    .locals 10

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v0, :cond_0

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/animation/Animator;

    invoke-virtual {v5}, Landroid/animation/Animator;->getStartDelay()J

    move-result-wide v6

    invoke-virtual {v5}, Landroid/animation/Animator;->getDuration()J

    move-result-wide v8

    add-long/2addr v8, v6

    invoke-static {v1, v2, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    filled-new-array {v3, v3}, [I

    move-result-object v0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Landroid/animation/Animator;->setDuration(J)Landroid/animation/Animator;

    invoke-virtual {p1, v3, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {p0, p1}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    return-void
.end method

.method public static V(Ljava/security/spec/EllipticCurve;[B)Ljava/security/spec/ECPoint;
    .locals 5

    invoke-static {p0}, Ls2/e;->s(Ljava/security/spec/EllipticCurve;)I

    move-result v0

    array-length v1, p1

    mul-int/lit8 v2, v0, 0x2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    if-ne v1, v2, :cond_1

    const/4 v1, 0x0

    aget-byte v1, p1, v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    new-instance v1, Ljava/math/BigInteger;

    add-int/2addr v0, v3

    invoke-static {p1, v3, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v2

    invoke-direct {v1, v3, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance v2, Ljava/math/BigInteger;

    array-length v4, p1

    invoke-static {p1, v0, v4}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-direct {v2, v3, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance p1, Ljava/security/spec/ECPoint;

    invoke-direct {p1, v1, v2}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    invoke-static {p1, p0}, Lcom/google/crypto/tink/internal/e;->b(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "invalid point format"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "invalid point size"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static W(Lat/p;Ljava/security/spec/ECPoint;)[B
    .locals 5

    invoke-static {p0}, Ls2/e;->z(Lat/p;)Ljava/security/spec/ECParameterSpec;

    move-result-object p0

    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/google/crypto/tink/internal/e;->b(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    invoke-static {p0}, Ls2/e;->s(Ljava/security/spec/EllipticCurve;)I

    move-result p0

    mul-int/lit8 v0, p0, 0x2

    add-int/lit8 v0, v0, 0x1

    new-array v1, v0, [B

    invoke-virtual {p1}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object v2

    invoke-static {v2}, Lcom/google/crypto/tink/internal/a;->v(Ljava/math/BigInteger;)[B

    move-result-object v2

    invoke-virtual {p1}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/internal/a;->v(Ljava/math/BigInteger;)[B

    move-result-object p1

    array-length v3, p1

    sub-int/2addr v0, v3

    array-length v3, p1

    const/4 v4, 0x0

    invoke-static {p1, v4, v1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 p0, p0, 0x1

    array-length p1, v2

    sub-int/2addr p0, p1

    array-length p1, v2

    invoke-static {v2, v4, v1, p0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 p0, 0x4

    aput-byte p0, v1, v4

    return-object v1
.end method

.method public static X(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V
    .locals 5

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_1

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object p0

    invoke-virtual {p1}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    array-length v2, p0

    array-length v3, p0

    array-length v4, v1

    add-int/2addr v3, v4

    invoke-static {p0, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p0

    const/4 v3, 0x0

    array-length v4, v1

    invoke-static {v1, v3, p0, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    invoke-virtual {p2, p0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p0

    invoke-virtual {p2, p0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static final Y(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "min"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "max"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p3}, Ls2/e;->b0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    invoke-static {p0, p2, p3}, Ls2/e;->c0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V

    return-void
.end method

.method public static final Z(DLjava/lang/String;)V
    .locals 2

    const-wide/16 v0, 0x0

    cmpl-double p0, p0, v0

    if-ltz p0, :cond_0

    return-void

    :cond_0
    const-string p0, " must not be negative"

    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final a(Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 27

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x2ab0014a

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    const/4 v6, 0x3

    and-int/2addr v3, v6

    if-ne v3, v4, :cond_3

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    move-object/from16 v23, v2

    goto :goto_3

    :cond_3
    :goto_2
    const v3, 0x7f140ff4

    invoke-static {v2, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v2, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/c1;

    invoke-virtual {v4}, Lg1/c1;->f()J

    move-result-wide v7

    sget-object v4, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v2, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/h9;

    iget-object v4, v4, Lg1/h9;->g:Ll3/v0;

    sget-object v9, Lp3/r;->G:Lp3/r;

    sget-object v10, Lb2/t;->w:Lb2/t;

    const-string v11, "TEST_TAG_VERTICAL_MODE_SAVED_PM_EDIT"

    invoke-static {v10, v11}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x7

    const/4 v13, 0x0

    invoke-static {v10, v11, v13, v0, v12}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v10

    int-to-float v5, v5

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-static {v10, v12, v5, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5, v13, v6}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v25, 0x0

    const v26, 0xffd8

    move-object/from16 v23, v2

    move-object v2, v3

    move-object/from16 v22, v4

    move-object v3, v5

    move-wide v4, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/high16 v24, 0x30000

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    :goto_3
    invoke-virtual/range {v23 .. v23}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance v3, Lch0/t;

    const/4 v4, 0x3

    invoke-direct {v3, v1, v4, v0}, Lch0/t;-><init>(IILc93/a;)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public static final a0(JLjava/lang/String;)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    if-ltz p0, :cond_0

    return-void

    :cond_0
    const-string p0, " must not be negative"

    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;ZLh0/o1;ZLf0/k;Lb2/f;Ll0/l;Lb2/g;Ll0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
    .locals 36

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v5, p2

    move/from16 v4, p3

    move/from16 v0, p5

    move-object/from16 v14, p11

    move/from16 v15, p13

    move/from16 v2, p14

    move/from16 v6, p15

    move-object/from16 v7, p12

    check-cast v7, Lp1/q;

    const v8, 0x37213af3

    invoke-virtual {v7, v8}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v8, v15, 0x6

    if-nez v8, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x4

    goto :goto_0

    :cond_0
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v15

    goto :goto_1

    :cond_1
    move v8, v15

    :goto_1
    and-int/lit8 v11, v15, 0x30

    if-nez v11, :cond_3

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    const/16 v11, 0x20

    goto :goto_2

    :cond_2
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v8, v11

    :cond_3
    and-int/lit16 v11, v15, 0x180

    const/16 v16, 0x80

    if-nez v11, :cond_5

    invoke-virtual {v7, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    const/16 v11, 0x100

    goto :goto_3

    :cond_4
    move/from16 v11, v16

    :goto_3
    or-int/2addr v8, v11

    :cond_5
    and-int/lit16 v11, v15, 0xc00

    const/4 v9, 0x0

    const/16 v18, 0x400

    if-nez v11, :cond_7

    invoke-virtual {v7, v9}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_6

    const/16 v11, 0x800

    goto :goto_4

    :cond_6
    move/from16 v11, v18

    :goto_4
    or-int/2addr v8, v11

    :cond_7
    and-int/lit16 v11, v15, 0x6000

    if-nez v11, :cond_9

    invoke-virtual {v7, v4}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x4000

    goto :goto_5

    :cond_8
    const/16 v11, 0x2000

    :goto_5
    or-int/2addr v8, v11

    :cond_9
    const/high16 v11, 0x30000

    and-int/2addr v11, v15

    if-nez v11, :cond_b

    move-object/from16 v11, p4

    invoke-virtual {v7, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_a

    const/high16 v20, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v20, 0x10000

    :goto_6
    or-int v8, v8, v20

    goto :goto_7

    :cond_b
    move-object/from16 v11, p4

    :goto_7
    const/high16 v20, 0x180000

    and-int v21, v15, v20

    if-nez v21, :cond_d

    invoke-virtual {v7, v0}, Lp1/q;->h(Z)Z

    move-result v21

    if-eqz v21, :cond_c

    const/high16 v21, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v21, 0x80000

    :goto_8
    or-int v8, v8, v21

    :cond_d
    const/high16 v21, 0xc00000

    and-int v22, v15, v21

    move-object/from16 v9, p6

    if-nez v22, :cond_f

    invoke-virtual {v7, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_e

    const/high16 v23, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v23, 0x400000

    :goto_9
    or-int v8, v8, v23

    :cond_f
    const/high16 v23, 0x6000000

    and-int v24, v15, v23

    if-nez v24, :cond_10

    const/high16 v24, 0x2000000

    or-int v8, v8, v24

    :cond_10
    and-int/lit16 v12, v6, 0x200

    const/high16 v25, 0x30000000

    if-eqz v12, :cond_11

    or-int v8, v8, v25

    move-object/from16 v13, p7

    goto :goto_b

    :cond_11
    and-int v26, v15, v25

    move-object/from16 v13, p7

    if-nez v26, :cond_13

    invoke-virtual {v7, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_12

    const/high16 v27, 0x20000000

    goto :goto_a

    :cond_12
    const/high16 v27, 0x10000000

    :goto_a
    or-int v8, v8, v27

    :cond_13
    :goto_b
    and-int/lit16 v10, v6, 0x400

    if-eqz v10, :cond_14

    or-int/lit8 v28, v2, 0x6

    move/from16 v29, v28

    move/from16 v28, v8

    move-object/from16 v8, p8

    goto :goto_d

    :cond_14
    and-int/lit8 v28, v2, 0x6

    if-nez v28, :cond_16

    move/from16 v28, v8

    move-object/from16 v8, p8

    invoke-virtual {v7, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_15

    const/16 v29, 0x4

    goto :goto_c

    :cond_15
    const/16 v29, 0x2

    :goto_c
    or-int v29, v2, v29

    goto :goto_d

    :cond_16
    move/from16 v28, v8

    move-object/from16 v8, p8

    move/from16 v29, v2

    :goto_d
    and-int/lit16 v8, v6, 0x800

    if-eqz v8, :cond_17

    or-int/lit8 v29, v29, 0x30

    move/from16 v30, v8

    :goto_e
    move/from16 v8, v29

    goto :goto_10

    :cond_17
    and-int/lit8 v30, v2, 0x30

    if-nez v30, :cond_19

    move/from16 v30, v8

    move-object/from16 v8, p9

    invoke-virtual {v7, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_18

    const/16 v19, 0x20

    goto :goto_f

    :cond_18
    const/16 v19, 0x10

    :goto_f
    or-int v29, v29, v19

    goto :goto_e

    :cond_19
    move/from16 v30, v8

    move-object/from16 v8, p9

    goto :goto_e

    :goto_10
    and-int/lit16 v9, v6, 0x1000

    if-eqz v9, :cond_1b

    or-int/lit16 v8, v8, 0x180

    :cond_1a
    move-object/from16 v6, p10

    goto :goto_11

    :cond_1b
    and-int/lit16 v6, v2, 0x180

    if-nez v6, :cond_1a

    move-object/from16 v6, p10

    invoke-virtual {v7, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_1c

    const/16 v16, 0x100

    :cond_1c
    or-int v8, v8, v16

    :goto_11
    and-int/lit16 v6, v2, 0xc00

    if-nez v6, :cond_1e

    invoke-virtual {v7, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1d

    const/16 v18, 0x800

    :cond_1d
    or-int v8, v8, v18

    :cond_1e
    const v6, 0x12492493

    and-int v6, v28, v6

    const v2, 0x12492492

    const/16 v16, 0x1

    if-ne v6, v2, :cond_20

    and-int/lit16 v2, v8, 0x493

    const/16 v6, 0x492

    if-eq v2, v6, :cond_1f

    goto :goto_12

    :cond_1f
    const/4 v2, 0x0

    goto :goto_13

    :cond_20
    :goto_12
    move/from16 v2, v16

    :goto_13
    and-int/lit8 v6, v28, 0x1

    invoke-virtual {v7, v6, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_57

    invoke-virtual {v7}, Lp1/q;->Z()V

    and-int/lit8 v2, v15, 0x1

    const v6, -0xe000001

    const/16 v18, 0x0

    if-eqz v2, :cond_22

    invoke-virtual {v7}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_21

    goto :goto_14

    :cond_21
    invoke-virtual {v7}, Lp1/q;->X()V

    and-int v2, v28, v6

    move-object/from16 v6, p8

    move v9, v8

    move-object v12, v13

    move-object/from16 v13, p9

    move-object/from16 v8, p10

    goto :goto_18

    :cond_22
    :goto_14
    and-int v2, v28, v6

    if-eqz v12, :cond_23

    move-object/from16 v13, v18

    :cond_23
    if-eqz v10, :cond_24

    move-object/from16 v6, v18

    goto :goto_15

    :cond_24
    move-object/from16 v6, p8

    :goto_15
    if-eqz v30, :cond_25

    move-object/from16 v10, v18

    goto :goto_16

    :cond_25
    move-object/from16 v10, p9

    :goto_16
    if-eqz v9, :cond_26

    move v9, v8

    move-object v12, v13

    move-object/from16 v8, v18

    :goto_17
    move-object v13, v10

    goto :goto_18

    :cond_26
    move v9, v8

    move-object v12, v13

    move-object/from16 v8, p10

    goto :goto_17

    :goto_18
    invoke-virtual {v7}, Lp1/q;->r()V

    shr-int/lit8 v19, v2, 0x3

    and-int/lit8 v10, v19, 0xe

    shr-int/lit8 v28, v9, 0x6

    and-int/lit8 v28, v28, 0x70

    or-int v28, v10, v28

    move/from16 p7, v2

    invoke-static {v14, v7}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v2

    and-int/lit8 v29, v28, 0xe

    move/from16 p8, v9

    xor-int/lit8 v9, v29, 0x6

    move/from16 p9, v10

    const/4 v10, 0x4

    if-le v9, v10, :cond_27

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_28

    :cond_27
    and-int/lit8 v9, v28, 0x6

    if-ne v9, v10, :cond_29

    :cond_28
    move/from16 v9, v16

    goto :goto_19

    :cond_29
    const/4 v9, 0x0

    :goto_19
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_2a

    if-ne v10, v14, :cond_2b

    :cond_2a
    new-instance v9, Landroidx/compose/foundation/lazy/b;

    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    new-instance v10, Lp1/h1;

    const v11, 0x7fffffff

    invoke-direct {v10, v11}, Lp1/h1;-><init>(I)V

    iput-object v10, v9, Landroidx/compose/foundation/lazy/b;->a:Lp1/h1;

    new-instance v10, Lp1/h1;

    invoke-direct {v10, v11}, Lp1/h1;-><init>(I)V

    iput-object v10, v9, Landroidx/compose/foundation/lazy/b;->b:Lp1/h1;

    sget-object v10, Lp1/v0;->z:Lp1/v0;

    new-instance v11, Ljt1/b;

    const/16 v15, 0x1b

    invoke-direct {v11, v15, v2}, Ljt1/b;-><init>(ILp1/c1;)V

    invoke-static {v11, v10}, Lp1/x;->s(Lc93/a;Lp1/o2;)Lp1/f0;

    move-result-object v2

    new-instance v11, Ln0/j;

    const/4 v15, 0x0

    invoke-direct {v11, v2, v3, v9, v15}, Ln0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v11, v10}, Lp1/x;->s(Lc93/a;Lp1/o2;)Lp1/f0;

    move-result-object v32

    new-instance v28, Lhc3/j;

    const/16 v29, 0x0

    const/16 v30, 0x5

    const-class v31, Lp1/t2;

    const-string v33, "value"

    const-string v34, "getValue()Ljava/lang/Object;"

    invoke-direct/range {v28 .. v34}, Lhc3/j;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v10, v28

    invoke-virtual {v7, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    move-object v2, v10

    check-cast v2, Lj93/u;

    shr-int/lit8 v9, p7, 0x9

    and-int/lit8 v10, v9, 0x70

    or-int v10, p9, v10

    and-int/lit8 v11, v10, 0xe

    xor-int/lit8 v11, v11, 0x6

    const/4 v15, 0x4

    if-le v11, v15, :cond_2c

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2d

    :cond_2c
    and-int/lit8 v11, v10, 0x6

    if-ne v11, v15, :cond_2e

    :cond_2d
    move/from16 v11, v16

    goto :goto_1a

    :cond_2e
    const/4 v11, 0x0

    :goto_1a
    and-int/lit8 v27, v10, 0x70

    xor-int/lit8 v15, v27, 0x30

    move-object/from16 p9, v2

    const/16 v2, 0x20

    if-le v15, v2, :cond_2f

    invoke-virtual {v7, v4}, Lp1/q;->h(Z)Z

    move-result v15

    if-nez v15, :cond_30

    :cond_2f
    and-int/lit8 v10, v10, 0x30

    if-ne v10, v2, :cond_31

    :cond_30
    move/from16 v2, v16

    goto :goto_1b

    :cond_31
    const/4 v2, 0x0

    :goto_1b
    or-int/2addr v2, v11

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v2, :cond_32

    if-ne v10, v14, :cond_33

    :cond_32
    new-instance v10, Ln0/b;

    const/4 v2, 0x0

    invoke-direct {v10, v3, v4, v2}, Ln0/b;-><init>(Lh0/x2;ZI)V

    invoke-virtual {v7, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_33
    move-object v15, v10

    check-cast v15, Lp0/s0;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v14, :cond_34

    invoke-static {v7}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v2

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_34
    check-cast v2, Lbc3/c0;

    sget-object v10, Lb3/v1;->g:Lp1/u2;

    invoke-virtual {v7, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Li2/f0;

    sget-object v11, Lb3/v1;->v:Lp1/b0;

    invoke-virtual {v7, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    if-nez v11, :cond_35

    sget-object v18, Lp0/f1;->a:Lp0/e1;

    :cond_35
    move-object/from16 v11, v18

    const v18, 0xfff0

    and-int v18, p7, v18

    const/high16 v27, 0x380000

    and-int v9, v9, v27

    or-int v9, v18, v9

    shl-int/lit8 v18, p8, 0x12

    const/high16 v29, 0x1c00000

    and-int v30, v18, v29

    or-int v9, v9, v30

    const/high16 v30, 0xe000000

    and-int v18, v18, v30

    or-int v9, v9, v18

    shl-int/lit8 v18, p8, 0x1b

    const/high16 v31, 0x70000000

    and-int v18, v18, v31

    or-int v9, v9, v18

    and-int/lit8 v18, v9, 0x70

    move-object/from16 p7, v2

    xor-int/lit8 v2, v18, 0x30

    const/16 v0, 0x20

    if-le v2, v0, :cond_36

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_37

    :cond_36
    and-int/lit8 v2, v9, 0x30

    if-ne v2, v0, :cond_38

    :cond_37
    move/from16 v0, v16

    goto :goto_1c

    :cond_38
    const/4 v0, 0x0

    :goto_1c
    and-int/lit16 v2, v9, 0x380

    xor-int/lit16 v2, v2, 0x180

    move/from16 p8, v0

    const/16 v0, 0x100

    if-le v2, v0, :cond_39

    invoke-virtual {v7, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3a

    :cond_39
    and-int/lit16 v2, v9, 0x180

    if-ne v2, v0, :cond_3b

    :cond_3a
    move/from16 v0, v16

    goto :goto_1d

    :cond_3b
    const/4 v0, 0x0

    :goto_1d
    or-int v0, p8, v0

    and-int/lit16 v2, v9, 0x1c00

    xor-int/lit16 v2, v2, 0xc00

    move/from16 p8, v0

    const/16 v0, 0x800

    if-le v2, v0, :cond_3c

    const/4 v2, 0x0

    invoke-virtual {v7, v2}, Lp1/q;->h(Z)Z

    move-result v17

    if-nez v17, :cond_3d

    :cond_3c
    and-int/lit16 v2, v9, 0xc00

    if-ne v2, v0, :cond_3e

    :cond_3d
    move/from16 v2, v16

    goto :goto_1e

    :cond_3e
    const/4 v2, 0x0

    :goto_1e
    or-int v0, p8, v2

    const v2, 0xe000

    and-int/2addr v2, v9

    xor-int/lit16 v2, v2, 0x6000

    move/from16 p8, v0

    const/16 v0, 0x4000

    if-le v2, v0, :cond_3f

    invoke-virtual {v7, v4}, Lp1/q;->h(Z)Z

    move-result v2

    if-nez v2, :cond_40

    :cond_3f
    and-int/lit16 v2, v9, 0x6000

    if-ne v2, v0, :cond_41

    :cond_40
    move/from16 v2, v16

    goto :goto_1f

    :cond_41
    const/4 v2, 0x0

    :goto_1f
    or-int v0, p8, v2

    const/4 v2, 0x0

    invoke-virtual {v7, v2}, Lp1/q;->e(I)Z

    move-result v17

    or-int v0, v0, v17

    and-int v17, v9, v27

    xor-int v2, v17, v20

    move/from16 p8, v0

    const/high16 v0, 0x100000

    if-le v2, v0, :cond_42

    invoke-virtual {v7, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_43

    :cond_42
    and-int v2, v9, v20

    if-ne v2, v0, :cond_44

    :cond_43
    move/from16 v2, v16

    goto :goto_20

    :cond_44
    const/4 v2, 0x0

    :goto_20
    or-int v0, p8, v2

    and-int v2, v9, v29

    xor-int v2, v2, v21

    move/from16 p8, v0

    const/high16 v0, 0x800000

    if-le v2, v0, :cond_45

    invoke-virtual {v7, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_46

    :cond_45
    and-int v2, v9, v21

    if-ne v2, v0, :cond_47

    :cond_46
    move/from16 v2, v16

    goto :goto_21

    :cond_47
    const/4 v2, 0x0

    :goto_21
    or-int v0, p8, v2

    and-int v2, v9, v30

    xor-int v2, v2, v23

    move/from16 p8, v0

    const/high16 v0, 0x4000000

    if-le v2, v0, :cond_48

    invoke-virtual {v7, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_49

    :cond_48
    and-int v2, v9, v23

    if-ne v2, v0, :cond_4a

    :cond_49
    move/from16 v2, v16

    goto :goto_22

    :cond_4a
    const/4 v2, 0x0

    :goto_22
    or-int v0, p8, v2

    and-int v2, v9, v31

    xor-int v2, v2, v25

    move/from16 p8, v0

    const/high16 v0, 0x20000000

    if-le v2, v0, :cond_4b

    invoke-virtual {v7, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4c

    :cond_4b
    and-int v2, v9, v25

    if-ne v2, v0, :cond_4d

    :cond_4c
    move/from16 v2, v16

    goto :goto_23

    :cond_4d
    const/4 v2, 0x0

    :goto_23
    or-int v0, p8, v2

    invoke-virtual {v7, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v7, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_4f

    if-ne v2, v14, :cond_4e

    goto :goto_24

    :cond_4e
    move-object/from16 v4, p9

    move-object v11, v6

    move-object v0, v7

    move-object/from16 v18, v8

    move-object/from16 p7, v15

    const/4 v15, 0x4

    goto :goto_25

    :cond_4f
    :goto_24
    new-instance v2, Ln0/l;

    move-object/from16 v9, p7

    move-object v0, v7

    move-object/from16 p7, v15

    const/4 v15, 0x4

    move-object v7, v6

    move-object/from16 v6, p9

    invoke-direct/range {v2 .. v13}, Ln0/l;-><init>(Ln0/u;ZLl0/k1;Lj93/u;Ll0/l;Ll0/i;Lbc3/c0;Li2/f0;Lp0/e1;Lb2/f;Lb2/g;)V

    move-object v4, v6

    move-object v11, v7

    move-object/from16 v18, v8

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_25
    move-object/from16 v17, v2

    check-cast v17, Lp0/c0;

    if-eqz p3, :cond_50

    sget-object v2, Lh0/d2;->w:Lh0/d2;

    goto :goto_26

    :cond_50
    sget-object v2, Lh0/d2;->x:Lh0/d2;

    :goto_26
    if-eqz p5, :cond_56

    const v5, -0x7bcdd0a8

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    and-int/lit8 v5, v19, 0xe

    xor-int/lit8 v5, v5, 0x6

    if-le v5, v15, :cond_51

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_52

    :cond_51
    and-int/lit8 v5, v19, 0x6

    if-ne v5, v15, :cond_53

    :cond_52
    move/from16 v9, v16

    :goto_27
    const/4 v5, 0x0

    goto :goto_28

    :cond_53
    const/4 v9, 0x0

    goto :goto_27

    :goto_28
    invoke-virtual {v0, v5}, Lp1/q;->e(I)Z

    move-result v6

    or-int v5, v9, v6

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_54

    if-ne v6, v14, :cond_55

    :cond_54
    new-instance v6, Ln0/c;

    invoke-direct {v6, v3}, Ln0/c;-><init>(Ln0/u;)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_55
    check-cast v6, Ln0/c;

    iget-object v5, v3, Ln0/u;->o:Laj/d;

    invoke-static {v6, v5, v2}, Landroidx/compose/foundation/lazy/layout/a;->a(Lp0/o;Laj/d;Lh0/d2;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    goto :goto_29

    :cond_56
    const/4 v6, 0x0

    const v5, -0x7bc74591

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    sget-object v5, Lb2/t;->w:Lb2/t;

    :goto_29
    iget-object v6, v3, Ln0/u;->l:Ln0/s;

    invoke-interface {v1, v6}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    iget-object v7, v3, Ln0/u;->m:Lp0/d;

    invoke-interface {v6, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move/from16 v7, p5

    move-object/from16 v10, p7

    invoke-static {v6, v4, v10, v2, v7}, Landroidx/compose/foundation/lazy/layout/a;->b(Landroidx/compose/ui/Modifier;Lj93/u;Lp0/s0;Lh0/d2;Z)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-interface {v6, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    iget-object v6, v3, Ln0/u;->n:Landroidx/compose/foundation/lazy/layout/b;

    iget-object v6, v6, Landroidx/compose/foundation/lazy/layout/b;->k:Landroidx/compose/ui/Modifier;

    invoke-interface {v5, v6}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    iget-object v7, v3, Ln0/u;->g:Lj0/j;

    const/4 v8, 0x0

    const/4 v10, 0x0

    move-object/from16 v6, p4

    move-object/from16 v9, p6

    move-object v14, v4

    move-object v4, v2

    move-object v2, v5

    move/from16 v5, p5

    invoke-static/range {v2 .. v10}, Landroidx/compose/foundation/a;->j(Landroidx/compose/ui/Modifier;Lh0/x2;Lh0/d2;ZLh0/o1;Lj0/i;ZLf0/k;Lq0/g;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v8, v3

    iget-object v4, v8, Ln0/u;->p:Lp0/l0;

    const/4 v7, 0x0

    move-object v6, v0

    move-object v3, v2

    move-object v2, v14

    move-object/from16 v5, v17

    invoke-static/range {v2 .. v7}, Lp0/y;->c(Lc93/a;Landroidx/compose/ui/Modifier;Lp0/l0;Lp0/c0;Landroidx/compose/runtime/Composer;I)V

    move-object v9, v11

    move-object v10, v13

    move-object/from16 v11, v18

    goto :goto_2a

    :cond_57
    move-object v8, v3

    move-object v0, v7

    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object v12, v13

    :goto_2a
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_58

    move-object v2, v0

    new-instance v0, Lb01/l;

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v13, p13

    move/from16 v14, p14

    move/from16 v15, p15

    move-object/from16 v35, v2

    move-object v2, v8

    move-object v8, v12

    move-object/from16 v12, p11

    invoke-direct/range {v0 .. v15}, Lb01/l;-><init>(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;ZLh0/o1;ZLf0/k;Lb2/f;Ll0/l;Lb2/g;Ll0/i;Lkotlin/jvm/functions/Function1;III)V

    move-object/from16 v2, v35

    iput-object v0, v2, Lp1/v1;->d:Lc93/m;

    :cond_58
    return-void
.end method

.method public static final b0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-ltz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " must not be less than "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", currently "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x2e

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final c(Ld30/u;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v15, p2

    check-cast v15, Lp1/q;

    const v3, -0x183d0446

    invoke-virtual {v15, v3}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x4

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x20

    goto :goto_1

    :cond_1
    const/16 v5, 0x10

    :goto_1
    or-int/2addr v3, v5

    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    if-ne v5, v6, :cond_3

    invoke-virtual {v15}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v15}, Lp1/q;->X()V

    goto/16 :goto_a

    :cond_3
    :goto_2
    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v15, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    const v6, 0x433274ae

    invoke-virtual {v15, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v6, v7, :cond_4

    new-instance v6, Lm40/w;

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    const-string v8, "getApplicationContext(...)"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x1e

    invoke-direct {v6, v5, v8}, Lm40/w;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v15, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v11, v6

    check-cast v11, Lm40/w;

    const/4 v5, 0x0

    invoke-virtual {v15, v5}, Lp1/q;->q(Z)V

    iget-object v6, v0, Ld30/u;->s:Ln53/e;

    invoke-static {v6, v15, v5}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v6

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ld30/s0;

    iget-object v8, v8, Ld30/s0;->a:Ljava/util/List;

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ld30/s0;

    iget-object v9, v9, Ld30/s0;->d:Lh20/l;

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ld30/s0;

    iget-object v10, v10, Ld30/s0;->e:Ld30/o0;

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ld30/s0;

    iget-object v12, v12, Ld30/s0;->c:Ld30/r0;

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ld30/s0;

    iget-boolean v6, v6, Ld30/s0;->b:Z

    const/4 v13, 0x1

    xor-int/2addr v6, v13

    const-string v14, "TEST_TAG_PAYMENT_METHOD_VERTICAL_LAYOUT"

    invoke-static {v1, v14}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const v13, 0x4332b0f1

    invoke-virtual {v15, v13}, Lp1/q;->e0(I)V

    and-int/lit8 v3, v3, 0xe

    if-eq v3, v4, :cond_5

    move v13, v5

    goto :goto_3

    :cond_5
    const/4 v13, 0x1

    :goto_3
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v13, :cond_6

    if-ne v4, v7, :cond_7

    :cond_6
    new-instance v4, Ld30/m;

    const/4 v13, 0x2

    invoke-direct {v4, v0, v13}, Ld30/m;-><init>(Ld30/u;I)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v4, Lc93/a;

    invoke-virtual {v15, v5}, Lp1/q;->q(Z)V

    const v13, 0x4332e62d

    invoke-virtual {v15, v13}, Lp1/q;->e0(I)V

    const/4 v13, 0x4

    if-eq v3, v13, :cond_8

    move v13, v5

    goto :goto_4

    :cond_8
    const/4 v13, 0x1

    :goto_4
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v13, :cond_9

    if-ne v5, v7, :cond_a

    :cond_9
    new-instance v5, Ld30/c1;

    const/4 v13, 0x0

    invoke-direct {v5, v0, v13}, Ld30/c1;-><init>(Ld30/u;I)V

    invoke-virtual {v15, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v13, 0x0

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    const v13, 0x4332caf8

    invoke-virtual {v15, v13}, Lp1/q;->e0(I)V

    const/4 v13, 0x4

    if-eq v3, v13, :cond_b

    const/4 v13, 0x0

    :goto_5
    move-object/from16 v17, v4

    goto :goto_6

    :cond_b
    const/4 v13, 0x1

    goto :goto_5

    :goto_6
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v13, :cond_c

    if-ne v4, v7, :cond_d

    :cond_c
    new-instance v4, Ld30/c1;

    const/4 v13, 0x1

    invoke-direct {v4, v0, v13}, Ld30/c1;-><init>(Ld30/u;I)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v13, 0x0

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    const v13, 0x433304d4

    invoke-virtual {v15, v13}, Lp1/q;->e0(I)V

    const/4 v13, 0x4

    if-eq v3, v13, :cond_e

    const/4 v13, 0x0

    :goto_7
    move-object/from16 v18, v4

    goto :goto_8

    :cond_e
    const/4 v13, 0x1

    goto :goto_7

    :goto_8
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v13, :cond_f

    if-ne v4, v7, :cond_10

    :cond_f
    new-instance v4, Ld30/i;

    const/4 v13, 0x2

    invoke-direct {v4, v0, v13}, Ld30/i;-><init>(Ld30/u;I)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v13, v4

    check-cast v13, Lc93/m;

    const/4 v4, 0x0

    invoke-virtual {v15, v4}, Lp1/q;->q(Z)V

    const v4, 0x43332c31

    invoke-virtual {v15, v4}, Lp1/q;->e0(I)V

    const/4 v4, 0x4

    if-eq v3, v4, :cond_11

    const/4 v3, 0x0

    goto :goto_9

    :cond_11
    const/4 v3, 0x1

    :goto_9
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_12

    if-ne v4, v7, :cond_13

    :cond_12
    new-instance v4, Ld30/m;

    const/4 v3, 0x3

    invoke-direct {v4, v0, v3}, Ld30/m;-><init>(Ld30/u;I)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v4, Lc93/a;

    const/4 v3, 0x0

    invoke-virtual {v15, v3}, Lp1/q;->q(Z)V

    const/high16 v16, 0x8000000

    move v7, v6

    move-object v3, v8

    move-object v6, v12

    move-object v12, v14

    move-object/from16 v8, v17

    move-object v14, v4

    move-object v4, v9

    move-object v9, v5

    move-object v5, v10

    move-object/from16 v10, v18

    invoke-static/range {v3 .. v16}, Ls2/e;->d(Ljava/util/List;Lh20/l;Ld30/o0;Ld30/r0;ZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm40/w;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_a
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_14

    new-instance v4, La0;

    const/16 v5, 0x15

    invoke-direct {v4, v0, v1, v2, v5}, La0;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method public static final c0(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/String;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " must not be more than "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", currently "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x2e

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final d(Ljava/util/List;Lh20/l;Ld30/o0;Ld30/r0;ZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm40/w;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 48

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v11, p3

    move-object/from16 v6, p5

    move-object/from16 v4, p6

    move-object/from16 v12, p7

    move-object/from16 v13, p8

    move-object/from16 v14, p9

    move-object/from16 v15, p10

    move-object/from16 v7, p11

    const-string v1, "paymentMethods"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "savedPaymentMethodAction"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewMorePaymentMethods"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onManageOneSavedPaymentMethod"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onSelectSavedPaymentMethod"

    invoke-static {v12, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "imageLoader"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p12

    check-cast v8, Lp1/q;

    const v1, 0x5d505289

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p13, v1

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    const/16 v10, 0x20

    goto :goto_1

    :cond_1
    const/16 v10, 0x10

    :goto_1
    or-int/2addr v1, v10

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x100

    goto :goto_2

    :cond_2
    const/16 v10, 0x80

    :goto_2
    or-int/2addr v1, v10

    invoke-virtual {v8, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    move/from16 v16, v10

    if-eqz v16, :cond_3

    const/16 v16, 0x800

    goto :goto_3

    :cond_3
    const/16 v16, 0x400

    :goto_3
    or-int v1, v1, v16

    move/from16 v10, p4

    invoke-virtual {v8, v10}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_4

    const/16 v16, 0x4000

    goto :goto_4

    :cond_4
    const/16 v16, 0x2000

    :goto_4
    or-int v1, v1, v16

    invoke-virtual {v8, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_5

    const/high16 v16, 0x20000

    goto :goto_5

    :cond_5
    const/high16 v16, 0x10000

    :goto_5
    or-int v1, v1, v16

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_6

    const/high16 v16, 0x100000

    goto :goto_6

    :cond_6
    const/high16 v16, 0x80000

    :goto_6
    or-int v1, v1, v16

    invoke-virtual {v8, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_7

    const/high16 v16, 0x800000

    goto :goto_7

    :cond_7
    const/high16 v16, 0x400000

    :goto_7
    or-int v1, v1, v16

    invoke-virtual {v8, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/high16 v16, 0x4000000

    goto :goto_8

    :cond_8
    const/high16 v16, 0x2000000

    :goto_8
    or-int v1, v1, v16

    invoke-virtual {v8, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_9

    const/high16 v16, 0x20000000

    goto :goto_9

    :cond_9
    const/high16 v16, 0x10000000

    :goto_9
    or-int v1, v1, v16

    invoke-virtual {v8, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_a

    const/16 v16, 0x4

    goto :goto_a

    :cond_a
    const/16 v16, 0x2

    :goto_a
    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_b

    const/16 v17, 0x20

    goto :goto_b

    :cond_b
    const/16 v17, 0x10

    :goto_b
    or-int v42, v16, v17

    const v16, 0x12492493

    and-int v5, v1, v16

    const v9, 0x12492492

    if-ne v5, v9, :cond_d

    and-int/lit8 v5, v42, 0x13

    const/16 v9, 0x12

    if-ne v5, v9, :cond_d

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_c

    goto :goto_c

    :cond_c
    invoke-virtual {v8}, Lp1/q;->X()V

    goto/16 :goto_1f

    :cond_d
    :goto_c
    const v5, 0x4333b74e

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v5, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_f

    if-ne v9, v10, :cond_e

    goto :goto_d

    :cond_e
    move/from16 v43, v1

    goto :goto_12

    :cond_f
    :goto_d
    move-object v5, v0

    check-cast v5, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    move/from16 v43, v1

    const/16 v1, 0xa

    invoke-static {v5, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v9, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ld30/w;

    iget-object v5, v5, Ld30/w;->a:Ljava/lang/String;

    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_10
    if-eqz v2, :cond_11

    iget-object v5, v2, Lh20/l;->b:Ly00/o4;

    if-eqz v5, :cond_11

    iget-object v5, v5, Ly00/o4;->w:Ljava/lang/String;

    goto :goto_f

    :cond_11
    const/4 v5, 0x0

    :goto_f
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "saved_"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v9}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v2, :cond_12

    goto :goto_10

    :cond_12
    const/4 v1, 0x0

    :goto_10
    if-nez v1, :cond_13

    goto :goto_11

    :cond_13
    move-object v9, v1

    :goto_11
    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_12
    check-cast v9, Ljava/util/List;

    const/4 v1, 0x0

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    const v3, 0x4333dc88

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    and-int/lit8 v3, v42, 0x70

    const/16 v5, 0x20

    if-ne v3, v5, :cond_14

    const/4 v3, 0x1

    goto :goto_13

    :cond_14
    move v3, v1

    :goto_13
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_15

    if-ne v5, v10, :cond_16

    :cond_15
    new-instance v5, Laz1/b;

    const/16 v3, 0xd

    invoke-direct {v5, v7, v3}, Laz1/b;-><init>(Lc93/a;I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    invoke-static {v9, v5, v8}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v5, v8, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v1, v8, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v8, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-eqz v4, :cond_17

    invoke-virtual {v8, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_17
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_14
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v8, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v8, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v3, v8, Lp1/q;->S:Z

    if-nez v3, :cond_18

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_19

    :cond_18
    invoke-static {v1, v8, v1, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v8, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8}, Lg1/l3;->c(Landroidx/compose/runtime/Composer;)Lg1/h9;

    move-result-object v1

    iget-object v1, v1, Lg1/h9;->g:Ll3/v0;

    invoke-static {v8}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v2

    iget-wide v2, v2, Ld40/n;->d:J

    sget-object v4, Lh20/e1;->y:Lh20/e1;

    sget-object v5, Ld40/q;->n:Ld40/d;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, Ld40/q;->m:Ld40/e;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, v4, Lh20/e1;->w:F

    sget v5, Ld40/p;->k:F

    new-instance v9, Lh20/e1;

    invoke-direct {v9, v4, v5}, Lh20/e1;-><init>(FF)V

    const v4, 0x3958ece5

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    if-eqz p1, :cond_22

    const v4, 0x7f1410ca

    invoke-static {v8, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v16

    const-string v4, "TEST_TAG_SAVED_TEXT"

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    const/16 v39, 0x0

    const v40, 0xfff8

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v38, 0x30

    move-object/from16 v36, v1

    move-wide/from16 v18, v2

    move-object/from16 v37, v8

    invoke-static/range {v16 .. v40}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    const/16 v1, 0x10

    int-to-float v1, v1

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v8, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v2, 0x39591d38

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    and-int/lit8 v2, v42, 0xe

    const/4 v3, 0x4

    if-ne v2, v3, :cond_1a

    const/4 v2, 0x1

    goto :goto_15

    :cond_1a
    const/4 v2, 0x0

    :goto_15
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1b

    if-ne v3, v10, :cond_1c

    :cond_1b
    new-instance v3, Ld30/d1;

    const/4 v2, 0x0

    invoke-direct {v3, v2, v15}, Ld30/d1;-><init>(ILc93/m;)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    move-object v2, v5

    invoke-static {v2, v3}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    if-eqz v11, :cond_1e

    invoke-interface {v11}, Ld30/r0;->a()Z

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1d

    move/from16 v44, v4

    goto :goto_17

    :cond_1d
    :goto_16
    const/16 v44, 0x0

    goto :goto_17

    :cond_1e
    const/4 v4, 0x1

    goto :goto_16

    :goto_17
    new-instance v3, Lh20/g1;

    invoke-direct {v3, v9}, Lh20/g1;-><init>(Lh20/f1;)V

    const v4, 0x39594442

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    const/high16 v4, 0x1c00000

    and-int v4, v43, v4

    const/high16 v5, 0x800000

    if-ne v4, v5, :cond_1f

    const/4 v4, 0x1

    :goto_18
    move-object/from16 v5, p1

    goto :goto_19

    :cond_1f
    const/4 v4, 0x0

    goto :goto_18

    :goto_19
    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    or-int v4, v4, v20

    move/from16 v20, v1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v4, :cond_20

    if-ne v1, v10, :cond_21

    :cond_20
    new-instance v1, Ld30/a1;

    const/4 v4, 0x0

    invoke-direct {v1, v12, v5, v4}, Ld30/a1;-><init>(Lkotlin/jvm/functions/Function1;Lh20/l;I)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    move-object/from16 v21, v1

    check-cast v21, Lc93/a;

    const/4 v1, 0x0

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    move/from16 v17, v1

    new-instance v1, Ld30/e1;

    const/4 v6, 0x0

    move-object/from16 v4, p6

    move-object/from16 v46, v2

    move-object/from16 v17, v3

    move-object/from16 p12, v10

    move/from16 v45, v20

    move/from16 v10, v43

    move-object/from16 v2, p2

    move-object/from16 v3, p5

    invoke-direct/range {v1 .. v6}, Ld30/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v2, -0x460084fb

    invoke-static {v2, v8, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    shr-int/lit8 v2, v10, 0x3

    and-int/lit8 v2, v2, 0xe

    const/high16 v3, 0x180000

    or-int/2addr v2, v3

    shr-int/lit8 v3, v10, 0x9

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    const/4 v10, 0x0

    move-object/from16 v47, p12

    move-object v7, v1

    move-object/from16 v41, v9

    move-object/from16 v4, v16

    move-object/from16 v5, v17

    move-object/from16 v6, v21

    move/from16 v12, v43

    move/from16 v3, v44

    const/16 v13, 0x800

    move-object/from16 v1, p1

    move v9, v2

    move/from16 v2, p4

    invoke-static/range {v1 .. v10}, Lse/a;->n(Lh20/l;ZZLandroidx/compose/ui/Modifier;Lh20/g1;Lc93/a;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/16 v1, 0x18

    int-to-float v1, v1

    move-object/from16 v2, v46

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v1, 0x7f14108b

    invoke-static {v8, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v16

    const/16 v39, 0x0

    const v40, 0xfffa

    const/16 v17, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v38, 0x0

    move-object/from16 v37, v8

    invoke-static/range {v16 .. v40}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move/from16 v1, v45

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    :goto_1a
    const/4 v5, 0x0

    goto :goto_1b

    :cond_22
    move-object/from16 v41, v9

    move-object/from16 v47, v10

    move/from16 v12, v43

    const/16 v13, 0x800

    goto :goto_1a

    :goto_1b
    invoke-virtual {v8, v5}, Lp1/q;->q(Z)V

    const v1, 0x3959a7b3

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    and-int/lit16 v1, v12, 0x1c00

    if-eq v1, v13, :cond_23

    move v1, v5

    goto :goto_1c

    :cond_23
    const/4 v1, 0x1

    :goto_1c
    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_24

    move-object/from16 v1, v47

    if-ne v2, v1, :cond_27

    :cond_24
    instance-of v1, v11, Ld30/p0;

    const/4 v2, -0x1

    if-eqz v1, :cond_26

    move-object v1, v11

    check-cast v1, Ld30/p0;

    iget-object v1, v1, Ld30/p0;->a:Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v4, v5

    :goto_1d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_26

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ld30/w;

    iget-object v6, v6, Ld30/w;->b:Ljava/lang/String;

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_25

    move v2, v4

    goto :goto_1e

    :cond_25
    add-int/lit8 v4, v4, 0x1

    goto :goto_1d

    :cond_26
    :goto_1e
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v8, v5}, Lp1/q;->q(Z)V

    and-int/lit8 v2, v12, 0xe

    shr-int/lit8 v3, v12, 0x6

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v2, v3

    or-int/lit16 v2, v2, 0x1000

    shr-int/lit8 v3, v12, 0xf

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v2, v3

    const/high16 v3, 0x70000

    shl-int/lit8 v4, v42, 0xf

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    const/4 v4, 0x0

    move-object/from16 v3, p8

    move-object v7, v8

    move-object v5, v15

    move-object/from16 v6, v41

    move v8, v2

    move/from16 v2, p4

    invoke-static/range {v0 .. v8}, Lio/sentry/config/a;->h(Ljava/util/List;IZLm40/w;Landroidx/compose/ui/Modifier;Lc93/m;Lh20/f1;Landroidx/compose/runtime/Composer;I)V

    move-object v8, v7

    const/4 v4, 0x1

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    :goto_1f
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v15

    if-eqz v15, :cond_28

    new-instance v0, Ld30/b1;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v12, p11

    move/from16 v13, p13

    move-object v4, v11

    move-object v10, v14

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v13}, Ld30/b1;-><init>(Ljava/util/List;Lh20/l;Ld30/o0;Ld30/r0;ZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lm40/w;Landroidx/compose/ui/Modifier;Lc93/m;Lc93/a;I)V

    iput-object v0, v15, Lp1/v1;->d:Lc93/m;

    :cond_28
    return-void
.end method

.method public static final d0(Ljava/util/Map;)Ljava/util/LinkedHashMap;
    .locals 3

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    move v0, v1

    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public static final e(Lh20/l;Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    const-string v0, "paymentMethod"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, Lh20/l;->b:Ly00/o4;

    const-string v5, "onConfirmListener"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onDismissListener"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v5, 0x46fa8f63

    invoke-virtual {v10, v5}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x2

    const/4 v7, 0x4

    if-eqz v5, :cond_0

    move v5, v7

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    or-int v5, p5, v5

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/16 v8, 0x20

    goto :goto_1

    :cond_1
    const/16 v8, 0x10

    :goto_1
    or-int/2addr v5, v8

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x100

    goto :goto_2

    :cond_2
    const/16 v8, 0x80

    :goto_2
    or-int/2addr v5, v8

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x800

    goto :goto_3

    :cond_3
    const/16 v8, 0x400

    :goto_3
    or-int/2addr v5, v8

    and-int/lit16 v8, v5, 0x493

    const/16 v9, 0x492

    if-ne v8, v9, :cond_5

    invoke-virtual {v10}, Lp1/q;->F()Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v10}, Lp1/q;->X()V

    goto/16 :goto_f

    :cond_5
    :goto_4
    iget-object v8, v0, Ly00/o4;->E:Ly00/f4;

    iget-object v9, v0, Ly00/o4;->R:Ly00/s2;

    if-nez v8, :cond_6

    const/4 v8, -0x1

    goto :goto_5

    :cond_6
    sget-object v12, Lb30/q4;->a:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v12, v8

    :goto_5
    sget-object v12, Lm83/y;->w:Lm83/y;

    const/4 v13, 0x3

    const/4 v14, 0x1

    const-string v15, ""

    const v11, 0x7f1410be

    if-eq v8, v14, :cond_c

    if-eq v8, v6, :cond_8

    if-eq v8, v13, :cond_7

    if-eq v8, v7, :cond_7

    const/4 v8, 0x0

    new-array v11, v8, [Ljava/lang/Object;

    new-instance v7, Lzy/d;

    invoke-static {v11}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    invoke-direct {v7, v15, v11}, Lzy/d;-><init>(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_6

    :cond_7
    const/4 v8, 0x0

    new-array v7, v8, [Ljava/lang/Object;

    invoke-static {v11, v7, v12}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v7

    goto :goto_6

    :cond_8
    const/4 v8, 0x0

    instance-of v7, v9, Ly00/q2;

    if-eqz v7, :cond_9

    new-array v7, v8, [Ljava/lang/Object;

    invoke-static {v11, v7, v12}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v7

    goto :goto_6

    :cond_9
    instance-of v7, v9, Ly00/r2;

    if-eqz v7, :cond_a

    new-array v7, v8, [Ljava/lang/Object;

    const v11, 0x7f1410c1

    invoke-static {v11, v7, v12}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v7

    goto :goto_6

    :cond_a
    if-nez v9, :cond_b

    new-array v7, v8, [Ljava/lang/Object;

    new-instance v11, Lzy/d;

    invoke-static {v7}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-direct {v11, v15, v7}, Lzy/d;-><init>(Ljava/lang/String;Ljava/util/List;)V

    move-object v7, v11

    goto :goto_6

    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_c
    const/4 v8, 0x0

    invoke-virtual {v0}, Ly00/o4;->f()Z

    move-result v7

    if-eqz v7, :cond_d

    new-array v7, v8, [Ljava/lang/Object;

    invoke-static {v11, v7, v12}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v7

    goto :goto_6

    :cond_d
    new-array v7, v8, [Ljava/lang/Object;

    const v11, 0x7f1410c1

    invoke-static {v11, v7, v12}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v7

    :goto_6
    invoke-static {v7, v10}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v7

    const v8, 0x479bd92c

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    if-nez v2, :cond_1b

    iget-object v8, v0, Ly00/o4;->E:Ly00/f4;

    if-nez v8, :cond_e

    const/4 v11, -0x1

    goto :goto_7

    :cond_e
    sget-object v11, Lb30/q4;->a:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v11, v11, v8

    :goto_7
    const v8, 0x7f140fbf

    if-eq v11, v14, :cond_17

    if-eq v11, v6, :cond_13

    if-eq v11, v13, :cond_11

    const/4 v6, 0x4

    if-eq v11, v6, :cond_f

    const/4 v6, 0x0

    new-array v0, v6, [Ljava/lang/Object;

    new-instance v6, Lzy/d;

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v6, v15, v0}, Lzy/d;-><init>(Ljava/lang/String;Ljava/util/List;)V

    goto/16 :goto_c

    :cond_f
    iget-object v0, v0, Ly00/o4;->Q:Ly00/l4;

    if-eqz v0, :cond_10

    iget-object v0, v0, Ly00/l4;->E:Ljava/lang/String;

    goto :goto_8

    :cond_10
    const/4 v0, 0x0

    :goto_8
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8, v0, v12}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v6

    goto/16 :goto_c

    :cond_11
    iget-object v0, v0, Ly00/o4;->L:Ly00/e4;

    if-eqz v0, :cond_12

    iget-object v0, v0, Ly00/e4;->E:Ljava/lang/String;

    goto :goto_9

    :cond_12
    const/4 v0, 0x0

    :goto_9
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8, v0, v12}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v6

    goto/16 :goto_c

    :cond_13
    instance-of v0, v9, Ly00/q2;

    if-eqz v0, :cond_14

    check-cast v9, Ly00/q2;

    iget-object v0, v9, Ly00/q2;->x:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8, v0, v12}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v6

    goto :goto_c

    :cond_14
    instance-of v0, v9, Ly00/r2;

    if-eqz v0, :cond_15

    invoke-virtual {v1}, Lh20/l;->a()Ljava/lang/String;

    move-result-object v0

    check-cast v9, Ly00/r2;

    iget-object v6, v9, Ly00/r2;->z:Ljava/lang/String;

    filled-new-array {v0, v6}, [Ljava/lang/Object;

    move-result-object v0

    const v6, 0x7f140fe1

    invoke-static {v6, v0, v12}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v6

    goto :goto_c

    :cond_15
    if-nez v9, :cond_16

    const/4 v6, 0x0

    new-array v0, v6, [Ljava/lang/Object;

    new-instance v6, Lzy/d;

    invoke-static {v0}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v6, v15, v0}, Lzy/d;-><init>(Ljava/lang/String;Ljava/util/List;)V

    goto :goto_c

    :cond_16
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_17
    invoke-virtual {v0}, Ly00/o4;->f()Z

    move-result v6

    if-eqz v6, :cond_19

    if-eqz v9, :cond_18

    invoke-interface {v9}, Ly00/s2;->getLast4()Ljava/lang/String;

    move-result-object v0

    goto :goto_a

    :cond_18
    const/4 v0, 0x0

    :goto_a
    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8, v0, v12}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v6

    goto :goto_c

    :cond_19
    invoke-virtual {v1}, Lh20/l;->a()Ljava/lang/String;

    move-result-object v6

    iget-object v0, v0, Ly00/o4;->H:Ly00/z3;

    if-eqz v0, :cond_1a

    iget-object v8, v0, Ly00/z3;->H:Ljava/lang/String;

    goto :goto_b

    :cond_1a
    const/4 v8, 0x0

    :goto_b
    filled-new-array {v6, v8}, [Ljava/lang/Object;

    move-result-object v0

    const v6, 0x7f140fe1

    invoke-static {v6, v0, v12}, Ls4/i;->s(I[Ljava/lang/Object;Ljava/util/List;)Lzy/b;

    move-result-object v6

    :goto_c
    invoke-static {v6, v10}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v0

    :goto_d
    const/4 v6, 0x0

    goto :goto_e

    :cond_1b
    move-object v0, v2

    goto :goto_d

    :goto_e
    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    const v6, 0x7f1410db

    invoke-static {v10, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    const v8, 0x7f140fd2

    invoke-static {v10, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    shl-int/lit8 v5, v5, 0x9

    const/high16 v9, 0x70000

    and-int/2addr v9, v5

    or-int/lit16 v9, v9, 0x6000

    const/high16 v11, 0x380000

    and-int/2addr v5, v11

    or-int v11, v9, v5

    move-object v3, v7

    const/4 v7, 0x1

    move-object v9, v4

    move-object v5, v6

    move-object v6, v8

    move-object/from16 v8, p2

    move-object v4, v0

    invoke-static/range {v3 .. v11}, Ls30/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_f
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1c

    new-instance v0, Lat2/u;

    const/4 v6, 0x2

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lat2/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method public static e0(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V
    .locals 3

    sget-object v0, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p0}, Landroid/view/View;->hasOnClickListeners()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    if-nez v0, :cond_1

    if-eqz p1, :cond_2

    :cond_1
    move v1, v2

    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {p0, v0}, Lcom/google/android/material/internal/CheckableImageButton;->setPressable(Z)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setLongClickable(Z)V

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x2

    :goto_1
    invoke-virtual {p0, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    return-void
.end method

.method public static final f(ZLd30/o0;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    const-string v0, "savedPaymentMethodAction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewMorePaymentMethods"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onManageOneSavedPaymentMethod"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p4, Lp1/q;

    const v0, -0x612d9c59

    invoke-virtual {p4, v0}, Lp1/q;->g0(I)Lp1/q;

    or-int/lit8 v0, p5, 0x6

    invoke-virtual {p4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    goto :goto_0

    :cond_0
    const/16 v1, 0x10

    :goto_0
    or-int/2addr v0, v1

    invoke-virtual {p4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x100

    goto :goto_1

    :cond_1
    const/16 v1, 0x80

    :goto_1
    or-int/2addr v0, v1

    invoke-virtual {p4, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x800

    goto :goto_2

    :cond_2
    const/16 v1, 0x400

    :goto_2
    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x493

    const/16 v2, 0x492

    if-ne v1, v2, :cond_4

    invoke-virtual {p4}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p4}, Lp1/q;->X()V

    move v4, p0

    goto :goto_5

    :cond_4
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p0, :cond_7

    if-eq p0, v2, :cond_6

    const/4 v3, 0x2

    if-ne p0, v3, :cond_5

    const p0, 0x475e978c

    invoke-virtual {p4, p0}, Lp1/q;->e0(I)V

    shr-int/lit8 p0, v0, 0x3

    and-int/lit8 p0, p0, 0x70

    const/4 v0, 0x6

    or-int/2addr p0, v0

    invoke-static {p2, p4, p0}, Ls2/e;->i(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p4, v1}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_5
    const p0, -0x5f4dcd8

    invoke-static {p0, p4, v1}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_6
    const p0, 0x475c1bed

    invoke-virtual {p4, p0}, Lp1/q;->e0(I)V

    shr-int/lit8 p0, v0, 0x9

    and-int/lit8 p0, p0, 0xe

    invoke-static {p3, p4, p0}, Ls2/e;->a(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p4, v1}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    const p0, -0x5f4d0d2

    invoke-virtual {p4, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p4, v1}, Lp1/q;->q(Z)V

    :goto_4
    move v4, v2

    :goto_5
    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_8

    new-instance v3, Lay/a0;

    const/4 v9, 0x2

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move v8, p5

    invoke-direct/range {v3 .. v9}, Lay/a0;-><init>(ZLjava/lang/Object;Lc93/a;Ljava/lang/Object;II)V

    iput-object v3, p0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final f0(Lcom/stripe/android/model/DisplayablePaymentDetails;Z)Lq00/o;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/model/DisplayablePaymentDetails;->getLast4()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/model/DisplayablePaymentDetails;->getDefaultPaymentType()Ljava/lang/String;

    move-result-object p1

    const-string v1, "CARD"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object p1, Ly00/i;->M:Lt9/c0;

    invoke-virtual {p0}, Lcom/stripe/android/model/DisplayablePaymentDetails;->getDefaultCardBrand()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lt9/c0;->i(Ljava/lang/String;)Ly00/i;

    move-result-object p1

    invoke-static {p1}, Ldp/d;->D(Ly00/i;)I

    move-result p1

    new-instance v1, Lq00/m;

    invoke-direct {v1, p1}, Lq00/m;-><init>(I)V

    goto :goto_0

    :cond_2
    const-string v1, "BANK_ACCOUNT"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    new-instance v1, Lq00/l;

    invoke-direct {v1, v0}, Lq00/l;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_4

    :goto_1
    return-object v0

    :cond_4
    new-instance p1, Lq00/o;

    invoke-virtual {p0}, Lcom/stripe/android/model/DisplayablePaymentDetails;->getLast4()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-direct {p1, v1, p0}, Lq00/o;-><init>(Lq00/n;Ljava/lang/String;)V

    return-object p1

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Required value was null."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final g(ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;II)V
    .locals 11

    move/from16 v8, p6

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p5

    check-cast v6, Lp1/q;

    const v0, 0x378c841f

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v3, v8, 0x30

    if-nez v3, :cond_4

    and-int/lit8 v3, v8, 0x40

    if-nez v3, :cond_2

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_2

    :cond_2
    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v0, v3

    :cond_4
    and-int/lit8 v3, p7, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v0, v0, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v5, v8, 0x180

    if-nez v5, :cond_7

    invoke-virtual {v6, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_4

    :cond_6
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :cond_7
    :goto_5
    and-int/lit16 v7, v8, 0xc00

    if-nez v7, :cond_9

    invoke-virtual {v6, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x800

    goto :goto_6

    :cond_8
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v0, v7

    :cond_9
    and-int/lit16 v7, v8, 0x6000

    if-nez v7, :cond_b

    move-object v7, p4

    invoke-virtual {v6, p4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x4000

    goto :goto_7

    :cond_a
    const/16 v9, 0x2000

    :goto_7
    or-int/2addr v0, v9

    goto :goto_8

    :cond_b
    move-object v7, p4

    :goto_8
    and-int/lit16 v9, v0, 0x2493

    const/16 v10, 0x2492

    if-ne v9, v10, :cond_d

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v9

    if-nez v9, :cond_c

    goto :goto_9

    :cond_c
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v3, p2

    goto :goto_c

    :cond_d
    :goto_9
    if-eqz v3, :cond_e

    sget-object v3, Lb2/t;->w:Lb2/t;

    goto :goto_a

    :cond_e
    move-object v3, p2

    :goto_a
    invoke-interface {p1}, Lg40/y2;->a()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v5

    invoke-interface {p3, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    invoke-interface {p1}, Lg40/y2;->i()Lg40/z2;

    move-result-object v5

    instance-of v9, v5, Lg40/x2;

    if-eqz v9, :cond_f

    check-cast v5, Lg40/x2;

    goto :goto_b

    :cond_f
    const/4 v5, 0x0

    :goto_b
    if-nez v5, :cond_10

    goto :goto_c

    :cond_10
    const v9, 0xfffe

    and-int/2addr v0, v9

    move-object v1, v7

    move v7, v0

    move-object v0, v5

    move-object v5, v1

    move v1, p0

    move-object v2, p1

    move-object v4, p3

    invoke-interface/range {v0 .. v7}, Lg40/x2;->i(ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V

    :cond_11
    :goto_c
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_12

    new-instance v0, Lbf0/g;

    const/16 v8, 0xc

    move v1, p0

    move-object v2, p1

    move-object v4, p3

    move-object v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static g0([B)[B
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    aget-byte v2, p0, v1

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    array-length v2, p0

    const/4 v3, 0x1

    if-ne v1, v2, :cond_1

    array-length v1, p0

    sub-int/2addr v1, v3

    :cond_1
    aget-byte v2, p0, v1

    const/16 v4, 0x80

    and-int/2addr v2, v4

    if-ne v2, v4, :cond_2

    move v0, v3

    :cond_2
    array-length v2, p0

    sub-int/2addr v2, v1

    add-int/2addr v2, v0

    new-array v2, v2, [B

    array-length v3, p0

    sub-int/2addr v3, v1

    invoke-static {p0, v1, v2, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method

.method public static final h(Lp00/o;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v2, p0

    move/from16 v8, p2

    const-string v0, "viewModel"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p1

    check-cast v9, Lp1/q;

    const v0, -0x277a4a0d

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v8

    and-int/lit8 v0, v0, 0x3

    if-ne v0, v1, :cond_2

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object/from16 v17, v9

    goto/16 :goto_2

    :cond_2
    :goto_1
    iget-object v0, v2, Lp00/o;->M:Lec3/h2;

    const/4 v10, 0x0

    invoke-static {v0, v9, v10}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lp00/q;

    iget-object v12, v2, Lp00/o;->N:Lg40/o1;

    const v0, 0x46c234d2

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_3

    if-ne v1, v13, :cond_4

    :cond_3
    new-instance v0, Lp00/j;

    const/4 v6, 0x0

    const/4 v7, 0x5

    const/4 v1, 0x0

    const-class v3, Lp00/o;

    const-string v4, "onBack"

    const-string v5, "onBack()V"

    invoke-direct/range {v0 .. v7}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_4
    move-object v14, v1

    check-cast v14, Lj93/g;

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    const v0, 0x46c23ae6

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_5

    if-ne v1, v13, :cond_6

    :cond_5
    new-instance v0, Lp00/j;

    const/4 v6, 0x0

    const/4 v7, 0x6

    const/4 v1, 0x0

    const-class v3, Lp00/o;

    const-string v4, "onChangeEmailButtonClicked"

    const-string v5, "onChangeEmailButtonClicked()V"

    invoke-direct/range {v0 .. v7}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_6
    move-object v15, v1

    check-cast v15, Lj93/g;

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    const v0, 0x46c24336

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_7

    if-ne v1, v13, :cond_8

    :cond_7
    new-instance v0, Lp00/j;

    const/4 v6, 0x0

    const/4 v7, 0x7

    const/4 v1, 0x0

    const-class v3, Lp00/o;

    const-string v4, "resendCode"

    const-string v5, "resendCode()V"

    invoke-direct/range {v0 .. v7}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_8
    move-object/from16 v16, v1

    check-cast v16, Lj93/g;

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    const v0, 0x46c2497c

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_9

    if-ne v1, v13, :cond_a

    :cond_9
    new-instance v0, Lp00/j;

    const/4 v6, 0x0

    const/16 v7, 0x8

    const/4 v1, 0x0

    const-class v3, Lp00/o;

    const-string v4, "onFocusRequested"

    const-string v5, "onFocusRequested()V"

    invoke-direct/range {v0 .. v7}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_a
    move-object/from16 v17, v1

    check-cast v17, Lj93/g;

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    const v0, 0x46c251e7

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_b

    if-ne v1, v13, :cond_c

    :cond_b
    new-instance v0, Lp00/j;

    const/4 v6, 0x0

    const/16 v7, 0x9

    const/4 v1, 0x0

    const-class v3, Lp00/o;

    const-string v4, "didShowCodeSentNotification"

    const-string v5, "didShowCodeSentNotification()V"

    invoke-direct/range {v0 .. v7}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_c
    move-object/from16 v18, v1

    check-cast v18, Lj93/g;

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    const v0, 0x46c259fa

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_d

    if-ne v1, v13, :cond_e

    :cond_d
    new-instance v0, Lp00/j;

    const/4 v6, 0x0

    const/16 v7, 0xa

    const/4 v1, 0x0

    const-class v3, Lp00/o;

    const-string v4, "onConsentShown"

    const-string v5, "onConsentShown()V"

    invoke-direct/range {v0 .. v7}, Lp00/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_e
    check-cast v1, Lj93/g;

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    check-cast v14, Lc93/a;

    check-cast v17, Lc93/a;

    move-object/from16 v13, v18

    check-cast v13, Lc93/a;

    check-cast v15, Lc93/a;

    check-cast v16, Lc93/a;

    check-cast v1, Lc93/a;

    const/16 v18, 0x40

    move-object v10, v12

    move-object/from16 v12, v17

    move-object/from16 v17, v9

    move-object v9, v11

    move-object v11, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v1

    invoke-static/range {v9 .. v18}, Lp00/h;->f(Lp00/q;Lg40/o1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    :goto_2
    invoke-virtual/range {v17 .. v17}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v1, Loe2/c;

    const/16 v3, 0xc

    invoke-direct {v1, v2, v8, v3}, Loe2/c;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static final h0(II)J
    .locals 6

    int-to-long v0, p0

    const/16 v2, 0xc

    int-to-long v2, v2

    mul-long/2addr v0, v2

    int-to-long v4, p1

    add-long/2addr v0, v4

    div-long v2, v0, v2

    const-wide/32 v4, -0x80000000

    cmp-long v4, v4, v2

    if-gtz v4, :cond_0

    const-wide/32 v4, 0x7fffffff

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    return-wide v0

    :cond_0
    const-string v0, " years and "

    const-string v1, " months overflows an Int"

    const-string v2, "The total number of years in "

    invoke-static {p0, p1, v2, v0, v1}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final i(Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, 0x66dcb8a2

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x1

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v7, v3}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v5

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v6, p2, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :cond_3
    and-int/lit8 v2, v2, 0x13

    const/16 v6, 0x12

    if-ne v2, v6, :cond_5

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v7}, Lp1/q;->X()V

    goto/16 :goto_5

    :cond_5
    :goto_3
    sget-object v2, Lb2/e;->K:Lb2/l;

    const-string v6, "TEST_TAG_VIEW_MORE"

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v9, 0x7

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static {v6, v10, v11, v0, v9}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v4, v4

    const/4 v9, 0x0

    invoke-static {v6, v9, v4, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v9, 0x3

    invoke-static {v6, v11, v9}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v9, Ll0/m;->a:Ll0/e;

    const/16 v11, 0x30

    invoke-static {v9, v2, v7, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v11, v7, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v7, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v13, v7, Lp1/q;->S:Z

    if-eqz v13, :cond_6

    invoke-virtual {v7, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v7, v12, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v7, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-nez v11, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    :cond_7
    invoke-static {v9, v7, v9, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x7f14110d

    invoke-static {v7, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v6, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v7, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg1/c1;

    invoke-virtual {v9}, Lg1/c1;->f()J

    move-result-wide v11

    sget-object v9, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v7, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg1/h9;

    iget-object v9, v9, Lg1/h9;->g:Ll3/v0;

    move-object/from16 v22, v9

    sget-object v9, Lp3/r;->G:Lp3/r;

    const/16 v25, 0x0

    const v26, 0xffda

    move v13, v3

    const/4 v3, 0x0

    move-object v14, v6

    move-object/from16 v23, v7

    const-wide/16 v6, 0x0

    move-object v15, v8

    const/4 v8, 0x0

    move/from16 v16, v10

    const/4 v10, 0x0

    move/from16 v17, v4

    move/from16 v18, v5

    move-wide v4, v11

    const-wide/16 v11, 0x0

    move/from16 v19, v13

    const/4 v13, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    move-object/from16 v24, v15

    move/from16 v21, v16

    const-wide/16 v15, 0x0

    move/from16 v27, v17

    const/16 v17, 0x0

    move/from16 v28, v18

    const/16 v18, 0x0

    move/from16 v29, v19

    const/16 v19, 0x0

    move-object/from16 v30, v20

    const/16 v20, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move-object/from16 v32, v24

    const/high16 v24, 0x30000

    move-object/from16 v0, v30

    move/from16 v1, v31

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v23

    const v2, -0x2db1c431

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    const v2, 0x7f0807c3

    invoke-static {v2, v7, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v2

    invoke-virtual {v7, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->f()J

    move-result-wide v5

    const/4 v0, 0x2

    int-to-float v10, v0

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v11, 0x0

    move/from16 v9, v27

    move-object/from16 v8, v32

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v8, 0x1b0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    const/4 v13, 0x1

    invoke-virtual {v7, v13}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_9

    new-instance v1, Lch0/t;

    const/4 v2, 0x2

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v4, v2, v3}, Lch0/t;-><init>(IILc93/a;)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method public static final j(Ljava/util/Collection;)Z
    .locals 3

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv00/m;

    instance-of v2, v0, Lv00/k;

    if-eqz v2, :cond_1

    check-cast v0, Lv00/k;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, Lv00/k;->w:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    :cond_2
    if-eqz v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_3
    return v1
.end method

.method public static j0(Ly00/c8;Ly00/o4;)V
    .locals 7

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Ly00/o4;->w:Ljava/lang/String;

    invoke-interface {p0}, Ly00/c8;->K()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    invoke-interface {p0}, Ly00/c8;->Y()Ly00/o4;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, v1, Ly00/o4;->w:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :cond_1
    :goto_0
    const/4 v3, 0x1

    if-eqz v1, :cond_1a

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1a

    invoke-interface {p0}, Ly00/c8;->Y()Ly00/o4;

    move-result-object p0

    const/4 v4, 0x0

    if-eqz p0, :cond_4

    iget-object v5, p1, Ly00/o4;->E:Ly00/f4;

    iget-object v6, p0, Ly00/o4;->E:Ly00/f4;

    if-eq v5, v6, :cond_2

    goto :goto_2

    :cond_2
    if-nez v5, :cond_3

    const/4 v5, -0x1

    goto :goto_1

    :cond_3
    sget-object v6, Lh20/j;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    :goto_1
    if-eq v5, v3, :cond_15

    const/4 v6, 0x2

    if-eq v5, v6, :cond_11

    const/4 v6, 0x3

    if-eq v5, v6, :cond_d

    const/4 v6, 0x4

    if-eq v5, v6, :cond_9

    const/4 v6, 0x5

    if-eq v5, v6, :cond_5

    :cond_4
    :goto_2
    move p0, v4

    goto/16 :goto_8

    :cond_5
    iget-object p1, p1, Ly00/o4;->L:Ly00/e4;

    if-eqz p1, :cond_6

    iget-object p1, p1, Ly00/e4;->z:Ljava/lang/String;

    goto :goto_3

    :cond_6
    move-object p1, v2

    :goto_3
    iget-object p0, p0, Ly00/o4;->L:Ly00/e4;

    if-eqz p0, :cond_7

    iget-object v2, p0, Ly00/e4;->z:Ljava/lang/String;

    :cond_7
    if-eqz p1, :cond_4

    if-nez v2, :cond_8

    goto :goto_2

    :cond_8
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    goto/16 :goto_8

    :cond_9
    iget-object p1, p1, Ly00/o4;->N:Ly00/t3;

    if-eqz p1, :cond_a

    iget-object p1, p1, Ly00/t3;->w:Ljava/lang/String;

    goto :goto_4

    :cond_a
    move-object p1, v2

    :goto_4
    iget-object p0, p0, Ly00/o4;->N:Ly00/t3;

    if-eqz p0, :cond_b

    iget-object v2, p0, Ly00/t3;->w:Ljava/lang/String;

    :cond_b
    if-eqz p1, :cond_4

    if-nez v2, :cond_c

    goto :goto_2

    :cond_c
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    goto :goto_8

    :cond_d
    iget-object p1, p1, Ly00/o4;->M:Ly00/s3;

    if-eqz p1, :cond_e

    iget-object p1, p1, Ly00/s3;->x:Ljava/lang/String;

    goto :goto_5

    :cond_e
    move-object p1, v2

    :goto_5
    iget-object p0, p0, Ly00/o4;->M:Ly00/s3;

    if-eqz p0, :cond_f

    iget-object v2, p0, Ly00/s3;->x:Ljava/lang/String;

    :cond_f
    if-eqz p1, :cond_4

    if-nez v2, :cond_10

    goto :goto_2

    :cond_10
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    goto :goto_8

    :cond_11
    iget-object p1, p1, Ly00/o4;->Q:Ly00/l4;

    if-eqz p1, :cond_12

    iget-object p1, p1, Ly00/l4;->z:Ljava/lang/String;

    goto :goto_6

    :cond_12
    move-object p1, v2

    :goto_6
    iget-object p0, p0, Ly00/o4;->Q:Ly00/l4;

    if-eqz p0, :cond_13

    iget-object v2, p0, Ly00/l4;->z:Ljava/lang/String;

    :cond_13
    if-eqz p1, :cond_4

    if-nez v2, :cond_14

    goto :goto_2

    :cond_14
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    goto :goto_8

    :cond_15
    iget-object p1, p1, Ly00/o4;->H:Ly00/z3;

    if-eqz p1, :cond_16

    iget-object p1, p1, Ly00/z3;->F:Ljava/lang/String;

    goto :goto_7

    :cond_16
    move-object p1, v2

    :goto_7
    iget-object p0, p0, Ly00/o4;->H:Ly00/z3;

    if-eqz p0, :cond_17

    iget-object v2, p0, Ly00/z3;->F:Ljava/lang/String;

    :cond_17
    if-eqz p1, :cond_4

    if-nez v2, :cond_18

    goto :goto_2

    :cond_18
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    :goto_8
    if-eqz p0, :cond_19

    goto :goto_9

    :cond_19
    move v3, v4

    :cond_1a
    :goto_9
    if-eqz v3, :cond_1b

    return-void

    :cond_1b
    const-string p0, ") attached to the intent does not match the provided payment method ("

    const-string p1, ")!"

    const-string v2, "Your payment method ("

    invoke-static {v2, v1, p0, v0, p1}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final k(Ln83/f;Ljava/lang/String;Ljava/util/List;)V
    .locals 7

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lv00/l;

    move-object v1, p2

    check-cast v1, Ljava/lang/Iterable;

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const-string v2, ","

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Lv00/l;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    return-void
.end method

.method public static final l(Ljava/lang/Throwable;)V
    .locals 1

    :try_start_0
    invoke-static {p0, p0}, Lio/ktor/utils/io/x;->b(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    move-object p0, v0

    :goto_1
    throw p0
.end method

.method public static m(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V
    .locals 5

    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object p0

    invoke-virtual {p1}, Landroid/view/View;->getDrawableState()[I

    move-result-object v1

    array-length v2, p0

    array-length v3, p0

    array-length v4, v1

    add-int/2addr v3, v4

    invoke-static {p0, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p0

    const/4 v3, 0x0

    array-length v4, v1

    invoke-static {v1, v3, p0, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    invoke-virtual {p2, p0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p0

    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p2}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    :goto_0
    if-eqz p3, :cond_1

    invoke-virtual {v0, p3}, Landroid/graphics/drawable/Drawable;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_1
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-eq p0, v0, :cond_2

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    return-void
.end method

.method public static final n(Lec3/h2;)Lhm/d;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhm/d;

    const/16 v1, 0x19

    invoke-direct {v0, p0, v1}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static final o(Lhm/d;JLcu2/l;Ls83/c;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p4, Ljy/b;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Ljy/b;

    iget v1, v0, Ljy/b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ljy/b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Ljy/b;

    invoke-direct {v0, p4}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p4, v0, Ljy/b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ljy/b;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p3, v0, Ljy/b;->w:Lcu2/l;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p4, La20/b;

    const/4 v2, 0x0

    const/16 v4, 0x1d

    invoke-direct {p4, p0, v2, v4}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p3, v0, Ljy/b;->w:Lcu2/l;

    iput v3, v0, Ljy/b;->y:I

    invoke-static {p1, p2, p4, v0}, Lbc3/k2;->e(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    if-eqz p4, :cond_4

    return-object p4

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    return-object p0
.end method

.method public static p(JJJLandroidx/compose/runtime/Composer;II)Lg1/v1;
    .locals 2

    and-int/lit8 p7, p8, 0x1

    if-eqz p7, :cond_0

    sget-object p0, Lg1/d1;->a:Lp1/u2;

    move-object p1, p6

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg1/c1;

    invoke-virtual {p0}, Lg1/c1;->g()J

    move-result-wide p0

    :cond_0
    and-int/lit8 p7, p8, 0x2

    if-eqz p7, :cond_1

    sget-object p2, Lg1/d1;->a:Lp1/u2;

    move-object p3, p6

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg1/c1;

    invoke-virtual {p2}, Lg1/c1;->e()J

    move-result-wide p2

    const p7, 0x3f19999a    # 0.6f

    invoke-static {p7, p2, p3}, Li2/x;->c(FJ)J

    move-result-wide p2

    :cond_1
    and-int/lit8 p7, p8, 0x4

    if-eqz p7, :cond_3

    sget-object p4, Lg1/d1;->a:Lp1/u2;

    move-object p5, p6

    check-cast p5, Lp1/q;

    invoke-virtual {p5, p4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Lg1/c1;

    invoke-virtual {p7}, Lg1/c1;->e()J

    move-result-wide p7

    sget-object v0, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {p5, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    invoke-virtual {p5, p4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lg1/c1;

    invoke-virtual {p4}, Lg1/c1;->i()Z

    move-result p4

    if-eqz p4, :cond_2

    invoke-static {v0, v1}, Li2/w0;->x(J)F

    goto :goto_0

    :cond_2
    invoke-static {v0, v1}, Li2/w0;->x(J)F

    :goto_0
    const p4, 0x3ec28f5c    # 0.38f

    invoke-static {p4, p7, p8}, Li2/x;->c(FJ)J

    move-result-wide p4

    :cond_3
    move-wide p7, p4

    move-object p4, p6

    check-cast p4, Lp1/q;

    invoke-virtual {p4, p0, p1}, Lp1/q;->f(J)Z

    move-result p4

    move-object p5, p6

    check-cast p5, Lp1/q;

    invoke-virtual {p5, p2, p3}, Lp1/q;->f(J)Z

    move-result p5

    or-int/2addr p4, p5

    move-object p5, p6

    check-cast p5, Lp1/q;

    invoke-virtual {p5, p7, p8}, Lp1/q;->f(J)Z

    move-result p5

    or-int/2addr p4, p5

    move-object v0, p6

    check-cast v0, Lp1/q;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    if-nez p4, :cond_4

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne p5, p4, :cond_5

    :cond_4
    move-wide p5, p2

    new-instance p2, Lg1/v1;

    move-wide p3, p0

    invoke-direct/range {p2 .. p8}, Lg1/v1;-><init>(JJJ)V

    invoke-virtual {v0, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p5, p2

    :cond_5
    check-cast p5, Lg1/v1;

    return-object p5
.end method

.method public static q(I)Landroid/widget/ImageView$ScaleType;
    .locals 1

    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x5

    if-eq p0, v0, :cond_1

    const/4 v0, 0x6

    if-eq p0, v0, :cond_0

    sget-object p0, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    return-object p0

    :cond_0
    sget-object p0, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    return-object p0

    :cond_1
    sget-object p0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    return-object p0

    :cond_2
    sget-object p0, Landroid/widget/ImageView$ScaleType;->FIT_END:Landroid/widget/ImageView$ScaleType;

    return-object p0

    :cond_3
    sget-object p0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    return-object p0

    :cond_4
    sget-object p0, Landroid/widget/ImageView$ScaleType;->FIT_START:Landroid/widget/ImageView$ScaleType;

    return-object p0

    :cond_5
    sget-object p0, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    return-object p0
.end method

.method public static r(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lnh/h;Lnh/g;Z)Landroid/graphics/Bitmap;
    .locals 5

    instance-of v0, p0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_5

    move-object v0, p0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v1

    if-eqz p1, :cond_1

    sget-object v2, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, p1

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :goto_1
    if-ne v1, v2, :cond_5

    if-eqz p4, :cond_2

    goto :goto_4

    :cond_2
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    sget-object v2, Lnh/h;->c:Lnh/h;

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    goto :goto_2

    :cond_3
    iget-object v3, p2, Lnh/h;->a:Ldt/b;

    invoke-static {v3, p3}, Lqh/d;->d(Ldt/b;Lnh/g;)I

    move-result v3

    :goto_2
    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    goto :goto_3

    :cond_4
    iget-object v2, p2, Lnh/h;->b:Ldt/b;

    invoke-static {v2, p3}, Lqh/d;->d(Ldt/b;Lnh/g;)I

    move-result v2

    :goto_3
    invoke-static {p4, v1, v3, v2, p3}, Landroidx/room/c1;->k(IIIILnh/g;)D

    move-result-wide v1

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    cmpg-double p4, v1, v3

    if-nez p4, :cond_5

    :goto_4
    return-object v0

    :cond_5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    sget-object p4, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    instance-of p4, p0, Landroid/graphics/drawable/BitmapDrawable;

    const/4 v0, 0x0

    if-eqz p4, :cond_6

    move-object v1, p0

    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    goto :goto_5

    :cond_6
    move-object v1, v0

    :goto_5
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    goto :goto_6

    :cond_7
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    :goto_6
    const/16 v2, 0x200

    if-lez v1, :cond_8

    goto :goto_7

    :cond_8
    move v1, v2

    :goto_7
    if-eqz p4, :cond_9

    move-object v0, p0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    :cond_9
    if-eqz v0, :cond_a

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p4

    if-eqz p4, :cond_a

    invoke-virtual {p4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p4

    goto :goto_8

    :cond_a
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p4

    :goto_8
    if-lez p4, :cond_b

    move v2, p4

    :cond_b
    sget-object p4, Lnh/h;->c:Lnh/h;

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    move v0, v1

    goto :goto_9

    :cond_c
    iget-object v0, p2, Lnh/h;->a:Ldt/b;

    invoke-static {v0, p3}, Lqh/d;->d(Ldt/b;Lnh/g;)I

    move-result v0

    :goto_9
    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_d

    move p2, v2

    goto :goto_a

    :cond_d
    iget-object p2, p2, Lnh/h;->b:Ldt/b;

    invoke-static {p2, p3}, Lqh/d;->d(Ldt/b;Lnh/g;)I

    move-result p2

    :goto_a
    invoke-static {v1, v2, v0, p2, p3}, Landroidx/room/c1;->k(IIIILnh/g;)D

    move-result-wide p2

    int-to-double v0, v1

    mul-double/2addr v0, p2

    invoke-static {v0, v1}, Le93/b;->W(D)I

    move-result p4

    int-to-double v0, v2

    mul-double/2addr p2, v0

    invoke-static {p2, p3}, Le93/b;->W(D)I

    move-result p2

    if-eqz p1, :cond_e

    sget-object p3, Landroid/graphics/Bitmap$Config;->HARDWARE:Landroid/graphics/Bitmap$Config;

    if-ne p1, p3, :cond_f

    :cond_e
    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :cond_f
    invoke-static {p4, p2, p1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p3

    iget v0, p3, Landroid/graphics/Rect;->left:I

    iget v1, p3, Landroid/graphics/Rect;->top:I

    iget v2, p3, Landroid/graphics/Rect;->right:I

    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v3, p4, p2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    new-instance p2, Landroid/graphics/Canvas;

    invoke-direct {p2, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, p2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0, v0, v1, v2, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    return-object p1
.end method

.method public static s(Ljava/security/spec/EllipticCurve;)I
    .locals 1

    invoke-static {p0}, Lcom/google/crypto/tink/internal/e;->d(Ljava/security/spec/EllipticCurve;)Ljava/math/BigInteger;

    move-result-object p0

    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p0

    invoke-virtual {p0}, Ljava/math/BigInteger;->bitLength()I

    move-result p0

    add-int/lit8 p0, p0, 0x7

    div-int/lit8 p0, p0, 0x8

    return p0
.end method

.method public static t([BLjava/lang/String;Ljava/lang/String;Lio/sentry/v0;)Lxl/a;
    .locals 4

    array-length v0, p0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    if-eqz p1, :cond_2

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "image/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "video/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "audio/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "application/octet-stream"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "application/pdf"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "application/zip"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "application/gzip"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    new-instance p2, Lxl/a;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "[Binary data, "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p0, p0

    const-string v0, " bytes, type: "

    const-string v2, "]"

    invoke-static {p0, v0, p1, v2, p3}, Ly00/t7;->f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    const/16 p1, 0x10

    invoke-direct {p2, p1, p0, v1}, Lxl/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p2

    :cond_2
    const/4 v0, 0x0

    :try_start_0
    array-length v1, p0

    const v2, 0x25800

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    array-length v3, p0

    if-le v3, v2, :cond_3

    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    move v2, v0

    :goto_0
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, p0, v0, v1, p2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-static {v3, p1, v2, p3}, Ls2/e;->S(Ljava/lang/String;Ljava/lang/String;ZLio/sentry/v0;)Lxl/a;

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    sget-object p2, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to decode bytes: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {p3, p2, p1, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lxl/a;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "[Failed to decode bytes, "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p0, p0

    const-string p3, " bytes]"

    invoke-static {p2, p0, p3}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    sget-object p2, Lio/sentry/util/network/a;->BODY_PARSE_ERROR:Lio/sentry/util/network/a;

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    const/16 p3, 0x10

    invoke-direct {p1, p3, p0, p2}, Lxl/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method public static u(Lbh3/h;)Lro/i;
    .locals 2

    new-instance v0, Lro/i;

    const/16 v1, 0x9

    invoke-direct {v0, p0, v1}, Lro/i;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public static v(Lat/p;)Ljava/security/KeyPair;
    .locals 0

    invoke-static {p0}, Ls2/e;->z(Lat/p;)Ljava/security/spec/ECParameterSpec;

    move-result-object p0

    invoke-static {p0}, Ls2/e;->w(Ljava/security/spec/ECParameterSpec;)Ljava/security/KeyPair;

    move-result-object p0

    return-object p0
.end method

.method public static w(Ljava/security/spec/ECParameterSpec;)Ljava/security/KeyPair;
    .locals 2

    sget-object v0, Lat/u;->f:Lat/u;

    const-string v1, "EC"

    iget-object v0, v0, Lat/u;->a:Lat/t;

    invoke-virtual {v0, v1}, Lat/t;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/KeyPairGenerator;

    invoke-virtual {v0, p0}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object p0

    return-object p0
.end method

.method public static x(Lr93/o0;)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lo93/h;->A(Lr93/k;)Z

    invoke-static {p0}, Lcb3/e;->k(Lr93/c;)Lr93/c;

    move-result-object p0

    sget-object v0, Lfa3/d;->z:Lfa3/d;

    invoke-static {p0, v0}, Lcb3/e;->b(Lr93/c;Lkotlin/jvm/functions/Function1;)Lr93/c;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lfa3/f;->a:Ljava/lang/Object;

    invoke-static {p0}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lva3/h;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lva3/h;->b()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final y(Landroid/database/Cursor;Ljava/lang/String;)I
    .locals 7

    const-string v0, "c"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "`"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x60

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    if-ltz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_0
    if-ltz v0, :cond_2

    return v0

    :cond_2
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->getColumnNames()[Ljava/lang/String;

    move-result-object v1

    const-string p0, "getColumnNames(...)"

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    const/16 v6, 0x3f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/n;->D0([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p0, v0

    const-string v0, "RoomCursorUtil"

    const-string v1, "Cannot collect column names for debug purposes"

    invoke-static {v0, v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string p0, "unknown"

    :goto_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "column \'"

    const-string v2, "\' does not exist. Available columns: "

    invoke-static {v1, p1, v2, p0}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static z(Lat/p;)Ljava/security/spec/ECParameterSpec;
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    sget-object p0, Lcom/google/crypto/tink/internal/e;->c:Ljava/security/spec/ECParameterSpec;

    return-object p0

    :cond_0
    new-instance v0, Ljava/security/NoSuchAlgorithmException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "curve not implemented:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lcom/google/crypto/tink/internal/e;->b:Ljava/security/spec/ECParameterSpec;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/crypto/tink/internal/e;->a:Ljava/security/spec/ECParameterSpec;

    return-object p0
.end method


# virtual methods
.method public abstract C()Landroidx/compose/ui/Modifier;
.end method

.method public abstract J()Landroidx/compose/ui/Modifier;
.end method

.method public abstract K()Ll3/v0;
.end method

.method public abstract Q(I)V
.end method

.method public abstract R(Landroid/graphics/Typeface;Z)V
.end method

.method public abstract i0(Llb3/p0;Lob3/g;)Lob3/h;
.end method
