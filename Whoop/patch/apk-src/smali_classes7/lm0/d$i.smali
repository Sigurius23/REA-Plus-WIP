.class final Llm0/d$i;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llm0/d;->B(Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.broadcastlisteners.BondLossReceiver"
    f = "BondLossReceiver.kt"
    l = {
        0xb5
    }
    m = "wasDevicePreviouslyLost"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Llm0/d;


# direct methods
.method public constructor <init>(Llm0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llm0/d;",
            "Lq83/d<",
            "-",
            "Llm0/d$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llm0/d$i;->z:Llm0/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Llm0/d$i;->y:Ljava/lang/Object;

    iget p1, p0, Llm0/d$i;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Llm0/d$i;->E:I

    iget-object p1, p0, Llm0/d$i;->z:Llm0/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Llm0/d;->l(Llm0/d;Landroid/bluetooth/BluetoothDevice;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
