.class final Lpu2/i$o;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpu2/i;->C(Lcom/whoop/weightlifting/data/domain/WorkoutExercise;Lcom/whoop/weightlifting/data/domain/WorkoutGroup;IILjava/util/Set;ZZZLjava/util/UUID;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Set;Ljava/util/UUID;ZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewStateReducer"
    f = "ActiveWorkoutViewStateReducer.kt"
    l = {
        0x1cb
    }
    m = "toExerciseTileState"
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

.field Q:I

.field R:I

.field S:I

.field T:I

.field U:Z

.field V:Z

.field W:Z

.field X:Z

.field Y:Z

.field synthetic Z:Ljava/lang/Object;

.field final synthetic a0:Lpu2/i;

.field b0:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lpu2/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpu2/i;",
            "Lq83/d<",
            "-",
            "Lpu2/i$o;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpu2/i$o;->a0:Lpu2/i;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    move-object/from16 v0, p1

    iput-object v0, p0, Lpu2/i$o;->Z:Ljava/lang/Object;

    iget v0, p0, Lpu2/i$o;->b0:I

    const/high16 v1, -0x80000000

    or-int/2addr v0, v1

    iput v0, p0, Lpu2/i$o;->b0:I

    iget-object v0, p0, Lpu2/i$o;->a0:Lpu2/i;

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v14, p0

    invoke-static/range {v0 .. v14}, Lpu2/i;->f(Lpu2/i;Lcom/whoop/weightlifting/data/domain/WorkoutExercise;Lcom/whoop/weightlifting/data/domain/WorkoutGroup;IILjava/util/Set;ZZZLjava/util/UUID;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Set;Ljava/util/UUID;ZLq83/d;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
