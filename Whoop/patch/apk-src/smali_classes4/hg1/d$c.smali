.class final Lhg1/d$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhg1/d;->e(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.firmwareEvents.uploader.StrapFirmwareEventsFileExporterImpl"
    f = "StrapFirmwareEventsFileExporter.kt"
    l = {
        0x35,
        0x39
    }
    m = "processRecords"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lhg1/d;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lhg1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhg1/d;",
            "Lq83/d<",
            "-",
            "Lhg1/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhg1/d$c;->F:Lhg1/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lhg1/d$c;->E:Ljava/lang/Object;

    iget p1, p0, Lhg1/d$c;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lhg1/d$c;->G:I

    iget-object p1, p0, Lhg1/d$c;->F:Lhg1/d;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lhg1/d;->d(Lhg1/d;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
