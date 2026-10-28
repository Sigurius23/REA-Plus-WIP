.class public final Lpk2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J]\u0010\u000f\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016JU\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\u0017\u0010\u0010J9\u0010\u0018\u001a\u00020\u000e2\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J?\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00062\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lpk2/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/hrZones/network/ZoneID;",
        "activeZone",
        "",
        "Ljava/time/Duration;",
        "hrZoneDurations",
        "",
        "thumbPercent",
        "",
        "maxDurationMillis",
        "goalDurations",
        "Lok2/h;",
        "e",
        "(Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;FLjava/lang/Long;Ljava/util/Map;)Lok2/h;",
        "",
        "Lok2/a;",
        "zoneBars",
        "Lok2/c;",
        "h",
        "(Ljava/util/List;)Lok2/c;",
        "a",
        "g",
        "(Ljava/util/Map;Ljava/util/Map;)Lok2/h;",
        "Lok2/f;",
        "c",
        "(Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;FLjava/lang/Long;)Lok2/f;",
        "track-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lpk2/a;Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;FLjava/lang/Long;Ljava/util/Map;ILjava/lang/Object;)Lok2/h;
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    const/high16 p3, 0x3f000000    # 0.5f

    :cond_0
    move v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    const/4 p4, 0x0

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    sget-object p5, Lm83/z;->w:Lm83/z;

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lpk2/a;->a(Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;FLjava/lang/Long;Ljava/util/Map;)Lok2/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lpk2/a;Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;FLjava/lang/Long;ILjava/lang/Object;)Lok2/f;
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/high16 p3, 0x3f000000    # 0.5f

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lpk2/a;->c(Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;FLjava/lang/Long;)Lok2/f;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;FLjava/lang/Long;Ljava/util/Map;)Lok2/h;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hrZones/network/ZoneID;",
            "Ljava/util/Map<",
            "Lcom/whoop/hrZones/network/ZoneID;",
            "Ljava/time/Duration;",
            ">;F",
            "Ljava/lang/Long;",
            "Ljava/util/Map<",
            "Lcom/whoop/hrZones/network/ZoneID;",
            "Ljava/time/Duration;",
            ">;)",
            "Lok2/h;"
        }
    .end annotation

    sget-object v0, Lok2/b;->a:Lok2/b;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/time/Duration;

    invoke-virtual {v1}, Ljava/time/Duration;->toMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-interface/range {p5 .. p5}, Ljava/util/Map;->size()I

    move-result p2

    invoke-static {p2}, Lm83/g0;->W(I)I

    move-result p2

    invoke-direct {v5, p2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface/range {p5 .. p5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/time/Duration;

    invoke-virtual {v1}, Ljava/time/Duration;->toMillis()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v5, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    move-object v1, p1

    move v4, p3

    move-object/from16 v3, p4

    invoke-virtual/range {v0 .. v5}, Lok2/b;->c(Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;Ljava/lang/Long;FLjava/util/Map;)Ljava/util/List;

    move-result-object v8

    new-instance v6, Lok2/h;

    invoke-direct {p0, v8}, Lpk2/a;->h(Ljava/util/List;)Lok2/c;

    move-result-object v9

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v6 .. v11}, Lok2/h;-><init>(Ljava/lang/String;Ljava/util/List;Lok2/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method

.method public static synthetic f(Lpk2/a;Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;FLjava/lang/Long;Ljava/util/Map;ILjava/lang/Object;)Lok2/h;
    .locals 2

    and-int/lit8 p7, p6, 0x1

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    sget-object v1, Lm83/z;->w:Lm83/z;

    if-eqz p7, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    const/high16 p3, 0x3f000000    # 0.5f

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move-object p5, v1

    :cond_4
    invoke-direct/range {p0 .. p5}, Lpk2/a;->e(Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;FLjava/lang/Long;Ljava/util/Map;)Lok2/h;

    move-result-object p0

    return-object p0
.end method

.method private final h(Ljava/util/List;)Lok2/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lok2/a;",
            ">;)",
            "Lok2/c;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lok2/a;

    invoke-virtual {v0}, Lok2/a;->d()Lok2/d;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object p1, Lok2/c;->FullWithGoals:Lok2/c;

    return-object p1

    :cond_2
    :goto_0
    sget-object p1, Lok2/c;->Full:Lok2/c;

    return-object p1
.end method


# virtual methods
.method public final a(Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;FLjava/lang/Long;Ljava/util/Map;)Lok2/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hrZones/network/ZoneID;",
            "Ljava/util/Map<",
            "Lcom/whoop/hrZones/network/ZoneID;",
            "Ljava/time/Duration;",
            ">;F",
            "Ljava/lang/Long;",
            "Ljava/util/Map<",
            "Lcom/whoop/hrZones/network/ZoneID;",
            "Ljava/time/Duration;",
            ">;)",
            "Lok2/h;"
        }
    .end annotation

    const-string v0, "activeZone"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrZoneDurations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalDurations"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p5}, Lpk2/a;->e(Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;FLjava/lang/Long;Ljava/util/Map;)Lok2/h;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;FLjava/lang/Long;)Lok2/f;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hrZones/network/ZoneID;",
            "Ljava/util/Map<",
            "Lcom/whoop/hrZones/network/ZoneID;",
            "Ljava/time/Duration;",
            ">;F",
            "Ljava/lang/Long;",
            ")",
            "Lok2/f;"
        }
    .end annotation

    const-string v0, "activeZone"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hrZoneDurations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lok2/f;

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-static/range {v2 .. v9}, Lpk2/a;->b(Lpk2/a;Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;FLjava/lang/Long;Ljava/util/Map;ILjava/lang/Object;)Lok2/h;

    move-result-object p1

    invoke-virtual {p1}, Lok2/h;->b()Ljava/util/List;

    move-result-object v3

    sget-object v4, Lok2/c;->Compact:Lok2/c;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Lok2/f;-><init>(Ljava/lang/String;Ljava/util/List;Lok2/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final g(Ljava/util/Map;Ljava/util/Map;)Lok2/h;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/whoop/hrZones/network/ZoneID;",
            "Ljava/time/Duration;",
            ">;",
            "Ljava/util/Map<",
            "Lcom/whoop/hrZones/network/ZoneID;",
            "Ljava/time/Duration;",
            ">;)",
            "Lok2/h;"
        }
    .end annotation

    const-string v0, "hrZoneDurations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goalDurations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0xd

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v6, p2

    invoke-static/range {v1 .. v8}, Lpk2/a;->f(Lpk2/a;Lcom/whoop/hrZones/network/ZoneID;Ljava/util/Map;FLjava/lang/Long;Ljava/util/Map;ILjava/lang/Object;)Lok2/h;

    move-result-object p1

    return-object p1
.end method
