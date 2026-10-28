.class final Lug1/a$k;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/a;->T(ILq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.firmwareUpdateService.strategy.BatteryPackUpdateStrategy"
    f = "BatteryPackUpdateStrategy.kt"
    l = {
        0x111,
        0x118,
        0x118,
        0x11d
    }
    m = "sendFwChunks"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lug1/a;

.field F:I

.field w:I

.field x:I

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lug1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lug1/a;",
            "Lq83/d<",
            "-",
            "Lug1/a$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug1/a$k;->E:Lug1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lug1/a$k;->z:Ljava/lang/Object;

    iget p1, p0, Lug1/a$k;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lug1/a$k;->F:I

    iget-object p1, p0, Lug1/a$k;->E:Lug1/a;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lug1/a;->t(Lug1/a;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
