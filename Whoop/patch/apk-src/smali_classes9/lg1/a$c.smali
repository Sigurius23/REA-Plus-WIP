.class final Llg1/a$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llg1/a;->c(Ljava/util/Map;Ljava/util/List;Ltg1/a;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.firmwareUpdateService.data.api.OtaFwUpdateApiWrapper"
    f = "OtaFwUpdateApiWrapper.kt"
    l = {
        0x23
    }
    m = "downloadFirmwareUpdate-BWLJW6A"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Llg1/a;

.field H:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Llg1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg1/a;",
            "Lq83/d<",
            "-",
            "Llg1/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llg1/a$c;->G:Llg1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Llg1/a$c;->F:Ljava/lang/Object;

    iget p1, p0, Llg1/a$c;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Llg1/a$c;->H:I

    iget-object p1, p0, Llg1/a$c;->G:Llg1/a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Llg1/a;->c(Ljava/util/Map;Ljava/util/List;Ltg1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
