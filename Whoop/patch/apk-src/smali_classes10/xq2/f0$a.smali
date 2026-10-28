.class final Lxq2/f0$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxq2/f0;->g(IIZLc93/a;ZLbc3/c0;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.user.journey.view.components.steps.inreviewdesignitem.userjourneydesigncomponents.TimelineScrollController"
    f = "YearInReviewTimeline.kt"
    l = {
        0x23f,
        0x129,
        0x12e
    }
    m = "scrollToIndex"
    v = 0x2
.end annotation


# instance fields
.field E:Z

.field F:Z

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field synthetic J:Ljava/lang/Object;

.field final synthetic K:Lxq2/f0;

.field L:I

.field w:I

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lxq2/f0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxq2/f0;",
            "Lq83/d<",
            "-",
            "Lxq2/f0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxq2/f0$a;->K:Lxq2/f0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iput-object p1, p0, Lxq2/f0$a;->J:Ljava/lang/Object;

    iget p1, p0, Lxq2/f0$a;->L:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lxq2/f0$a;->L:I

    iget-object v0, p0, Lxq2/f0$a;->K:Lxq2/f0;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v7, p0

    invoke-virtual/range {v0 .. v7}, Lxq2/f0;->g(IIZLc93/a;ZLbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
