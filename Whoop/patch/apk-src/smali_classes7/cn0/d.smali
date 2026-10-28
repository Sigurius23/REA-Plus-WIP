.class public abstract Lcn0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a#\u0010\u0004\u001a\u000c\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0002*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\" \u0010\u000c\u001a\u0004\u0018\u00010\t*\u0008\u0012\u0004\u0012\u00020\u00010\u00008@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lkb1/e;",
        "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "Lcom/whoop/design/reducer/calendar/CalendarDateArguments;",
        "b",
        "(Lkb1/e;)Lkb1/e;",
        "Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;",
        "c",
        "(Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;)Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "a",
        "(Lkb1/e;)Lcom/whoop/navigation/models/GenericInteraction;",
        "dayInteraction",
        "calendar-arch-mini_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lkb1/e;)Lcom/whoop/navigation/models/GenericInteraction;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkb1/e<",
            "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;",
            ">;)",
            "Lcom/whoop/navigation/models/GenericInteraction;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkb1/e;->g()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1
.end method

.method public static final b(Lkb1/e;)Lkb1/e;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkb1/e<",
            "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;",
            ">;)",
            "Lkb1/e<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lkb1/e;

    invoke-virtual {p0}, Lkb1/e;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lkb1/e;->h()Z

    move-result v3

    invoke-virtual {p0}, Lkb1/e;->j()Z

    move-result v4

    invoke-virtual {p0}, Lkb1/e;->i()Z

    move-result v5

    invoke-virtual {p0}, Lkb1/e;->e()I

    move-result v6

    invoke-virtual {p0}, Lkb1/e;->f()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lkb1/e;->d()Ljava/time/LocalDate;

    move-result-object v8

    invoke-virtual {p0}, Lkb1/e;->g()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;

    const/4 v9, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;

    goto :goto_0

    :cond_0
    move-object p0, v9

    :goto_0
    if-eqz p0, :cond_1

    invoke-static {p0}, Lcn0/d;->c(Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;)Lcom/whoop/design/models/calendar/CalendarDateModel;

    move-result-object v9

    :cond_1
    invoke-direct/range {v1 .. v9}, Lkb1/e;-><init>(Ljava/lang/String;ZZZILjava/lang/String;Ljava/time/LocalDate;Ljava/lang/Object;)V

    return-object v1
.end method

.method private static final c(Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;)Lcom/whoop/design/models/calendar/CalendarDateModel;
    .locals 14

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->getDateValueDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->getHasData()Z

    move-result v3

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->getCycleId()Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->getDayState()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/whoop/design/models/calendar/CalendarDayState;->NO_DATA:Lcom/whoop/design/models/calendar/CalendarDayState;

    invoke-static {}, Lcom/whoop/design/models/calendar/CalendarDayState;->values()[Lcom/whoop/design/models/calendar/CalendarDayState;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    const/4 v9, 0x0

    if-ge v8, v6, :cond_1

    aget-object v10, v5, v8

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_1
    move-object v10, v9

    :goto_1
    if-nez v10, :cond_2

    move-object v5, v1

    goto :goto_2

    :cond_2
    move-object v5, v10

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->getPhase()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    sget-object v1, Lcom/whoop/design/models/calendar/CalendarPhase;->NONE:Lcom/whoop/design/models/calendar/CalendarPhase;

    invoke-static {}, Lcom/whoop/design/models/calendar/CalendarPhase;->values()[Lcom/whoop/design/models/calendar/CalendarPhase;

    move-result-object v6

    array-length v8, v6

    move v10, v7

    :goto_3
    if-ge v10, v8, :cond_4

    aget-object v11, v6, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_4
    move-object v11, v9

    :goto_4
    if-nez v11, :cond_5

    goto :goto_5

    :cond_5
    move-object v1, v11

    :goto_5
    move-object v6, v1

    :goto_6
    move v0, v7

    goto :goto_7

    :cond_6
    move-object v6, v9

    goto :goto_6

    :goto_7
    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->getFirstDayOfPhase()Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->getLastDayOfPhase()Ljava/lang/Boolean;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->getBottomState()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-static {}, Lcom/whoop/design/models/calendar/CalendarDayBottomState;->values()[Lcom/whoop/design/models/calendar/CalendarDayBottomState;

    move-result-object v10

    array-length v11, v10

    :goto_8
    if-ge v0, v11, :cond_8

    aget-object v12, v10, v0

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    move-object v9, v12

    goto :goto_9

    :cond_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_8
    :goto_9
    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->getHidden()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->getDate()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/archmini/HormonalInsightsCalendarDayModel;->getOverlay()Lcom/whoop/design/models/calendar/CalendarOverlay;

    move-result-object v12

    new-instance v1, Lcom/whoop/design/models/calendar/CalendarDateModel;

    invoke-direct/range {v1 .. v12}, Lcom/whoop/design/models/calendar/CalendarDateModel;-><init>(Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;)V

    return-object v1
.end method
