.class final Lfx0/b$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfx0/b;->a(Lfx0/a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.dataSyncService.metrics.DataSyncServiceMetrics"
    f = "DataSyncServiceMetrics.kt"
    l = {
        0x2b,
        0x2c,
        0x3c,
        0x4c,
        0x5c
    }
    m = "sendDataSyncMetric"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field G:Z

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lfx0/b;

.field J:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfx0/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfx0/b;",
            "Lq83/d<",
            "-",
            "Lfx0/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfx0/b$a;->I:Lfx0/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lfx0/b$a;->H:Ljava/lang/Object;

    iget p1, p0, Lfx0/b$a;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfx0/b$a;->J:I

    iget-object p1, p0, Lfx0/b$a;->I:Lfx0/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lfx0/b;->a(Lfx0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
