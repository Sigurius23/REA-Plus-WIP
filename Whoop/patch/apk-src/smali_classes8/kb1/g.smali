.class public abstract Lkb1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0002\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "",
        "Lcom/whoop/design/models/calendar/CalendarDayState;",
        "a",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "hormonalInsightsCalendarDayStates",
        "design-models_release"
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
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/CalendarDayState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/calendar/CalendarDayState;->PERIOD:Lcom/whoop/design/models/calendar/CalendarDayState;

    sget-object v1, Lcom/whoop/design/models/calendar/CalendarDayState;->PREDICTED_PERIOD:Lcom/whoop/design/models/calendar/CalendarDayState;

    sget-object v2, Lcom/whoop/design/models/calendar/CalendarDayState;->NONE:Lcom/whoop/design/models/calendar/CalendarDayState;

    sget-object v3, Lcom/whoop/design/models/calendar/CalendarDayState;->WHITE_NO_BACKGROUND:Lcom/whoop/design/models/calendar/CalendarDayState;

    filled-new-array {v0, v1, v2, v3}, [Lcom/whoop/design/models/calendar/CalendarDayState;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lkb1/g;->a:Ljava/util/List;

    return-void
.end method

.method public static final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/CalendarDayState;",
            ">;"
        }
    .end annotation

    sget-object v0, Lkb1/g;->a:Ljava/util/List;

    return-object v0
.end method
