.class final Lri1/j$n;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lri1/j;->w(Lcom/whoop/health/domain/models/HealthTabResponse;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.health.domain.HealthTabInteractor"
    f = "HealthTabInteractor.kt"
    l = {
        0x99,
        0xb5
    }
    m = "updateBasedOnLatestProcessedTimestamp"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field L:Ljava/lang/Object;

.field M:Ljava/lang/Object;

.field N:Ljava/lang/Object;

.field O:Ljava/lang/Object;

.field P:Ljava/lang/Object;

.field Q:Ljava/lang/Object;

.field R:Ljava/lang/Object;

.field S:Ljava/lang/Object;

.field T:Ljava/lang/Object;

.field U:Ljava/lang/Object;

.field V:Ljava/lang/Object;

.field W:I

.field X:I

.field Y:I

.field Z:I

.field a0:I

.field b0:I

.field c0:I

.field d0:I

.field e0:I

.field synthetic f0:Ljava/lang/Object;

.field final synthetic g0:Lri1/j;

.field h0:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lri1/j;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lri1/j;",
            "Lq83/d<",
            "-",
            "Lri1/j$n;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lri1/j$n;->g0:Lri1/j;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lri1/j$n;->f0:Ljava/lang/Object;

    iget p1, p0, Lri1/j$n;->h0:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lri1/j$n;->h0:I

    iget-object p1, p0, Lri1/j$n;->g0:Lri1/j;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lri1/j;->o(Lri1/j;Lcom/whoop/health/domain/models/HealthTabResponse;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
