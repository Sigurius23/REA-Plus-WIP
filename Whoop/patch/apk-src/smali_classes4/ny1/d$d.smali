.class final Lny1/d$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lny1/d;->e(Lny1/e;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.metrics.storage.StorageMetricsCollector"
    f = "StorageMetricsCollector.kt"
    l = {
        0x22,
        0x2a,
        0x34,
        0x3d
    }
    m = "emitMetrics"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lny1/d;

.field J:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lny1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lny1/d;",
            "Lq83/d<",
            "-",
            "Lny1/d$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lny1/d$d;->I:Lny1/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lny1/d$d;->H:Ljava/lang/Object;

    iget p1, p0, Lny1/d$d;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lny1/d$d;->J:I

    iget-object p1, p0, Lny1/d$d;->I:Lny1/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lny1/d;->a(Lny1/d;Lny1/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
