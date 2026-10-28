.class public final Ldo1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\u0010\u000c\u001a\u000c\u0012\u0004\u0012\u00020\n0\tj\u0002`\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Ldo1/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/design/models/calendar/CalendarOverlay;",
        "overlay",
        "Lco1/b;",
        "b",
        "(Lcom/whoop/design/models/calendar/CalendarOverlay;)Lco1/b;",
        "Lkb1/e;",
        "Lcom/whoop/design/models/calendar/CalendarDateModel;",
        "Lcom/whoop/design/reducer/calendar/CalendarDateArguments;",
        "dateArgs",
        "Lco1/a;",
        "a",
        "(Lkb1/e;)Lco1/a;",
        "hormonal-insights_release"
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

.method private final b(Lcom/whoop/design/models/calendar/CalendarOverlay;)Lco1/b;
    .locals 7

    new-instance v0, Lco1/b;

    sget-object v1, Ly81/f;->SURFACE_MCI_OVULATORY:Ly81/f;

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v2

    invoke-virtual {p1}, Lcom/whoop/design/models/calendar/CalendarOverlay;->getType()Lcom/whoop/design/models/calendar/CalendarOverlayType;

    move-result-object v3

    sget-object v4, Lcom/whoop/design/models/calendar/CalendarOverlayType;->FERTILE_WINDOW_FUTURE:Lcom/whoop/design/models/calendar/CalendarOverlayType;

    if-ne v3, v4, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/design/models/calendar/CalendarOverlay;->getFirstDayOfOverlay()Z

    move-result v4

    invoke-virtual {p1}, Lcom/whoop/design/models/calendar/CalendarOverlay;->getLastDayOfOverlay()Z

    move-result v5

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v6}, Lco1/b;-><init>(Ly81/e;FZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lkb1/e;)Lco1/a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkb1/e<",
            "Lcom/whoop/design/models/calendar/CalendarDateModel;",
            ">;)",
            "Lco1/a;"
        }
    .end annotation

    const-string v0, "dateArgs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkb1/e;->g()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/design/models/calendar/CalendarDateModel;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/design/models/calendar/CalendarDateModel;->getOverlay()Lcom/whoop/design/models/calendar/CalendarOverlay;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/design/models/calendar/CalendarDateModel;->getDayState()Lcom/whoop/design/models/calendar/CalendarDayState;

    move-result-object p1

    sget-object v2, Lcom/whoop/design/models/calendar/CalendarDayState;->OVULATION:Lcom/whoop/design/models/calendar/CalendarDayState;

    if-ne p1, v2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-nez v1, :cond_2

    if-nez p1, :cond_2

    :goto_1
    return-object v0

    :cond_2
    if-eqz p1, :cond_3

    sget p1, Lxn1/b;->a:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_2

    :cond_3
    move-object p1, v0

    :goto_2
    if-eqz v1, :cond_4

    invoke-direct {p0, v1}, Ldo1/a;->b(Lcom/whoop/design/models/calendar/CalendarOverlay;)Lco1/b;

    move-result-object v0

    :cond_4
    new-instance v1, Lco1/a;

    invoke-direct {v1, p1, v0}, Lco1/a;-><init>(Ljava/lang/Integer;Lco1/b;)V

    return-object v1
.end method
