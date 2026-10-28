.class final Lcv2/h$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcv2/h;->j(ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.weightlifting.feature.builder.select.domain.SelectExercisesInteractor"
    f = "SelectExercisesInteractor.kt"
    l = {
        0x4e
    }
    m = "loadExerciseListWithFilterOptions"
    v = 0x2
.end annotation


# instance fields
.field w:Z

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcv2/h;

.field z:I


# direct methods
.method public constructor <init>(Lcv2/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcv2/h;",
            "Lq83/d<",
            "-",
            "Lcv2/h$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcv2/h$a;->y:Lcv2/h;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcv2/h$a;->x:Ljava/lang/Object;

    iget p1, p0, Lcv2/h$a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcv2/h$a;->z:I

    iget-object p1, p0, Lcv2/h$a;->y:Lcv2/h;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lcv2/h;->b(Lcv2/h;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
