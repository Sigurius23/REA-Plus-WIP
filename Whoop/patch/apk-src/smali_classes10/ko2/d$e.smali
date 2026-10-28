.class final Lko2/d$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lko2/d;->t(Lko2/c;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.universalcheckout.features.checkout.domain.interactors.checkout.UniversalCheckoutInteractor"
    f = "UniversalCheckoutInteractor.kt"
    l = {
        0x1fc,
        0x20d
    }
    m = "handleToggleAnnualCheckbox"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lko2/d;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Z


# direct methods
.method public constructor <init>(Lko2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lko2/d;",
            "Lq83/d<",
            "-",
            "Lko2/d$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lko2/d$e;->F:Lko2/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lko2/d$e;->E:Ljava/lang/Object;

    iget p1, p0, Lko2/d$e;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lko2/d$e;->G:I

    iget-object p1, p0, Lko2/d$e;->F:Lko2/d;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, p0}, Lko2/d;->h(Lko2/d;Lko2/c;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
