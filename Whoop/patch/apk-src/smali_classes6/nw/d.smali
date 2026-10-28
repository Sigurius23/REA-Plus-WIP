.class public abstract Lnw/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final E:Ljava/lang/String;

.field public final F:Ljava/net/URI;

.field public final G:Lxw/b;

.field public final H:Lxw/b;

.field public final I:Ljava/util/List;

.field public final J:Ljava/util/Date;

.field public final K:Ljava/util/Date;

.field public final L:Ljava/util/Date;

.field public final M:Lnw/g;

.field public final N:Ljava/util/LinkedList;

.field public final w:Lnw/h;

.field public final x:Lnw/i;

.field public final y:Ljava/util/Set;

.field public final z:Lgw/a;


# direct methods
.method public constructor <init>(Lnw/h;Lnw/i;Ljava/util/Set;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "The key type \"kty\" parameter must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lnw/d;->w:Lnw/h;

    sget-object p1, Lnw/j;->a:Ljava/util/Map;

    if-eqz p2, :cond_2

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lnw/j;->a:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    invoke-interface {p1, p3}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iput-object p2, p0, Lnw/d;->x:Lnw/i;

    iput-object p3, p0, Lnw/d;->y:Ljava/util/Set;

    iput-object p4, p0, Lnw/d;->z:Lgw/a;

    iput-object p5, p0, Lnw/d;->E:Ljava/lang/String;

    iput-object p6, p0, Lnw/d;->F:Ljava/net/URI;

    iput-object p7, p0, Lnw/d;->G:Lxw/b;

    iput-object p8, p0, Lnw/d;->H:Lxw/b;

    if-eqz p9, :cond_4

    invoke-interface {p9}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "The X.509 certificate chain \"x5c\" must not be empty"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    iput-object p9, p0, Lnw/d;->I:Ljava/util/List;

    :try_start_0
    invoke-static {p9}, Ls2/d;->p(Ljava/util/List;)Ljava/util/LinkedList;

    move-result-object p1

    iput-object p1, p0, Lnw/d;->N:Ljava/util/LinkedList;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    iput-object p10, p0, Lnw/d;->J:Ljava/util/Date;

    iput-object p11, p0, Lnw/d;->K:Ljava/util/Date;

    iput-object p12, p0, Lnw/d;->L:Ljava/util/Date;

    iput-object p13, p0, Lnw/d;->M:Lnw/g;

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Invalid X.509 certificate chain \"x5c\": "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public static c(Ljava/util/Map;)Lnw/d;
    .locals 32

    move-object/from16 v0, p0

    const-string v1, "kty"

    invoke-static {v1, v0}, Lxw/d;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-static {v1}, Lnw/h;->a(Ljava/lang/String;)Lnw/h;

    move-result-object v1

    sget-object v3, Lnw/h;->x:Lnw/h;

    if-ne v1, v3, :cond_0

    invoke-static {v0}, Lnw/b;->h(Ljava/util/Map;)Lnw/b;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v3, Lnw/h;->y:Lnw/h;

    const-class v4, Ljava/lang/String;

    const-string v5, "d"

    const-string v6, "x5t#S256"

    const-string v7, "x5t"

    const-string v8, "x5u"

    const-string v9, "kid"

    if-ne v1, v3, :cond_5

    invoke-static {v0}, Lse/b;->R(Ljava/util/Map;)Lnw/h;

    move-result-object v1

    invoke-virtual {v3, v1}, Lnw/h;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "n"

    invoke-static {v1, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v11

    const-string v1, "e"

    invoke-static {v1, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v12

    invoke-static {v5, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v13

    const-string v1, "p"

    invoke-static {v1, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v14

    const-string v1, "q"

    invoke-static {v1, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v15

    const-string v1, "dp"

    invoke-static {v1, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v16

    const-string v1, "dq"

    invoke-static {v1, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v17

    const-string v3, "qi"

    invoke-static {v3, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v18

    const-string v3, "oth"

    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const-class v5, Ljava/util/List;

    invoke-static {v0, v3, v5}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_3

    new-instance v5, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v10

    invoke-direct {v5, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    instance-of v2, v10, Ljava/util/Map;

    if-eqz v2, :cond_1

    check-cast v10, Ljava/util/Map;

    const-string v2, "r"

    invoke-static {v2, v10}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v2

    move-object/from16 v19, v3

    invoke-static {v1, v10}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v3

    move-object/from16 v20, v1

    const-string v1, "t"

    invoke-static {v1, v10}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v1

    :try_start_0
    new-instance v10, Lnw/m;

    invoke-direct {v10, v2, v3, v1}, Lnw/m;-><init>(Lxw/b;Lxw/b;Lxw/b;)V

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/text/ParseException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v1

    :cond_1
    move-object/from16 v20, v1

    move-object/from16 v19, v3

    :goto_1
    move-object/from16 v3, v19

    move-object/from16 v1, v20

    goto :goto_0

    :cond_2
    :goto_2
    move-object/from16 v19, v5

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    goto :goto_2

    :goto_3
    :try_start_1
    new-instance v10, Lnw/n;

    invoke-static {v0}, Lse/b;->S(Ljava/util/Map;)Lnw/i;

    move-result-object v20

    invoke-static {v0}, Lse/b;->P(Ljava/util/Map;)Ljava/util/LinkedHashSet;

    move-result-object v21

    invoke-static {v0}, Lse/b;->M(Ljava/util/Map;)Lgw/a;

    move-result-object v22

    invoke-static {v0, v9, v4}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v23, v1

    check-cast v23, Ljava/lang/String;

    invoke-static {v8, v0}, Lxw/d;->h(Ljava/lang/String;Ljava/util/Map;)Ljava/net/URI;

    move-result-object v24

    invoke-static {v7, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v25

    invoke-static {v6, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v26

    invoke-static {v0}, Lse/b;->U(Ljava/util/Map;)Ljava/util/LinkedList;

    move-result-object v27

    invoke-static {v0}, Lse/b;->N(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v28

    invoke-static {v0}, Lse/b;->T(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v29

    invoke-static {v0}, Lse/b;->O(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v30

    invoke-static {v0}, Lse/b;->Q(Ljava/util/Map;)Lnw/g;

    move-result-object v31

    invoke-direct/range {v10 .. v31}, Lnw/n;-><init>(Lxw/b;Lxw/b;Lxw/b;Lxw/b;Lxw/b;Lxw/b;Lxw/b;Lxw/b;Ljava/util/ArrayList;Lnw/i;Ljava/util/LinkedHashSet;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/LinkedList;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v10

    :catch_1
    move-exception v0

    new-instance v1, Ljava/text/ParseException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v1

    :cond_4
    const/4 v2, 0x0

    new-instance v0, Ljava/text/ParseException;

    const-string v1, "The key type \"kty\" must be RSA"

    invoke-direct {v0, v1, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_5
    sget-object v2, Lnw/h;->z:Lnw/h;

    const-string v3, "The key type kty must be "

    if-ne v1, v2, :cond_7

    invoke-static {v0}, Lse/b;->R(Ljava/util/Map;)Lnw/h;

    move-result-object v1

    invoke-virtual {v2, v1}, Lnw/h;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "k"

    invoke-static {v1, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v11

    :try_start_2
    new-instance v10, Lnw/l;

    invoke-static {v0}, Lse/b;->S(Ljava/util/Map;)Lnw/i;

    move-result-object v12

    invoke-static {v0}, Lse/b;->P(Ljava/util/Map;)Ljava/util/LinkedHashSet;

    move-result-object v13

    invoke-static {v0}, Lse/b;->M(Ljava/util/Map;)Lgw/a;

    move-result-object v14

    invoke-static {v0, v9, v4}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Ljava/lang/String;

    invoke-static {v8, v0}, Lxw/d;->h(Ljava/lang/String;Ljava/util/Map;)Ljava/net/URI;

    move-result-object v16

    invoke-static {v7, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v17

    invoke-static {v6, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v18

    invoke-static {v0}, Lse/b;->U(Ljava/util/Map;)Ljava/util/LinkedList;

    move-result-object v19

    invoke-static {v0}, Lse/b;->N(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v20

    invoke-static {v0}, Lse/b;->T(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v21

    invoke-static {v0}, Lse/b;->O(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v22

    invoke-static {v0}, Lse/b;->Q(Ljava/util/Map;)Lnw/g;

    move-result-object v23

    invoke-direct/range {v10 .. v23}, Lnw/l;-><init>(Lxw/b;Lnw/i;Ljava/util/LinkedHashSet;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/LinkedList;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    return-object v10

    :catch_2
    move-exception v0

    new-instance v1, Ljava/text/ParseException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    invoke-direct {v1, v0, v4}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v1

    :cond_6
    const/4 v4, 0x0

    new-instance v0, Ljava/text/ParseException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v2, Lnw/h;->w:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v4}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_7
    sget-object v2, Lnw/h;->E:Lnw/h;

    if-ne v1, v2, :cond_a

    sget-object v1, Lnw/k;->T:Ljava/util/Set;

    invoke-static {v0}, Lse/b;->R(Ljava/util/Map;)Lnw/h;

    move-result-object v1

    invoke-virtual {v2, v1}, Lnw/h;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    :try_start_3
    const-string v1, "crv"

    invoke-static {v0, v1, v4}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lnw/a;->b(Ljava/lang/String;)Lnw/a;

    move-result-object v11
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_4

    const-string v1, "x"

    invoke-static {v1, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v12

    invoke-static {v5, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v13

    if-nez v13, :cond_8

    :try_start_4
    new-instance v10, Lnw/k;

    invoke-static {v0}, Lse/b;->S(Ljava/util/Map;)Lnw/i;

    move-result-object v13

    invoke-static {v0}, Lse/b;->P(Ljava/util/Map;)Ljava/util/LinkedHashSet;

    move-result-object v14

    invoke-static {v0}, Lse/b;->M(Ljava/util/Map;)Lgw/a;

    move-result-object v15

    invoke-static {v0, v9, v4}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Ljava/lang/String;

    invoke-static {v8, v0}, Lxw/d;->h(Ljava/lang/String;Ljava/util/Map;)Ljava/net/URI;

    move-result-object v17

    invoke-static {v7, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v18

    invoke-static {v6, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v19

    invoke-static {v0}, Lse/b;->U(Ljava/util/Map;)Ljava/util/LinkedList;

    move-result-object v20

    invoke-static {v0}, Lse/b;->N(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v21

    invoke-static {v0}, Lse/b;->T(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v22

    invoke-static {v0}, Lse/b;->O(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v23

    invoke-static {v0}, Lse/b;->Q(Ljava/util/Map;)Lnw/g;

    move-result-object v24

    invoke-direct/range {v10 .. v24}, Lnw/k;-><init>(Lnw/a;Lxw/b;Lnw/i;Ljava/util/LinkedHashSet;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/LinkedList;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V

    return-object v10

    :catch_3
    move-exception v0

    goto :goto_4

    :cond_8
    new-instance v10, Lnw/k;

    invoke-static {v0}, Lse/b;->S(Ljava/util/Map;)Lnw/i;

    move-result-object v14

    invoke-static {v0}, Lse/b;->P(Ljava/util/Map;)Ljava/util/LinkedHashSet;

    move-result-object v15

    invoke-static {v0}, Lse/b;->M(Ljava/util/Map;)Lgw/a;

    move-result-object v16

    invoke-static {v0, v9, v4}, Lxw/d;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Ljava/lang/String;

    invoke-static {v8, v0}, Lxw/d;->h(Ljava/lang/String;Ljava/util/Map;)Ljava/net/URI;

    move-result-object v18

    invoke-static {v7, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v19

    invoke-static {v6, v0}, Lxw/d;->a(Ljava/lang/String;Ljava/util/Map;)Lxw/b;

    move-result-object v20

    invoke-static {v0}, Lse/b;->U(Ljava/util/Map;)Ljava/util/LinkedList;

    move-result-object v21

    invoke-static {v0}, Lse/b;->N(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v22

    invoke-static {v0}, Lse/b;->T(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v23

    invoke-static {v0}, Lse/b;->O(Ljava/util/Map;)Ljava/util/Date;

    move-result-object v24

    invoke-static {v0}, Lse/b;->Q(Ljava/util/Map;)Lnw/g;

    move-result-object v25

    invoke-direct/range {v10 .. v25}, Lnw/k;-><init>(Lnw/a;Lxw/b;Lxw/b;Lnw/i;Ljava/util/LinkedHashSet;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/LinkedList;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    return-object v10

    :goto_4
    new-instance v1, Ljava/text/ParseException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v1

    :catch_4
    move-exception v0

    new-instance v1, Ljava/text/ParseException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    invoke-direct {v1, v0, v4}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v1

    :cond_9
    const/4 v4, 0x0

    new-instance v0, Ljava/text/ParseException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v2, Lnw/h;->w:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v4}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_a
    const/4 v4, 0x0

    new-instance v0, Ljava/text/ParseException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unsupported key type \"kty\" parameter: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, v4}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_b
    const/4 v4, 0x0

    new-instance v0, Ljava/text/ParseException;

    const-string v1, "Missing key type \"kty\" parameter"

    invoke-direct {v0, v1, v4}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lnw/d;->N:Ljava/util/LinkedList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public abstract b()Z
.end method

.method public d()Ljava/util/HashMap;
    .locals 7

    sget-object v0, Lxw/d;->a:Low/m;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lnw/d;->w:Lnw/h;

    iget-object v1, v1, Lnw/h;->w:Ljava/lang/String;

    const-string v2, "kty"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lnw/d;->x:Lnw/i;

    if-eqz v1, :cond_0

    const-string v2, "use"

    iget-object v1, v1, Lnw/i;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lnw/d;->y:Ljava/util/Set;

    if-eqz v1, :cond_2

    sget v2, Lxw/c;->a:I

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lnw/e;

    iget-object v3, v3, Lnw/e;->w:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const-string v1, "key_ops"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v1, p0, Lnw/d;->z:Lgw/a;

    if-eqz v1, :cond_3

    const-string v2, "alg"

    iget-object v1, v1, Lgw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, Lnw/d;->E:Ljava/lang/String;

    if-eqz v1, :cond_4

    const-string v2, "kid"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v1, p0, Lnw/d;->F:Ljava/net/URI;

    if-eqz v1, :cond_5

    const-string v2, "x5u"

    invoke-virtual {v1}, Ljava/net/URI;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget-object v1, p0, Lnw/d;->G:Lxw/b;

    if-eqz v1, :cond_6

    const-string v2, "x5t"

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    iget-object v1, p0, Lnw/d;->H:Lxw/b;

    if-eqz v1, :cond_7

    const-string v2, "x5t#S256"

    iget-object v1, v1, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget-object v1, p0, Lnw/d;->I:Ljava/util/List;

    if-eqz v1, :cond_9

    sget v2, Lxw/c;->a:I

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxw/a;

    iget-object v3, v3, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_8
    const-string v1, "x5c"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    const-wide/16 v1, 0x3e8

    iget-object v3, p0, Lnw/d;->J:Ljava/util/Date;

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    div-long/2addr v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "exp"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    iget-object v3, p0, Lnw/d;->K:Ljava/util/Date;

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    div-long/2addr v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "nbf"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_b
    iget-object v3, p0, Lnw/d;->L:Ljava/util/Date;

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    div-long/2addr v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "iat"

    invoke-virtual {v0, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    iget-object v3, p0, Lnw/d;->M:Lnw/g;

    if-eqz v3, :cond_e

    sget-object v4, Lxw/d;->a:Low/m;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    iget-object v5, v3, Lnw/g;->w:Ljava/util/Date;

    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    div-long/2addr v5, v1

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "revoked_at"

    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v3, Lnw/g;->x:Lnw/f;

    if-eqz v1, :cond_d

    const-string v2, "reason"

    iget-object v1, v1, Lnw/f;->a:Ljava/lang/String;

    invoke-virtual {v4, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    const-string v1, "revoked"

    invoke-virtual {v0, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lnw/d;

    if-nez v1, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lnw/d;

    iget-object v1, p0, Lnw/d;->w:Lnw/h;

    iget-object v2, p1, Lnw/d;->w:Lnw/h;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnw/d;->x:Lnw/i;

    iget-object v2, p1, Lnw/d;->x:Lnw/i;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnw/d;->y:Ljava/util/Set;

    iget-object v2, p1, Lnw/d;->y:Ljava/util/Set;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnw/d;->z:Lgw/a;

    iget-object v2, p1, Lnw/d;->z:Lgw/a;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnw/d;->E:Ljava/lang/String;

    iget-object v2, p1, Lnw/d;->E:Ljava/lang/String;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnw/d;->F:Ljava/net/URI;

    iget-object v2, p1, Lnw/d;->F:Ljava/net/URI;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnw/d;->G:Lxw/b;

    iget-object v2, p1, Lnw/d;->G:Lxw/b;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnw/d;->H:Lxw/b;

    iget-object v2, p1, Lnw/d;->H:Lxw/b;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnw/d;->I:Ljava/util/List;

    iget-object v2, p1, Lnw/d;->I:Ljava/util/List;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnw/d;->J:Ljava/util/Date;

    iget-object v2, p1, Lnw/d;->J:Ljava/util/Date;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnw/d;->K:Ljava/util/Date;

    iget-object v2, p1, Lnw/d;->K:Ljava/util/Date;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnw/d;->L:Ljava/util/Date;

    iget-object v2, p1, Lnw/d;->L:Ljava/util/Date;

    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lnw/d;->M:Lnw/g;

    iget-object p1, p1, Lnw/d;->M:Lnw/g;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 14

    iget-object v12, p0, Lnw/d;->M:Lnw/g;

    const/4 v13, 0x0

    iget-object v0, p0, Lnw/d;->w:Lnw/h;

    iget-object v1, p0, Lnw/d;->x:Lnw/i;

    iget-object v2, p0, Lnw/d;->y:Ljava/util/Set;

    iget-object v3, p0, Lnw/d;->z:Lgw/a;

    iget-object v4, p0, Lnw/d;->E:Ljava/lang/String;

    iget-object v5, p0, Lnw/d;->F:Ljava/net/URI;

    iget-object v6, p0, Lnw/d;->G:Lxw/b;

    iget-object v7, p0, Lnw/d;->H:Lxw/b;

    iget-object v8, p0, Lnw/d;->I:Ljava/util/List;

    iget-object v9, p0, Lnw/d;->J:Ljava/util/Date;

    iget-object v10, p0, Lnw/d;->K:Ljava/util/Date;

    iget-object v11, p0, Lnw/d;->L:Ljava/util/Date;

    filled-new-array/range {v0 .. v13}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lnw/d;->d()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v0}, Lxw/d;->j(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
