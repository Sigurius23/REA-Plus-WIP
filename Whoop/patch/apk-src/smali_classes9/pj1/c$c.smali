.class final Lpj1/c$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpj1/c;->g(Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;Lb7/b;Lq83/d;)Ljava/lang/Object;
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
        0x4e,
        0x4f,
        0x50,
        0x51,
        0x52,
        0x53,
        0x54,
        0x55,
        0x5c,
        0x5d,
        0x5e,
        0x5f,
        0x60,
        0x61,
        0x62,
        0x63,
        0x64
    }
    m = "mutateHealthConnectRecords"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lpj1/c;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lpj1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpj1/c;",
            "Lq83/d<",
            "-",
            "Lpj1/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpj1/c$c;->F:Lpj1/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lpj1/c$c;->E:Ljava/lang/Object;

    iget p1, p0, Lpj1/c$c;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lpj1/c$c;->G:I

    iget-object p1, p0, Lpj1/c$c;->F:Lpj1/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lpj1/c;->c(Lpj1/c;Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;Lb7/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
