.class final Lpj1/c$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpj1/c;->e(Lb7/b;Ljava/util/Set;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.healthconnect.repository.HealthConnectWhoopRecordsWriter"
    f = "HealthConnectWhoopRecordsWriter.kt"
    l = {
        0x2b,
        0x36
    }
    m = "fetchAndMutateWhoopRecords"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:I

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Lpj1/c;

.field K:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lpj1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpj1/c;",
            "Lq83/d<",
            "-",
            "Lpj1/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpj1/c$a;->J:Lpj1/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lpj1/c$a;->I:Ljava/lang/Object;

    iget p1, p0, Lpj1/c$a;->K:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lpj1/c$a;->K:I

    iget-object p1, p0, Lpj1/c$a;->J:Lpj1/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lpj1/c;->e(Lb7/b;Ljava/util/Set;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
