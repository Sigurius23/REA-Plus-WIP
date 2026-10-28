.class public final Llg3/a;
.super Lce/w;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public final F:Ljava/util/HashMap;

.field public G:Lkg3/d;

.field public H:Ljg3/o;

.field public I:Lkg3/a;

.field public J:Ljg3/f;

.field public K:Ljg3/k;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Llg3/a;->F:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a(Lng3/m;)Z
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Llg3/a;->F:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Llg3/a;->I:Lkg3/a;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lkg3/a;->a(Lng3/m;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    iget-object v0, p0, Llg3/a;->J:Ljg3/f;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Ljg3/f;->a(Lng3/m;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_3
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final g(Lng3/q;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lng3/p;->a:Lg73/a;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Llg3/a;->H:Ljg3/o;

    return-object p1

    :cond_0
    sget-object v0, Lng3/p;->b:Lg73/d;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Llg3/a;->G:Lkg3/d;

    return-object p1

    :cond_1
    sget-object v0, Lng3/p;->f:Lng3/o;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Llg3/a;->I:Lkg3/a;

    if-eqz p1, :cond_5

    invoke-static {p1}, Ljg3/d;->q0(Lng3/k;)Ljg3/d;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object v0, Lng3/p;->g:Lng3/n;

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Llg3/a;->J:Ljg3/f;

    return-object p1

    :cond_3
    sget-object v0, Lng3/p;->d:Lng3/o;

    if-eq p1, v0, :cond_7

    sget-object v0, Lng3/p;->e:Lng3/n;

    if-ne p1, v0, :cond_4

    goto :goto_0

    :cond_4
    sget-object v0, Lng3/p;->c:Lng3/n;

    if-ne p1, v0, :cond_6

    :cond_5
    const/4 p1, 0x0

    return-object p1

    :cond_6
    invoke-interface {p1, p0}, Lng3/q;->l(Lng3/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    :goto_0
    invoke-interface {p1, p0}, Lng3/q;->l(Lng3/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(Lng3/m;)J
    .locals 2

    const-string v0, "field"

    invoke-static {p1, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llg3/a;->F:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-nez v0, :cond_2

    iget-object v0, p0, Llg3/a;->I:Lkg3/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lkg3/a;->a(Lng3/m;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llg3/a;->I:Lkg3/a;

    check-cast v0, Ljg3/d;

    invoke-virtual {v0, p1}, Ljg3/d;->h(Lng3/m;)J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p0, Llg3/a;->J:Ljg3/f;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Ljg3/f;->a(Lng3/m;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Llg3/a;->J:Ljg3/f;

    invoke-virtual {v0, p1}, Ljg3/f;->h(Lng3/m;)J

    move-result-wide v0

    return-wide v0

    :cond_1
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    const-string v1, "Field not found: "

    invoke-static {v1, p1}, Lhc3/i;->f(Ljava/lang/String;Lng3/m;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final o0(JLng3/m;)V
    .locals 4

    const-string v0, "field"

    invoke-static {p3, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llg3/a;->F:Ljava/util/HashMap;

    invoke-virtual {v0, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v2, v2, p1

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Conflict found: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " differs from "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final p0(Ljg3/d;)V
    .locals 8

    if-eqz p1, :cond_2

    iput-object p1, p0, Llg3/a;->I:Lkg3/a;

    iget-object v0, p0, Llg3/a;->F:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :catch_0
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lng3/m;

    instance-of v3, v2, Lng3/a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lng3/a;

    invoke-virtual {v3}, Lng3/a;->isDateBased()Z

    move-result v3

    if-eqz v3, :cond_0

    :try_start_0
    invoke-virtual {p1, v2}, Ljg3/d;->h(Lng3/m;)J

    move-result-wide v3
    :try_end_0
    .catch Lorg/threeten/bp/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    cmp-long v6, v3, v6

    if-nez v6, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "Conflict found: Field "

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " "

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " differs from "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " derived from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-void
.end method

.method public final q0(Lng3/k;)V
    .locals 7

    iget-object v0, p0, Llg3/a;->F:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lng3/m;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-interface {p1, v2}, Lng3/k;->a(Lng3/m;)Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-interface {p1, v2}, Lng3/k;->h(Lng3/m;)J

    move-result-wide v5
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long v1, v5, v3

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    new-instance p1, Lorg/threeten/bp/DateTimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cross check failed: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, " vs "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    return-void
.end method

.method public final r0(Llg3/u;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Llg3/a;->G:Lkg3/d;

    instance-of v2, v2, Lkg3/e;

    iget-object v3, v0, Llg3/a;->F:Ljava/util/HashMap;

    if-eqz v2, :cond_26

    sget-object v2, Lkg3/e;->w:Lkg3/e;

    sget-object v2, Lng3/a;->W:Lng3/a;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljg3/d;->u0(J)Ljg3/d;

    move-result-object v1

    goto/16 :goto_9

    :cond_0
    sget-object v2, Lng3/a;->a0:Lng3/a;

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    sget-object v5, Llg3/u;->y:Llg3/u;

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-eq v1, v5, :cond_1

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-virtual {v2, v7, v8}, Lng3/a;->f(J)V

    :cond_1
    sget-object v2, Lng3/a;->Z:Lng3/a;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    const/16 v9, 0xc

    invoke-static {v9, v7, v8}, Lcom/squareup/wire/n;->B(IJ)I

    move-result v7

    add-int/2addr v7, v6

    int-to-long v7, v7

    invoke-static {v3, v2, v7, v8}, Lkg3/d;->b(Ljava/util/HashMap;Lng3/a;J)V

    sget-object v2, Lng3/a;->c0:Lng3/a;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    const-wide/16 v9, 0xc

    invoke-static {v7, v8, v9, v10}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v7

    invoke-static {v3, v2, v7, v8}, Lkg3/d;->b(Ljava/util/HashMap;Lng3/a;J)V

    :cond_2
    sget-object v2, Lng3/a;->b0:Lng3/a;

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    const-wide/16 v7, 0x0

    sget-object v9, Llg3/u;->w:Llg3/u;

    const-wide/16 v10, 0x1

    if-eqz v4, :cond_c

    if-eq v1, v5, :cond_3

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-virtual {v2, v12, v13}, Lng3/a;->f(J)V

    :cond_3
    sget-object v12, Lng3/a;->d0:Lng3/a;

    invoke-interface {v3, v12}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Long;

    if-nez v12, :cond_9

    sget-object v12, Lng3/a;->c0:Lng3/a;

    invoke-interface {v3, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Long;

    if-ne v1, v9, :cond_6

    if-eqz v13, :cond_5

    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    cmp-long v2, v13, v7

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    if-lez v2, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {v10, v11, v13, v14}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide v13

    :goto_0
    invoke-static {v3, v12, v13, v14}, Lkg3/d;->b(Ljava/util/HashMap;Lng3/a;J)V

    goto/16 :goto_3

    :cond_5
    invoke-interface {v3, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_6
    if-eqz v13, :cond_8

    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    cmp-long v2, v13, v7

    if-lez v2, :cond_7

    goto :goto_1

    :cond_7
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    invoke-static {v10, v11, v13, v14}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide v13

    goto :goto_2

    :cond_8
    :goto_1
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    :goto_2
    invoke-static {v3, v12, v13, v14}, Lkg3/d;->b(Ljava/util/HashMap;Lng3/a;J)V

    goto :goto_3

    :cond_9
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    cmp-long v2, v13, v10

    if-nez v2, :cond_a

    sget-object v2, Lng3/a;->c0:Lng3/a;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-static {v3, v2, v12, v13}, Lkg3/d;->b(Ljava/util/HashMap;Lng3/a;J)V

    goto :goto_3

    :cond_a
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    cmp-long v2, v13, v7

    if-nez v2, :cond_b

    sget-object v2, Lng3/a;->c0:Lng3/a;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-static {v10, v11, v12, v13}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide v12

    invoke-static {v3, v2, v12, v13}, Lkg3/d;->b(Ljava/util/HashMap;Lng3/a;J)V

    goto :goto_3

    :cond_b
    new-instance v1, Lorg/threeten/bp/DateTimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid value for era: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    sget-object v2, Lng3/a;->d0:Lng3/a;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-virtual {v2, v12, v13}, Lng3/a;->f(J)V

    :cond_d
    :goto_3
    sget-object v2, Lng3/a;->c0:Lng3/a;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_25

    sget-object v4, Lng3/a;->Z:Lng3/a;

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    const-string v14, "Strict mode rejected date parsed to a different month"

    if-eqz v12, :cond_1c

    sget-object v12, Lng3/a;->U:Lng3/a;

    invoke-interface {v3, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_15

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Long;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    iget-object v11, v2, Lng3/a;->x:Lng3/s;

    invoke-virtual {v11, v9, v10, v2}, Lng3/s;->a(JLng3/m;)I

    move-result v2

    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    invoke-static {v9, v10}, Lcom/squareup/wire/n;->b0(J)I

    move-result v4

    invoke-interface {v3, v12}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    invoke-static {v9, v10}, Lcom/squareup/wire/n;->b0(J)I

    move-result v3

    if-ne v1, v5, :cond_e

    invoke-static {v4}, Lcom/squareup/wire/n;->Z(I)I

    move-result v1

    int-to-long v4, v1

    invoke-static {v3}, Lcom/squareup/wire/n;->Z(I)I

    move-result v1

    int-to-long v7, v1

    invoke-static {v2, v6, v6}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljg3/d;->y0(J)Ljg3/d;

    move-result-object v1

    invoke-virtual {v1, v7, v8}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object v1

    goto/16 :goto_9

    :cond_e
    sget-object v5, Llg3/u;->x:Llg3/u;

    if-ne v1, v5, :cond_14

    int-to-long v9, v3

    invoke-virtual {v12, v9, v10}, Lng3/a;->f(J)V

    const/4 v1, 0x4

    if-eq v4, v1, :cond_12

    const/4 v1, 0x6

    if-eq v4, v1, :cond_12

    const/16 v1, 0x9

    if-eq v4, v1, :cond_12

    const/16 v1, 0xb

    if-ne v4, v1, :cond_f

    goto :goto_5

    :cond_f
    const/4 v1, 0x2

    if-ne v4, v1, :cond_13

    sget-object v1, Ljg3/g;->w:Ljg3/g;

    int-to-long v9, v2

    sget v5, Ljg3/m;->G:I

    const-wide/16 v11, 0x3

    and-long/2addr v11, v9

    cmp-long v5, v11, v7

    if-nez v5, :cond_10

    const-wide/16 v11, 0x64

    rem-long v11, v9, v11

    cmp-long v5, v11, v7

    if-nez v5, :cond_11

    const-wide/16 v11, 0x190

    rem-long/2addr v9, v11

    cmp-long v5, v9, v7

    if-nez v5, :cond_10

    goto :goto_4

    :cond_10
    const/4 v6, 0x0

    :cond_11
    :goto_4
    invoke-virtual {v1, v6}, Ljg3/g;->m(Z)I

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v3

    goto :goto_6

    :cond_12
    :goto_5
    const/16 v1, 0x1e

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v3

    :cond_13
    :goto_6
    invoke-static {v2, v4, v3}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object v1

    goto/16 :goto_9

    :cond_14
    invoke-static {v2, v4, v3}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object v1

    goto/16 :goto_9

    :cond_15
    sget-object v7, Lng3/a;->X:Lng3/a;

    invoke-interface {v3, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1c

    sget-object v8, Lng3/a;->S:Lng3/a;

    invoke-interface {v3, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_19

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Long;

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iget-object v15, v2, Lng3/a;->x:Lng3/s;

    invoke-virtual {v15, v12, v13, v2}, Lng3/s;->a(JLng3/m;)I

    move-result v2

    if-ne v1, v5, :cond_16

    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5, v10, v11}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide v4

    invoke-interface {v3, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-static {v12, v13, v10, v11}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide v12

    invoke-interface {v3, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v7, v8, v10, v11}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide v7

    invoke-static {v2, v6, v6}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljg3/d;->y0(J)Ljg3/d;

    move-result-object v1

    invoke-virtual {v1, v12, v13}, Ljg3/d;->z0(J)Ljg3/d;

    move-result-object v1

    invoke-virtual {v1, v7, v8}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object v1

    goto/16 :goto_9

    :cond_16
    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    iget-object v5, v4, Lng3/a;->x:Lng3/s;

    invoke-virtual {v5, v10, v11, v4}, Lng3/s;->a(JLng3/m;)I

    move-result v5

    invoke-interface {v3, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Long;

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    iget-object v12, v7, Lng3/a;->x:Lng3/s;

    invoke-virtual {v12, v10, v11, v7}, Lng3/s;->a(JLng3/m;)I

    move-result v7

    invoke-interface {v3, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    iget-object v3, v8, Lng3/a;->x:Lng3/s;

    invoke-virtual {v3, v10, v11, v8}, Lng3/s;->a(JLng3/m;)I

    move-result v3

    invoke-static {v2, v5, v6}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object v2

    sub-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x7

    sub-int/2addr v3, v6

    add-int/2addr v3, v7

    int-to-long v6, v3

    invoke-virtual {v2, v6, v7}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object v2

    if-ne v1, v9, :cond_18

    invoke-virtual {v2, v4}, Ljg3/d;->f(Lng3/m;)I

    move-result v1

    if-ne v1, v5, :cond_17

    goto :goto_7

    :cond_17
    new-instance v1, Lorg/threeten/bp/DateTimeException;

    invoke-direct {v1, v14}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_18
    :goto_7
    move-object v1, v2

    goto/16 :goto_9

    :cond_19
    sget-object v8, Lng3/a;->R:Lng3/a;

    invoke-interface {v3, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1c

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Long;

    move-object v15, v14

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    iget-object v12, v2, Lng3/a;->x:Lng3/s;

    invoke-virtual {v12, v13, v14, v2}, Lng3/s;->a(JLng3/m;)I

    move-result v2

    if-ne v1, v5, :cond_1a

    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5, v10, v11}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide v4

    invoke-interface {v3, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-static {v12, v13, v10, v11}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide v12

    invoke-interface {v3, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-static {v7, v8, v10, v11}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide v7

    invoke-static {v2, v6, v6}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljg3/d;->y0(J)Ljg3/d;

    move-result-object v1

    invoke-virtual {v1, v12, v13}, Ljg3/d;->z0(J)Ljg3/d;

    move-result-object v1

    invoke-virtual {v1, v7, v8}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object v1

    goto/16 :goto_9

    :cond_1a
    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    iget-object v5, v4, Lng3/a;->x:Lng3/s;

    invoke-virtual {v5, v10, v11, v4}, Lng3/s;->a(JLng3/m;)I

    move-result v5

    invoke-interface {v3, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Long;

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    iget-object v12, v7, Lng3/a;->x:Lng3/s;

    invoke-virtual {v12, v10, v11, v7}, Lng3/s;->a(JLng3/m;)I

    move-result v7

    invoke-interface {v3, v8}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    iget-object v3, v8, Lng3/a;->x:Lng3/s;

    invoke-virtual {v3, v10, v11, v8}, Lng3/s;->a(JLng3/m;)I

    move-result v3

    invoke-static {v2, v5, v6}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object v2

    sub-int/2addr v7, v6

    int-to-long v6, v7

    invoke-virtual {v2, v6, v7}, Ljg3/d;->z0(J)Ljg3/d;

    move-result-object v2

    invoke-static {v3}, Ljg3/a;->l(I)Ljg3/a;

    move-result-object v3

    new-instance v6, Lc9/k;

    const/4 v7, 0x0

    invoke-direct {v6, v7, v3}, Lc9/k;-><init>(ILjg3/a;)V

    invoke-virtual {v2, v6}, Ljg3/d;->D0(Lng3/l;)Ljg3/d;

    move-result-object v2

    if-ne v1, v9, :cond_18

    invoke-virtual {v2, v4}, Ljg3/d;->f(Lng3/m;)I

    move-result v1

    if-ne v1, v5, :cond_1b

    goto/16 :goto_7

    :cond_1b
    new-instance v1, Lorg/threeten/bp/DateTimeException;

    invoke-direct {v1, v15}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1c
    move-object v15, v14

    sget-object v4, Lng3/a;->V:Lng3/a;

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1e

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    iget-object v9, v2, Lng3/a;->x:Lng3/s;

    invoke-virtual {v9, v7, v8, v2}, Lng3/s;->a(JLng3/m;)I

    move-result v2

    if-ne v1, v5, :cond_1d

    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4, v10, v11}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide v3

    invoke-static {v2, v6}, Ljg3/d;->v0(II)Ljg3/d;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object v1

    goto/16 :goto_9

    :cond_1d
    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v1, v4, Lng3/a;->x:Lng3/s;

    invoke-virtual {v1, v5, v6, v4}, Lng3/s;->a(JLng3/m;)I

    move-result v1

    invoke-static {v2, v1}, Ljg3/d;->v0(II)Ljg3/d;

    move-result-object v1

    goto/16 :goto_9

    :cond_1e
    sget-object v4, Lng3/a;->Y:Lng3/a;

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_25

    sget-object v7, Lng3/a;->T:Lng3/a;

    invoke-interface {v3, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_22

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iget-object v8, v2, Lng3/a;->x:Lng3/s;

    invoke-virtual {v8, v12, v13, v2}, Lng3/s;->a(JLng3/m;)I

    move-result v8

    if-ne v1, v5, :cond_1f

    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2, v10, v11}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide v1

    invoke-interface {v3, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4, v10, v11}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide v3

    invoke-static {v8, v6, v6}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object v5

    invoke-virtual {v5, v1, v2}, Ljg3/d;->z0(J)Ljg3/d;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object v1

    goto/16 :goto_9

    :cond_1f
    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    iget-object v5, v4, Lng3/a;->x:Lng3/s;

    invoke-virtual {v5, v10, v11, v4}, Lng3/s;->a(JLng3/m;)I

    move-result v4

    invoke-interface {v3, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    iget-object v3, v7, Lng3/a;->x:Lng3/s;

    invoke-virtual {v3, v10, v11, v7}, Lng3/s;->a(JLng3/m;)I

    move-result v3

    invoke-static {v8, v6, v6}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object v5

    sub-int/2addr v4, v6

    mul-int/lit8 v4, v4, 0x7

    sub-int/2addr v3, v6

    add-int/2addr v3, v4

    int-to-long v3, v3

    invoke-virtual {v5, v3, v4}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object v3

    if-ne v1, v9, :cond_21

    invoke-virtual {v3, v2}, Ljg3/d;->f(Lng3/m;)I

    move-result v1

    if-ne v1, v8, :cond_20

    goto :goto_8

    :cond_20
    new-instance v1, Lorg/threeten/bp/DateTimeException;

    const-string v2, "Strict mode rejected date parsed to a different year"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_21
    :goto_8
    move-object v1, v3

    goto/16 :goto_9

    :cond_22
    sget-object v7, Lng3/a;->R:Lng3/a;

    invoke-interface {v3, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_25

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Long;

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    iget-object v8, v2, Lng3/a;->x:Lng3/s;

    invoke-virtual {v8, v12, v13, v2}, Lng3/s;->a(JLng3/m;)I

    move-result v8

    if-ne v1, v5, :cond_23

    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2, v10, v11}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide v1

    invoke-interface {v3, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v3, v4, v10, v11}, Lcom/squareup/wire/n;->a0(JJ)J

    move-result-wide v3

    invoke-static {v8, v6, v6}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object v5

    invoke-virtual {v5, v1, v2}, Ljg3/d;->z0(J)Ljg3/d;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljg3/d;->x0(J)Ljg3/d;

    move-result-object v1

    goto :goto_9

    :cond_23
    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    iget-object v5, v4, Lng3/a;->x:Lng3/s;

    invoke-virtual {v5, v10, v11, v4}, Lng3/s;->a(JLng3/m;)I

    move-result v4

    invoke-interface {v3, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    iget-object v3, v7, Lng3/a;->x:Lng3/s;

    invoke-virtual {v3, v10, v11, v7}, Lng3/s;->a(JLng3/m;)I

    move-result v3

    invoke-static {v8, v6, v6}, Ljg3/d;->t0(III)Ljg3/d;

    move-result-object v5

    sub-int/2addr v4, v6

    int-to-long v6, v4

    invoke-virtual {v5, v6, v7}, Ljg3/d;->z0(J)Ljg3/d;

    move-result-object v4

    invoke-static {v3}, Ljg3/a;->l(I)Ljg3/a;

    move-result-object v3

    new-instance v5, Lc9/k;

    const/4 v7, 0x0

    invoke-direct {v5, v7, v3}, Lc9/k;-><init>(ILjg3/a;)V

    invoke-virtual {v4, v5}, Ljg3/d;->D0(Lng3/l;)Ljg3/d;

    move-result-object v3

    if-ne v1, v9, :cond_21

    invoke-virtual {v3, v2}, Ljg3/d;->f(Lng3/m;)I

    move-result v1

    if-ne v1, v8, :cond_24

    goto/16 :goto_8

    :cond_24
    new-instance v1, Lorg/threeten/bp/DateTimeException;

    invoke-direct {v1, v15}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_25
    const/4 v1, 0x0

    :goto_9
    invoke-virtual {v0, v1}, Llg3/a;->p0(Ljg3/d;)V

    return-void

    :cond_26
    sget-object v1, Lng3/a;->W:Lng3/a;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_27

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljg3/d;->u0(J)Ljg3/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Llg3/a;->p0(Ljg3/d;)V

    :cond_27
    return-void
.end method

.method public final s0()V
    .locals 2

    sget-object v0, Lng3/a;->e0:Lng3/a;

    iget-object v1, p0, Llg3/a;->F:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Llg3/a;->H:Ljg3/o;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Llg3/a;->t0(Ljg3/o;)V

    return-void

    :cond_0
    sget-object v0, Lng3/a;->f0:Lng3/a;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Long;->intValue()I

    move-result v0

    invoke-static {v0}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object v0

    invoke-virtual {p0, v0}, Llg3/a;->t0(Ljg3/o;)V

    :cond_1
    return-void
.end method

.method public final t0(Ljg3/o;)V
    .locals 4

    sget-object v0, Lng3/a;->e0:Lng3/a;

    iget-object v1, p0, Llg3/a;->F:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v3, v1, v2}, Ljg3/c;->o0(IJ)Ljg3/c;

    move-result-object v1

    iget-object v2, p0, Llg3/a;->G:Lkg3/d;

    check-cast v2, Lkg3/e;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "instant"

    invoke-static {v1, v2}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "zone"

    invoke-static {p1, v2}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v2, v1, Ljg3/c;->F:J

    iget v1, v1, Ljg3/c;->G:I

    invoke-static {v2, v3, v1, p1}, Ljg3/r;->o0(JILjg3/o;)Ljg3/r;

    move-result-object p1

    iget-object p1, p1, Ljg3/r;->F:Ljg3/e;

    iget-object v1, p0, Llg3/a;->I:Lkg3/a;

    if-nez v1, :cond_0

    iget-object v0, p1, Ljg3/e;->F:Ljg3/d;

    iput-object v0, p0, Llg3/a;->I:Lkg3/a;

    goto :goto_0

    :cond_0
    iget-object v1, p1, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {p0, v0, v1}, Llg3/a;->x0(Lng3/m;Lkg3/a;)V

    :goto_0
    sget-object v0, Lng3/a;->J:Lng3/a;

    iget-object p1, p1, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {p1}, Ljg3/f;->D0()I

    move-result p1

    int-to-long v1, p1

    invoke-virtual {p0, v1, v2, v0}, Llg3/a;->o0(JLng3/m;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "DateTimeBuilder["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llg3/a;->F:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v2

    if-lez v2, :cond_0

    const-string v2, "fields="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_0
    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Llg3/a;->G:Lkg3/d;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Llg3/a;->H:Ljg3/o;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Llg3/a;->I:Lkg3/a;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llg3/a;->J:Ljg3/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u0(Llg3/u;)V
    .locals 13

    sget-object v0, Lng3/a;->P:Lng3/a;

    iget-object v1, p0, Llg3/a;->F:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    sget-object v3, Llg3/u;->x:Llg3/u;

    sget-object v4, Llg3/u;->y:Llg3/u;

    const-wide/16 v5, 0x0

    if-eqz v2, :cond_3

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    if-eq p1, v4, :cond_1

    if-ne p1, v3, :cond_0

    cmp-long v2, v7, v5

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v7, v8}, Lng3/a;->f(J)V

    :cond_1
    :goto_0
    sget-object v0, Lng3/a;->O:Lng3/a;

    const-wide/16 v9, 0x18

    cmp-long v2, v7, v9

    if-nez v2, :cond_2

    move-wide v7, v5

    :cond_2
    invoke-virtual {p0, v7, v8, v0}, Llg3/a;->o0(JLng3/m;)V

    :cond_3
    sget-object v0, Lng3/a;->N:Lng3/a;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    const-wide/16 v7, 0xc

    if-eqz v2, :cond_7

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    if-eq p1, v4, :cond_5

    if-ne p1, v3, :cond_4

    cmp-long v2, v9, v5

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v0, v9, v10}, Lng3/a;->f(J)V

    :cond_5
    :goto_1
    sget-object v0, Lng3/a;->M:Lng3/a;

    cmp-long v2, v9, v7

    if-nez v2, :cond_6

    goto :goto_2

    :cond_6
    move-wide v5, v9

    :goto_2
    invoke-virtual {p0, v5, v6, v0}, Llg3/a;->o0(JLng3/m;)V

    :cond_7
    if-eq p1, v4, :cond_9

    sget-object v0, Lng3/a;->Q:Lng3/a;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lng3/a;->f(J)V

    :cond_8
    sget-object v0, Lng3/a;->M:Lng3/a;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lng3/a;->f(J)V

    :cond_9
    sget-object v0, Lng3/a;->Q:Lng3/a;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    sget-object v2, Lng3/a;->M:Lng3/a;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sget-object v0, Lng3/a;->O:Lng3/a;

    mul-long/2addr v5, v7

    add-long/2addr v5, v2

    invoke-virtual {p0, v5, v6, v0}, Llg3/a;->o0(JLng3/m;)V

    :cond_a
    sget-object v0, Lng3/a;->z:Lng3/a;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    if-eq p1, v4, :cond_b

    invoke-virtual {v0, v2, v3}, Lng3/a;->f(J)V

    :cond_b
    sget-object v0, Lng3/a;->J:Lng3/a;

    const-wide/32 v5, 0x3b9aca00

    div-long v7, v2, v5

    invoke-virtual {p0, v7, v8, v0}, Llg3/a;->o0(JLng3/m;)V

    sget-object v0, Lng3/a;->y:Lng3/a;

    rem-long/2addr v2, v5

    invoke-virtual {p0, v2, v3, v0}, Llg3/a;->o0(JLng3/m;)V

    :cond_c
    sget-object v0, Lng3/a;->F:Lng3/a;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    const-wide/32 v5, 0xf4240

    if-eqz v2, :cond_e

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    if-eq p1, v4, :cond_d

    invoke-virtual {v0, v2, v3}, Lng3/a;->f(J)V

    :cond_d
    sget-object v0, Lng3/a;->J:Lng3/a;

    div-long v7, v2, v5

    invoke-virtual {p0, v7, v8, v0}, Llg3/a;->o0(JLng3/m;)V

    sget-object v0, Lng3/a;->E:Lng3/a;

    rem-long/2addr v2, v5

    invoke-virtual {p0, v2, v3, v0}, Llg3/a;->o0(JLng3/m;)V

    :cond_e
    sget-object v0, Lng3/a;->H:Lng3/a;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    const-wide/16 v7, 0x3e8

    if-eqz v2, :cond_10

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    if-eq p1, v4, :cond_f

    invoke-virtual {v0, v2, v3}, Lng3/a;->f(J)V

    :cond_f
    sget-object v0, Lng3/a;->J:Lng3/a;

    div-long v9, v2, v7

    invoke-virtual {p0, v9, v10, v0}, Llg3/a;->o0(JLng3/m;)V

    sget-object v0, Lng3/a;->G:Lng3/a;

    rem-long/2addr v2, v7

    invoke-virtual {p0, v2, v3, v0}, Llg3/a;->o0(JLng3/m;)V

    :cond_10
    sget-object v0, Lng3/a;->J:Lng3/a;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    const-wide/16 v9, 0x3c

    if-eqz v2, :cond_12

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    if-eq p1, v4, :cond_11

    invoke-virtual {v0, v2, v3}, Lng3/a;->f(J)V

    :cond_11
    sget-object v0, Lng3/a;->O:Lng3/a;

    const-wide/16 v11, 0xe10

    div-long v11, v2, v11

    invoke-virtual {p0, v11, v12, v0}, Llg3/a;->o0(JLng3/m;)V

    sget-object v0, Lng3/a;->K:Lng3/a;

    div-long v11, v2, v9

    rem-long/2addr v11, v9

    invoke-virtual {p0, v11, v12, v0}, Llg3/a;->o0(JLng3/m;)V

    sget-object v0, Lng3/a;->I:Lng3/a;

    rem-long/2addr v2, v9

    invoke-virtual {p0, v2, v3, v0}, Llg3/a;->o0(JLng3/m;)V

    :cond_12
    sget-object v0, Lng3/a;->L:Lng3/a;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    if-eq p1, v4, :cond_13

    invoke-virtual {v0, v2, v3}, Lng3/a;->f(J)V

    :cond_13
    sget-object v0, Lng3/a;->O:Lng3/a;

    div-long v11, v2, v9

    invoke-virtual {p0, v11, v12, v0}, Llg3/a;->o0(JLng3/m;)V

    sget-object v0, Lng3/a;->K:Lng3/a;

    rem-long/2addr v2, v9

    invoke-virtual {p0, v2, v3, v0}, Llg3/a;->o0(JLng3/m;)V

    :cond_14
    if-eq p1, v4, :cond_16

    sget-object p1, Lng3/a;->G:Lng3/a;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lng3/a;->f(J)V

    :cond_15
    sget-object p1, Lng3/a;->E:Lng3/a;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Lng3/a;->f(J)V

    :cond_16
    sget-object p1, Lng3/a;->G:Lng3/a;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    sget-object v0, Lng3/a;->E:Lng3/a;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    mul-long/2addr v2, v7

    rem-long/2addr v9, v7

    add-long/2addr v9, v2

    invoke-virtual {p0, v9, v10, v0}, Llg3/a;->o0(JLng3/m;)V

    :cond_17
    sget-object v0, Lng3/a;->E:Lng3/a;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18

    sget-object v2, Lng3/a;->y:Lng3/a;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    div-long/2addr v2, v7

    invoke-virtual {p0, v2, v3, v0}, Llg3/a;->o0(JLng3/m;)V

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_18
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_19

    sget-object v2, Lng3/a;->y:Lng3/a;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    div-long/2addr v2, v5

    invoke-virtual {p0, v2, v3, p1}, Llg3/a;->o0(JLng3/m;)V

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_19
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sget-object p1, Lng3/a;->y:Lng3/a;

    mul-long/2addr v0, v7

    invoke-virtual {p0, v0, v1, p1}, Llg3/a;->o0(JLng3/m;)V

    return-void

    :cond_1a
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    sget-object p1, Lng3/a;->y:Lng3/a;

    mul-long/2addr v0, v5

    invoke-virtual {p0, v0, v1, p1}, Llg3/a;->o0(JLng3/m;)V

    :cond_1b
    return-void
.end method

.method public final v0(Llg3/u;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0}, Llg3/a;->s0()V

    invoke-virtual/range {p0 .. p1}, Llg3/a;->r0(Llg3/u;)V

    invoke-virtual/range {p0 .. p1}, Llg3/a;->u0(Llg3/u;)V

    const/4 v6, 0x0

    :goto_0
    iget-object v7, v0, Llg3/a;->F:Ljava/util/HashMap;

    const/16 v8, 0x64

    if-ge v6, v8, :cond_8

    invoke-virtual {v7}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lng3/m;

    invoke-interface {v10, v7, v1}, Lng3/m;->d(Ljava/util/HashMap;Llg3/u;)Lng3/k;

    move-result-object v11

    if-eqz v11, :cond_7

    instance-of v7, v11, Lkg3/c;

    if-eqz v7, :cond_3

    check-cast v11, Lkg3/c;

    iget-object v7, v0, Llg3/a;->H:Ljg3/o;

    if-nez v7, :cond_1

    move-object v7, v11

    check-cast v7, Ljg3/r;

    iget-object v7, v7, Ljg3/r;->H:Ljg3/o;

    iput-object v7, v0, Llg3/a;->H:Ljg3/o;

    goto :goto_1

    :cond_1
    move-object v8, v11

    check-cast v8, Ljg3/r;

    iget-object v8, v8, Ljg3/r;->H:Ljg3/o;

    invoke-virtual {v7, v8}, Ljg3/o;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    :goto_1
    check-cast v11, Ljg3/r;

    iget-object v11, v11, Ljg3/r;->F:Ljg3/e;

    goto :goto_2

    :cond_2
    new-instance v1, Lorg/threeten/bp/DateTimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ChronoZonedDateTime must use the effective parsed zone: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v0, Llg3/a;->H:Ljg3/o;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    :goto_2
    instance-of v7, v11, Lkg3/a;

    if-eqz v7, :cond_4

    check-cast v11, Lkg3/a;

    invoke-virtual {v0, v10, v11}, Llg3/a;->x0(Lng3/m;Lkg3/a;)V

    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    instance-of v7, v11, Ljg3/f;

    if-eqz v7, :cond_5

    check-cast v11, Ljg3/f;

    invoke-virtual {v0, v10, v11}, Llg3/a;->w0(Lng3/m;Ljg3/f;)V

    goto :goto_3

    :cond_5
    instance-of v7, v11, Lkg3/b;

    if-eqz v7, :cond_6

    check-cast v11, Lkg3/b;

    check-cast v11, Ljg3/e;

    iget-object v7, v11, Ljg3/e;->F:Ljg3/d;

    invoke-virtual {v0, v10, v7}, Llg3/a;->x0(Lng3/m;Lkg3/a;)V

    iget-object v7, v11, Ljg3/e;->G:Ljg3/f;

    invoke-virtual {v0, v10, v7}, Llg3/a;->w0(Lng3/m;Ljg3/f;)V

    goto :goto_3

    :cond_6
    new-instance v1, Lorg/threeten/bp/DateTimeException;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Unknown type: "

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    invoke-virtual {v7, v10}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_0

    goto :goto_3

    :cond_8
    if-eq v6, v8, :cond_29

    if-lez v6, :cond_9

    invoke-virtual {v0}, Llg3/a;->s0()V

    invoke-virtual/range {p0 .. p1}, Llg3/a;->r0(Llg3/u;)V

    invoke-virtual/range {p0 .. p1}, Llg3/a;->u0(Llg3/u;)V

    :cond_9
    sget-object v6, Lng3/a;->O:Lng3/a;

    invoke-virtual {v7, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Long;

    sget-object v9, Lng3/a;->K:Lng3/a;

    invoke-virtual {v7, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Long;

    sget-object v11, Lng3/a;->I:Lng3/a;

    invoke-virtual {v7, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Long;

    sget-object v13, Lng3/a;->y:Lng3/a;

    invoke-virtual {v7, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Long;

    if-nez v8, :cond_a

    goto/16 :goto_a

    :cond_a
    if-nez v10, :cond_b

    if-nez v12, :cond_1d

    if-eqz v14, :cond_b

    goto/16 :goto_a

    :cond_b
    if-eqz v10, :cond_c

    if-nez v12, :cond_c

    if-eqz v14, :cond_c

    goto/16 :goto_a

    :cond_c
    sget-object v15, Llg3/u;->y:Llg3/u;

    move-wide/from16 v16, v2

    const-wide/16 v2, 0x18

    if-eq v1, v15, :cond_16

    sget-object v15, Llg3/u;->x:Llg3/u;

    if-ne v1, v15, :cond_10

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v18

    cmp-long v1, v18, v2

    if-nez v1, :cond_10

    if-eqz v10, :cond_d

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    cmp-long v1, v1, v16

    if-nez v1, :cond_10

    :cond_d
    if-eqz v12, :cond_e

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    cmp-long v1, v1, v16

    if-nez v1, :cond_10

    :cond_e
    if-eqz v14, :cond_f

    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    cmp-long v1, v1, v16

    if-nez v1, :cond_10

    :cond_f
    new-instance v1, Ljg3/k;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljg3/k;-><init>(I)V

    iput-object v1, v0, Llg3/a;->K:Ljg3/k;

    move-object v8, v4

    :cond_10
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v3, v6, Lng3/a;->x:Lng3/s;

    invoke-virtual {v3, v1, v2, v6}, Lng3/s;->a(JLng3/m;)I

    move-result v1

    if-eqz v10, :cond_14

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object v8, v9, Lng3/a;->x:Lng3/s;

    invoke-virtual {v8, v2, v3, v9}, Lng3/s;->a(JLng3/m;)I

    move-result v2

    if-eqz v12, :cond_13

    move-object/from16 v16, v6

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v3, v11, Lng3/a;->x:Lng3/s;

    invoke-virtual {v3, v5, v6, v11}, Lng3/s;->a(JLng3/m;)I

    move-result v3

    if-eqz v14, :cond_11

    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v8, v13, Lng3/a;->x:Lng3/s;

    invoke-virtual {v8, v5, v6, v13}, Lng3/s;->a(JLng3/m;)I

    move-result v5

    invoke-static {v1, v2, v3, v5}, Ljg3/f;->t0(IIII)Ljg3/f;

    move-result-object v1

    iput-object v1, v0, Llg3/a;->J:Ljg3/f;

    move-object/from16 v8, v16

    goto :goto_5

    :cond_11
    sget-object v5, Ljg3/f;->J:Ljg3/f;

    int-to-long v5, v1

    move-object/from16 v8, v16

    invoke-virtual {v8, v5, v6}, Lng3/a;->f(J)V

    or-int v5, v2, v3

    if-nez v5, :cond_12

    sget-object v2, Ljg3/f;->L:[Ljg3/f;

    aget-object v1, v2, v1

    goto :goto_4

    :cond_12
    int-to-long v5, v2

    invoke-virtual {v9, v5, v6}, Lng3/a;->f(J)V

    int-to-long v5, v3

    invoke-virtual {v11, v5, v6}, Lng3/a;->f(J)V

    new-instance v5, Ljg3/f;

    const/4 v15, 0x0

    invoke-direct {v5, v1, v2, v3, v15}, Ljg3/f;-><init>(IIII)V

    move-object v1, v5

    :goto_4
    iput-object v1, v0, Llg3/a;->J:Ljg3/f;

    goto :goto_5

    :cond_13
    move-object v8, v6

    if-nez v14, :cond_15

    invoke-static {v1, v2}, Ljg3/f;->s0(II)Ljg3/f;

    move-result-object v1

    iput-object v1, v0, Llg3/a;->J:Ljg3/f;

    goto :goto_5

    :cond_14
    move-object v8, v6

    if-nez v12, :cond_15

    if-nez v14, :cond_15

    const/4 v15, 0x0

    invoke-static {v1, v15}, Ljg3/f;->s0(II)Ljg3/f;

    move-result-object v1

    iput-object v1, v0, Llg3/a;->J:Ljg3/f;

    :cond_15
    :goto_5
    move-object v1, v8

    goto/16 :goto_9

    :cond_16
    move-object v1, v6

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    if-eqz v10, :cond_1b

    if-eqz v12, :cond_19

    if-nez v14, :cond_17

    move-object v14, v4

    :cond_17
    const-wide v2, 0x34630b8a000L

    invoke-static {v5, v6, v2, v3}, Lcom/squareup/wire/n;->Y(JJ)J

    move-result-wide v2

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    move-object/from16 p1, v14

    const-wide v14, 0xdf8475800L

    invoke-static {v5, v6, v14, v15}, Lcom/squareup/wire/n;->Y(JJ)J

    move-result-wide v5

    invoke-static {v2, v3, v5, v6}, Lcom/squareup/wire/n;->W(JJ)J

    move-result-wide v2

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const-wide/32 v14, 0x3b9aca00

    invoke-static {v5, v6, v14, v15}, Lcom/squareup/wire/n;->Y(JJ)J

    move-result-wide v5

    invoke-static {v2, v3, v5, v6}, Lcom/squareup/wire/n;->W(JJ)J

    move-result-wide v2

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static {v2, v3, v5, v6}, Lcom/squareup/wire/n;->W(JJ)J

    move-result-wide v2

    const-wide v5, 0x4e94914f0000L

    invoke-static {v2, v3, v5, v6}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v14

    long-to-int v8, v14

    rem-long/2addr v2, v5

    add-long/2addr v2, v5

    rem-long/2addr v2, v5

    invoke-static {v2, v3}, Ljg3/f;->u0(J)Ljg3/f;

    move-result-object v2

    iput-object v2, v0, Llg3/a;->J:Ljg3/f;

    if-nez v8, :cond_18

    sget-object v2, Ljg3/k;->x:Ljg3/k;

    goto :goto_6

    :cond_18
    new-instance v2, Ljg3/k;

    invoke-direct {v2, v8}, Ljg3/k;-><init>(I)V

    :goto_6
    iput-object v2, v0, Llg3/a;->K:Ljg3/k;

    goto :goto_9

    :cond_19
    const-wide/16 v2, 0xe10

    invoke-static {v5, v6, v2, v3}, Lcom/squareup/wire/n;->Y(JJ)J

    move-result-wide v2

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const-wide/16 v14, 0x3c

    invoke-static {v5, v6, v14, v15}, Lcom/squareup/wire/n;->Y(JJ)J

    move-result-wide v5

    invoke-static {v2, v3, v5, v6}, Lcom/squareup/wire/n;->W(JJ)J

    move-result-wide v2

    const-wide/32 v5, 0x15180

    invoke-static {v2, v3, v5, v6}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v14

    long-to-int v8, v14

    rem-long/2addr v2, v5

    add-long/2addr v2, v5

    rem-long/2addr v2, v5

    invoke-static {v2, v3}, Ljg3/f;->v0(J)Ljg3/f;

    move-result-object v2

    iput-object v2, v0, Llg3/a;->J:Ljg3/f;

    if-nez v8, :cond_1a

    sget-object v2, Ljg3/k;->x:Ljg3/k;

    goto :goto_7

    :cond_1a
    new-instance v2, Ljg3/k;

    invoke-direct {v2, v8}, Ljg3/k;-><init>(I)V

    :goto_7
    iput-object v2, v0, Llg3/a;->K:Ljg3/k;

    goto :goto_9

    :cond_1b
    invoke-static {v5, v6, v2, v3}, Lcom/squareup/wire/n;->A(JJ)J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/squareup/wire/n;->b0(J)I

    move-result v2

    const/16 v3, 0x18

    invoke-static {v3, v5, v6}, Lcom/squareup/wire/n;->B(IJ)I

    move-result v3

    int-to-long v5, v3

    long-to-int v3, v5

    const/4 v15, 0x0

    invoke-static {v3, v15}, Ljg3/f;->s0(II)Ljg3/f;

    move-result-object v3

    iput-object v3, v0, Llg3/a;->J:Ljg3/f;

    if-nez v2, :cond_1c

    sget-object v2, Ljg3/k;->x:Ljg3/k;

    goto :goto_8

    :cond_1c
    new-instance v3, Ljg3/k;

    invoke-direct {v3, v2}, Ljg3/k;-><init>(I)V

    move-object v2, v3

    :goto_8
    iput-object v2, v0, Llg3/a;->K:Ljg3/k;

    :goto_9
    invoke-virtual {v7, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7, v9}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7, v11}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7, v13}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1d
    :goto_a
    invoke-virtual {v7}, Ljava/util/HashMap;->size()I

    move-result v1

    if-lez v1, :cond_20

    iget-object v1, v0, Llg3/a;->I:Lkg3/a;

    if-eqz v1, :cond_1e

    iget-object v2, v0, Llg3/a;->J:Ljg3/f;

    if-eqz v2, :cond_1e

    check-cast v1, Ljg3/d;

    invoke-static {v1, v2}, Ljg3/e;->t0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Llg3/a;->q0(Lng3/k;)V

    goto :goto_b

    :cond_1e
    if-eqz v1, :cond_1f

    invoke-virtual {v0, v1}, Llg3/a;->q0(Lng3/k;)V

    goto :goto_b

    :cond_1f
    iget-object v1, v0, Llg3/a;->J:Ljg3/f;

    if-eqz v1, :cond_20

    invoke-virtual {v0, v1}, Llg3/a;->q0(Lng3/k;)V

    :cond_20
    :goto_b
    iget-object v1, v0, Llg3/a;->K:Ljg3/k;

    if-eqz v1, :cond_23

    sget-object v2, Ljg3/k;->x:Ljg3/k;

    if-ne v1, v2, :cond_21

    goto :goto_c

    :cond_21
    iget-object v3, v0, Llg3/a;->I:Lkg3/a;

    if-eqz v3, :cond_23

    iget-object v5, v0, Llg3/a;->J:Ljg3/f;

    if-eqz v5, :cond_23

    check-cast v3, Ljg3/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v1, v1, Ljg3/k;->w:I

    if-eqz v1, :cond_22

    int-to-long v5, v1

    sget-object v1, Lng3/b;->y:Lng3/b;

    invoke-virtual {v3, v5, v6, v1}, Ljg3/d;->c(JLng3/r;)Lng3/j;

    move-result-object v3

    :cond_22
    check-cast v3, Ljg3/d;

    iput-object v3, v0, Llg3/a;->I:Lkg3/a;

    iput-object v2, v0, Llg3/a;->K:Ljg3/k;

    :cond_23
    :goto_c
    iget-object v1, v0, Llg3/a;->J:Ljg3/f;

    if-nez v1, :cond_26

    sget-object v1, Lng3/a;->e0:Lng3/a;

    invoke-virtual {v7, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    sget-object v1, Lng3/a;->J:Lng3/a;

    invoke-virtual {v7, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    invoke-virtual {v7, v11}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_26

    :cond_24
    invoke-virtual {v7, v13}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_25

    invoke-virtual {v7, v13}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sget-object v3, Lng3/a;->E:Lng3/a;

    const-wide/16 v4, 0x3e8

    div-long v4, v1, v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v7, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lng3/a;->G:Lng3/a;

    const-wide/32 v4, 0xf4240

    div-long/2addr v1, v4

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v7, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_d

    :cond_25
    invoke-virtual {v7, v13, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lng3/a;->E:Lng3/a;

    invoke-virtual {v7, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lng3/a;->G:Lng3/a;

    invoke-virtual {v7, v1, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_26
    :goto_d
    iget-object v1, v0, Llg3/a;->I:Lkg3/a;

    if-eqz v1, :cond_28

    iget-object v1, v0, Llg3/a;->J:Ljg3/f;

    if-eqz v1, :cond_28

    sget-object v1, Lng3/a;->f0:Lng3/a;

    invoke-virtual {v7, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    const/4 v2, 0x0

    if-eqz v1, :cond_27

    invoke-virtual {v1}, Ljava/lang/Long;->intValue()I

    move-result v1

    invoke-static {v1}, Ljg3/p;->r(I)Ljg3/p;

    move-result-object v1

    iget-object v3, v0, Llg3/a;->I:Lkg3/a;

    iget-object v4, v0, Llg3/a;->J:Ljg3/f;

    check-cast v3, Ljg3/d;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v3, v4}, Ljg3/e;->t0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object v3

    invoke-static {v3, v1, v2}, Ljg3/r;->p0(Ljg3/e;Ljg3/o;Ljg3/p;)Ljg3/r;

    move-result-object v1

    sget-object v2, Lng3/a;->e0:Lng3/a;

    invoke-virtual {v1, v2}, Ljg3/r;->h(Lng3/m;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v7, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_27
    iget-object v1, v0, Llg3/a;->H:Ljg3/o;

    if-eqz v1, :cond_28

    iget-object v1, v0, Llg3/a;->I:Lkg3/a;

    iget-object v3, v0, Llg3/a;->J:Ljg3/f;

    check-cast v1, Ljg3/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v3}, Ljg3/e;->t0(Ljg3/d;Ljg3/f;)Ljg3/e;

    move-result-object v1

    iget-object v3, v0, Llg3/a;->H:Ljg3/o;

    invoke-static {v1, v3, v2}, Ljg3/r;->p0(Ljg3/e;Ljg3/o;Ljg3/p;)Ljg3/r;

    move-result-object v1

    sget-object v2, Lng3/a;->e0:Lng3/a;

    invoke-virtual {v1, v2}, Ljg3/r;->h(Lng3/m;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v7, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_28
    return-void

    :cond_29
    new-instance v1, Lorg/threeten/bp/DateTimeException;

    const-string v2, "Badly written field"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final w0(Lng3/m;Ljg3/f;)V
    .locals 5

    invoke-virtual {p2}, Ljg3/f;->C0()J

    move-result-wide v0

    sget-object v2, Lng3/a;->z:Lng3/a;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iget-object v4, p0, Llg3/a;->F:Ljava/util/HashMap;

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    cmp-long v0, v3, v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lorg/threeten/bp/DateTimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Conflict found: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljg3/f;->u0(J)Ljg3/f;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " differs from "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " while resolving  "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final x0(Lng3/m;Lkg3/a;)V
    .locals 6

    iget-object v0, p0, Llg3/a;->G:Lkg3/d;

    move-object v1, p2

    check-cast v1, Ljg3/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lkg3/e;->w:Lkg3/e;

    invoke-virtual {v0, v1}, Lkg3/d;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lkg3/a;->toEpochDay()J

    move-result-wide v0

    sget-object p2, Lng3/a;->W:Lng3/a;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-object v3, p0, Llg3/a;->F:Ljava/util/HashMap;

    invoke-virtual {v3, p2, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v2, v2, v0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lorg/threeten/bp/DateTimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Conflict found: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljg3/d;->u0(J)Ljg3/d;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " differs from "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, v1}, Ljg3/d;->u0(J)Ljg3/d;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " while resolving  "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance p1, Lorg/threeten/bp/DateTimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "ChronoLocalDate must use the effective parsed chronology: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Llg3/a;->G:Lkg3/d;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
