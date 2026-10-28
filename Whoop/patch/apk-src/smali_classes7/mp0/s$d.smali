.class final Lmp0/s$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmp0/s;->d0(ZLorg/joda/time/DateTime;ZZLq83/d;)Ljava/lang/Object;
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
        0xe3
    }
    m = "updateAlarmOnServer"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lmp0/s;

.field G:I

.field w:Z

.field x:Z

.field y:Z

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lmp0/s;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmp0/s;",
            "Lq83/d<",
            "-",
            "Lmp0/s$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmp0/s$d;->F:Lmp0/s;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lmp0/s$d;->E:Ljava/lang/Object;

    iget p1, p0, Lmp0/s$d;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmp0/s$d;->G:I

    iget-object v0, p0, Lmp0/s$d;->F:Lmp0/s;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lmp0/s;->A(Lmp0/s;ZLorg/joda/time/DateTime;ZZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
