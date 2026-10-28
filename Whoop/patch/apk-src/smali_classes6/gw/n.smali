.class public final Lgw/n;
.super Lgw/c;
.source "SourceFile"


# static fields
.field public static final P:Ljava/util/Set;


# instance fields
.field public final O:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const-string v1, "alg"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "jku"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "jwk"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "x5u"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "x5t"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "x5t#S256"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "x5c"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "kid"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "typ"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "cty"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "crit"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "b64"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lgw/n;->P:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lgw/m;Lgw/h;Ljava/lang/String;Ljava/util/Set;Ljava/net/URI;Lnw/d;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/List;Ljava/lang/String;ZLjava/util/Map;Lxw/b;)V
    .locals 14

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    invoke-direct/range {v0 .. v13}, Lgw/c;-><init>(Lgw/a;Lgw/h;Ljava/lang/String;Ljava/util/Set;Ljava/net/URI;Lnw/d;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lxw/b;)V

    iget-object p1, p1, Lgw/a;->w:Ljava/lang/String;

    sget-object v1, Lgw/a;->x:Lgw/a;

    iget-object v1, v1, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    move/from16 p1, p12

    iput-boolean p1, p0, Lgw/n;->O:Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v1, "The JWS algorithm \"alg\" cannot be \"none\""

    invoke-direct {p1, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static c(Lxw/b;)Lgw/n;
    .locals 21

    new-instance v0, Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lxw/a;->a()[B

    move-result-object v1

    sget-object v2, Lxw/f;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const/16 v1, 0x4e20

    invoke-static {v1, v0}, Lxw/d;->i(ILjava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "alg"

    invoke-static {v1, v0}, Lxw/d;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_28

    sget-object v4, Lgw/a;->x:Lgw/a;

    iget-object v5, v4, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v2, v4

    goto/16 :goto_1

    :cond_0
    const-string v5, "enc"

    invoke-interface {v0, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {v2}, Lgw/i;->a(Ljava/lang/String;)Lgw/i;

    move-result-object v2

    goto/16 :goto_1

    :cond_1
    sget-object v5, Lgw/m;->y:Lgw/m;

    iget-object v6, v5, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    :goto_0
    move-object v2, v5

    goto/16 :goto_1

    :cond_2
    sget-object v5, Lgw/m;->z:Lgw/m;

    iget-object v6, v5, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_0

    :cond_3
    sget-object v5, Lgw/m;->E:Lgw/m;

    iget-object v6, v5, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_0

    :cond_4
    sget-object v5, Lgw/m;->F:Lgw/m;

    iget-object v6, v5, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_0

    :cond_5
    sget-object v5, Lgw/m;->G:Lgw/m;

    iget-object v6, v5, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_0

    :cond_6
    sget-object v5, Lgw/m;->H:Lgw/m;

    iget-object v6, v5, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_0

    :cond_7
    sget-object v5, Lgw/m;->I:Lgw/m;

    iget-object v6, v5, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_0

    :cond_8
    sget-object v5, Lgw/m;->J:Lgw/m;

    iget-object v6, v5, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    goto :goto_0

    :cond_9
    sget-object v5, Lgw/m;->K:Lgw/m;

    iget-object v6, v5, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    goto :goto_0

    :cond_a
    sget-object v5, Lgw/m;->L:Lgw/m;

    iget-object v6, v5, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    goto :goto_0

    :cond_b
    sget-object v5, Lgw/m;->M:Lgw/m;

    iget-object v6, v5, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    goto :goto_0

    :cond_c
    sget-object v5, Lgw/m;->N:Lgw/m;

    iget-object v6, v5, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    goto :goto_0

    :cond_d
    sget-object v5, Lgw/m;->O:Lgw/m;

    iget-object v6, v5, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    goto/16 :goto_0

    :cond_e
    sget-object v5, Lgw/m;->P:Lgw/m;

    iget-object v6, v5, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_f

    goto/16 :goto_0

    :cond_f
    sget-object v5, Lgw/m;->Q:Lgw/m;

    iget-object v6, v5, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_10

    goto/16 :goto_0

    :cond_10
    sget-object v5, Lgw/m;->R:Lgw/m;

    iget-object v6, v5, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    goto/16 :goto_0

    :cond_11
    new-instance v5, Lgw/m;

    invoke-direct {v5, v2}, Lgw/a;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    :goto_1
    instance-of v5, v2, Lgw/m;

    if-eqz v5, :cond_27

    move-object v7, v2

    check-cast v7, Lgw/m;

    iget-object v2, v7, Lgw/a;->w:Ljava/lang/String;

    iget-object v4, v4, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_26

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v5, 0x1

    move/from16 v18, v5

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    :cond_12
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_25

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    goto :goto_2

    :cond_13
    const-string v6, "typ"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const-class v4, Ljava/lang/String;

    if-eqz v6, :cond_14

    invoke-static {v0, v5, v4}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_12

    new-instance v8, Lgw/h;

    invoke-direct {v8, v4}, Lgw/h;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_14
    const-string v6, "cty"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-static {v0, v5, v4}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Ljava/lang/String;

    goto :goto_2

    :cond_15
    const-string v6, "crit"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-static {v5, v0}, Lxw/d;->g(Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_12

    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    goto :goto_2

    :cond_16
    const-string v6, "jku"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-static {v5, v0}, Lxw/d;->h(Ljava/lang/String;Ljava/util/Map;)Ljava/net/URI;

    move-result-object v11

    goto :goto_2

    :cond_17
    const-string v6, "jwk"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1b

    invoke-static {v5, v0}, Lxw/d;->d(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v4

    if-nez v4, :cond_18

    const/4 v12, 0x0

    goto :goto_3

    :cond_18
    invoke-static {v4}, Lnw/d;->c(Ljava/util/Map;)Lnw/d;

    move-result-object v4

    invoke-virtual {v4}, Lnw/d;->b()Z

    move-result v5

    if-nez v5, :cond_1a

    move-object v12, v4

    :goto_3
    if-eqz v12, :cond_12

    invoke-virtual {v12}, Lnw/d;->b()Z

    move-result v4

    if-nez v4, :cond_19

    goto :goto_2

    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The JWK must be public"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    new-instance v0, Ljava/text/ParseException;

    const-string v1, "Non-public key in jwk header parameter"

    invoke-direct {v0, v1, v3}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_1b
    const-string v6, "x5u"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1c

    invoke-static {v5, v0}, Lxw/d;->h(Ljava/lang/String;Ljava/util/Map;)Ljava/net/URI;

    move-result-object v13

    goto/16 :goto_2

    :cond_1c
    const-string v6, "x5t"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1d

    invoke-static {v0, v5, v4}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lxw/b;->d(Ljava/lang/String;)Lxw/b;

    move-result-object v14

    goto/16 :goto_2

    :cond_1d
    const-string v6, "x5t#S256"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1e

    invoke-static {v0, v5, v4}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lxw/b;->d(Ljava/lang/String;)Lxw/b;

    move-result-object v15

    goto/16 :goto_2

    :cond_1e
    const-string v6, "x5c"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1f

    const-class v4, Ljava/util/List;

    invoke-static {v0, v5, v4}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Ls2/d;->u(Ljava/util/List;)Ljava/util/LinkedList;

    move-result-object v16

    goto/16 :goto_2

    :cond_1f
    const-string v6, "kid"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_20

    invoke-static {v0, v5, v4}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v17, v4

    check-cast v17, Ljava/lang/String;

    goto/16 :goto_2

    :cond_20
    const-string v4, "b64"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_22

    const-class v4, Ljava/lang/Boolean;

    invoke-static {v0, v5, v4}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    if-eqz v4, :cond_21

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    move/from16 v18, v4

    goto/16 :goto_2

    :cond_21
    new-instance v0, Ljava/text/ParseException;

    const-string v1, "JSON object member "

    const-string v2, " is missing or null"

    invoke-static {v1, v5, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v3}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_22
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    sget-object v6, Lgw/n;->P:Ljava/util/Set;

    invoke-interface {v6, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_24

    if-nez v19, :cond_23

    new-instance v19, Ljava/util/HashMap;

    invoke-direct/range {v19 .. v19}, Ljava/util/HashMap;-><init>()V

    :cond_23
    move-object/from16 v6, v19

    invoke-interface {v6, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v19, v6

    goto/16 :goto_2

    :cond_24
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The parameter name \""

    const-string v2, "\" matches a registered name"

    invoke-static {v1, v5, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_25
    new-instance v6, Lgw/n;

    move-object/from16 v20, p0

    invoke-direct/range {v6 .. v20}, Lgw/n;-><init>(Lgw/m;Lgw/h;Ljava/lang/String;Ljava/util/Set;Ljava/net/URI;Lnw/d;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/List;Ljava/lang/String;ZLjava/util/Map;Lxw/b;)V

    return-object v6

    :cond_26
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The JWS algorithm \"alg\" cannot be \"none\""

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_27
    new-instance v0, Ljava/text/ParseException;

    const-string v1, "Not a JWS header"

    invoke-direct {v0, v1, v3}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_28
    new-instance v0, Ljava/text/ParseException;

    const-string v1, "Missing \"alg\" in header JSON object"

    invoke-direct {v0, v1, v3}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0
.end method


# virtual methods
.method public final b()Ljava/util/HashMap;
    .locals 3

    invoke-super {p0}, Lgw/c;->b()Ljava/util/HashMap;

    move-result-object v0

    iget-boolean v1, p0, Lgw/n;->O:Z

    if-nez v1, :cond_0

    const-string v1, "b64"

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method
