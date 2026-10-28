.class final Lyu2/e$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyu2/e;->x(Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;Lyu2/a;ZLandroidx/compose/runtime/Composer;II)V
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
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.feature.builder.edit.view.EditWorkoutScreenKt$EditWorkoutScreen$1$1"
    f = "EditWorkoutScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;Ljava/lang/String;Ll83/h;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;",
            "Ljava/lang/String;",
            "Ll83/h;",
            "Lq83/d<",
            "-",
            "Lyu2/e$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyu2/e$b;->x:Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;

    iput-object p2, p0, Lyu2/e$b;->y:Ljava/lang/String;

    iput-object p3, p0, Lyu2/e$b;->z:Ll83/h;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lyu2/e$b;

    iget-object v0, p0, Lyu2/e$b;->x:Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;

    iget-object v1, p0, Lyu2/e$b;->y:Ljava/lang/String;

    iget-object v2, p0, Lyu2/e$b;->z:Ll83/h;

    invoke-direct {p1, v0, v1, v2, p2}, Lyu2/e$b;-><init>(Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;Ljava/lang/String;Ll83/h;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lyu2/e$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lyu2/e$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lyu2/e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lyu2/e$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lyu2/e$b;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lyu2/e$b;->z:Ll83/h;

    invoke-static {p1}, Lyu2/e;->R(Ll83/h;)Lxu2/c;

    move-result-object p1

    new-instance v0, Lhu2/b$k;

    iget-object v1, p0, Lyu2/e$b;->x:Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;->f()Ljava/lang/Long;

    move-result-object v1

    iget-object v2, p0, Lyu2/e$b;->x:Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lyu2/e$b;->x:Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;

    invoke-virtual {v3}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;->e()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lyu2/e$b;->x:Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;

    invoke-virtual {v4}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;->h()Ljava/lang/Boolean;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    iget-object v5, p0, Lyu2/e$b;->x:Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;

    invoke-virtual {v5}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;->g()Z

    move-result v5

    iget-object v6, p0, Lyu2/e$b;->y:Ljava/lang/String;

    iget-object v7, p0, Lyu2/e$b;->x:Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;

    invoke-virtual {v7}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d$a;->b()Ljava/lang/String;

    move-result-object v7

    invoke-direct/range {v0 .. v7}, Lhu2/b$k;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lxu2/c;->n(Lhu2/b$p;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
