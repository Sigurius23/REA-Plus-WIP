.class final Llx0/f$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llx0/f;->a(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ls83/c;"
    }
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
    c = "com.whoop.dataSyncService.upload.UploadPipelineGate"
    f = "UploadPipelineGate.kt"
    l = {
        0x20,
        0x34,
        0x2a
    }
    m = "withUploadLock$data_sync_service_release"
    v = 0x2
.end annotation


# instance fields
.field E:J

.field F:I

.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Llx0/f;

.field J:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:J


# direct methods
.method public constructor <init>(Llx0/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llx0/f;",
            "Lq83/d<",
            "-",
            "Llx0/f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llx0/f$a;->I:Llx0/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Llx0/f$a;->H:Ljava/lang/Object;

    iget p1, p0, Llx0/f$a;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Llx0/f$a;->J:I

    iget-object p1, p0, Llx0/f$a;->I:Llx0/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Llx0/f;->a(Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
