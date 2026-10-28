.class public final Lgw/k;
.super Lgw/c;
.source "SourceFile"


# static fields
.field public static final b0:Ljava/util/Set;


# instance fields
.field public final O:Lgw/f;

.field public final P:Lnw/d;

.field public final Q:Lgw/d;

.field public final R:Lxw/b;

.field public final S:Lxw/b;

.field public final T:Lxw/b;

.field public final U:I

.field public final V:Lxw/b;

.field public final W:Lxw/b;

.field public final X:Ljava/lang/String;

.field public final Y:Ljava/lang/String;

.field public final Z:Ljava/lang/String;

.field public final a0:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const-string v1, "alg"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "enc"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "epk"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "zip"

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

    const-string v1, "apu"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "apv"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "p2s"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "p2c"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "iv"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "tag"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "skid"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "iss"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "sub"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "aud"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v1, "authTag"

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lgw/k;->b0:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lgw/a;Lgw/f;Lgw/h;Ljava/lang/String;Ljava/util/HashSet;Ljava/net/URI;Lnw/d;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/LinkedList;Ljava/lang/String;Lnw/d;Lgw/d;Lxw/b;Lxw/b;Lxw/b;ILxw/b;Lxw/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/HashMap;Lxw/b;)V
    .locals 15

    move-object/from16 v14, p13

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move-object/from16 v12, p25

    move-object/from16 v13, p26

    invoke-direct/range {v0 .. v13}, Lgw/c;-><init>(Lgw/a;Lgw/h;Ljava/lang/String;Ljava/util/Set;Ljava/net/URI;Lnw/d;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Lxw/b;)V

    if-eqz v1, :cond_1

    iget-object v1, v1, Lgw/a;->w:Ljava/lang/String;

    sget-object v2, Lgw/a;->x:Lgw/a;

    iget-object v2, v2, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "The JWE algorithm cannot be \"none\""

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    :goto_0
    if-eqz v14, :cond_3

    invoke-virtual {v14}, Lnw/d;->b()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Ephemeral public key should not be a private key"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    :goto_1
    invoke-static/range {p2 .. p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, p2

    iput-object v1, p0, Lgw/k;->O:Lgw/f;

    iput-object v14, p0, Lgw/k;->P:Lnw/d;

    move-object/from16 v1, p14

    iput-object v1, p0, Lgw/k;->Q:Lgw/d;

    move-object/from16 v1, p15

    iput-object v1, p0, Lgw/k;->R:Lxw/b;

    move-object/from16 v1, p16

    iput-object v1, p0, Lgw/k;->S:Lxw/b;

    move-object/from16 v1, p17

    iput-object v1, p0, Lgw/k;->T:Lxw/b;

    move/from16 v1, p18

    iput v1, p0, Lgw/k;->U:I

    move-object/from16 v1, p19

    iput-object v1, p0, Lgw/k;->V:Lxw/b;

    move-object/from16 v1, p20

    iput-object v1, p0, Lgw/k;->W:Lxw/b;

    move-object/from16 v1, p21

    iput-object v1, p0, Lgw/k;->X:Ljava/lang/String;

    move-object/from16 v1, p22

    iput-object v1, p0, Lgw/k;->Y:Ljava/lang/String;

    move-object/from16 v1, p23

    iput-object v1, p0, Lgw/k;->Z:Ljava/lang/String;

    move-object/from16 v1, p24

    iput-object v1, p0, Lgw/k;->a0:Ljava/util/List;

    return-void
.end method

.method public static c(Lxw/b;)Lgw/k;
    .locals 33

    new-instance v0, Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lxw/a;->a()[B

    move-result-object v1

    sget-object v2, Lxw/f;->a:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    const/16 v1, 0x4e20

    invoke-static {v1, v0}, Lxw/d;->i(ILjava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "enc"

    invoke-static {v1, v0}, Lxw/d;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lgw/f;->z:Lgw/f;

    iget-object v4, v3, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    :goto_0
    move-object v8, v3

    goto :goto_1

    :cond_0
    sget-object v3, Lgw/f;->E:Lgw/f;

    iget-object v4, v3, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    sget-object v3, Lgw/f;->F:Lgw/f;

    iget-object v4, v3, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    sget-object v3, Lgw/f;->I:Lgw/f;

    iget-object v4, v3, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_3
    sget-object v3, Lgw/f;->J:Lgw/f;

    iget-object v4, v3, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    goto :goto_0

    :cond_4
    sget-object v3, Lgw/f;->K:Lgw/f;

    iget-object v4, v3, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    goto :goto_0

    :cond_5
    sget-object v3, Lgw/f;->G:Lgw/f;

    iget-object v4, v3, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_0

    :cond_6
    sget-object v3, Lgw/f;->H:Lgw/f;

    iget-object v4, v3, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_0

    :cond_7
    sget-object v3, Lgw/f;->L:Lgw/f;

    iget-object v4, v3, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_0

    :cond_8
    new-instance v3, Lgw/f;

    invoke-direct {v3, v2, v5}, Lgw/f;-><init>(Ljava/lang/String;I)V

    goto :goto_0

    :goto_1
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move/from16 v24, v5

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    :cond_9
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v6, "alg"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const-class v3, Ljava/lang/String;

    if-eqz v6, :cond_a

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lgw/i;->a(Ljava/lang/String;)Lgw/i;

    move-result-object v7

    goto :goto_2

    :cond_a
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    goto :goto_2

    :cond_b
    const-string v6, "typ"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_9

    new-instance v9, Lgw/h;

    invoke-direct {v9, v3}, Lgw/h;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_c
    const-string v6, "cty"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Ljava/lang/String;

    goto :goto_2

    :cond_d
    const-string v6, "crit"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-static {v4, v0}, Lxw/d;->g(Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_9

    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    goto :goto_2

    :cond_e
    const-string v6, "jku"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-static {v4, v0}, Lxw/d;->h(Ljava/lang/String;Ljava/util/Map;)Ljava/net/URI;

    move-result-object v12

    goto :goto_2

    :cond_f
    const-string v6, "jwk"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-static {v4, v0}, Lxw/d;->d(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    if-nez v3, :cond_10

    const/4 v13, 0x0

    goto :goto_3

    :cond_10
    invoke-static {v3}, Lnw/d;->c(Ljava/util/Map;)Lnw/d;

    move-result-object v3

    invoke-virtual {v3}, Lnw/d;->b()Z

    move-result v4

    if-nez v4, :cond_12

    move-object v13, v3

    :goto_3
    if-eqz v13, :cond_9

    invoke-virtual {v13}, Lnw/d;->b()Z

    move-result v3

    if-nez v3, :cond_11

    goto/16 :goto_2

    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The JWK must be public"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    new-instance v0, Ljava/text/ParseException;

    const-string v1, "Non-public key in jwk header parameter"

    invoke-direct {v0, v1, v5}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_13
    const-string v6, "x5u"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    invoke-static {v4, v0}, Lxw/d;->h(Ljava/lang/String;Ljava/util/Map;)Ljava/net/URI;

    move-result-object v14

    goto/16 :goto_2

    :cond_14
    const-string v6, "x5t"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lxw/b;->d(Ljava/lang/String;)Lxw/b;

    move-result-object v15

    goto/16 :goto_2

    :cond_15
    const-string v6, "x5t#S256"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lxw/b;->d(Ljava/lang/String;)Lxw/b;

    move-result-object v16

    goto/16 :goto_2

    :cond_16
    const-string v6, "x5c"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_17

    const-class v3, Ljava/util/List;

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Ls2/d;->u(Ljava/util/List;)Ljava/util/LinkedList;

    move-result-object v17

    goto/16 :goto_2

    :cond_17
    const-string v6, "kid"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v18, v3

    check-cast v18, Ljava/lang/String;

    goto/16 :goto_2

    :cond_18
    const-string v6, "epk"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_19

    invoke-static {v4, v0}, Lxw/d;->d(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v3}, Lnw/d;->c(Ljava/util/Map;)Lnw/d;

    move-result-object v19

    goto/16 :goto_2

    :cond_19
    const-string v6, "zip"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1a

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_9

    new-instance v4, Lgw/d;

    invoke-direct {v4, v3}, Lgw/d;-><init>(Ljava/lang/String;)V

    move-object/from16 v20, v4

    goto/16 :goto_2

    :cond_1a
    const-string v6, "apu"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1b

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lxw/b;->d(Ljava/lang/String;)Lxw/b;

    move-result-object v21

    goto/16 :goto_2

    :cond_1b
    const-string v6, "apv"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1c

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lxw/b;->d(Ljava/lang/String;)Lxw/b;

    move-result-object v22

    goto/16 :goto_2

    :cond_1c
    const-string v6, "p2s"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1d

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lxw/b;->d(Ljava/lang/String;)Lxw/b;

    move-result-object v23

    goto/16 :goto_2

    :cond_1d
    const-string v6, "p2c"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_20

    const-class v3, Ljava/lang/Number;

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    if-eqz v3, :cond_1f

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v24

    if-ltz v24, :cond_1e

    goto/16 :goto_2

    :cond_1e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The PBES2 count parameter must not be negative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    new-instance v0, Ljava/text/ParseException;

    const-string v1, "JSON object member "

    const-string v2, " is missing or null"

    invoke-static {v1, v4, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v5}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_20
    const-string v6, "iv"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_21

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lxw/b;->d(Ljava/lang/String;)Lxw/b;

    move-result-object v25

    goto/16 :goto_2

    :cond_21
    const-string v6, "tag"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_22

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lxw/b;->d(Ljava/lang/String;)Lxw/b;

    move-result-object v26

    goto/16 :goto_2

    :cond_22
    const-string v6, "skid"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_23

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v27, v3

    check-cast v27, Ljava/lang/String;

    goto/16 :goto_2

    :cond_23
    const-string v6, "iss"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_24

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v28, v3

    check-cast v28, Ljava/lang/String;

    goto/16 :goto_2

    :cond_24
    const-string v6, "sub"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_25

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v29, v3

    check-cast v29, Ljava/lang/String;

    goto/16 :goto_2

    :cond_25
    const-string v6, "aud"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_27

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    instance-of v6, v6, Ljava/lang/String;

    if-eqz v6, :cond_26

    invoke-static {v0, v4, v3}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v30

    goto/16 :goto_2

    :cond_26
    invoke-static {v4, v0}, Lxw/d;->g(Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;

    move-result-object v30

    goto/16 :goto_2

    :cond_27
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v6, Lgw/k;->b0:Ljava/util/Set;

    invoke-interface {v6, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_29

    if-nez v31, :cond_28

    new-instance v31, Ljava/util/HashMap;

    invoke-direct/range {v31 .. v31}, Ljava/util/HashMap;-><init>()V

    :cond_28
    move-object/from16 v6, v31

    invoke-virtual {v6, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v31, v6

    goto/16 :goto_2

    :cond_29
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The parameter name \""

    const-string v2, "\" matches a registered name"

    invoke-static {v1, v4, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2a
    new-instance v6, Lgw/k;

    move-object/from16 v32, p0

    invoke-direct/range {v6 .. v32}, Lgw/k;-><init>(Lgw/a;Lgw/f;Lgw/h;Ljava/lang/String;Ljava/util/HashSet;Ljava/net/URI;Lnw/d;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/LinkedList;Ljava/lang/String;Lnw/d;Lgw/d;Lxw/b;Lxw/b;Lxw/b;ILxw/b;Lxw/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/HashMap;Lxw/b;)V

    return-object v6
.end method


# virtual methods
.method public final b()Ljava/util/HashMap;
    .locals 5

    invoke-super {p0}, Lgw/c;->b()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lgw/k;->O:Lgw/f;

    if-eqz v1, :cond_0

    const-string v2, "enc"

    iget-object v1, v1, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lgw/k;->P:Lnw/d;

    if-eqz v1, :cond_1

    const-string v2, "epk"

    invoke-virtual {v1}, Lnw/d;->d()Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, Lgw/k;->Q:Lgw/d;

    if-eqz v1, :cond_2

    const-string v2, "zip"

    iget-object v1, v1, Lgw/d;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, Lgw/k;->R:Lxw/b;

    if-eqz v1, :cond_3

    const-string v2, "apu"

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, Lgw/k;->S:Lxw/b;

    if-eqz v1, :cond_4

    const-string v2, "apv"

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v1, p0, Lgw/k;->T:Lxw/b;

    if-eqz v1, :cond_5

    const-string v2, "p2s"

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget v1, p0, Lgw/k;->U:I

    if-lez v1, :cond_6

    const-string v2, "p2c"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    iget-object v1, p0, Lgw/k;->V:Lxw/b;

    if-eqz v1, :cond_7

    const-string v2, "iv"

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget-object v1, p0, Lgw/k;->W:Lxw/b;

    if-eqz v1, :cond_8

    const-string v2, "tag"

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    iget-object v1, p0, Lgw/k;->X:Ljava/lang/String;

    if-eqz v1, :cond_9

    const-string v2, "skid"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    iget-object v1, p0, Lgw/k;->Y:Ljava/lang/String;

    if-eqz v1, :cond_a

    const-string v2, "iss"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    iget-object v1, p0, Lgw/k;->Z:Ljava/lang/String;

    if-eqz v1, :cond_b

    const-string v2, "sub"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    iget-object v1, p0, Lgw/k;->a0:Ljava/util/List;

    if-eqz v1, :cond_d

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    const-string v4, "aud"

    if-ne v2, v3, :cond_c

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0

    :cond_c
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_d

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    return-object v0
.end method
