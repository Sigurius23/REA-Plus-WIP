.class final Lvl2/u$j;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvl2/u;->A(Lcm2/i;Lvl2/a0;Lvl2/t;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.trends.data.domain.TrendsApiInteractor"
    f = "TrendsApiInteractor.kt"
    l = {
        0x142,
        0x145
    }
    m = "editMenuSheetManualMeasurement"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lvl2/u;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvl2/u;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvl2/u;",
            "Lq83/d<",
            "-",
            "Lvl2/u$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvl2/u$j;->F:Lvl2/u;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lvl2/u$j;->E:Ljava/lang/Object;

    iget p1, p0, Lvl2/u$j;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lvl2/u$j;->G:I

    iget-object p1, p0, Lvl2/u$j;->F:Lvl2/u;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, v0, p0}, Lvl2/u;->i(Lvl2/u;Lcm2/i;Lvl2/a0;Lvl2/t;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
