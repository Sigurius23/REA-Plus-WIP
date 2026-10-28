.class final Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;->j(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.coaching.sleepcoach.harvard.worker.PostLatestWakeTimeWorker"
    f = "PostLatestWakeTimeWorker.kt"
    l = {
        0x2a
    }
    m = "work"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;

.field F:I

.field w:J

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;->E:Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;->z:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;->F:I

    iget-object p1, p0, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker$d;->E:Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;

    invoke-virtual {p1, p0}, Lcom/whoop/coaching/sleepcoach/harvard/worker/PostLatestWakeTimeWorker;->j(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
