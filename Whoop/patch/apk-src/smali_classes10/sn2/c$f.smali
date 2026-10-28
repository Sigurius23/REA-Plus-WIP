.class final Lsn2/c$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsn2/c;->m(Lsn2/d;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.universalcheckout.features.buynow.domain.BuyNowInteractor"
    f = "BuyNowInteractor.kt"
    l = {
        0x5c,
        0x5e
    }
    m = "placeOrder"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lsn2/c;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lsn2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsn2/c;",
            "Lq83/d<",
            "-",
            "Lsn2/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsn2/c$f;->G:Lsn2/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lsn2/c$f;->F:Ljava/lang/Object;

    iget p1, p0, Lsn2/c$f;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lsn2/c$f;->H:I

    iget-object p1, p0, Lsn2/c$f;->G:Lsn2/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lsn2/c;->g(Lsn2/c;Lsn2/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
