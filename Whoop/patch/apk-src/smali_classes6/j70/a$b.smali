.class final Lj70/a$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj70/a;->e(Lf70/e$b;Lcom/whoop/activation/domain/models/ActivationFlowStepModel;ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.domain.interactors.activation.forward.ForwardNavigationOrchestrator"
    f = "ForwardNavigationOrchestrator.kt"
    l = {
        0x65,
        0x77
    }
    m = "advanceToNextScreen"
    v = 0x2
.end annotation


# instance fields
.field E:Z

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lj70/a;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj70/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj70/a;",
            "Lq83/d<",
            "-",
            "Lj70/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj70/a$b;->G:Lj70/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lj70/a$b;->F:Ljava/lang/Object;

    iget p1, p0, Lj70/a$b;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lj70/a$b;->H:I

    iget-object v0, p0, Lj70/a$b;->G:Lj70/a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lj70/a;->a(Lj70/a;Lf70/e$b;Lcom/whoop/activation/domain/models/ActivationFlowStepModel;ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
