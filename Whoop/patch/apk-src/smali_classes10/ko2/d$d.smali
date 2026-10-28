.class final Lko2/d$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lko2/d;->r(Lko2/c;Lko2/b;Lq83/d;)Ljava/lang/Object;
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
        0xcb,
        0xd2,
        0xe1,
        0xe9,
        0x119,
        0x127
    }
    m = "handleDomainAction"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lko2/d;


# direct methods
.method public constructor <init>(Lko2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lko2/d;",
            "Lq83/d<",
            "-",
            "Lko2/d$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lko2/d$d;->z:Lko2/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lko2/d$d;->y:Ljava/lang/Object;

    iget p1, p0, Lko2/d$d;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lko2/d$d;->E:I

    iget-object p1, p0, Lko2/d$d;->z:Lko2/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lko2/d;->g(Lko2/d;Lko2/c;Lko2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
