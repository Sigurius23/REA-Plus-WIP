.class final Lmp0/s$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmp0/s;->c0(ZLorg/joda/time/DateTime;ZZZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachAlarmLoadingStateViewModel"
    f = "SleepCoachAlarmLoadingStateViewModel.kt"
    l = {
        0x59,
        0x5e,
        0x63,
        0x69,
        0x6c,
        0x6f,
        0x75
    }
    m = "submitAlarm"
    v = 0x2
.end annotation


# instance fields
.field E:Z

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:I

.field synthetic J:Ljava/lang/Object;

.field final synthetic K:Lmp0/s;

.field L:I

.field w:Z

.field x:Z

.field y:Z

.field z:Z


# direct methods
.method public constructor <init>(Lmp0/s;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmp0/s;",
            "Lq83/d<",
            "-",
            "Lmp0/s$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmp0/s$c;->K:Lmp0/s;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lmp0/s$c;->J:Ljava/lang/Object;

    iget p1, p0, Lmp0/s$c;->L:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmp0/s$c;->L:I

    iget-object v0, p0, Lmp0/s$c;->K:Lmp0/s;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Lmp0/s;->z(Lmp0/s;ZLorg/joda/time/DateTime;ZZZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
