.class final Lxj1/e$d;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxj1/e;->l(ILq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.healthmonitor.domain.ComposableHealthMonitorInteractor"
    f = "ComposableHealthMonitorInteractor.kt"
    l = {
        0xaa,
        0xac,
        0xaf,
        0xb1,
        0xb4,
        0xbf
    }
    m = "getHealthReportWithRetry"
    v = 0x2
.end annotation


# instance fields
.field E:Z

.field synthetic F:Ljava/lang/Object;

.field final synthetic G:Lxj1/e;

.field H:I

.field w:I

.field x:I

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lxj1/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxj1/e;",
            "Lq83/d<",
            "-",
            "Lxj1/e$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxj1/e$d;->G:Lxj1/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lxj1/e$d;->F:Ljava/lang/Object;

    iget p1, p0, Lxj1/e$d;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lxj1/e$d;->H:I

    iget-object p1, p0, Lxj1/e$d;->G:Lxj1/e;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lxj1/e;->e(Lxj1/e;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
