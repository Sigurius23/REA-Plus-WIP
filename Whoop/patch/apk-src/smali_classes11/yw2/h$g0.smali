.class final Lyw2/h$g0;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyw2/h;->h0(Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.whooplabs.WhoopLabsServiceModel"
    f = "WhoopLabsServiceModel.kt"
    l = {
        0x1d4,
        0x1d5,
        0x1dd,
        0x1e1
    }
    m = "submitStudy"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:I

.field synthetic K:Ljava/lang/Object;

.field final synthetic L:Lyw2/h;

.field M:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lyw2/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyw2/h;",
            "Lq83/d<",
            "-",
            "Lyw2/h$g0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyw2/h$g0;->L:Lyw2/h;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lyw2/h$g0;->K:Ljava/lang/Object;

    iget p1, p0, Lyw2/h$g0;->M:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lyw2/h$g0;->M:I

    iget-object p1, p0, Lyw2/h$g0;->L:Lyw2/h;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lyw2/h;->n(Lyw2/h;Lcom/whoop/whooplabs/data/room/entity/LastKnownStrapInfo;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
