.class final Lvl2/u$l;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvl2/u;->C(Lor2/h0;Ljava/lang/String;Lvl2/t;ZZZLq83/d;)Ljava/lang/Object;
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
        0x97,
        0x9a,
        0xa1
    }
    m = "fetchPillarsDataV3"
    v = 0x2
.end annotation


# instance fields
.field E:Z

.field F:Z

.field G:Z

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lvl2/u;

.field J:I

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
            "Lvl2/u$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvl2/u$l;->I:Lvl2/u;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iput-object p1, p0, Lvl2/u$l;->H:Ljava/lang/Object;

    iget p1, p0, Lvl2/u$l;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lvl2/u$l;->J:I

    iget-object v0, p0, Lvl2/u$l;->I:Lvl2/u;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v7, p0

    invoke-static/range {v0 .. v7}, Lvl2/u;->k(Lvl2/u;Lor2/h0;Ljava/lang/String;Lvl2/t;ZZZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
