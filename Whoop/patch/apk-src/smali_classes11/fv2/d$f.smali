.class final Lfv2/d$f;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfv2/d;->G(Lfv2/c;Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.weightlifting.feature.customexercise.domain.CustomExerciseInteractor"
    f = "CustomExerciseInteractor.kt"
    l = {
        0x10e
    }
    m = "updateExerciseCacheWithNewlyAddedCustomExercise"
    v = 0x2
.end annotation


# instance fields
.field synthetic E:Ljava/lang/Object;

.field final synthetic F:Lfv2/d;

.field G:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Z


# direct methods
.method public constructor <init>(Lfv2/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfv2/d;",
            "Lq83/d<",
            "-",
            "Lfv2/d$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfv2/d$f;->F:Lfv2/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lfv2/d$f;->E:Ljava/lang/Object;

    iget p1, p0, Lfv2/d$f;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lfv2/d$f;->G:I

    iget-object p1, p0, Lfv2/d$f;->F:Lfv2/d;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v0, v1, p0}, Lfv2/d;->o(Lfv2/d;Lfv2/c;Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
