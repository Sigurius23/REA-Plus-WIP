.class public final Lqp0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo02/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqp0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lqp0/a;",
        "Lo02/d;",
        "<init>",
        "()V",
        "",
        "Lorg/joda/time/LocalDateTime;",
        "f",
        "(Ljava/lang/String;)Lorg/joda/time/LocalDateTime;",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "navigationScreenModel",
        "Lj02/m0;",
        "e",
        "(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;",
        "a",
        "add-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lqp0/a$a;

.field private static final b:Ljava/time/format/DateTimeFormatter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqp0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lqp0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lqp0/a;->a:Lqp0/a$a;

    const-string v0, "yyyy-MM-dd\'T\'HH:mm:ss.SSSX"

    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    const-string v1, "ofPattern(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lqp0/a;->b:Ljava/time/format/DateTimeFormatter;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic c()Ljava/time/format/DateTimeFormatter;
    .locals 1

    sget-object v0, Lqp0/a;->b:Ljava/time/format/DateTimeFormatter;

    return-object v0
.end method

.method public static final d(JJ)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lqp0/a;->a:Lqp0/a$a;

    invoke-virtual {v0, p0, p1, p2, p3}, Lqp0/a$a;->a(JJ)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private final f(Ljava/lang/String;)Lorg/joda/time/LocalDateTime;
    .locals 2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    new-instance v0, Lorg/joda/time/LocalDateTime;

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss.SSSZ"

    invoke-static {v1}, Lorg/joda/time/format/DateTimeFormat;->forPattern(Ljava/lang/String;)Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v1

    invoke-virtual {v1, p1}, Lorg/joda/time/format/DateTimeFormatter;->parseDateTime(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/joda/time/LocalDateTime;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public bridge synthetic a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;
    .locals 0

    invoke-virtual {p0, p1}, Lqp0/a;->e(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;

    move-result-object p1

    return-object p1
.end method

.method public bridge b(Ljava/util/List;Ljava/util/Map;)Lo02/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lo02/d;",
            ">;",
            "Ljava/util/Map<",
            "Lj93/d;",
            "+",
            "Lkotlin/jvm/functions/Function1;",
            ">;)",
            "Lo02/d;"
        }
    .end annotation

    invoke-super {p0, p1, p2}, Lo02/d;->b(Ljava/util/List;Ljava/util/Map;)Lo02/d;

    move-result-object p1

    return-object p1
.end method

.method public e(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/m0;
    .locals 12

    const-string v0, "navigationScreenModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/navigation/AddActivityModel;

    const-string v1, ""

    if-eqz v0, :cond_1

    check-cast p1, Lcom/whoop/navigation/AddActivityModel;

    invoke-virtual {p1}, Lcom/whoop/navigation/AddActivityModel;->getStartTime()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lqp0/a;->b:Ljava/time/format/DateTimeFormatter;

    invoke-static {v0, v2}, Ljava/time/OffsetDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/OffsetDateTime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/OffsetDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    move-result-object v6

    invoke-virtual {p1}, Lcom/whoop/navigation/AddActivityModel;->getEndTime()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Ljava/time/OffsetDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/OffsetDateTime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/OffsetDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    move-result-object v7

    invoke-virtual {p1}, Lcom/whoop/navigation/AddActivityModel;->getActivityType()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    move-object v9, v1

    goto :goto_0

    :cond_0
    move-object v9, p1

    :goto_0
    new-instance v3, Lj02/m0$f;

    const/16 v10, 0x13

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v11}, Lj02/m0$f;-><init>(ZLjava/time/LocalDate;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_1
    instance-of v0, p1, Lcom/whoop/navigation/ActivityEditModel;

    if-eqz v0, :cond_6

    new-instance v2, Lj02/m0$c1;

    check-cast p1, Lcom/whoop/navigation/ActivityEditModel;

    invoke-virtual {p1}, Lcom/whoop/navigation/ActivityEditModel;->getStartTime()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    invoke-direct {p0, v0}, Lqp0/a;->f(Ljava/lang/String;)Lorg/joda/time/LocalDateTime;

    move-result-object v0

    goto :goto_1

    :cond_2
    move-object v0, v3

    :goto_1
    invoke-virtual {p1}, Lcom/whoop/navigation/ActivityEditModel;->getEndTime()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-direct {p0, v4}, Lqp0/a;->f(Ljava/lang/String;)Lorg/joda/time/LocalDateTime;

    move-result-object v3

    :cond_3
    move-object v4, v3

    invoke-virtual {p1}, Lcom/whoop/navigation/ActivityEditModel;->getInternalName()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_4

    move-object v5, v1

    goto :goto_2

    :cond_4
    move-object v5, v3

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/navigation/ActivityEditModel;->getActivityScoreType()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_5

    move-object v6, v1

    goto :goto_3

    :cond_5
    move-object v6, v3

    :goto_3
    invoke-virtual {p1}, Lcom/whoop/navigation/ActivityEditModel;->getActivityId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/whoop/navigation/ActivityEditModel;->getFlow()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1}, Lcom/whoop/navigation/ActivityEditModel;->isDeletable()Z

    move-result v9

    move-object v3, v0

    invoke-direct/range {v2 .. v9}, Lj02/m0$c1;-><init>(Lorg/joda/time/LocalDateTime;Lorg/joda/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v2

    :cond_6
    instance-of v0, p1, Lcom/whoop/navigation/HealthMonitorScreenModel;

    if-eqz v0, :cond_7

    check-cast p1, Lcom/whoop/navigation/HealthMonitorScreenModel;

    invoke-virtual {p1}, Lcom/whoop/navigation/HealthMonitorScreenModel;->getInitialHr()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/navigation/HealthMonitorScreenModel;->getInitialHrZone()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/navigation/HealthMonitorScreenModel;->getSource()Ljava/lang/String;

    move-result-object v1

    new-instance v0, Lj02/m0$q1;

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lj02/m0$q1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_7
    sget-object p1, Lj02/m0$j3;->b:Lj02/m0$j3;

    return-object p1
.end method
