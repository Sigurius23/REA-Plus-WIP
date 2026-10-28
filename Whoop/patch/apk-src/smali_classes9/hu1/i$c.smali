.class final Lhu1/i$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhu1/i;->b(ISLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.labradorService.data.LabradorPacketsDbManager"
    f = "LabradorPacketsDbManager.kt"
    l = {
        0x31
    }
    m = "getEcgPackets"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lhu1/i;

.field G:I

.field w:I

.field x:S

.field y:J

.field z:J


# direct methods
.method public constructor <init>(Lhu1/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhu1/i;",
            "Lq83/d<",
            "-",
            "Lhu1/i$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lhu1/i$c;->F:Lhu1/i;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lhu1/i$c;->E:Ljava/lang/Object;

    iget p1, p0, Lhu1/i$c;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lhu1/i$c;->G:I

    iget-object p1, p0, Lhu1/i$c;->F:Lhu1/i;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lhu1/i;->b(ISLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
