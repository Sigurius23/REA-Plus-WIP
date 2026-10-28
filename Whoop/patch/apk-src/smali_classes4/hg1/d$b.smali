.class final Lhg1/d$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhg1/d;->b(Lq83/d;)Ljava/lang/Object;
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
        0x25,
        0x29,
        0x2f
    }
    m = "getStrapEventsToUpload"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lhg1/d;

.field F:I

.field w:I

.field x:I

.field y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lhg1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhg1/d;",
            "Lq83/d<",
            "-",
            "Lhg1/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhg1/d$b;->E:Lhg1/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lhg1/d$b;->z:Ljava/lang/Object;

    iget p1, p0, Lhg1/d$b;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lhg1/d$b;->F:I

    iget-object p1, p0, Lhg1/d$b;->E:Lhg1/d;

    invoke-virtual {p1, p0}, Lhg1/d;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
