.class final Lmp0/s$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmp0/s;->f0(ZZLcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;
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
        0xf2
    }
    m = "updateUiAfterAlarmChange"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lmp0/s;

.field F:I

.field w:Z

.field x:Z

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lmp0/s;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmp0/s;",
            "Lq83/d<",
            "-",
            "Lmp0/s$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmp0/s$e;->E:Lmp0/s;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lmp0/s$e;->z:Ljava/lang/Object;

    iget p1, p0, Lmp0/s$e;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmp0/s$e;->F:I

    iget-object p1, p0, Lmp0/s$e;->E:Lmp0/s;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v0, v1, p0}, Lmp0/s;->B(Lmp0/s;ZZLcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
