.class public final synthetic Lcom/whoop/calendararchmini/domain/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lan0/a;

.field public final synthetic x:I


# direct methods
.method public synthetic constructor <init>(Lan0/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/calendararchmini/domain/e;->w:Lan0/a;

    iput p2, p0, Lcom/whoop/calendararchmini/domain/e;->x:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/whoop/calendararchmini/domain/e;->w:Lan0/a;

    iget v1, p0, Lcom/whoop/calendararchmini/domain/e;->x:I

    invoke-static {v0, v1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;->f(Lan0/a;I)Lan0/a;

    move-result-object v0

    return-object v0
.end method
