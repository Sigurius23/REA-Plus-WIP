.class public final Lwc1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0008\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J9\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0010R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0010\u00a8\u0006\u0016"
    }
    d2 = {
        "Lwc1/a;",
        "",
        "<init>",
        "()V",
        "Ljava/util/Locale;",
        "locale",
        "Ljava/time/LocalDate;",
        "currentDate",
        "selectedDate",
        "latestMonthDate",
        "Lh91/b;",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "a",
        "(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;)Lh91/b;",
        "",
        "b",
        "Ljava/util/List;",
        "recoveryDates",
        "c",
        "strainDates",
        "d",
        "sleepDates",
        "design-models_release"
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
.field public static final a:Lwc1/a;

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 21

    new-instance v0, Lwc1/a;

    invoke-direct {v0}, Lwc1/a;-><init>()V

    sput-object v0, Lwc1/a;->a:Lwc1/a;

    const/4 v0, 0x0

    const/16 v1, 0x1f

    invoke-static {v0, v1}, Le93/b;->i0(II)Li93/j;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v5, v2

    check-cast v5, Lm83/e0;

    invoke-virtual {v5}, Lm83/e0;->nextInt()I

    move-result v5

    add-int/lit8 v6, v5, 0x1

    rem-int/lit8 v7, v5, 0x5

    if-nez v7, :cond_0

    sget-object v5, Lcom/whoop/design/models/calendar/CalendarDayState;->LOW_RECOVERY:Lcom/whoop/design/models/calendar/CalendarDayState;

    :goto_1
    move-object v11, v5

    goto :goto_2

    :cond_0
    rem-int/lit8 v5, v5, 0x6

    if-nez v5, :cond_1

    sget-object v5, Lcom/whoop/design/models/calendar/CalendarDayState;->MEDIUM_RECOVERY:Lcom/whoop/design/models/calendar/CalendarDayState;

    goto :goto_1

    :cond_1
    sget-object v5, Lcom/whoop/design/models/calendar/CalendarDayState;->HIGH_RECOVERY:Lcom/whoop/design/models/calendar/CalendarDayState;

    goto :goto_1

    :goto_2
    new-instance v7, Lcom/whoop/design/models/calendar/CalendarDateModel;

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    int-to-long v5, v6

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const/16 v19, 0x7f0

    const/16 v20, 0x0

    const/4 v9, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v7 .. v20}, Lcom/whoop/design/models/calendar/CalendarDateModel;-><init>(Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    sput-object v3, Lwc1/a;->b:Ljava/util/List;

    invoke-static {v0, v1}, Le93/b;->i0(II)Li93/j;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    move-object v5, v2

    check-cast v5, Lm83/e0;

    invoke-virtual {v5}, Lm83/e0;->nextInt()I

    move-result v5

    add-int/lit8 v6, v5, 0x1

    rem-int/lit8 v7, v5, 0x5

    if-nez v7, :cond_3

    sget-object v5, Lcom/whoop/design/models/calendar/CalendarDayState;->LOW_STRAIN:Lcom/whoop/design/models/calendar/CalendarDayState;

    :goto_4
    move-object v11, v5

    goto :goto_5

    :cond_3
    rem-int/lit8 v5, v5, 0x6

    if-nez v5, :cond_4

    sget-object v5, Lcom/whoop/design/models/calendar/CalendarDayState;->HIGH_STRAIN:Lcom/whoop/design/models/calendar/CalendarDayState;

    goto :goto_4

    :cond_4
    sget-object v5, Lcom/whoop/design/models/calendar/CalendarDayState;->NO_DATA:Lcom/whoop/design/models/calendar/CalendarDayState;

    goto :goto_4

    :goto_5
    new-instance v7, Lcom/whoop/design/models/calendar/CalendarDateModel;

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    int-to-long v5, v6

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const/16 v19, 0x7f0

    const/16 v20, 0x0

    const/4 v9, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v7 .. v20}, Lcom/whoop/design/models/calendar/CalendarDateModel;-><init>(Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    sput-object v3, Lwc1/a;->c:Ljava/util/List;

    invoke-static {v0, v1}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    move-object v2, v0

    check-cast v2, Lm83/e0;

    invoke-virtual {v2}, Lm83/e0;->nextInt()I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    rem-int/lit8 v4, v2, 0x4

    if-nez v4, :cond_6

    sget-object v2, Lcom/whoop/design/models/calendar/CalendarDayState;->LOW_SLEEP:Lcom/whoop/design/models/calendar/CalendarDayState;

    :goto_7
    move-object v8, v2

    goto :goto_8

    :cond_6
    rem-int/lit8 v2, v2, 0x5

    if-nez v2, :cond_7

    sget-object v2, Lcom/whoop/design/models/calendar/CalendarDayState;->HIGH_SLEEP:Lcom/whoop/design/models/calendar/CalendarDayState;

    goto :goto_7

    :cond_7
    sget-object v2, Lcom/whoop/design/models/calendar/CalendarDayState;->NO_DATA:Lcom/whoop/design/models/calendar/CalendarDayState;

    goto :goto_7

    :goto_8
    new-instance v4, Lcom/whoop/design/models/calendar/CalendarDateModel;

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    int-to-long v2, v3

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const/16 v16, 0x7f0

    const/16 v17, 0x0

    const/4 v6, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v4 .. v17}, Lcom/whoop/design/models/calendar/CalendarDateModel;-><init>(Lcom/whoop/design/util/TextResource;ZLjava/lang/Long;Lcom/whoop/design/models/calendar/CalendarDayState;Lcom/whoop/design/models/calendar/CalendarPhase;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/whoop/design/models/calendar/CalendarDayBottomState;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/calendar/CalendarOverlay;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_8
    sput-object v1, Lwc1/a;->d:Ljava/util/List;

    const/16 v0, 0x8

    sput v0, Lwc1/a;->e:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lwc1/a;Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;ILjava/lang/Object;)Lh91/b;
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const-string v0, "now(...)"

    if-eqz p6, :cond_0

    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object p4

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lwc1/a;->a(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;)Lh91/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;)Lh91/b;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Locale;",
            "Ljava/time/LocalDate;",
            "Ljava/time/LocalDate;",
            "Ljava/time/LocalDate;",
            ")",
            "Lh91/b<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;"
        }
    .end annotation

    const-string v0, "locale"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentDate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedDate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestMonthDate"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lh91/b;->j:Lh91/b$a;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v2, Lwc1/a;->c:Ljava/util/List;

    new-instance v3, Ll83/k;

    invoke-direct {v3, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v2, Lwc1/a;->b:Ljava/util/List;

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v2, Lwc1/a;->d:Ljava/util/List;

    new-instance v6, Ll83/k;

    invoke-direct {v6, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4, v6}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v6

    const/16 v10, 0xe0

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v11}, Lh91/b$a;->b(Lh91/b$a;Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;ZLjava/util/List;IILjava/lang/Object;)Lh91/b;

    move-result-object p1

    return-object p1
.end method
