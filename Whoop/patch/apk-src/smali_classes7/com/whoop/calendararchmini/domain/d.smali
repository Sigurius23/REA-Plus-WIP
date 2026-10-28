.class public final synthetic Lcom/whoop/calendararchmini/domain/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

.field public final synthetic x:Lan0/a;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;ILan0/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/calendararchmini/domain/d;->w:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iput-object p3, p0, Lcom/whoop/calendararchmini/domain/d;->x:Lan0/a;

    iput p2, p0, Lcom/whoop/calendararchmini/domain/d;->y:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lcom/whoop/calendararchmini/domain/d;->y:I

    check-cast p1, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;

    iget-object v1, p0, Lcom/whoop/calendararchmini/domain/d;->w:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iget-object v2, p0, Lcom/whoop/calendararchmini/domain/d;->x:Lan0/a;

    invoke-static {v1, v2, v0, p1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->h(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lan0/a;ILcom/whoop/design/models/calendar/archmini/CalendarContentModel;)Lan0/a;

    move-result-object p1

    return-object p1
.end method
