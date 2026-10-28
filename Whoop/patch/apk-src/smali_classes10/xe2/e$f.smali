.class final Lxe2/e$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe2/e;->w(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.sleep.coach.data.domain.WakeTimeScheduleDomainInteractor"
    f = "WakeTimeScheduleDomainInteractor.kt"
    l = {
        0x7a,
        0x79,
        0x80,
        0x7f
    }
    m = "saveSleepSchedule"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lxe2/e;

.field F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lxe2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxe2/e;",
            "Lq83/d<",
            "-",
            "Lxe2/e$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxe2/e$f;->E:Lxe2/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lxe2/e$f;->z:Ljava/lang/Object;

    iget p1, p0, Lxe2/e$f;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lxe2/e$f;->F:I

    iget-object p1, p0, Lxe2/e$f;->E:Lxe2/e;

    invoke-static {p1, p0}, Lxe2/e;->e(Lxe2/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
