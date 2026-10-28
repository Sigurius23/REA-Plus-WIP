.class final Lvu2/d$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvu2/d;->p(Ljava/lang/String;Lcu2/b;Ljava/lang/String;)Lec3/l;
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
        "Lvu2/f;",
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
    c = "com.whoop.weightlifting.feature.builder.details.domain.ExerciseDetailsV2Interactor$loadExerciseInternalActions$1"
    f = "ExerciseDetailsV2Interactor.kt"
    l = {
        0x3c,
        0x3d,
        0x45,
        0x4e,
        0x4f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lvu2/d;

.field final synthetic G:Ljava/lang/String;

.field final synthetic H:Lcu2/b;

.field final synthetic I:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lvu2/d;Ljava/lang/String;Lcu2/b;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvu2/d;",
            "Ljava/lang/String;",
            "Lcu2/b;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lvu2/d$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvu2/d$f;->F:Lvu2/d;

    iput-object p2, p0, Lvu2/d$f;->G:Ljava/lang/String;

    iput-object p3, p0, Lvu2/d$f;->H:Lcu2/b;

    iput-object p4, p0, Lvu2/d$f;->I:Ljava/lang/String;

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

    new-instance v0, Lvu2/d$f;

    iget-object v1, p0, Lvu2/d$f;->F:Lvu2/d;

    iget-object v2, p0, Lvu2/d$f;->G:Ljava/lang/String;

    iget-object v3, p0, Lvu2/d$f;->H:Lcu2/b;

    iget-object v4, p0, Lvu2/d$f;->I:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lvu2/d$f;-><init>(Lvu2/d;Ljava/lang/String;Lcu2/b;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lvu2/d$f;->E:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lvu2/d$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvu2/d$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvu2/d$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvu2/d$f;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lvu2/d$f;->E:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lvu2/d$f;->z:I

    const/4 v10, 0x5

    const/4 v11, 0x4

    const/4 v12, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v13, 0x0

    if-eqz v0, :cond_5

    if-eq v0, v2, :cond_4

    if-eq v0, v1, :cond_3

    if-eq v0, v12, :cond_1

    if-eq v0, v11, :cond_2

    if-ne v0, v10, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lvu2/d$f;->y:Ljava/lang/Object;

    check-cast v0, Luu2/m;

    iget-object v0, p0, Lvu2/d$f;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :cond_2
    :goto_0
    iget-object v0, p0, Lvu2/d$f;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lvu2/f$e;->a:Lvu2/f$e;

    iput-object v8, p0, Lvu2/d$f;->E:Ljava/lang/Object;

    iput v2, p0, Lvu2/d$f;->z:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    goto/16 :goto_3

    :cond_6
    :goto_1
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lvu2/d$f;->F:Lvu2/d;

    invoke-static {v2}, Lvu2/d;->h(Lvu2/d;)Ltr2/n;

    move-result-object v2

    iget-object v3, p0, Lvu2/d$f;->G:Ljava/lang/String;

    const-string v4, "Failed to retrieve exercise details for id "

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lvu2/d$f$a;

    iget-object v6, p0, Lvu2/d$f;->F:Lvu2/d;

    iget-object v7, p0, Lvu2/d$f;->G:Ljava/lang/String;

    invoke-direct {v4, v6, v7, v13}, Lvu2/d$f$a;-><init>(Lvu2/d;Ljava/lang/String;Lq83/d;)V

    iput-object v8, p0, Lvu2/d$f;->E:Ljava/lang/Object;

    iput v1, p0, Lvu2/d$f;->z:I

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lvu2/d$f;->H:Lcu2/b;

    iget-object v2, p0, Lvu2/d$f;->I:Ljava/lang/String;

    invoke-static {v1, v2}, Luu2/n;->e(Lcu2/b;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;

    iget-object v3, p0, Lvu2/d$f;->G:Ljava/lang/String;

    invoke-static {v2, v1, v3}, Luu2/n;->a(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Ljava/lang/String;Ljava/lang/String;)Luu2/m;

    move-result-object v2

    iget-object v3, p0, Lvu2/d$f;->F:Lvu2/d;

    invoke-static {v3}, Lvu2/d;->g(Lvu2/d;)Lfi0/a;

    move-result-object v3

    invoke-static {v3, v2}, Luu2/n;->f(Lfi0/a;Luu2/m;)V

    new-instance v3, Lvu2/f$f;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;

    iget-object v4, p0, Lvu2/d$f;->G:Ljava/lang/String;

    invoke-direct {v3, v0, v1, v4, v2}, Lvu2/f$f;-><init>(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Ljava/lang/String;Ljava/lang/String;Luu2/m;)V

    iput-object v13, p0, Lvu2/d$f;->E:Ljava/lang/Object;

    iput-object v13, p0, Lvu2/d$f;->w:Ljava/lang/Object;

    iput-object v13, p0, Lvu2/d$f;->x:Ljava/lang/Object;

    iput-object v13, p0, Lvu2/d$f;->y:Ljava/lang/Object;

    iput v12, p0, Lvu2/d$f;->z:I

    invoke-interface {v8, v3, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    goto :goto_3

    :cond_8
    instance-of v1, v0, Lu02/a$b$a;

    if-eqz v1, :cond_9

    sget-object v0, Lvu2/f$c;->a:Lvu2/f$c;

    iput-object v13, p0, Lvu2/d$f;->E:Ljava/lang/Object;

    iput-object v13, p0, Lvu2/d$f;->w:Ljava/lang/Object;

    iput v11, p0, Lvu2/d$f;->z:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    goto :goto_3

    :cond_9
    instance-of v0, v0, Lu02/a$b$b;

    if-eqz v0, :cond_b

    sget-object v0, Lvu2/f$d;->a:Lvu2/f$d;

    iput-object v13, p0, Lvu2/d$f;->E:Ljava/lang/Object;

    iput-object v13, p0, Lvu2/d$f;->w:Ljava/lang/Object;

    iput v10, p0, Lvu2/d$f;->z:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    :goto_3
    return-object v9

    :cond_a
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
