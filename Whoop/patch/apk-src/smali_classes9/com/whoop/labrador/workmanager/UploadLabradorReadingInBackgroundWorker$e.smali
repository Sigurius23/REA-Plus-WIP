.class final Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;->j(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.labrador.workmanager.UploadLabradorReadingInBackgroundWorker"
    f = "UploadLabradorReadingInBackgroundWorker.kt"
    l = {
        0x25,
        0x35,
        0x37
    }
    m = "work"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;

.field J:I

.field w:J

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->I:Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->H:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->J:I

    iget-object p1, p0, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker$e;->I:Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;

    invoke-virtual {p1, p0}, Lcom/whoop/labrador/workmanager/UploadLabradorReadingInBackgroundWorker;->j(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
