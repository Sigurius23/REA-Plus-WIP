.class final Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;->j(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.gps.foreground.upload.ForegroundGpsUploadWorker"
    f = "ForegroundGpsUploadWorker.kt"
    l = {
        0x18,
        0x1d,
        0x1f
    }
    m = "work"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field G:Z

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;

.field J:I

.field w:J

.field x:J

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->I:Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->H:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->J:I

    iget-object p1, p0, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker$d;->I:Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;

    invoke-virtual {p1, p0}, Lcom/whoop/gps/foreground/upload/ForegroundGpsUploadWorker;->j(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
