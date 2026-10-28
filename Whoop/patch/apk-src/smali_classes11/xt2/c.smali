.class public abstract Lxt2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001f\u0010\n\u001a\u00020\t2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;",
        "goalSections",
        "",
        "a",
        "(Ljava/util/List;)Ljava/lang/String;",
        "date",
        "Lorg/joda/time/LocalDate;",
        "todayDate",
        "",
        "b",
        "(Ljava/lang/String;Lorg/joda/time/LocalDate;)I",
        "weekly-plan_release"
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
.method public static final a(Ljava/util/List;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "goalSections"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/GoalSection;->getGoalCards()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {}, Lxt2/b;->h()Ljb1/a;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v1

    instance-of v2, v1, Lzt2/n;

    if-eqz v2, :cond_2

    const-string p0, "Locked"

    return-object p0

    :cond_2
    instance-of v2, v1, Lzt2/b;

    const-string v3, "Active Plan"

    if-eqz v2, :cond_3

    return-object v3

    :cond_3
    instance-of v2, v1, Lk71/m;

    if-eqz v2, :cond_4

    return-object v3

    :cond_4
    instance-of v2, v1, Lzt2/h;

    if-eqz v2, :cond_5

    return-object v3

    :cond_5
    instance-of v1, v1, La61/e;

    if-eqz v1, :cond_1

    return-object v3

    :cond_6
    const-string p0, "Empty State"

    return-object p0
.end method

.method public static final b(Ljava/lang/String;Lorg/joda/time/LocalDate;)I
    .locals 1

    const-string v0, "todayDate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_1

    const-string v0, "yyyy-MM-dd"

    invoke-static {v0}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-static {p0, v0}, Lorg/joda/time/LocalDate;->parse(Ljava/lang/String;Lorg/joda/time/format/DateTimeFormatter;)Lorg/joda/time/LocalDate;

    move-result-object p0

    invoke-static {p0, p1}, Lorg/joda/time/Days;->daysBetween(Lorg/joda/time/ReadablePartial;Lorg/joda/time/ReadablePartial;)Lorg/joda/time/Days;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/Days;->getDays()I

    move-result v0

    rem-int/lit8 v0, v0, 0x7

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Lorg/joda/time/Days;->daysBetween(Lorg/joda/time/ReadablePartial;Lorg/joda/time/ReadablePartial;)Lorg/joda/time/Days;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/Days;->getDays()I

    move-result p0

    div-int/lit8 p0, p0, 0x7

    return p0

    :cond_0
    invoke-static {p0, p1}, Lorg/joda/time/Days;->daysBetween(Lorg/joda/time/ReadablePartial;Lorg/joda/time/ReadablePartial;)Lorg/joda/time/Days;

    move-result-object p0

    invoke-virtual {p0}, Lorg/joda/time/Days;->getDays()I

    move-result p0

    div-int/lit8 p0, p0, 0x7

    add-int/lit8 p0, p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
