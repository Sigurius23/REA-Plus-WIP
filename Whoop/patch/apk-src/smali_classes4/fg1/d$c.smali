.class final Lfg1/d$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfg1/d;->b(Lq83/d;)Ljava/lang/Object;
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
        0x3a
    }
    m = "getOldestVersionId"
    v = 0x2
.end annotation


# instance fields
.field synthetic w:Ljava/lang/Object;

.field final synthetic x:Lfg1/d;

.field y:I


# direct methods
.method public constructor <init>(Lfg1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfg1/d;",
            "Lq83/d<",
            "-",
            "Lfg1/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfg1/d$c;->x:Lfg1/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lfg1/d$c;->w:Ljava/lang/Object;

    iget p1, p0, Lfg1/d$c;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfg1/d$c;->y:I

    iget-object p1, p0, Lfg1/d$c;->x:Lfg1/d;

    invoke-virtual {p1, p0}, Lfg1/d;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
