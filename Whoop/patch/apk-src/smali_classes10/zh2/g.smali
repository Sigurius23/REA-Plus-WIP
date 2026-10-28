.class public final Lzh2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzh2/g$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lzh2/g;",
        "",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ltr2/n;)V",
        "",
        "revision",
        "",
        "dataSequenceNumber",
        "Ll83/a0;",
        "b",
        "(SJ)V",
        "Lzh2/b;",
        "a",
        "()Lzh2/b;",
        "c",
        "()V",
        "Ltr2/n;",
        "",
        "Lzh2/g$a;",
        "Ljava/util/Map;",
        "revisions",
        "strap-history-sync_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ltr2/n;

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Short;",
            "Lzh2/g$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltr2/n;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lzh2/g;->a:Ltr2/n;

    .line 3
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lzh2/g;->b:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "SequenceGapTracker"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lzh2/g;-><init>(Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a()Lzh2/b;
    .locals 11

    iget-object v0, p0, Lzh2/g;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzh2/g$a;

    invoke-virtual {v2}, Lzh2/g$a;->c()I

    move-result v2

    add-int/2addr v3, v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lzh2/g;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v4, 0x0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzh2/g$a;

    invoke-virtual {v2}, Lzh2/g$a;->e()J

    move-result-wide v6

    add-long/2addr v4, v6

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lzh2/g;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v6, v1

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzh2/g$a;

    invoke-virtual {v1}, Lzh2/g$a;->a()I

    move-result v1

    add-int/2addr v6, v1

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lzh2/g;->b:Ljava/util/Map;

    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v7, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzh2/g$a;

    invoke-virtual {v1}, Lzh2/g$a;->b()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v7, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_3
    iget-object v0, p0, Lzh2/g;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->shortValue()S

    move-result v8

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzh2/g$a;

    invoke-virtual {v2}, Lzh2/g$a;->d()Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    invoke-static {v8}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v2

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    new-instance v9, Ll83/k;

    invoke-direct {v9, v2, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_5
    const/4 v9, 0x0

    :goto_5
    if-eqz v9, :cond_4

    invoke-interface {v1, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    invoke-static {v1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v8

    new-instance v2, Lzh2/b;

    invoke-direct/range {v2 .. v8}, Lzh2/b;-><init>(IJILjava/util/Map;Ljava/util/Map;)V

    return-object v2
.end method

.method public final b(SJ)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    iget-object v12, v0, Lzh2/g;->b:Ljava/util/Map;

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Lzh2/g$a;

    const/16 v10, 0x1e

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    move-wide/from16 v3, p2

    invoke-direct/range {v2 .. v11}, Lzh2/g$a;-><init>(JLjava/lang/Long;IJIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v12, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-wide/from16 v3, p2

    :goto_0
    check-cast v2, Lzh2/g$a;

    invoke-virtual {v2}, Lzh2/g$a;->d()Ljava/lang/Long;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    const-wide/16 v8, 0x1

    add-long/2addr v6, v8

    cmp-long v6, v3, v6

    const/4 v7, 0x0

    const-string v10, ", got "

    const-string v11, ": expected "

    if-lez v6, :cond_1

    invoke-virtual {v2}, Lzh2/g$a;->c()I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v2, v6}, Lzh2/g$a;->g(I)V

    invoke-virtual {v2}, Lzh2/g$a;->e()J

    move-result-wide v12

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    sub-long v14, v3, v14

    sub-long/2addr v14, v8

    add-long/2addr v14, v12

    invoke-virtual {v2, v14, v15}, Lzh2/g$a;->i(J)V

    iget-object v6, v0, Lzh2/g;->a:Ltr2/n;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    add-long/2addr v12, v8

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v14

    sub-long v14, v3, v14

    sub-long/2addr v14, v8

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Sequence gap V"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " (missing "

    invoke-static {v8, v10, v3, v4, v1}, Lb9/y;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    const-string v1, ")"

    invoke-static {v14, v15, v1, v8}, Ld;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    new-array v7, v7, [Lqr2/a$a;

    invoke-interface {v6, v1, v7}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    cmp-long v6, v3, v12

    if-gtz v6, :cond_2

    invoke-virtual {v2}, Lzh2/g$a;->a()I

    move-result v6

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v2, v6}, Lzh2/g$a;->f(I)V

    iget-object v6, v0, Lzh2/g;->a:Ltr2/n;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    add-long/2addr v12, v8

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "Backward/duplicate V"

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v7, v7, [Lqr2/a$a;

    invoke-interface {v6, v1, v7}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_2
    :goto_1
    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-lez v1, :cond_3

    goto :goto_2

    :cond_3
    return-void

    :cond_4
    :goto_2
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v2, v1}, Lzh2/g$a;->h(Ljava/lang/Long;)V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lzh2/g;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method
