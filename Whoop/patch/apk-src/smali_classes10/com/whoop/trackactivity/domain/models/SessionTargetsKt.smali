.class public final Lcom/whoop/trackactivity/domain/models/SessionTargetsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u0004H\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "toSessionTargets",
        "Lcom/whoop/trackactivity/domain/models/SessionTargets;",
        "Lcom/whoop/trackactivity/domain/models/LiveActivityTargetsResponse;",
        "BFF_HR_ZONE_PREFIX",
        "",
        "BFF_HR_ZONE_DURATION_UNIT",
        "toZoneIDOrNull",
        "Lcom/whoop/hrZones/network/ZoneID;",
        "track-activity_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final BFF_HR_ZONE_DURATION_UNIT:Ljava/lang/String; = "SECONDS"

.field private static final BFF_HR_ZONE_PREFIX:Ljava/lang/String; = "HR_"


# direct methods
.method public static final toSessionTargets(Lcom/whoop/trackactivity/domain/models/LiveActivityTargetsResponse;)Lcom/whoop/trackactivity/domain/models/SessionTargets;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/trackactivity/domain/models/LiveActivityTargetsResponse;->getStrainTarget()Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;->getTargetValue()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    double-to-float v0, v2

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/trackactivity/domain/models/LiveActivityTargetsResponse;->getDurationTarget()Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;

    move-result-object v2

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    const-string v6, "SECONDS"

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;->getUnit()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6, v5}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;->getTargetValue()Ljava/lang/Double;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    double-to-long v7, v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    cmp-long v7, v7, v3

    if-lez v7, :cond_2

    goto :goto_2

    :cond_2
    move-object v2, v1

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/trackactivity/domain/models/LiveActivityTargetsResponse;->getDistanceTarget()Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Lcom/whoop/trackactivity/domain/models/LiveActivityTargetSection;->getTargetValue()Ljava/lang/Double;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmpl-double v8, v8, v10

    if-lez v8, :cond_3

    goto :goto_3

    :cond_3
    move-object v7, v1

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/trackactivity/domain/models/LiveActivityTargetsResponse;->getHrzTarget()Lcom/whoop/trackactivity/domain/models/LiveActivityHrzTargetSection;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Lcom/whoop/trackactivity/domain/models/LiveActivityHrzTargetSection;->getUnit()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_5

    invoke-virtual {p0}, Lcom/whoop/trackactivity/domain/models/LiveActivityHrzTargetSection;->getUnit()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v6, v5}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_4

    :cond_4
    move-object p0, v1

    :cond_5
    :goto_4
    if-eqz p0, :cond_6

    invoke-virtual {p0}, Lcom/whoop/trackactivity/domain/models/LiveActivityHrzTargetSection;->getZones()Ljava/util/List;

    move-result-object p0

    goto :goto_5

    :cond_6
    move-object p0, v1

    :goto_5
    if-nez p0, :cond_7

    sget-object p0, Lm83/y;->w:Lm83/y;

    :cond_7
    check-cast p0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_8
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/trackactivity/domain/models/LiveActivityHrzZone;

    invoke-virtual {v6}, Lcom/whoop/trackactivity/domain/models/LiveActivityHrzZone;->getZone()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_b

    invoke-static {v8}, Lcom/whoop/trackactivity/domain/models/SessionTargetsKt;->toZoneIDOrNull(Ljava/lang/String;)Lcom/whoop/hrZones/network/ZoneID;

    move-result-object v8

    if-nez v8, :cond_9

    goto :goto_8

    :cond_9
    invoke-virtual {v6}, Lcom/whoop/trackactivity/domain/models/LiveActivityHrzZone;->getTargetValue()Ljava/lang/Double;

    move-result-object v6

    if-eqz v6, :cond_b

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v9

    double-to-long v9, v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    cmp-long v9, v9, v3

    if-lez v9, :cond_a

    goto :goto_7

    :cond_a
    move-object v6, v1

    :goto_7
    if-eqz v6, :cond_b

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/time/Duration;->ofSeconds(J)Ljava/time/Duration;

    move-result-object v6

    new-instance v9, Ll83/k;

    invoke-direct {v9, v8, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_9

    :cond_b
    :goto_8
    move-object v9, v1

    :goto_9
    if-eqz v9, :cond_8

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_c
    invoke-static {v5}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p0

    new-instance v1, Lcom/whoop/trackactivity/domain/models/SessionTargets;

    invoke-direct {v1, v0, v2, v7, p0}, Lcom/whoop/trackactivity/domain/models/SessionTargets;-><init>(Ljava/lang/Float;Ljava/lang/Long;Ljava/lang/Double;Ljava/util/Map;)V

    return-object v1
.end method

.method private static final toZoneIDOrNull(Ljava/lang/String;)Lcom/whoop/hrZones/network/ZoneID;
    .locals 4

    invoke-static {}, Lcom/whoop/hrZones/network/ZoneID;->getEntries()Lt83/a;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/whoop/hrZones/network/ZoneID;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    const-string v3, "HR_"

    invoke-static {p0, v3}, Lyb3/r;->q0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/whoop/hrZones/network/ZoneID;

    return-object v1
.end method
