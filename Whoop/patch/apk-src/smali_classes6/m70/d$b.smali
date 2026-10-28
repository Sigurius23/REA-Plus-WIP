.class final Lm70/d$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm70/d;->n(Lm70/k;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.activation.domain.interactors.payments.PaymentsInteractor"
    f = "PaymentsInteractor.kt"
    l = {
        0xb6,
        0xcb,
        0xd1
    }
    m = "createPaymentMethod"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lm70/d;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm70/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm70/d;",
            "Lq83/d<",
            "-",
            "Lm70/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lm70/d$b;->F:Lm70/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lm70/d$b;->E:Ljava/lang/Object;

    iget p1, p0, Lm70/d$b;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lm70/d$b;->G:I

    iget-object p1, p0, Lm70/d$b;->F:Lm70/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lm70/d;->c(Lm70/d;Lm70/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
