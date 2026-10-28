.class final Loy2/e$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loy2/e;->j0(IIIIILq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor"
    f = "CampaignStepsInteractor.kt"
    l = {
        0x3bc,
        0x3bd,
        0x3c2
    }
    m = "dateTimeChanged"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:I

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field synthetic L:Ljava/lang/Object;

.field final synthetic M:Loy2/e;

.field N:I

.field w:I

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Loy2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loy2/e;",
            "Lq83/d<",
            "-",
            "Loy2/e$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loy2/e$f;->M:Loy2/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Loy2/e$f;->L:Ljava/lang/Object;

    iget p1, p0, Loy2/e$f;->N:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Loy2/e$f;->N:I

    iget-object v0, p0, Loy2/e$f;->M:Loy2/e;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Loy2/e;->v(Loy2/e;IIIIILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
