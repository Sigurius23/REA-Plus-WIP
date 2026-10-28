.class public final synthetic Lcom/whoop/calendararchmini/domain/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

.field public final synthetic x:Lib1/a;

.field public final synthetic y:Ljava/time/LocalDate;

.field public final synthetic z:Ljava/time/LocalDate;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lib1/a;Ljava/time/LocalDate;Ljava/time/LocalDate;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/calendararchmini/domain/b;->w:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iput-object p2, p0, Lcom/whoop/calendararchmini/domain/b;->x:Lib1/a;

    iput-object p3, p0, Lcom/whoop/calendararchmini/domain/b;->y:Ljava/time/LocalDate;

    iput-object p4, p0, Lcom/whoop/calendararchmini/domain/b;->z:Ljava/time/LocalDate;

    iput p5, p0, Lcom/whoop/calendararchmini/domain/b;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v4, p0, Lcom/whoop/calendararchmini/domain/b;->E:I

    move-object v5, p1

    check-cast v5, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;

    iget-object v0, p0, Lcom/whoop/calendararchmini/domain/b;->w:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;

    iget-object v1, p0, Lcom/whoop/calendararchmini/domain/b;->x:Lib1/a;

    iget-object v2, p0, Lcom/whoop/calendararchmini/domain/b;->y:Ljava/time/LocalDate;

    iget-object v3, p0, Lcom/whoop/calendararchmini/domain/b;->z:Ljava/time/LocalDate;

    invoke-static/range {v0 .. v5}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;->h(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lib1/a;Ljava/time/LocalDate;Ljava/time/LocalDate;ILcom/whoop/design/models/calendar/archmini/CalendarContentModel;)Lan0/a;

    move-result-object p1

    return-object p1
.end method
