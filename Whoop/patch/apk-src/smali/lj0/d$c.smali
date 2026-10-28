.class final Llj0/d$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llj0/d;->d(Llj0/k;DLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.ble.analytics.HistoryPullThroughputAnalytics"
    f = "HistoryPullThroughputAnalytics.kt"
    l = {
        0x48
    }
    m = "updateThroughput"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Llj0/d;

.field F:I

.field w:Ljava/lang/Object;

.field x:D

.field y:J

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Llj0/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llj0/d;",
            "Lq83/d<",
            "-",
            "Llj0/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llj0/d$c;->E:Llj0/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Llj0/d$c;->z:Ljava/lang/Object;

    iget p1, p0, Llj0/d$c;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Llj0/d$c;->F:I

    iget-object p1, p0, Llj0/d$c;->E:Llj0/d;

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2, p0}, Llj0/d;->a(Llj0/d;Llj0/k;DLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
