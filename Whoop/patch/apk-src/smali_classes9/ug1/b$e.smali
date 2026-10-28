.class final Lug1/b$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/b;->U(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lq83/d;)Ljava/lang/Object;
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
        0x8e
    }
    m = "checkIfFwAlreadyUpToDate"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lug1/b;

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
            "Lug1/b$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug1/b$e;->y:Lug1/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lug1/b$e;->x:Ljava/lang/Object;

    iget p1, p0, Lug1/b$e;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lug1/b$e;->z:I

    iget-object p1, p0, Lug1/b$e;->y:Lug1/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lug1/b;->g(Lug1/b;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
