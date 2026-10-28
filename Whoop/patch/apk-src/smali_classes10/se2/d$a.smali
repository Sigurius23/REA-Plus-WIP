.class final Lse2/d$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lse2/d;->k(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.sleep.coach.alarmWarning.domain.TurnoffAlarmWarningInteractor"
    f = "TurnoffAlarmWarningInteractor.kt"
    l = {
        0x66,
        0x67,
        0x6e,
        0x6f,
        0x70,
        0x72,
        0x76
    }
    m = "callPostSmartAlarmOverride"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lse2/d;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lse2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lse2/d;",
            "Lq83/d<",
            "-",
            "Lse2/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lse2/d$a;->F:Lse2/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lse2/d$a;->E:Ljava/lang/Object;

    iget p1, p0, Lse2/d$a;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lse2/d$a;->G:I

    iget-object p1, p0, Lse2/d$a;->F:Lse2/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lse2/d;->c(Lse2/d;Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
