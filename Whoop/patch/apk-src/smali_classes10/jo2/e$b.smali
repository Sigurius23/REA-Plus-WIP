.class final Ljo2/e$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljo2/e;->e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.universalcheckout.features.checkout.domain.StripeFlowControllerManager"
    f = "StripeFlowControllerManager.kt"
    l = {
        0x160,
        0x163,
        0x168,
        0x180
    }
    m = "checkout"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Ljo2/e;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljo2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljo2/e;",
            "Lq83/d<",
            "-",
            "Ljo2/e$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljo2/e$b;->H:Ljo2/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ljo2/e$b;->G:Ljava/lang/Object;

    iget p1, p0, Ljo2/e$b;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ljo2/e$b;->I:I

    iget-object p1, p0, Ljo2/e$b;->H:Ljo2/e;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ljo2/e;->e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
