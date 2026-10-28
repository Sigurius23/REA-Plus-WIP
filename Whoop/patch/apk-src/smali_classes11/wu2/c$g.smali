.class final Lwu2/c$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwu2/c;->A(Lwu2/b;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.weightlifting.feature.builder.edit.domain.EditWorkoutInteractor$sendLinkWorkoutRequest$2"
    f = "EditWorkoutInteractor.kt"
    l = {
        0x15a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lwu2/b;

.field final synthetic y:Lwu2/c;


# direct methods
.method public constructor <init>(Lwu2/b;Lwu2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwu2/b;",
            "Lwu2/c;",
            "Lq83/d<",
            "-",
            "Lwu2/c$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwu2/c$g;->x:Lwu2/b;

    iput-object p2, p0, Lwu2/c$g;->y:Lwu2/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lwu2/c$g;

    iget-object v0, p0, Lwu2/c$g;->x:Lwu2/b;

    iget-object v1, p0, Lwu2/c$g;->y:Lwu2/c;

    invoke-direct {p1, v0, v1, p2}, Lwu2/c$g;-><init>(Lwu2/b;Lwu2/c;Lq83/d;)V

    return-object p1
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
    invoke-virtual {p0, p1, p2}, Lwu2/c$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwu2/c$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwu2/c$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lwu2/c$g;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v5, p0

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lwu2/c$g;->w:I

    const/4 v9, 0x0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Lwu2/c$g;->x:Lwu2/b;

    invoke-virtual {v0}, Lwu2/b;->g()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Required value was null."

    if-eqz v0, :cond_9

    iget-object v0, v5, Lwu2/c$g;->x:Lwu2/b;

    invoke-virtual {v0}, Lwu2/b;->k()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getWorkoutTemplateKey()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_8

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, v5, Lwu2/c$g;->y:Lwu2/c;

    invoke-static {v2}, Lwu2/c;->f(Lwu2/c;)Ltr2/n;

    move-result-object v2

    new-instance v4, Lwu2/c$g$a;

    iget-object v3, v5, Lwu2/c$g;->y:Lwu2/c;

    iget-object v6, v5, Lwu2/c$g;->x:Lwu2/b;

    invoke-direct {v4, v3, v6, v9}, Lwu2/c$g$a;-><init>(Lwu2/c;Lwu2/b;Lq83/d;)V

    iput v1, v5, Lwu2/c$g;->w:I

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_2

    return-object v8

    :cond_2
    :goto_0
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_4

    iget-object v1, v5, Lwu2/c$g;->y:Lwu2/c;

    invoke-static {v1}, Lwu2/c;->d(Lwu2/c;)Lfi0/a;

    move-result-object v10

    iget-object v1, v5, Lwu2/c$g;->x:Lwu2/b;

    invoke-virtual {v1}, Lwu2/b;->k()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getWorkoutTemplateKey()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    iget-object v1, v5, Lwu2/c$g;->x:Lwu2/b;

    invoke-virtual {v1}, Lwu2/b;->k()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplateKt;->toDto(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;->getName()Ljava/lang/String;

    move-result-object v13

    iget-object v1, v5, Lwu2/c$g;->x:Lwu2/b;

    invoke-virtual {v1}, Lwu2/b;->g()Ljava/lang/String;

    move-result-object v14

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/dto/LinkWorkoutResponse;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/data/dto/LinkWorkoutResponse;->getOriginalActivityType()Ljava/lang/String;

    move-result-object v15

    iget-object v0, v5, Lwu2/c$g;->x:Lwu2/b;

    invoke-virtual {v0}, Lwu2/b;->m()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, v5, Lwu2/c$g;->x:Lwu2/b;

    invoke-virtual {v0}, Lwu2/b;->g()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_3

    const-string v9, "AI_link_MSK"

    :cond_3
    move-object/from16 v16, v9

    invoke-static/range {v10 .. v16}, Ldu2/b;->i(Lfi0/a;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v5, Lwu2/c$g;->x:Lwu2/b;

    sget-object v19, Lwu2/a$f;->a:Lwu2/a$f;

    const/16 v26, 0x1fb

    const/16 v27, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v16 .. v27}, Lwu2/b;->c(Lwu2/b;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/util/Set;Lwu2/a;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZILjava/lang/Object;)Lwu2/b;

    move-result-object v0

    return-object v0

    :cond_4
    instance-of v1, v0, Lu02/a$b$b;

    if-eqz v1, :cond_5

    iget-object v0, v5, Lwu2/c$g;->y:Lwu2/c;

    invoke-static {v0}, Lwu2/c;->d(Lwu2/c;)Lfi0/a;

    move-result-object v0

    iget-object v1, v5, Lwu2/c$g;->x:Lwu2/b;

    invoke-virtual {v1}, Lwu2/b;->k()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getWorkoutTemplateKey()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v3, v5, Lwu2/c$g;->x:Lwu2/b;

    invoke-virtual {v3}, Lwu2/b;->g()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Timeout"

    invoke-static {v0, v1, v2, v3, v4}, Ldu2/b;->h(Lfi0/a;JLjava/lang/String;Ljava/lang/String;)V

    iget-object v6, v5, Lwu2/c$g;->x:Lwu2/b;

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

    :cond_5
    instance-of v1, v0, Lu02/a$b$a;

    if-eqz v1, :cond_7

    iget-object v1, v5, Lwu2/c$g;->y:Lwu2/c;

    invoke-static {v1}, Lwu2/c;->d(Lwu2/c;)Lfi0/a;

    move-result-object v1

    iget-object v2, v5, Lwu2/c$g;->x:Lwu2/b;

    invoke-virtual {v2}, Lwu2/b;->k()Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;->getWorkoutTemplateKey()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object v4, v5, Lwu2/c$g;->x:Lwu2/b;

    invoke-virtual {v4}, Lwu2/b;->g()Ljava/lang/String;

    move-result-object v4

    check-cast v0, Lu02/a$b$a;

    invoke-virtual {v0}, Lu02/a$b$a;->d()I

    move-result v6

    const-string v7, "error "

    invoke-static {v6, v7}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v2, v3, v4, v6}, Ldu2/b;->h(Lfi0/a;JLjava/lang/String;Ljava/lang/String;)V

    iget-object v7, v5, Lwu2/c$g;->x:Lwu2/b;

    invoke-static {v0}, Lu02/b;->d(Lu02/a$b$a;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget-object v0, Lwu2/a$e;->a:Lwu2/a$e;

    :goto_1
    move-object v10, v0

    goto :goto_2

    :cond_6
    sget-object v0, Lwu2/a$d;->a:Lwu2/a$d;

    goto :goto_1

    :goto_2
    const/16 v17, 0x1fb

    const/16 v18, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v7 .. v18}, Lwu2/b;->c(Lwu2/b;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/util/Set;Lwu2/a;Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZILjava/lang/Object;)Lwu2/b;

    move-result-object v0

    return-object v0

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
