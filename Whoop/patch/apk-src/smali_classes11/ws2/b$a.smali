.class final Lws2/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lws2/b;->j(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "Lws2/e;",
        "<anonymous>",
        "(Lbc3/c0;)Lws2/e;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weeklyplan.customizeplan.domain.CustomizePlanApiInteractor$deleteTargetMetric$2"
    f = "CustomizePlanApiInteractor.kt"
    l = {
        0x77
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:I

.field final synthetic x:Lws2/b;

.field final synthetic y:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lws2/b;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lws2/b;",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lws2/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lws2/b$a;->x:Lws2/b;

    iput-object p2, p0, Lws2/b$a;->y:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    iput-object p3, p0, Lws2/b$a;->z:Ljava/lang/String;

    iput-object p4, p0, Lws2/b$a;->E:Ljava/lang/String;

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

    new-instance v0, Lws2/b$a;

    iget-object v1, p0, Lws2/b$a;->x:Lws2/b;

    iget-object v2, p0, Lws2/b$a;->y:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    iget-object v3, p0, Lws2/b$a;->z:Ljava/lang/String;

    iget-object v4, p0, Lws2/b$a;->E:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lws2/b$a;-><init>(Lws2/b;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

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
            "Lws2/e;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lws2/b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lws2/b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lws2/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lws2/b$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lws2/b$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, p0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lws2/b$a;->x:Lws2/b;

    invoke-static {p1}, Lws2/b;->g(Lws2/b;)Ltr2/n;

    move-result-object p1

    new-instance v3, Lws2/b$a$a;

    iget-object v4, p0, Lws2/b$a;->y:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    iget-object v5, p0, Lws2/b$a;->x:Lws2/b;

    iget-object v6, p0, Lws2/b$a;->E:Ljava/lang/String;

    iget-object v7, p0, Lws2/b$a;->z:Ljava/lang/String;

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v8}, Lws2/b$a$a;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lws2/b;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput v2, p0, Lws2/b$a;->w:I

    move-object v5, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x6

    move-object v6, p0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_3

    sget-object p1, Lws2/e$g;->a:Lws2/e$g;

    return-object p1

    :cond_3
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_4

    iget-object p1, v6, Lws2/b$a;->x:Lws2/b;

    invoke-static {p1}, Lws2/b;->d(Lws2/b;)Lls2/b;

    move-result-object p1

    new-instance v0, Lls2/a$c;

    iget-object v1, v6, Lws2/b$a;->y:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v2, "Fail to Save"

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lls2/a$c;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Lls2/b;->q(Lls2/a;)V

    new-instance p1, Lws2/e$c;

    iget-object v0, v6, Lws2/b$a;->z:Ljava/lang/String;

    iget-object v1, v6, Lws2/b$a;->y:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    invoke-direct {p1, v0, v1}, Lws2/e$c;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
