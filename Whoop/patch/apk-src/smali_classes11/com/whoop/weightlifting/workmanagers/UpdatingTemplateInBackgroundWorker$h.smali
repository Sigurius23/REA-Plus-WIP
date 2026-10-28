.class final Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;->y(JLcom/whoop/weightlifting/data/domain/WorkoutTemplate;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lpg3/v0;",
        "Ll83/a0;",
        "<anonymous>",
        "()Lpg3/v0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.workmanagers.UpdatingTemplateInBackgroundWorker$updateWorkoutTemplateInBackground$2"
    f = "UpdatingTemplateInBackgroundWorker.kt"
    l = {
        0x85
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;

.field final synthetic y:J

.field final synthetic z:Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;


# direct methods
.method public constructor <init>(Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;JLcom/whoop/weightlifting/data/domain/WorkoutTemplate;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;",
            "J",
            "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;->x:Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;

    iput-wide p2, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;->y:J

    iput-object p4, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;->z:Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;

    iget-object v1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;->x:Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;

    iget-wide v2, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;->y:J

    iget-object v4, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;->z:Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;-><init>(Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;JLcom/whoop/weightlifting/data/domain/WorkoutTemplate;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;->x:Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;

    invoke-static {p1}, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;->m(Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker;)Lcom/whoop/weightlifting/data/WeightliftingApi;

    move-result-object p1

    iget-wide v3, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;->y:J

    iget-object v1, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;->z:Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    invoke-static {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateKt;->toDto(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    move-result-object v1

    iput v2, p0, Lcom/whoop/weightlifting/workmanagers/UpdatingTemplateInBackgroundWorker$h;->w:I

    invoke-interface {p1, v3, v4, v1, p0}, Lcom/whoop/weightlifting/data/WeightliftingApi;->updateWorkoutTemplate(JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
