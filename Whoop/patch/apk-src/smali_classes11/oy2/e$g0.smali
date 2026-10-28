.class final Loy2/e$g0;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loy2/e;->c1(IILq83/d;)Ljava/lang/Object;
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
        0x3ae,
        0x3af,
        0x3b2
    }
    m = "timePickerChanged"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Loy2/e;

.field I:I

.field w:I

.field x:I

.field y:I

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Loy2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loy2/e;",
            "Lq83/d<",
            "-",
            "Loy2/e$g0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loy2/e$g0;->H:Loy2/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Loy2/e$g0;->G:Ljava/lang/Object;

    iget p1, p0, Loy2/e$g0;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Loy2/e$g0;->I:I

    iget-object p1, p0, Loy2/e$g0;->H:Loy2/e;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Loy2/e;->b0(Loy2/e;IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
