.class final Lwu2/c$h$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwu2/c$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;",
        "updatedTemplate",
        "Ll83/a0;",
        "<anonymous>",
        "(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.feature.builder.edit.domain.EditWorkoutInteractor$upsertWorkoutTemplateToServer$2$workoutTemplateFromServer$2"
    f = "EditWorkoutInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lwu2/b;

.field final synthetic z:Lwu2/c;


# direct methods
.method public constructor <init>(Lwu2/b;Lwu2/c;ZLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwu2/b;",
            "Lwu2/c;",
            "Z",
            "Lq83/d<",
            "-",
            "Lwu2/c$h$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwu2/c$h$c;->y:Lwu2/b;

    iput-object p2, p0, Lwu2/c$h$c;->z:Lwu2/c;

    iput-boolean p3, p0, Lwu2/c$h$c;->E:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lwu2/c$h$c;

    iget-object v1, p0, Lwu2/c$h$c;->y:Lwu2/b;

    iget-object v2, p0, Lwu2/c$h$c;->z:Lwu2/c;

    iget-boolean v3, p0, Lwu2/c$h$c;->E:Z

    invoke-direct {v0, v1, v2, v3, p2}, Lwu2/c$h$c;-><init>(Lwu2/b;Lwu2/c;ZLq83/d;)V

    iput-object p1, v0, Lwu2/c$h$c;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lwu2/c$h$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwu2/c$h$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwu2/c$h$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lwu2/c$h$c;->f(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Lwu2/c$h$c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lwu2/c$h$c;->w:I

    if-nez v1, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lwu2/c$h$c;->y:Lwu2/b;

    invoke-virtual {p1}, Lwu2/b;->g()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "AI_link_MSK"

    goto :goto_1

    :cond_1
    :goto_0
    const-string p1, "AI_create_workout"

    :goto_1
    iget-object v1, p0, Lwu2/c$h$c;->z:Lwu2/c;

    invoke-static {v1}, Lwu2/c;->d(Lwu2/c;)Lfi0/a;

    move-result-object v2

    iget-object v1, p0, Lwu2/c$h$c;->y:Lwu2/b;

    invoke-virtual {v1}, Lwu2/b;->n()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    const-string v1, "Shared"

    move-object v5, v1

    goto :goto_2

    :cond_2
    move-object v5, v3

    :goto_2
    iget-boolean v1, p0, Lwu2/c$h$c;->E:Z

    if-eqz v1, :cond_3

    const-string v1, "Copy Workout"

    goto :goto_3

    :cond_3
    move-object v1, v3

    :goto_3
    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;->getWorkoutTemplateKey()Ljava/lang/Long;

    move-result-object v0

    new-instance v4, Ll83/k;

    const-string v6, "workoutId"

    invoke-direct {v4, v6, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lwu2/c$h$c;->y:Lwu2/b;

    invoke-virtual {v0}, Lwu2/b;->k()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getParentTemplateKey()Ljava/lang/Long;

    move-result-object v0

    new-instance v6, Ll83/k;

    const-string v7, "originId"

    invoke-direct {v6, v7, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lwu2/c$h$c;->y:Lwu2/b;

    invoke-virtual {v0}, Lwu2/b;->h()Ljava/lang/String;

    move-result-object v0

    new-instance v7, Ll83/k;

    const-string v8, "sharedworkoutID"

    invoke-direct {v7, v8, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lwu2/c$h$c;->y:Lwu2/b;

    invoke-virtual {v0}, Lwu2/b;->n()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    move-object v7, v3

    :goto_4
    new-instance v0, Ll83/k;

    const-string v8, "source"

    invoke-direct {v0, v8, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lwu2/c$h$c;->y:Lwu2/b;

    invoke-virtual {p1}, Lwu2/b;->m()Z

    move-result p1

    if-eqz p1, :cond_5

    move-object v3, v0

    :cond_5
    filled-new-array {v4, v6, v7, v3}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v7

    const-string v4, "Save Template"

    const-string v6, "Workout Builder"

    move-object v3, v1

    invoke-interface/range {v2 .. v7}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
