.class final Lwu2/c$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwu2/c;->D(Lwu2/b;ZLq83/d;)Ljava/lang/Object;
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
        "Lwu2/b;",
        "<anonymous>",
        "(Lbc3/c0;)Lwu2/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.feature.builder.edit.domain.EditWorkoutInteractor$upsertWorkoutTemplateToServer$2"
    f = "EditWorkoutInteractor.kt"
    l = {
        0x129,
        0x12b,
        0x13b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lwu2/b;

.field final synthetic G:Lwu2/c;

.field final synthetic H:Z

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


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
            "Lwu2/c$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwu2/c$h;->F:Lwu2/b;

    iput-object p2, p0, Lwu2/c$h;->G:Lwu2/c;

    iput-boolean p3, p0, Lwu2/c$h;->H:Z

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

    new-instance v0, Lwu2/c$h;

    iget-object v1, p0, Lwu2/c$h;->F:Lwu2/b;

    iget-object v2, p0, Lwu2/c$h;->G:Lwu2/c;

    iget-boolean v3, p0, Lwu2/c$h;->H:Z

    invoke-direct {v0, v1, v2, v3, p2}, Lwu2/c$h;-><init>(Lwu2/b;Lwu2/c;ZLq83/d;)V

    iput-object p1, v0, Lwu2/c$h;->E:Ljava/lang/Object;

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
            "Lwu2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lwu2/c$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwu2/c$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwu2/c$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lwu2/c$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v5, p0

    iget-object v0, v5, Lwu2/c$h;->E:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lwu2/c$h;->z:I

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v2, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-eq v1, v8, :cond_1

    if-ne v1, v7, :cond_0

    iget-object v0, v5, Lwu2/c$h;->y:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v1, v5, Lwu2/c$h;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v5, Lwu2/c$h;->w:Ljava/lang/Object;

    check-cast v1, Lbc3/i0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v5, Lwu2/c$h;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v5, Lwu2/c$h;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, v0

    move-object/from16 v0, p1

    goto/16 :goto_1

    :cond_2
    iget-object v0, v5, Lwu2/c$h;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v5, Lwu2/c$h;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, v0

    move-object/from16 v0, p1

    goto :goto_0

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v1, Lwu2/c$h$a;

    invoke-direct {v1, v9}, Lwu2/c$h$a;-><init>(Lq83/d;)V

    invoke-static {v0, v9, v1, v7}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v10

    iget-object v0, v5, Lwu2/c$h;->F:Lwu2/b;

    invoke-virtual {v0}, Lwu2/b;->k()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "failed to upsert workout template to server:"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, v5, Lwu2/c$h;->G:Lwu2/c;

    invoke-static {v1}, Lwu2/c;->f(Lwu2/c;)Ltr2/n;

    move-result-object v1

    iget-object v4, v5, Lwu2/c$h;->G:Lwu2/c;

    invoke-static {v4}, Lwu2/c;->e(Lwu2/c;)Lrr2/c;

    move-result-object v4

    move-object v11, v4

    new-instance v4, Lwu2/c$h$b;

    iget-object v12, v5, Lwu2/c$h;->G:Lwu2/c;

    iget-object v13, v5, Lwu2/c$h;->F:Lwu2/b;

    invoke-direct {v4, v12, v13, v9}, Lwu2/c$h$b;-><init>(Lwu2/c;Lwu2/b;Lq83/d;)V

    iput-object v9, v5, Lwu2/c$h;->E:Ljava/lang/Object;

    iput-object v10, v5, Lwu2/c$h;->w:Ljava/lang/Object;

    iput-object v9, v5, Lwu2/c$h;->x:Ljava/lang/Object;

    iput v2, v5, Lwu2/c$h;->z:I

    move-object v2, v11

    invoke-virtual/range {v0 .. v5}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    check-cast v0, Lu02/a;

    new-instance v1, Lwu2/c$h$c;

    iget-object v2, v5, Lwu2/c$h;->F:Lwu2/b;

    iget-object v3, v5, Lwu2/c$h;->G:Lwu2/c;

    iget-boolean v4, v5, Lwu2/c$h;->H:Z

    invoke-direct {v1, v2, v3, v4, v9}, Lwu2/c$h$c;-><init>(Lwu2/b;Lwu2/c;ZLq83/d;)V

    iput-object v9, v5, Lwu2/c$h;->E:Ljava/lang/Object;

    iput-object v10, v5, Lwu2/c$h;->w:Ljava/lang/Object;

    iput-object v9, v5, Lwu2/c$h;->x:Ljava/lang/Object;

    iput v8, v5, Lwu2/c$h;->z:I

    invoke-static {v0, v1, v5}, Lu02/b;->g(Lu02/a;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    check-cast v0, Lu02/a;

    iput-object v9, v5, Lwu2/c$h;->E:Ljava/lang/Object;

    iput-object v9, v5, Lwu2/c$h;->w:Ljava/lang/Object;

    iput-object v9, v5, Lwu2/c$h;->x:Ljava/lang/Object;

    iput-object v0, v5, Lwu2/c$h;->y:Ljava/lang/Object;

    iput v7, v5, Lwu2/c$h;->z:I

    invoke-interface {v10, v5}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_6

    :goto_2
    return-object v6

    :cond_6
    :goto_3
    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_8

    iget-object v1, v5, Lwu2/c$h;->F:Lwu2/b;

    invoke-virtual {v1}, Lwu2/b;->n()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, v5, Lwu2/c$h;->G:Lwu2/c;

    invoke-static {v1}, Lwu2/c;->g(Lwu2/c;)Lfu2/i;

    move-result-object v1

    sget-object v2, Lfu2/g$d;->a:Lfu2/g$d;

    invoke-virtual {v1, v2}, Lfu2/i;->j(Lfu2/g;)V

    :cond_7
    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;->toWorkoutTemplate()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v7

    iget-object v0, v5, Lwu2/c$h;->G:Lwu2/c;

    invoke-static {v0, v7}, Lwu2/c;->j(Lwu2/c;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)V

    sget-object v9, Lwu2/a$m;->a:Lwu2/a$m;

    iget-object v6, v5, Lwu2/c$h;->F:Lwu2/b;

    const/16 v16, 0x1b0

    const/16 v17, 0x0

    sget-object v8, Lm83/a0;->w:Lm83/a0;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v10, v7

    invoke-static/range {v6 .. v17}, Lwu2/b;->c(Lwu2/b;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/util/Set;Lwu2/a;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZILjava/lang/Object;)Lwu2/b;

    move-result-object v0

    return-object v0

    :cond_8
    instance-of v1, v0, Lu02/a$b$b;

    if-eqz v1, :cond_9

    iget-object v6, v5, Lwu2/c$h;->F:Lwu2/b;

    new-instance v9, Lwu2/a$j;

    sget-object v0, Lfu2/e$a;->a:Lfu2/e$a;

    invoke-direct {v9, v0}, Lwu2/a$j;-><init>(Lfu2/e;)V

    const/16 v16, 0x1fb

    const/16 v17, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v6 .. v17}, Lwu2/b;->c(Lwu2/b;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/util/Set;Lwu2/a;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZILjava/lang/Object;)Lwu2/b;

    move-result-object v0

    return-object v0

    :cond_9
    instance-of v0, v0, Lu02/a$b;

    if-eqz v0, :cond_a

    iget-object v6, v5, Lwu2/c$h;->F:Lwu2/b;

    new-instance v9, Lwu2/a$l;

    sget-object v0, Lfu2/e$a;->a:Lfu2/e$a;

    invoke-direct {v9, v0}, Lwu2/a$l;-><init>(Lfu2/e;)V

    const/16 v16, 0x1fb

    const/16 v17, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v6 .. v17}, Lwu2/b;->c(Lwu2/b;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/util/Set;Lwu2/a;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZILjava/lang/Object;)Lwu2/b;

    move-result-object v0

    return-object v0

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
