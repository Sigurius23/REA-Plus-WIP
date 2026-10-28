.class final Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->f0(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lic/e0;",
        "<anonymous>",
        "(Lbc3/c0;)Lic/e0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor$prepareToEnqueueSavingWorkoutInBackgroundWorker$2"
    f = "ActiveWorkoutInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

.field w:I

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;",
            "Ljava/lang/String;",
            "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->x:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->y:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iput-object p3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->z:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->E:Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->x:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->y:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->z:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->E:Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;-><init>(Ljava/lang/String;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Ljava/lang/String;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lic/e0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->x:Ljava/lang/String;

    const-string v0, "StrengthTrainerWorkoutForBackgroundSave_"

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->y:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    invoke-static {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->c(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;)Lu92/d;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->z:Ljava/lang/String;

    invoke-virtual {p1, v4, v0}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker;->J:Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$a;

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->y:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    invoke-static {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->f(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;)Lic/p0;

    move-result-object v2

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->E:Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    invoke-virtual {p1}, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;->getName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    move-object v3, p1

    iget-object v5, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$d;->x:Ljava/lang/String;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$a;->d(Lcom/whoop/weightlifting/workmanagers/SavingWorkoutInBackgroundWorker$a;Lic/p0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lic/a0;ILjava/lang/Object;)Lic/e0;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
