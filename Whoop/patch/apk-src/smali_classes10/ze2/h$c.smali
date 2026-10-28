.class final Lze2/h$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lze2/h;->j(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.sleep.coach.data.domain.sleepSchedule.SleepScheduleListInteractor"
    f = "SleepScheduleListInteractor.kt"
    l = {
        0x84
    }
    m = "fetchSleepScheduleList"
    v = 0x2
.end annotation


# instance fields
.field synthetic w:Ljava/lang/Object;

.field final synthetic x:Lze2/h;

.field y:I


# direct methods
.method public constructor <init>(Lze2/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lze2/h;",
            "Lq83/d<",
            "-",
            "Lze2/h$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lze2/h$c;->x:Lze2/h;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lze2/h$c;->w:Ljava/lang/Object;

    iget p1, p0, Lze2/h$c;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lze2/h$c;->y:I

    iget-object p1, p0, Lze2/h$c;->x:Lze2/h;

    invoke-static {p1, p0}, Lze2/h;->b(Lze2/h;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
