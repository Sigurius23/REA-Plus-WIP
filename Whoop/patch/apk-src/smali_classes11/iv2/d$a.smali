.class final Liv2/d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liv2/d;->g(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Liv2/c;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.feature.details.domain.WorkoutDetailsInteractor$fetchBffData$2"
    f = "WorkoutDetailsInteractor.kt"
    l = {
        0x1f,
        0x20,
        0x26,
        0x28,
        0x29
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Liv2/d;


# direct methods
.method public constructor <init>(Liv2/d;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liv2/d;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Liv2/d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liv2/d$a;->z:Liv2/d;

    iput-object p2, p0, Liv2/d$a;->E:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Liv2/d$a;

    iget-object v1, p0, Liv2/d$a;->z:Liv2/d;

    iget-object v2, p0, Liv2/d$a;->E:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Liv2/d$a;-><init>(Liv2/d;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Liv2/d$a;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Liv2/d$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Liv2/d$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Liv2/d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Liv2/d$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    iget-object v0, p0, Liv2/d$a;->y:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Liv2/d$a;->x:I

    const/4 v10, 0x5

    const/4 v11, 0x4

    const/4 v12, 0x3

    const/4 v1, 0x1

    const/4 v13, 0x2

    const/4 v14, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v1, :cond_3

    if-eq v0, v13, :cond_2

    if-eq v0, v12, :cond_1

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Liv2/d$a;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_2

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Liv2/c;

    sget-object v2, Liv2/a$a;->a:Liv2/a$a;

    invoke-direct {v0, v2, v14}, Liv2/c;-><init>(Liv2/a;Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;)V

    iput-object v8, p0, Liv2/d$a;->y:Ljava/lang/Object;

    iput v1, p0, Liv2/d$a;->x:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto/16 :goto_3

    :cond_5
    :goto_1
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Liv2/d$a;->z:Liv2/d;

    invoke-static {v1}, Liv2/d;->e(Liv2/d;)Ltr2/n;

    move-result-object v1

    iget-object v2, p0, Liv2/d$a;->E:Ljava/lang/String;

    const-string v3, "Failed to fetch workout-details for workoutTemplateId: "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Liv2/d$a$a;

    iget-object v2, p0, Liv2/d$a;->z:Liv2/d;

    iget-object v6, p0, Liv2/d$a;->E:Ljava/lang/String;

    invoke-direct {v4, v2, v6, v14}, Liv2/d$a$a;-><init>(Liv2/d;Ljava/lang/String;Lq83/d;)V

    iput-object v8, p0, Liv2/d$a;->y:Ljava/lang/Object;

    iput v13, p0, Liv2/d$a;->x:I

    const/4 v2, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_7

    iget-object v1, p0, Liv2/d$a;->z:Liv2/d;

    invoke-static {v1}, Liv2/d;->f(Liv2/d;)Lfu2/i;

    move-result-object v1

    new-instance v2, Lfu2/g$i;

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->getWorkoutTemplate()Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    move-result-object v3

    invoke-virtual {v3, v14}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;->toWorkoutTemplate(Ljava/lang/Long;)Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v3

    invoke-direct {v2, v3}, Lfu2/g$i;-><init>(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)V

    invoke-virtual {v1, v2}, Lfu2/i;->j(Lfu2/g;)V

    new-instance v1, Liv2/c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;

    invoke-direct {v1, v14, v0}, Liv2/c;-><init>(Liv2/a;Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;)V

    iput-object v14, p0, Liv2/d$a;->y:Ljava/lang/Object;

    iput-object v14, p0, Liv2/d$a;->w:Ljava/lang/Object;

    iput v12, p0, Liv2/d$a;->x:I

    invoke-interface {v8, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    goto :goto_3

    :cond_7
    instance-of v1, v0, Lu02/a$b$b;

    if-eqz v1, :cond_8

    new-instance v0, Liv2/c;

    sget-object v1, Liv2/a$b;->a:Liv2/a$b;

    invoke-direct {v0, v1, v14, v13, v14}, Liv2/c;-><init>(Liv2/a;Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v14, p0, Liv2/d$a;->y:Ljava/lang/Object;

    iput-object v14, p0, Liv2/d$a;->w:Ljava/lang/Object;

    iput v11, p0, Liv2/d$a;->x:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    goto :goto_3

    :cond_8
    instance-of v0, v0, Lu02/a$b;

    if-eqz v0, :cond_a

    new-instance v0, Liv2/c;

    sget-object v1, Liv2/a$c;->a:Liv2/a$c;

    invoke-direct {v0, v1, v14, v13, v14}, Liv2/c;-><init>(Liv2/a;Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v14, p0, Liv2/d$a;->y:Ljava/lang/Object;

    iput-object v14, p0, Liv2/d$a;->w:Ljava/lang/Object;

    iput v10, p0, Liv2/d$a;->x:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    :goto_3
    return-object v9

    :cond_9
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
