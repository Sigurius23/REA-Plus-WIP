.class final Ltf1/d$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltf1/d;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ltf1/c;",
        "previousState",
        "Ltf1/e;",
        "action",
        "<anonymous>",
        "(Ltf1/c;Ltf1/e;)Ltf1/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.feedbacksurvey.domain.FeedbackSurveyInteractor$interact$2"
    f = "FeedbackSurveyInteractor.kt"
    l = {
        0x36
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ltf1/d;


# direct methods
.method public constructor <init>(Ltf1/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf1/d;",
            "Lq83/d<",
            "-",
            "Ltf1/d$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltf1/d$g;->z:Ltf1/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ltf1/c;Ltf1/e;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltf1/c;",
            "Ltf1/e;",
            "Lq83/d<",
            "-",
            "Ltf1/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ltf1/d$g;

    iget-object v1, p0, Ltf1/d$g;->z:Ltf1/d;

    invoke-direct {v0, v1, p3}, Ltf1/d$g;-><init>(Ltf1/d;Lq83/d;)V

    iput-object p1, v0, Ltf1/d$g;->x:Ljava/lang/Object;

    iput-object p2, v0, Ltf1/d$g;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ltf1/d$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltf1/c;

    check-cast p2, Ltf1/e;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ltf1/d$g;->f(Ltf1/c;Ltf1/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Ltf1/d$g;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ltf1/c;

    iget-object v0, p0, Ltf1/d$g;->y:Ljava/lang/Object;

    check-cast v0, Ltf1/e;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Ltf1/d$g;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Ltf1/e$b;

    if-eqz p1, :cond_3

    iget-object p1, p0, Ltf1/d$g;->z:Ltf1/d;

    check-cast v0, Ltf1/e$b;

    invoke-virtual {v0}, Ltf1/e$b;->a()Ltf1/b;

    move-result-object v0

    const/4 v3, 0x0

    iput-object v3, p0, Ltf1/d$g;->x:Ljava/lang/Object;

    iput-object v3, p0, Ltf1/d$g;->y:Ljava/lang/Object;

    iput v4, p0, Ltf1/d$g;->w:I

    invoke-static {p1, v1, v0, p0}, Ltf1/d;->e(Ltf1/d;Ltf1/c;Ltf1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    check-cast p1, Ltf1/c;

    return-object p1

    :cond_3
    instance-of p1, v0, Ltf1/e$a;

    if-eqz p1, :cond_4

    check-cast v0, Ltf1/e$a;

    invoke-virtual {v0}, Ltf1/e$a;->a()Ltf1/c;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v0, Ltf1/e$c;

    if-eqz p1, :cond_5

    sget-object v4, Ltf1/a$c;->a:Ltf1/a$c;

    const/16 v8, 0x3b

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Ltf1/c;->b(Ltf1/c;Ljava/lang/String;Ljava/lang/String;Ltf1/a;Lcom/whoop/feedbacksurvey/domain/models/FeedbackSurveyModels;ZZILjava/lang/Object;)Ltf1/c;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
