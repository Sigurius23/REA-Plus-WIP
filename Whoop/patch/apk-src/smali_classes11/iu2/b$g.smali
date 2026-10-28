.class final Liu2/b$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liu2/b;->y(Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.weightlifting.data.WeightliftingRepository$serializeWorkoutState$2"
    f = "WeightliftingRepository.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Liu2/b;

.field final synthetic y:Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;


# direct methods
.method public constructor <init>(Liu2/b;Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liu2/b;",
            "Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;",
            "Lq83/d<",
            "-",
            "Liu2/b$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liu2/b$g;->x:Liu2/b;

    iput-object p2, p0, Liu2/b$g;->y:Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;

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

    new-instance p1, Liu2/b$g;

    iget-object v0, p0, Liu2/b$g;->x:Liu2/b;

    iget-object v1, p0, Liu2/b$g;->y:Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;

    invoke-direct {p1, v0, v1, p2}, Liu2/b$g;-><init>(Liu2/b;Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Liu2/b$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Liu2/b$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Liu2/b$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Liu2/b$g;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Liu2/b$g;->w:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Liu2/b$g;->x:Liu2/b;

    invoke-static {p1}, Liu2/b;->h(Liu2/b;)Lu92/d;

    move-result-object p1

    iget-object v0, p0, Liu2/b$g;->y:Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;

    iget-object v1, p0, Liu2/b$g;->x:Liu2/b;

    invoke-static {v1}, Liu2/b;->f(Liu2/b;)Llu2/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/weightlifting/data/domain/WorkoutSessionState;->serialize(Llu2/d;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "StrengthBuilderSavedState"

    invoke-virtual {p1, v1, v0}, Lu92/d;->v(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
