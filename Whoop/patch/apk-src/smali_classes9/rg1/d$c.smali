.class final Lrg1/d$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrg1/d;->c(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.firmwareUpdateService.domain.FwApiInteractor"
    f = "FwApiInteractor.kt"
    l = {
        0x2f,
        0x30
    }
    m = "resetState"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field w:Ljava/lang/Object;

.field x:I

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lrg1/d;


# direct methods
.method public constructor <init>(Lrg1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrg1/d;",
            "Lq83/d<",
            "-",
            "Lrg1/d$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lrg1/d$c;->z:Lrg1/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lrg1/d$c;->y:Ljava/lang/Object;

    iget p1, p0, Lrg1/d$c;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lrg1/d$c;->E:I

    iget-object p1, p0, Lrg1/d$c;->z:Lrg1/d;

    invoke-virtual {p1, p0}, Lrg1/d;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
