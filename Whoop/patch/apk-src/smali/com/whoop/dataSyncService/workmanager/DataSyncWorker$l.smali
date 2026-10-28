.class final Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->j(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.dataSyncService.workmanager.DataSyncWorker"
    f = "DataSyncWorker.kt"
    l = {
        0x4c,
        0x54,
        0x58,
        0x5f,
        0x9b
    }
    m = "work"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

.field I:I

.field w:J

.field x:J

.field y:J

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->H:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->G:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->I:I

    iget-object p1, p0, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker$l;->H:Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;

    invoke-virtual {p1, p0}, Lcom/whoop/dataSyncService/workmanager/DataSyncWorker;->j(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
