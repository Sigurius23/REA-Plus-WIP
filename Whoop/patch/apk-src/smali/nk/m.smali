.class public final Lnk/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ldk/f;

.field public final b:Lkk/b;

.field public final c:Lbc3/c0;

.field public final d:Lbc3/z;

.field public final e:Lfk/a;


# direct methods
.method public constructor <init>(Ldk/f;Lkk/b;Lgj/g;Lbc3/c0;Lbc3/z;Lfk/a;)V
    .locals 0

    const-string p3, "scope"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnk/m;->a:Ldk/f;

    iput-object p2, p0, Lnk/m;->b:Lkk/b;

    iput-object p4, p0, Lnk/m;->c:Lbc3/c0;

    iput-object p5, p0, Lnk/m;->d:Lbc3/z;

    iput-object p6, p0, Lnk/m;->e:Lfk/a;

    return-void
.end method


# virtual methods
.method public a(Lal/a;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "events"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v4, v0, Lok/e;

    if-eqz v4, :cond_1

    check-cast v0, Lok/e;

    const-string v4, "events"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/String;

    iget-object v4, v1, Lnk/m;->e:Lfk/a;

    if-eqz v4, :cond_0

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Handle response, status: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Lok/c;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Lfk/a;->debug(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v1, v3, v2}, Lnk/m;->b(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-static {v0}, Lhg3/i;->n0(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v3, Lok/c;->x:Lok/c;

    iget-object v3, v3, Lok/c;->w:Li93/j;

    iget v3, v3, Li93/h;->w:I

    const-string v4, "Event sent success."

    invoke-virtual {v1, v3, v4, v0}, Lnk/m;->c(ILjava/lang/String;Ljava/util/ArrayList;)V

    new-instance v0, Lnk/l;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v4, v3}, Lnk/l;-><init>(Lnk/m;Ljava/lang/String;Lq83/d;I)V

    const/4 v2, 0x2

    iget-object v3, v1, Lnk/m;->c:Lbc3/c0;

    iget-object v5, v1, Lnk/m;->d:Lbc3/z;

    invoke-static {v3, v5, v4, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    const/4 v0, 0x0

    return-object v0

    :cond_1
    instance-of v4, v0, Lok/a;

    if-eqz v4, :cond_b

    check-cast v0, Lok/a;

    iget-object v4, v0, Lok/a;->y:Ljava/lang/String;

    const-string v5, "events"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v1, Lnk/m;->e:Lfk/a;

    if-eqz v5, :cond_2

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Handle response, status: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v0, Lal/a;->x:Ljava/lang/Object;

    check-cast v7, Lok/c;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ", error: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Lfk/a;->debug(Ljava/lang/String;)V

    :cond_2
    move-object v5, v2

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v1, v3, v5}, Lnk/m;->b(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-static {v3}, Lhg3/i;->n0(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v3

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "invalid api key"

    const/4 v8, 0x0

    invoke-static {v6, v7, v8}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    const/4 v7, 0x2

    iget-object v9, v1, Lnk/m;->d:Lbc3/z;

    iget-object v10, v1, Lnk/m;->c:Lbc3/c0;

    const/4 v11, 0x0

    if-eqz v6, :cond_3

    sget-object v0, Lok/c;->y:Lok/c;

    iget-object v0, v0, Lok/c;->w:Li93/j;

    iget v0, v0, Li93/h;->w:I

    invoke-virtual {v1, v0, v4, v3}, Lnk/m;->c(ILjava/lang/String;Ljava/util/ArrayList;)V

    new-instance v0, La6/q;

    const/16 v2, 0xa

    invoke-direct {v0, v1, v5, v11, v2}, La6/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v10, v9, v11, v0, v7}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto/16 :goto_5

    :cond_3
    new-instance v6, Ljava/util/LinkedHashSet;

    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    iget-object v12, v0, Lok/a;->z:Ljava/util/Set;

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v6, v12}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object v12, v0, Lok/a;->E:Ljava/util/Set;

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v6, v12}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object v12, v0, Lok/a;->F:Ljava/util/Set;

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v6, v12}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    move-object v12, v3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    move v14, v8

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    add-int/lit8 v16, v14, 0x1

    if-ltz v14, :cond_7

    check-cast v15, Ljk/a;

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v6, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_6

    const-string v14, "event"

    invoke-static {v15, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v14, v15, Ljk/a;->b:Ljava/lang/String;

    if-eqz v14, :cond_4

    iget-object v8, v0, Lok/a;->G:Ljava/util/Set;

    invoke-interface {v8, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_1

    :cond_4
    const/4 v8, 0x0

    :goto_1
    if-eqz v8, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    :goto_2
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    move/from16 v14, v16

    const/4 v8, 0x0

    goto :goto_0

    :cond_7
    invoke-static {}, Lwb3/f;->d0()V

    throw v11

    :cond_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    new-instance v0, Lnk/k;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v11, v3}, Lnk/k;-><init>(Lnk/m;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v10, v9, v11, v0, v7}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    const/4 v8, 0x1

    goto :goto_5

    :cond_9
    sget-object v0, Lok/c;->y:Lok/c;

    iget-object v0, v0, Lok/c;->w:Li93/j;

    iget v0, v0, Li93/h;->w:I

    invoke-virtual {v1, v0, v4, v3}, Lnk/m;->c(ILjava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljk/a;

    iget-object v4, v1, Lnk/m;->b:Lkk/b;

    invoke-virtual {v4, v2}, Lkk/b;->a(Ljk/a;)V

    goto :goto_4

    :cond_a
    new-instance v0, Ld0;

    move-object v2, v5

    const/4 v5, 0x0

    const/4 v6, 0x4

    move-object v4, v13

    invoke-direct/range {v0 .. v6}, Ld0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v10, v9, v11, v0, v7}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    const/4 v8, 0x0

    :goto_5
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_b
    instance-of v4, v0, Lok/d;

    if-eqz v4, :cond_e

    check-cast v0, Lok/d;

    const-string v4, "events"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v1, Lnk/m;->e:Lfk/a;

    if-eqz v4, :cond_c

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Handle response, status: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, v0, Lal/a;->x:Ljava/lang/Object;

    check-cast v6, Lok/c;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ", error: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lok/d;->H0()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Lfk/a;->debug(Ljava/lang/String;)V

    :cond_c
    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v3, v2}, Lnk/m;->b(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x2

    iget-object v7, v1, Lnk/m;->d:Lbc3/z;

    iget-object v8, v1, Lnk/m;->c:Lbc3/c0;

    const/4 v9, 0x0

    if-ne v4, v5, :cond_d

    invoke-static {v3}, Lhg3/i;->n0(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v3

    sget-object v4, Lok/c;->E:Lok/c;

    iget-object v4, v4, Lok/c;->w:Li93/j;

    iget v4, v4, Li93/h;->w:I

    invoke-virtual {v0}, Lok/d;->H0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v4, v0, v3}, Lnk/m;->c(ILjava/lang/String;Ljava/util/ArrayList;)V

    new-instance v0, Lnk/l;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v9, v3}, Lnk/l;-><init>(Lnk/m;Ljava/lang/String;Lq83/d;I)V

    invoke-static {v8, v7, v9, v0, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_6

    :cond_d
    new-instance v0, Lay/u;

    const/16 v5, 0xe

    move-object v4, v9

    invoke-direct/range {v0 .. v5}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v8, v7, v4, v0, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_6
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_e
    instance-of v3, v0, Lok/g;

    if-eqz v3, :cond_10

    check-cast v0, Lok/g;

    const-string v3, "events"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lnk/m;->e:Lfk/a;

    if-eqz v3, :cond_f

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Handle response, status: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, v0, Lal/a;->x:Ljava/lang/Object;

    check-cast v5, Lok/c;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", error: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lok/g;->H0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Lfk/a;->debug(Ljava/lang/String;)V

    :cond_f
    new-instance v0, Lnk/k;

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v4, v3}, Lnk/k;-><init>(Lnk/m;Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x2

    iget-object v3, v1, Lnk/m;->c:Lbc3/c0;

    iget-object v5, v1, Lnk/m;->d:Lbc3/z;

    invoke-static {v3, v5, v4, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_10
    instance-of v3, v0, Lok/f;

    if-eqz v3, :cond_12

    check-cast v0, Lok/f;

    const-string v3, "events"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lnk/m;->e:Lfk/a;

    if-eqz v3, :cond_11

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Handle response, status: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lal/a;->x:Ljava/lang/Object;

    check-cast v0, Lok/c;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Lfk/a;->debug(Ljava/lang/String;)V

    :cond_11
    new-instance v0, Lnk/k;

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v4, v3}, Lnk/k;-><init>(Lnk/m;Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x2

    iget-object v3, v1, Lnk/m;->c:Lbc3/c0;

    iget-object v5, v1, Lnk/m;->d:Lbc3/z;

    invoke-static {v3, v5, v4, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_12
    check-cast v0, Lok/b;

    const-string v3, "events"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lnk/m;->e:Lfk/a;

    if-eqz v3, :cond_13

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Handle response, status: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, v0, Lal/a;->x:Ljava/lang/Object;

    check-cast v5, Lok/c;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ", error: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lok/b;->H0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Lfk/a;->debug(Ljava/lang/String;)V

    :cond_13
    new-instance v0, Lnk/k;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v4, v3}, Lnk/k;-><init>(Lnk/m;Ljava/lang/Object;Lq83/d;I)V

    const/4 v2, 0x2

    iget-object v3, v1, Lnk/m;->c:Lbc3/c0;

    iget-object v5, v1, Lnk/m;->d:Lbc3/z;

    invoke-static {v3, v5, v4, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 7

    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lnk/l;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v1, p0, p2, v3, v2}, Lnk/l;-><init>(Lnk/m;Ljava/lang/String;Lq83/d;I)V

    iget-object p2, p0, Lnk/m;->c:Lbc3/c0;

    iget-object v2, p0, Lnk/m;->d:Lbc3/z;

    const/4 v4, 0x2

    invoke-static {p2, v2, v3, v1, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v1, Lyb3/p;

    const-string v5, "\"insert_id\":\"(.{36})\","

    invoke-direct {v1, v5}, Lyb3/p;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lyb3/p;->b(Ljava/lang/CharSequence;Lyb3/p;)Lx83/h;

    move-result-object p1

    new-instance v1, Lxb3/h;

    invoke-direct {v1, p1}, Lxb3/h;-><init>(Lx83/h;)V

    :goto_0
    invoke-virtual {v1}, Lxb3/h;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Lxb3/h;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lyb3/k;

    new-instance v5, Landroidx/room/e;

    const/16 v6, 0x1c

    invoke-direct {v5, p0, p1, v3, v6}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {p2, v2, v3, v5, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :cond_0
    throw v0
.end method

.method public final c(ILjava/lang/String;Ljava/util/ArrayList;)V
    .locals 8

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljk/a;

    iget-object v3, v4, Ljk/a;->f:Ljava/lang/String;

    if-eqz v3, :cond_0

    new-instance v1, Landroidx/lifecycle/e1;

    const/4 v7, 0x0

    move-object v2, p0

    move v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v7}, Landroidx/lifecycle/e1;-><init>(Lnk/m;Ljava/lang/String;Ljk/a;ILjava/lang/String;Lq83/d;)V

    const/4 p1, 0x2

    iget-object p2, v2, Lnk/m;->c:Lbc3/c0;

    iget-object v0, v2, Lnk/m;->d:Lbc3/z;

    const/4 v3, 0x0

    invoke-static {p2, v0, v3, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_1

    :cond_0
    move-object v2, p0

    move v5, p1

    move-object v6, p2

    :goto_1
    move p1, v5

    move-object p2, v6

    goto :goto_0

    :cond_1
    move-object v2, p0

    return-void
.end method
