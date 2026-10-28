.class final Lj70/d$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj70/d;->k(Lec3/m;Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Lf70/e$b;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.domain.interactors.activation.forward.ScreenSpecificForwardActionHandler"
    f = "ScreenSpecificForwardActionHandler.kt"
    l = {
        0x74,
        0x76,
        0x7c,
        0x8b,
        0x8c,
        0x93,
        0x95,
        0x96,
        0xa1,
        0xaa,
        0xab,
        0xb9,
        0xba,
        0xcd,
        0xee,
        0xfc,
        0xfe,
        0x120,
        0x129,
        0x145,
        0x15d,
        0x15e,
        0x173,
        0x175,
        0x17f,
        0x181,
        0x187,
        0x188,
        0x192
    }
    m = "handle"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field I:Z

.field synthetic J:Ljava/lang/Object;

.field final synthetic K:Lj70/d;

.field L:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj70/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj70/d;",
            "Lq83/d<",
            "-",
            "Lj70/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lj70/d$c;->K:Lj70/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lj70/d$c;->J:Ljava/lang/Object;

    iget p1, p0, Lj70/d$c;->L:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lj70/d$c;->L:I

    iget-object v0, p0, Lj70/d$c;->K:Lj70/d;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lj70/d;->k(Lec3/m;Lcom/whoop/activation/domain/models/ActivationFlowStepModel;Lf70/e$b;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
