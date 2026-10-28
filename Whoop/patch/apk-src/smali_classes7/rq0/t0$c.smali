.class public final Lrq0/t0$c;
.super Lpq/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrq0/t0;->G0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "rq0/t0$c",
        "Lpq/c;",
        "Landroid/view/View;",
        "bottomSheet",
        "",
        "newState",
        "Ll83/a0;",
        "c",
        "(Landroid/view/View;I)V",
        "",
        "slideOffset",
        "b",
        "(Landroid/view/View;F)V",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;

.field final synthetic b:Lrq0/t0;


# direct methods
.method public constructor <init>(Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;Lrq0/t0;)V
    .locals 0

    iput-object p1, p0, Lrq0/t0$c;->a:Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;

    iput-object p2, p0, Lrq0/t0$c;->b:Lrq0/t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;F)V
    .locals 0

    const-string p2, "bottomSheet"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public c(Landroid/view/View;I)V
    .locals 1

    const-string v0, "bottomSheet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x2

    if-eq p2, p1, :cond_1

    const/4 p1, 0x3

    if-eq p2, p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lrq0/t0$c;->a:Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;

    iget-object p2, p0, Lrq0/t0$c;->b:Lrq0/t0;

    invoke-static {p2}, Lrq0/t0;->Z(Lrq0/t0;)Lrq0/h1;

    move-result-object p2

    invoke-virtual {p2}, Lrq0/h1;->X()Lcom/whoop/community/domain/model/teams/TimePeriod;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;->setType(Lcom/whoop/community/domain/model/teams/TimePeriod;)V

    return-void

    :cond_1
    iget-object p1, p0, Lrq0/t0$c;->a:Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;

    iget-object p2, p0, Lrq0/t0$c;->b:Lrq0/t0;

    invoke-static {p2}, Lrq0/t0;->Z(Lrq0/t0;)Lrq0/h1;

    move-result-object p2

    invoke-virtual {p2}, Lrq0/h1;->X()Lcom/whoop/community/domain/model/teams/TimePeriod;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;->setType(Lcom/whoop/community/domain/model/teams/TimePeriod;)V

    return-void
.end method
