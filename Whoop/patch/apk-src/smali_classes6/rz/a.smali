.class public final Lrz/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Lkz/d;Ljava/lang/String;)Ljava/lang/String;
    .locals 14

    invoke-virtual {p0}, Lkz/d;->f()Ljz/e;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Ljz/e;->F:Ljz/d;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const-string v2, "args"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ltx/f;->N(Lkz/d;)Lkz/i;

    move-result-object v2

    sget-object v3, Lkz/i;->x:Lkz/i;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v2, v3, :cond_1

    move v2, v5

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    invoke-virtual {p0}, Lkz/d;->f()Ljz/e;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v3, v3, Ljz/e;->y:Ly00/p2;

    goto :goto_2

    :cond_2
    move-object v3, v1

    :goto_2
    invoke-virtual {p0}, Lkz/d;->f()Ljz/e;

    move-result-object v6

    if-eqz v6, :cond_3

    iget-object v6, v6, Ljz/e;->E:Ljz/c;

    goto :goto_3

    :cond_3
    move-object v6, v1

    :goto_3
    invoke-virtual {p0}, Lkz/d;->f()Ljz/e;

    move-result-object v7

    if-eqz v7, :cond_4

    iget-object v7, v7, Ljz/e;->G:Ly00/j2;

    goto :goto_4

    :cond_4
    move-object v7, v1

    :goto_4
    invoke-virtual {p0}, Lkz/d;->f()Ljz/e;

    move-result-object p0

    if-eqz p0, :cond_5

    iget-object p0, p0, Ljz/e;->z:Ljz/a;

    goto :goto_5

    :cond_5
    move-object p0, v1

    :goto_5
    if-nez p1, :cond_6

    return-object v1

    :cond_6
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v8

    if-eqz v2, :cond_17

    const-string p1, "return_payment_method=true"

    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string p1, "expand_payment_method=true"

    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v7, :cond_7

    move v4, v5

    :cond_7
    const-string p1, "instantDebitsIncentive="

    invoke-static {p1, v4, v8}, Lq63/c;->x(Ljava/lang/String;ZLjava/util/ArrayList;)V

    if-eqz v3, :cond_8

    iget-object p1, v3, Ly00/p2;->w:Ljava/lang/String;

    const-string v2, "link_mode="

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    if-eqz v6, :cond_15

    iget-object p1, v6, Ljz/c;->z:Ljz/b;

    if-eqz p1, :cond_10

    new-instance v2, Ln83/f;

    invoke-direct {v2}, Ln83/f;-><init>()V

    iget-object v3, p1, Ljz/b;->w:Ljava/lang/String;

    if-eqz v3, :cond_9

    const-string v4, "line1"

    invoke-virtual {v2, v4, v3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    :cond_9
    iget-object v3, p1, Ljz/b;->x:Ljava/lang/String;

    if-eqz v3, :cond_a

    const-string v4, "line2"

    invoke-virtual {v2, v4, v3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    :cond_a
    iget-object v3, p1, Ljz/b;->y:Ljava/lang/String;

    if-eqz v3, :cond_b

    const-string v4, "postal_code"

    invoke-virtual {v2, v4, v3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    :cond_b
    iget-object v3, p1, Ljz/b;->z:Ljava/lang/String;

    if-eqz v3, :cond_c

    const-string v4, "city"

    invoke-virtual {v2, v4, v3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    :cond_c
    iget-object v3, p1, Ljz/b;->E:Ljava/lang/String;

    if-eqz v3, :cond_d

    const-string v4, "state"

    invoke-virtual {v2, v4, v3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    :cond_d
    iget-object p1, p1, Ljz/b;->F:Ljava/lang/String;

    if-eqz p1, :cond_e

    const-string v3, "country"

    invoke-virtual {v2, v3, p1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_e
    invoke-virtual {v2}, Ln83/f;->b()Ln83/f;

    move-result-object p1

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p1}, Ln83/f;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ln83/g;

    invoke-virtual {p1}, Ln83/g;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_f
    :goto_6
    move-object v3, p1

    check-cast v3, Li6/c;

    invoke-virtual {v3}, Li6/c;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_11

    move-object v3, p1

    check-cast v3, Ln83/d;

    invoke-virtual {v3}, Ln83/d;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_f

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_10
    move-object v2, v1

    :cond_11
    iget-object p1, v6, Ljz/c;->w:Ljava/lang/String;

    new-instance v3, Ll83/k;

    const-string v4, "name"

    invoke-direct {v3, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, v6, Ljz/c;->y:Ljava/lang/String;

    new-instance v4, Ll83/k;

    const-string v5, "email"

    invoke-direct {v4, v5, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, v6, Ljz/c;->x:Ljava/lang/String;

    new-instance v5, Ll83/k;

    const-string v6, "phone"

    invoke-direct {v5, v6, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance p1, Ll83/k;

    const-string v6, "address"

    invoke-direct {p1, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4, v5, p1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    new-instance v2, Ln83/f;

    invoke-direct {v2}, Ln83/f;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_12
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_12

    invoke-virtual {v2, v4, v3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_7

    :cond_13
    invoke-virtual {v2}, Ln83/f;->b()Ln83/f;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v3, "billingDetails"

    invoke-direct {v2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lyy/q;->b(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object p1

    invoke-static {v1, p1}, Lyy/q;->g(Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Lyv0/h;

    const/16 p1, 0xa

    invoke-direct {v5, p1}, Lyv0/h;-><init>(I)V

    const/16 v6, 0x1e

    const-string v2, "&"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_14

    const-string p1, ""

    :cond_14
    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_15
    if-eqz v7, :cond_16

    invoke-interface {v7}, Ly00/j2;->getId()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "incentiveEligibilitySession="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v8, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_16
    if-eqz p0, :cond_17

    iget-object p0, p0, Ljz/a;->w:Ljava/lang/String;

    const-string p1, "allow_redisplay="

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v8, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_17
    if-eqz v0, :cond_1a

    iget-object p0, v0, Ljz/d;->w:Ljava/lang/String;

    if-eqz p0, :cond_18

    const-string p1, "email="

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v8, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_18
    iget-object p0, v0, Ljz/d;->x:Ljava/lang/String;

    if-eqz p0, :cond_19

    const-string p1, "linkMobilePhone="

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v8, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_19
    iget-object p0, v0, Ljz/d;->y:Ljava/lang/String;

    if-eqz p0, :cond_1a

    const-string p1, "linkMobilePhoneCountry="

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v8, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1a
    const-string p0, "launched_by=android_sdk"

    invoke-virtual {v8, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v12, 0x0

    const/16 v13, 0x3e

    const-string v9, "&"

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
