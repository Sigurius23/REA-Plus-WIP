.class final Lmx2/h$i;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmx2/h;->p(Lmx2/h$a;Lmx2/h$b;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.whooplabs.feature.campaigndetails.interactor.CampaignDetailsInteractor"
    f = "CampaignDetailsInteractor.kt"
    l = {
        0x6e
    }
    m = "reduce"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lmx2/h;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lmx2/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmx2/h;",
            "Lq83/d<",
            "-",
            "Lmx2/h$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmx2/h$i;->F:Lmx2/h;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lmx2/h$i;->E:Ljava/lang/Object;

    iget p1, p0, Lmx2/h$i;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lmx2/h$i;->G:I

    iget-object p1, p0, Lmx2/h$i;->F:Lmx2/h;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lmx2/h;->j(Lmx2/h;Lmx2/h$a;Lmx2/h$b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
