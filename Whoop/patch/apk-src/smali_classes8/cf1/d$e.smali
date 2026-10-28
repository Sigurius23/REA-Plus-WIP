.class final Lcf1/d$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcf1/d;->interact(Lec3/l;)Lec3/l;
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
        "Lcf1/c;",
        "previousState",
        "Lcf1/d$a;",
        "internalAction",
        "<anonymous>",
        "(Lcf1/c;Lcf1/d$a;)Lcf1/c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.exerciseprogressminiarch.domain.ExerciseProgressInteractor$interact$2"
    f = "ExerciseProgressInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcf1/d$e;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lcf1/c;Lcf1/d$a;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcf1/c;",
            "Lcf1/d$a;",
            "Lq83/d<",
            "-",
            "Lcf1/c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcf1/d$e;

    invoke-direct {v0, p3}, Lcf1/d$e;-><init>(Lq83/d;)V

    iput-object p1, v0, Lcf1/d$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcf1/d$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcf1/d$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcf1/c;

    check-cast p2, Lcf1/d$a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcf1/d$e;->f(Lcf1/c;Lcf1/d$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Lcf1/d$e;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcf1/c;

    iget-object v0, p0, Lcf1/d$e;->y:Ljava/lang/Object;

    check-cast v0, Lcf1/d$a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcf1/d$e;->w:I

    if-nez v2, :cond_4

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lcf1/d$a$b;

    if-eqz p1, :cond_1

    check-cast v0, Lcf1/d$a$b;

    invoke-virtual {v0}, Lcf1/d$a$b;->a()Lcf1/b;

    move-result-object p1

    instance-of v0, p1, Lcf1/b$b;

    if-eqz v0, :cond_0

    check-cast p1, Lcf1/b$b;

    invoke-virtual {p1}, Lcf1/b$b;->a()I

    move-result p1

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, p1}, Ljava/lang/Integer;-><init>(I)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcf1/c;->b(Lcf1/c;Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;ILjava/lang/Object;)Lcf1/c;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    instance-of p1, v0, Lcf1/d$a$a;

    if-eqz p1, :cond_3

    check-cast v0, Lcf1/d$a$a;

    invoke-virtual {v0}, Lcf1/d$a$a;->a()Lcf1/c;

    move-result-object v2

    invoke-virtual {v1}, Lcf1/c;->e()Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-virtual {v0}, Lcf1/d$a$a;->a()Lcf1/c;

    move-result-object p1

    invoke-virtual {p1}, Lcf1/c;->e()Ljava/lang/Integer;

    move-result-object p1

    :cond_2
    move-object v5, p1

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lcf1/c;->b(Lcf1/c;Lcf1/a;Lcom/whoop/exerciseprogressminiarch/domain/models/ExerciseProgressModels;Ljava/lang/Integer;ILjava/lang/Object;)Lcf1/c;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
