.class final Lug1/b$o;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/b;->l0(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.firmwareUpdateService.strategy.DefaultUpdateStrategy"
    f = "DefaultUpdateStrategy.kt"
    l = {
        0x18a,
        0x18b,
        0x190,
        0x191,
        0x196,
        0x197
    }
    m = "startFwLoad"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lug1/b;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lug1/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lug1/b;",
            "Lq83/d<",
            "-",
            "Lug1/b$o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug1/b$o;->F:Lug1/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lug1/b$o;->E:Ljava/lang/Object;

    iget p1, p0, Lug1/b$o;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lug1/b$o;->G:I

    iget-object p1, p0, Lug1/b$o;->F:Lug1/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lug1/b;->Q(Lug1/b;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
