.class final Lmp0/s$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmp0/s;->P(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;ZLq83/d;)Ljava/lang/Object;
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
        0xba
    }
    m = "handleStrapAndServerAlarmMismatchError"
    v = 0x2
.end annotation


# instance fields
.field E:Z

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lmp0/s;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

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
            "Lmp0/s$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmp0/s$a;->G:Lmp0/s;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lmp0/s$a;->F:Ljava/lang/Object;

    iget p1, p0, Lmp0/s$a;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmp0/s$a;->H:I

    iget-object p1, p0, Lmp0/s$a;->G:Lmp0/s;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p0}, Lmp0/s;->y(Lmp0/s;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
