.class final Lwp1/c$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwp1/c;->interact(Lec3/l;)Lec3/l;
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
        "Lwp1/b;",
        "acc",
        "Lwp1/a;",
        "domainAction",
        "<anonymous>",
        "(Lwp1/b;Lwp1/a;)Lwp1/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.hormonalinsights.symptompatterns.domain.SymptomPatternsInteractor$interact$1"
    f = "SymptomPatternsInteractor.kt"
    l = {
        0x14,
        0x19
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lwp1/c;


# direct methods
.method public constructor <init>(Lwp1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwp1/c;",
            "Lq83/d<",
            "-",
            "Lwp1/c$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwp1/c$e;->z:Lwp1/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lwp1/b;Lwp1/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwp1/b;",
            "Lwp1/a;",
            "Lq83/d<",
            "-",
            "Lwp1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lwp1/c$e;

    iget-object v1, p0, Lwp1/c$e;->z:Lwp1/c;

    invoke-direct {v0, v1, p3}, Lwp1/c$e;-><init>(Lwp1/c;Lq83/d;)V

    iput-object p1, v0, Lwp1/c$e;->x:Ljava/lang/Object;

    iput-object p2, v0, Lwp1/c$e;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lwp1/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwp1/b;

    check-cast p2, Lwp1/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lwp1/c$e;->f(Lwp1/b;Lwp1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lwp1/c$e;->x:Ljava/lang/Object;

    check-cast v0, Lwp1/b;

    iget-object v1, p0, Lwp1/c$e;->y:Ljava/lang/Object;

    check-cast v1, Lwp1/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lwp1/c$e;->w:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lwp1/a$a;

    const/4 v3, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Lwp1/c$e;->z:Lwp1/c;

    check-cast v1, Lwp1/a$a;

    invoke-virtual {v1}, Lwp1/a$a;->b()Z

    move-result v0

    invoke-virtual {v1}, Lwp1/a$a;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v3, p0, Lwp1/c$e;->x:Ljava/lang/Object;

    iput-object v3, p0, Lwp1/c$e;->y:Ljava/lang/Object;

    iput v5, p0, Lwp1/c$e;->w:I

    invoke-static {p1, v0, v1, p0}, Lwp1/c;->c(Lwp1/c;ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast p1, Lwp1/b;

    return-object p1

    :cond_4
    instance-of p1, v1, Lwp1/a$b;

    if-eqz p1, :cond_8

    instance-of p1, v0, Lwp1/b$c;

    if-eqz p1, :cond_5

    check-cast v0, Lwp1/b$c;

    goto :goto_1

    :cond_5
    move-object v0, v3

    :goto_1
    if-eqz v0, :cond_6

    check-cast v1, Lwp1/a$b;

    invoke-virtual {v1}, Lwp1/a$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v3, p1, v5, v3}, Lwp1/b$c;->b(Lwp1/b$c;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;Ljava/lang/String;ILjava/lang/Object;)Lwp1/b$c;

    move-result-object p1

    if-eqz p1, :cond_6

    return-object p1

    :cond_6
    iget-object v5, p0, Lwp1/c$e;->z:Lwp1/c;

    iput-object v3, p0, Lwp1/c$e;->x:Ljava/lang/Object;

    iput-object v3, p0, Lwp1/c$e;->y:Ljava/lang/Object;

    iput v4, p0, Lwp1/c$e;->w:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x0

    move-object v8, p0

    invoke-static/range {v5 .. v10}, Lwp1/c;->h(Lwp1/c;ZLjava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_7

    :goto_2
    return-object v2

    :cond_7
    :goto_3
    check-cast p1, Lwp1/b;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
