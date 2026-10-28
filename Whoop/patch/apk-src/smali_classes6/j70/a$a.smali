.class final Lj70/a$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj70/a;->c(Lec3/m;Lf70/e;ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;
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
        0x38,
        0x3f,
        0x4a,
        0x4e
    }
    m = "advance"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Z

.field J:Z

.field synthetic K:Ljava/lang/Object;

.field final synthetic L:Lj70/a;

.field M:I

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
            "Lj70/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj70/a$a;->L:Lj70/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lj70/a$a;->K:Ljava/lang/Object;

    iget p1, p0, Lj70/a$a;->M:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lj70/a$a;->M:I

    iget-object v0, p0, Lj70/a$a;->L:Lj70/a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-virtual/range {v0 .. v6}, Lj70/a;->c(Lec3/m;Lf70/e;ZLcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
