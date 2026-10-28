.class final Lsn2/c$h;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsn2/c;->n(Lsn2/a$c;Lq83/d;)Ljava/lang/Object;
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
        0x41
    }
    m = "resolve"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lsn2/c;

.field z:I


# direct methods
.method public constructor <init>(Lsn2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsn2/c;",
            "Lq83/d<",
            "-",
            "Lsn2/c$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsn2/c$h;->y:Lsn2/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lsn2/c$h;->x:Ljava/lang/Object;

    iget p1, p0, Lsn2/c$h;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lsn2/c$h;->z:I

    iget-object p1, p0, Lsn2/c$h;->y:Lsn2/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lsn2/c;->h(Lsn2/c;Lsn2/a$c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
