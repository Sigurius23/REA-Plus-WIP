.class final Log1/a$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Log1/a;->k(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.firmwareUpdateService.data.repo.FirmwareRepoImpl"
    f = "FirmwareRepoImpl.kt"
    l = {
        0x48,
        0x4a,
        0x4d
    }
    m = "checkAndDownloadUpdate"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Log1/a;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Log1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Log1/a;",
            "Lq83/d<",
            "-",
            "Log1/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Log1/a$a;->H:Log1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Log1/a$a;->G:Ljava/lang/Object;

    iget p1, p0, Log1/a$a;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Log1/a$a;->I:I

    iget-object p1, p0, Log1/a$a;->H:Log1/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Log1/a;->k(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
