.class final Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->p0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor"
    f = "ActiveWorkoutInteractor.kt"
    l = {
        0x3ad
    }
    m = "saveWorkoutInBackground"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field synthetic G:Ljava/lang/Object;

.field final synthetic H:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

.field I:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->H:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->G:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->I:I

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$j;->H:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->l(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
