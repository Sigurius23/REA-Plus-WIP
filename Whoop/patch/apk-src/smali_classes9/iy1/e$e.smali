.class final Liy1/e$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liy1/e;->k(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.metrics.domain.MetricsInteractor"
    f = "MetricsInteractor.kt"
    l = {
        0x4b,
        0x5a,
        0x5d
    }
    m = "uploadBatch"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Liy1/e;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Liy1/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liy1/e;",
            "Lq83/d<",
            "-",
            "Liy1/e$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liy1/e$e;->H:Liy1/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Liy1/e$e;->G:Ljava/lang/Object;

    iget p1, p0, Liy1/e$e;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Liy1/e$e;->I:I

    iget-object p1, p0, Liy1/e$e;->H:Liy1/e;

    invoke-static {p1, p0}, Liy1/e;->f(Liy1/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
