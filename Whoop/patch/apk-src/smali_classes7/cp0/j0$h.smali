.class final Lcp0/j0$h;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcp0/j0;->d1(ZZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.coacheverywhere.view.composables.CoachEverywhereBottomSheetKt"
    f = "CoachEverywhereBottomSheet.kt"
    l = {
        0x1fc,
        0x203
    }
    m = "animateBottomSheetVisibility"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field synthetic G:Ljava/lang/Object;

.field H:I

.field w:Z

.field x:Z

.field y:F

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcp0/j0$h;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lcp0/j0$h;->G:Ljava/lang/Object;

    iget p1, p0, Lcp0/j0$h;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcp0/j0$h;->H:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Lcp0/j0;->d1(ZZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
