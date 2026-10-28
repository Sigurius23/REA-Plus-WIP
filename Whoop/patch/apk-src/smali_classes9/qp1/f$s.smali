.class final Lqp1/f$s;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqp1/f;->p(ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.hormonalinsights.settings.domain.HormonalSettingsInteractor"
    f = "HormonalSettingsInteractor.kt"
    l = {
        0x87
    }
    m = "updateCycleTrendsOverlay"
    v = 0x2
.end annotation


# instance fields
.field w:Z

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lqp1/f;

.field z:I


# direct methods
.method public constructor <init>(Lqp1/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqp1/f;",
            "Lq83/d<",
            "-",
            "Lqp1/f$s;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqp1/f$s;->y:Lqp1/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lqp1/f$s;->x:Ljava/lang/Object;

    iget p1, p0, Lqp1/f$s;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqp1/f$s;->z:I

    iget-object p1, p0, Lqp1/f$s;->y:Lqp1/f;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lqp1/f;->i(Lqp1/f;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
