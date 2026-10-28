.class public final Lnw/n;
.super Lnw/d;
.source "SourceFile"


# instance fields
.field public final O:Lxw/b;

.field public final P:Lxw/b;

.field public final Q:Lxw/b;

.field public final R:Lxw/b;

.field public final S:Lxw/b;

.field public final T:Lxw/b;

.field public final U:Lxw/b;

.field public final V:Lxw/b;

.field public final W:Ljava/util/List;


# direct methods
.method public constructor <init>(Lxw/b;Lxw/b;Lxw/b;Lxw/b;Lxw/b;Lxw/b;Lxw/b;Lxw/b;Ljava/util/ArrayList;Lnw/i;Ljava/util/LinkedHashSet;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/LinkedList;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V
    .locals 16

    move-object/from16 v14, p1

    move-object/from16 v15, p2

    sget-object v1, Lnw/h;->y:Lnw/h;

    move-object/from16 v0, p0

    move-object/from16 v2, p10

    move-object/from16 v3, p11

    move-object/from16 v4, p12

    move-object/from16 v5, p13

    move-object/from16 v6, p14

    move-object/from16 v7, p15

    move-object/from16 v8, p16

    move-object/from16 v9, p17

    move-object/from16 v10, p18

    move-object/from16 v11, p19

    move-object/from16 v12, p20

    move-object/from16 v13, p21

    invoke-direct/range {v0 .. v13}, Lnw/d;-><init>(Lnw/h;Lnw/i;Ljava/util/Set;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V

    const-string v1, "The modulus value must not be null"

    invoke-static {v14, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v14, v0, Lnw/n;->O:Lxw/b;

    const-string v1, "The public exponent value must not be null"

    invoke-static {v15, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v15, v0, Lnw/n;->P:Lxw/b;

    invoke-virtual {v0}, Lnw/d;->a()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lnw/d;->a()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/X509Certificate;

    :try_start_0
    invoke-virtual {v0}, Lnw/d;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/X509Certificate;

    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v1

    check-cast v1, Ljava/security/interfaces/RSAPublicKey;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v15}, Lxw/a;->b()Ljava/math/BigInteger;

    move-result-object v3

    invoke-interface {v1}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v14}, Lxw/a;->b()Ljava/math/BigInteger;

    move-result-object v2

    invoke-interface {v1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v2

    :catch_0
    :goto_0
    if-eqz v2, :cond_2

    :cond_1
    move-object/from16 v1, p3

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_1
    iput-object v1, v0, Lnw/n;->Q:Lxw/b;

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    if-eqz v1, :cond_5

    if-eqz v2, :cond_5

    move-object/from16 v4, p7

    if-eqz v3, :cond_4

    move-object/from16 v5, p8

    if-eqz v4, :cond_6

    if-eqz v5, :cond_6

    iput-object v1, v0, Lnw/n;->R:Lxw/b;

    iput-object v2, v0, Lnw/n;->S:Lxw/b;

    iput-object v3, v0, Lnw/n;->T:Lxw/b;

    iput-object v4, v0, Lnw/n;->U:Lxw/b;

    iput-object v5, v0, Lnw/n;->V:Lxw/b;

    if-eqz p9, :cond_3

    invoke-static/range {p9 .. p9}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lnw/n;->W:Ljava/util/List;

    goto :goto_4

    :cond_3
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lnw/n;->W:Ljava/util/List;

    goto :goto_4

    :cond_4
    :goto_2
    move-object/from16 v5, p8

    goto :goto_3

    :cond_5
    move-object/from16 v4, p7

    goto :goto_2

    :cond_6
    :goto_3
    const/4 v6, 0x0

    if-nez v1, :cond_7

    if-nez v2, :cond_7

    if-nez v3, :cond_7

    if-nez v4, :cond_7

    if-nez v5, :cond_7

    if-nez p9, :cond_7

    iput-object v6, v0, Lnw/n;->R:Lxw/b;

    iput-object v6, v0, Lnw/n;->S:Lxw/b;

    iput-object v6, v0, Lnw/n;->T:Lxw/b;

    iput-object v6, v0, Lnw/n;->U:Lxw/b;

    iput-object v6, v0, Lnw/n;->V:Lxw/b;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lnw/n;->W:Ljava/util/List;

    goto :goto_4

    :cond_7
    if-nez v1, :cond_8

    if-nez v2, :cond_8

    if-nez v3, :cond_8

    if-nez v4, :cond_8

    if-nez v5, :cond_8

    iput-object v6, v0, Lnw/n;->R:Lxw/b;

    iput-object v6, v0, Lnw/n;->S:Lxw/b;

    iput-object v6, v0, Lnw/n;->T:Lxw/b;

    iput-object v6, v0, Lnw/n;->U:Lxw/b;

    iput-object v6, v0, Lnw/n;->V:Lxw/b;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Lnw/n;->W:Ljava/util/List;

    :goto_4
    return-void

    :cond_8
    const-string v5, "Incomplete second private (CRT) representation: The first prime factor must not be null"

    invoke-static {v1, v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v1, "Incomplete second private (CRT) representation: The second prime factor must not be null"

    invoke-static {v2, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v1, "Incomplete second private (CRT) representation: The first factor CRT exponent must not be null"

    invoke-static {v3, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v1, "Incomplete second private (CRT) representation: The second factor CRT exponent must not be null"

    invoke-static {v4, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Incomplete second private (CRT) representation: The first CRT coefficient must not be null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final b()Z
    .locals 1

    iget-object v0, p0, Lnw/n;->Q:Lxw/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lnw/n;->R:Lxw/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final d()Ljava/util/HashMap;
    .locals 8

    invoke-super {p0}, Lnw/d;->d()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lnw/n;->O:Lxw/b;

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    const-string v2, "n"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lnw/n;->P:Lxw/b;

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    const-string v2, "e"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "d"

    iget-object v2, p0, Lnw/n;->Q:Lxw/b;

    if-eqz v2, :cond_0

    iget-object v2, v2, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v2, p0, Lnw/n;->R:Lxw/b;

    if-eqz v2, :cond_1

    const-string v3, "p"

    iget-object v2, v2, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v2, p0, Lnw/n;->S:Lxw/b;

    if-eqz v2, :cond_2

    const-string v3, "q"

    iget-object v2, v2, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v2, p0, Lnw/n;->T:Lxw/b;

    if-eqz v2, :cond_3

    const-string v3, "dp"

    iget-object v2, v2, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v2, p0, Lnw/n;->U:Lxw/b;

    if-eqz v2, :cond_4

    const-string v3, "dq"

    iget-object v2, v2, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v2, p0, Lnw/n;->V:Lxw/b;

    if-eqz v2, :cond_5

    const-string v3, "qi"

    iget-object v2, v2, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget-object v2, p0, Lnw/n;->W:Ljava/util/List;

    if-eqz v2, :cond_7

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_7

    sget v3, Lxw/c;->a:I

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnw/m;

    sget-object v5, Lxw/d;->a:Low/m;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    iget-object v6, v4, Lnw/m;->w:Lxw/b;

    iget-object v6, v6, Lxw/a;->w:Ljava/lang/String;

    const-string v7, "r"

    invoke-virtual {v5, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v6, v4, Lnw/m;->x:Lxw/b;

    iget-object v6, v6, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v5, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, v4, Lnw/m;->y:Lxw/b;

    iget-object v4, v4, Lxw/a;->w:Ljava/lang/String;

    const-string v6, "t"

    invoke-virtual {v5, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_6
    const-string v1, "oth"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnw/n;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-super {p0, p1}, Lnw/d;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    check-cast p1, Lnw/n;

    iget-object v1, p0, Lnw/n;->O:Lxw/b;

    iget-object v2, p1, Lnw/n;->O:Lxw/b;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnw/n;->P:Lxw/b;

    iget-object v2, p1, Lnw/n;->P:Lxw/b;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnw/n;->Q:Lxw/b;

    iget-object v2, p1, Lnw/n;->Q:Lxw/b;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnw/n;->R:Lxw/b;

    iget-object v2, p1, Lnw/n;->R:Lxw/b;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnw/n;->S:Lxw/b;

    iget-object v2, p1, Lnw/n;->S:Lxw/b;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnw/n;->T:Lxw/b;

    iget-object v2, p1, Lnw/n;->T:Lxw/b;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnw/n;->U:Lxw/b;

    iget-object v2, p1, Lnw/n;->U:Lxw/b;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnw/n;->V:Lxw/b;

    iget-object v2, p1, Lnw/n;->V:Lxw/b;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnw/n;->W:Ljava/util/List;

    iget-object p1, p1, Lnw/n;->W:Ljava/util/List;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v0

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 12

    invoke-super {p0}, Lnw/d;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v10, p0, Lnw/n;->W:Ljava/util/List;

    const/4 v11, 0x0

    iget-object v2, p0, Lnw/n;->O:Lxw/b;

    iget-object v3, p0, Lnw/n;->P:Lxw/b;

    iget-object v4, p0, Lnw/n;->Q:Lxw/b;

    iget-object v5, p0, Lnw/n;->R:Lxw/b;

    iget-object v6, p0, Lnw/n;->S:Lxw/b;

    iget-object v7, p0, Lnw/n;->T:Lxw/b;

    iget-object v8, p0, Lnw/n;->U:Lxw/b;

    iget-object v9, p0, Lnw/n;->V:Lxw/b;

    filled-new-array/range {v1 .. v11}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
