.class final Lfg1/d$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfg1/d;->d(JJLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.firmwareEvents.domain.FirmwareEventsRoomInteractorImpl"
    f = "FirmwareEventsRoomInteractor.kt"
    l = {
        0x24
    }
    m = "deleteRowsByTimeStamps"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:J

.field x:J

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lfg1/d;


# direct methods
.method public constructor <init>(Lfg1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg1/d;",
            "Lq83/d<",
            "-",
            "Lfg1/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfg1/d$a;->z:Lfg1/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lfg1/d$a;->y:Ljava/lang/Object;

    iget p1, p0, Lfg1/d$a;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfg1/d$a;->E:I

    iget-object v0, p0, Lfg1/d$a;->z:Lfg1/d;

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lfg1/d;->d(JJLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
