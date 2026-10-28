.class final Loo1/g$x;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo1/g;->A(Lso1/r;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor"
    f = "MciOverviewInteractor.kt"
    l = {
        0x1a6,
        0x1ac
    }
    m = "logPeriod"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Loo1/g;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Loo1/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo1/g;",
            "Lq83/d<",
            "-",
            "Loo1/g$x;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loo1/g$x;->F:Loo1/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Loo1/g$x;->E:Ljava/lang/Object;

    iget p1, p0, Loo1/g$x;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Loo1/g$x;->G:I

    iget-object p1, p0, Loo1/g$x;->F:Loo1/g;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Loo1/g;->m(Loo1/g;Lso1/r;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
