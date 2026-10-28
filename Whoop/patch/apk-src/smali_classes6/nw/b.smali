.class public final Lnw/b;
.super Lnw/d;
.source "SourceFile"


# static fields
.field public static final S:Ljava/util/Set;


# instance fields
.field public final O:Lnw/a;

.field public final P:Lxw/b;

.field public final Q:Lxw/b;

.field public final R:Lxw/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljava/util/HashSet;

    sget-object v1, Lnw/a;->y:Lnw/a;

    sget-object v2, Lnw/a;->z:Lnw/a;

    sget-object v3, Lnw/a;->F:Lnw/a;

    sget-object v4, Lnw/a;->G:Lnw/a;

    filled-new-array {v1, v2, v3, v4}, [Lnw/a;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lnw/b;->S:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lnw/a;Lxw/b;Lxw/b;Lnw/i;Ljava/util/Set;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V
    .locals 16

    move-object/from16 v14, p1

    move-object/from16 v15, p2

    .line 1
    sget-object v1, Lnw/h;->x:Lnw/h;

    move-object/from16 v0, p0

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p12

    move-object/from16 v11, p13

    move-object/from16 v12, p14

    move-object/from16 v13, p15

    invoke-direct/range {v0 .. v13}, Lnw/d;-><init>(Lnw/h;Lnw/i;Ljava/util/Set;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V

    .line 2
    const-string v1, "The curve must not be null"

    invoke-static {v14, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v14, v0, Lnw/b;->O:Lnw/a;

    .line 3
    const-string v1, "The x coordinate must not be null"

    invoke-static {v15, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v15, v0, Lnw/b;->P:Lxw/b;

    .line 4
    const-string v1, "The y coordinate must not be null"

    move-object/from16 v2, p3

    invoke-static {v2, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v2, v0, Lnw/b;->Q:Lxw/b;

    .line 5
    invoke-static/range {p1 .. p3}, Lnw/b;->g(Lnw/a;Lxw/b;Lxw/b;)V

    .line 6
    invoke-virtual {v0}, Lnw/d;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnw/b;->f(Ljava/util/List;)V

    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, Lnw/b;->R:Lxw/b;

    return-void
.end method

.method public constructor <init>(Lnw/a;Lxw/b;Lxw/b;Lxw/b;Lnw/i;Ljava/util/LinkedHashSet;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/LinkedList;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V
    .locals 16

    move-object/from16 v14, p1

    move-object/from16 v15, p2

    .line 8
    sget-object v1, Lnw/h;->x:Lnw/h;

    move-object/from16 v0, p0

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    move-object/from16 v5, p8

    move-object/from16 v6, p9

    move-object/from16 v7, p10

    move-object/from16 v8, p11

    move-object/from16 v9, p12

    move-object/from16 v10, p13

    move-object/from16 v11, p14

    move-object/from16 v12, p15

    move-object/from16 v13, p16

    invoke-direct/range {v0 .. v13}, Lnw/d;-><init>(Lnw/h;Lnw/i;Ljava/util/Set;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V

    .line 9
    const-string v1, "The curve must not be null"

    invoke-static {v14, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v14, v0, Lnw/b;->O:Lnw/a;

    .line 10
    const-string v1, "The x coordinate must not be null"

    invoke-static {v15, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v15, v0, Lnw/b;->P:Lxw/b;

    .line 11
    const-string v1, "The y coordinate must not be null"

    move-object/from16 v2, p3

    invoke-static {v2, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v2, v0, Lnw/b;->Q:Lxw/b;

    .line 12
    invoke-static/range {p1 .. p3}, Lnw/b;->g(Lnw/a;Lxw/b;Lxw/b;)V

    .line 13
    invoke-virtual {v0}, Lnw/d;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnw/b;->f(Ljava/util/List;)V

    move-object/from16 v1, p4

    .line 14
    iput-object v1, v0, Lnw/b;->R:Lxw/b;

    return-void
.end method

.method public static e(ILjava/math/BigInteger;)Lxw/b;
    .locals 6

    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    move-result v0

    add-int/lit8 v0, v0, 0x7

    shr-int/lit8 v0, v0, 0x3

    shl-int/lit8 v0, v0, 0x3

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v1

    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    move-result v2

    rem-int/lit8 v2, v2, 0x8

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    move-result v2

    div-int/lit8 v2, v2, 0x8

    add-int/2addr v2, v4

    div-int/lit8 v5, v0, 0x8

    if-ne v2, v5, :cond_0

    goto :goto_1

    :cond_0
    array-length v2, v1

    invoke-virtual {p1}, Ljava/math/BigInteger;->bitLength()I

    move-result p1

    rem-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_1

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    move v4, v3

    :goto_0
    div-int/lit8 v0, v0, 0x8

    sub-int p1, v0, v2

    new-array v0, v0, [B

    invoke-static {v1, v4, v0, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v0

    :goto_1
    add-int/lit8 p0, p0, 0x7

    div-int/lit8 p0, p0, 0x8

    array-length p1, v1

    if-lt p1, p0, :cond_2

    invoke-static {v1}, Lxw/b;->c([B)Lxw/b;

    move-result-object p0

    return-object p0

    :cond_2
    new-array p1, p0, [B

    array-length v0, v1

    sub-int/2addr p0, v0

    array-length v0, v1

    invoke-static {v1, v3, p1, p0, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p1}, Lxw/b;->c([B)Lxw/b;

    move-result-object p0

    return-object p0
.end method

.method public static g(Lnw/a;Lxw/b;Lxw/b;)V
    .locals 1

    sget-object v0, Lnw/b;->S:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lxw/a;->b()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p2}, Lxw/a;->b()Ljava/math/BigInteger;

    move-result-object p2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p0}, Lnw/c;->a(Lnw/a;)Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    invoke-static {p1, p2, v0}, Lvp/c;->f0(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Invalid EC JWK: The \'x\' and \'y\' public coordinates are not on the "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " curve"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unknown / unsupported curve: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static h(Ljava/util/Map;)Lnw/b;
    .locals 21

    move-object/from16 v0, p0

    const-class v1, Ljava/lang/String;

    sget-object v2, Lnw/h;->x:Lnw/h;

    invoke-static {v0}, Lse/b;->R(Ljava/util/Map;)Lnw/h;

    move-result-object v3

    invoke-virtual {v2, v3}, Lnw/h;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    :try_start_0
    const-string v2, "crv"

    invoke-static {v0, v2, v1}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lnw/a;->b(Ljava/lang/String;)Lnw/a;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    const-string v2, "x"

    invoke-static {v2, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v6

    const-string v2, "y"

    invoke-static {v2, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v7

    const-string v2, "d"

    invoke-static {v2, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v8

    const-string v2, "x5t#S256"

    const-string v4, "x5t"

    const-string v9, "x5u"

    const-string v10, "kid"

    if-nez v8, :cond_0

    :try_start_1
    new-instance v8, Lnw/b;

    move-object v11, v8

    invoke-static {v0}, Lse/b;->S(Ljava/util/Map;)Lnw/i;

    move-result-object v8

    invoke-static {v0}, Lse/b;->P(Ljava/util/Map;)Ljava/util/LinkedHashSet;

    move-result-object v12

    invoke-static {v0}, Lse/b;->M(Ljava/util/Map;)Lgw/a;

    move-result-object v13

    invoke-static {v0, v10, v1}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    move-object v10, v12

    invoke-static {v9, v0}, Lxw/d;->h(Ljava/lang/String;Ljava/util/Map;)Ljava/net/URI;

    move-result-object v12

    move-object v9, v10

    move-object v10, v13

    invoke-static {v4, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v13

    invoke-static {v2, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v14

    invoke-static {v0}, Lse/b;->U(Ljava/util/Map;)Ljava/util/LinkedList;

    move-result-object v15

    invoke-static {v0}, Lse/b;->N(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v16

    invoke-static {v0}, Lse/b;->T(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v17

    invoke-static {v0}, Lse/b;->O(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v18

    invoke-static {v0}, Lse/b;->Q(Ljava/util/Map;)Lnw/g;

    move-result-object v19

    move-object v4, v11

    move-object v11, v1

    invoke-direct/range {v4 .. v19}, Lnw/b;-><init>(Lnw/a;Lxw/b;Lxw/b;Lnw/i;Ljava/util/Set;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V

    return-object v4

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    new-instance v11, Lnw/b;

    invoke-static {v0}, Lse/b;->S(Ljava/util/Map;)Lnw/i;

    move-result-object v12

    invoke-static {v0}, Lse/b;->P(Ljava/util/Map;)Ljava/util/LinkedHashSet;

    move-result-object v13

    move-object v14, v11

    invoke-static {v0}, Lse/b;->M(Ljava/util/Map;)Lgw/a;

    move-result-object v11

    invoke-static {v0, v10, v1}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v9, v0}, Lxw/d;->h(Ljava/lang/String;Ljava/util/Map;)Ljava/net/URI;

    move-result-object v9

    invoke-static {v4, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v4

    invoke-static {v2, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v15

    invoke-static {v0}, Lse/b;->U(Ljava/util/Map;)Ljava/util/LinkedList;

    move-result-object v16

    invoke-static {v0}, Lse/b;->N(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v17

    invoke-static {v0}, Lse/b;->T(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v18

    invoke-static {v0}, Lse/b;->O(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v19

    invoke-static {v0}, Lse/b;->Q(Ljava/util/Map;)Lnw/g;

    move-result-object v20

    move-object v10, v14

    move-object v14, v4

    move-object v4, v10

    move-object v10, v13

    move-object v13, v9

    move-object v9, v12

    move-object v12, v1

    invoke-direct/range {v4 .. v20}, Lnw/b;-><init>(Lnw/a;Lxw/b;Lxw/b;Lxw/b;Lnw/i;Ljava/util/LinkedHashSet;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/LinkedList;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v4

    :goto_0
    new-instance v1, Ljava/text/ParseException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, v3}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v1

    :catch_1
    move-exception v0

    new-instance v1, Ljava/text/ParseException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, v3}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v1

    :cond_1
    new-instance v0, Ljava/text/ParseException;

    const-string v1, "The key type \"kty\" must be EC"

    invoke-direct {v0, v1, v3}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-object v0, p0, Lnw/b;->R:Lxw/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final d()Ljava/util/HashMap;
    .locals 3

    invoke-super {p0}, Lnw/d;->d()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lnw/b;->O:Lnw/a;

    iget-object v1, v1, Lnw/a;->w:Ljava/lang/String;

    const-string v2, "crv"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lnw/b;->P:Lxw/b;

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    const-string v2, "x"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lnw/b;->Q:Lxw/b;

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    const-string v2, "y"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lnw/b;->R:Lxw/b;

    if-eqz v1, :cond_0

    const-string v2, "d"

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnw/b;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Lnw/d;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    check-cast p1, Lnw/b;

    iget-object v1, p0, Lnw/b;->O:Lnw/a;

    iget-object v2, p1, Lnw/b;->O:Lnw/a;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnw/b;->P:Lxw/b;

    iget-object v2, p1, Lnw/b;->P:Lxw/b;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnw/b;->Q:Lxw/b;

    iget-object v2, p1, Lnw/b;->Q:Lxw/b;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnw/b;->R:Lxw/b;

    iget-object p1, p1, Lnw/b;->R:Lxw/b;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f(Ljava/util/List;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/cert/X509Certificate;

    :try_start_0
    invoke-virtual {p0}, Lnw/d;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/cert/X509Certificate;

    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object p1

    check-cast p1, Ljava/security/interfaces/ECPublicKey;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lnw/b;->P:Lxw/b;

    invoke-virtual {v1}, Lxw/a;->b()Ljava/math/BigInteger;

    move-result-object v1

    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v2

    invoke-virtual {v2}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lnw/b;->Q:Lxw/b;

    invoke-virtual {v0}, Lxw/a;->b()Ljava/math/BigInteger;

    move-result-object v0

    invoke-interface {p1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object p1

    invoke-virtual {p1}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v0

    :catch_0
    :goto_0
    if-eqz v0, :cond_2

    :goto_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final hashCode()I
    .locals 7

    invoke-super {p0}, Lnw/d;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v5, p0, Lnw/b;->R:Lxw/b;

    const/4 v6, 0x0

    iget-object v2, p0, Lnw/b;->O:Lnw/a;

    iget-object v3, p0, Lnw/b;->P:Lxw/b;

    iget-object v4, p0, Lnw/b;->Q:Lxw/b;

    filled-new-array/range {v1 .. v6}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
