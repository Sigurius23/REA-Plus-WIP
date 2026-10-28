.class final Lio1/g$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio1/g;->interact(Lec3/l;)Lec3/l;
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
        "Lio1/a;",
        "currentState",
        "Lio1/c;",
        "internalAction",
        "<anonymous>",
        "(Lio1/a;Lio1/c;)Lio1/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.hormonalinsights.logsymptoms.domain.LogSymptomsInteractor$interact$2"
    f = "LogSymptomsInteractor.kt"
    l = {
        0x76
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lio1/g;

.field w:Ljava/lang/Object;

.field x:I

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lio1/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio1/g;",
            "Lq83/d<",
            "-",
            "Lio1/g$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio1/g$e;->E:Lio1/g;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lio1/a;Lio1/c;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio1/a;",
            "Lio1/c;",
            "Lq83/d<",
            "-",
            "Lio1/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lio1/g$e;

    iget-object v1, p0, Lio1/g$e;->E:Lio1/g;

    invoke-direct {v0, v1, p3}, Lio1/g$e;-><init>(Lio1/g;Lq83/d;)V

    iput-object p1, v0, Lio1/g$e;->y:Ljava/lang/Object;

    iput-object p2, v0, Lio1/g$e;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lio1/g$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lio1/a;

    check-cast p2, Lio1/c;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lio1/g$e;->f(Lio1/a;Lio1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lio1/g$e;->y:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lio1/a;

    iget-object v0, p0, Lio1/g$e;->z:Ljava/lang/Object;

    check-cast v0, Lio1/c;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lio1/g$e;->x:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v0, p0, Lio1/g$e;->w:Ljava/lang/Object;

    check-cast v0, Lio1/e;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lio1/c$b;

    const/4 v3, 0x0

    if-eqz p1, :cond_4

    check-cast v0, Lio1/c$b;

    invoke-virtual {v0}, Lio1/c$b;->a()Lio1/f;

    move-result-object p1

    invoke-virtual {p1}, Lio1/f;->h()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {p1}, Lio1/h;->a(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;)Ll83/k;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_2
    new-instance p1, Ll83/k;

    invoke-direct {p1, v3, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_3
    iget-object v2, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0}, Lio1/c$b;->a()Lio1/f;

    move-result-object v3

    invoke-virtual {v0}, Lio1/c$b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v3, v0, v2, p1}, Lio1/a;->a(Lio1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio1/a;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of p1, v0, Lio1/c$a;

    if-eqz p1, :cond_11

    check-cast v0, Lio1/c$a;

    invoke-virtual {v0}, Lio1/c$a;->a()Lio1/e;

    move-result-object p1

    instance-of v0, p1, Lio1/e$f;

    if-eqz v0, :cond_5

    check-cast p1, Lio1/e$f;

    invoke-virtual {p1}, Lio1/e$f;->a()Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0xb

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lio1/a;->b(Lio1/a;Lio1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio1/a;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of v0, p1, Lio1/e$d;

    if-eqz v0, :cond_6

    check-cast p1, Lio1/e$d;

    invoke-virtual {p1}, Lio1/e$d;->a()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lio1/a;->b(Lio1/a;Lio1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio1/a;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of v0, p1, Lio1/e$g;

    if-eqz v0, :cond_8

    invoke-virtual {v1}, Lio1/a;->d()Lio1/f;

    move-result-object v0

    invoke-virtual {v0}, Lio1/f;->h()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;

    move-result-object v4

    if-eqz v4, :cond_7

    check-cast p1, Lio1/e$g;

    invoke-virtual {p1}, Lio1/e$g;->a()I

    move-result v5

    invoke-virtual {p1}, Lio1/e$g;->b()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const/16 v9, 0xc

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lio1/h;->f(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;

    move-result-object v3

    :cond_7
    move-object v6, v3

    invoke-virtual {v1}, Lio1/a;->d()Lio1/f;

    move-result-object v4

    const/16 v11, 0x3d

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, Lio1/f;->b(Lio1/f;Lio1/d;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;ZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio1/f;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lio1/a;->b(Lio1/a;Lio1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio1/a;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of v0, p1, Lio1/e$e;

    if-eqz v0, :cond_a

    invoke-virtual {v1}, Lio1/a;->d()Lio1/f;

    move-result-object v0

    invoke-virtual {v0}, Lio1/f;->h()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;

    move-result-object v4

    if-eqz v4, :cond_9

    check-cast p1, Lio1/e$e;

    invoke-virtual {p1}, Lio1/e$e;->a()I

    move-result v5

    invoke-virtual {p1}, Lio1/e$e;->b()Ljava/lang/Integer;

    move-result-object v7

    const/16 v9, 0xa

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Lio1/h;->f(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;

    move-result-object v3

    :cond_9
    move-object v6, v3

    invoke-virtual {v1}, Lio1/a;->d()Lio1/f;

    move-result-object v4

    const/16 v11, 0x3d

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, Lio1/f;->b(Lio1/f;Lio1/d;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;ZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio1/f;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lio1/a;->b(Lio1/a;Lio1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio1/a;

    move-result-object p1

    return-object p1

    :cond_a
    instance-of v0, p1, Lio1/e$h;

    if-eqz v0, :cond_c

    invoke-virtual {v1}, Lio1/a;->d()Lio1/f;

    move-result-object v0

    invoke-virtual {v0}, Lio1/f;->h()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;

    move-result-object v4

    if-eqz v4, :cond_b

    check-cast p1, Lio1/e$h;

    invoke-virtual {p1}, Lio1/e$h;->a()I

    move-result v5

    invoke-virtual {p1}, Lio1/e$h;->b()Ljava/lang/Long;

    move-result-object v8

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Lio1/h;->f(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;

    move-result-object v3

    :cond_b
    move-object v6, v3

    invoke-virtual {v1}, Lio1/a;->d()Lio1/f;

    move-result-object v4

    const/16 v11, 0x3d

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, Lio1/f;->b(Lio1/f;Lio1/d;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;ZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio1/f;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lio1/a;->b(Lio1/a;Lio1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio1/a;

    move-result-object p1

    return-object p1

    :cond_c
    instance-of v0, p1, Lio1/e$c;

    if-eqz v0, :cond_f

    iget-object v5, p0, Lio1/g$e;->E:Lio1/g;

    invoke-virtual {v1}, Lio1/a;->f()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_d

    iget-object p1, p0, Lio1/g$e;->E:Lio1/g;

    invoke-static {p1}, Lio1/g;->d(Lio1/g;)Ljava/lang/String;

    move-result-object p1

    :cond_d
    move-object v6, p1

    invoke-virtual {v1}, Lio1/a;->e()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lio1/a;->c()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lio1/a;->d()Lio1/f;

    move-result-object p1

    invoke-virtual {p1}, Lio1/f;->h()Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;

    move-result-object v9

    iput-object v1, p0, Lio1/g$e;->y:Ljava/lang/Object;

    iput-object v3, p0, Lio1/g$e;->z:Ljava/lang/Object;

    iput-object v3, p0, Lio1/g$e;->w:Ljava/lang/Object;

    iput v4, p0, Lio1/g$e;->x:I

    move-object v10, p0

    invoke-static/range {v5 .. v10}, Lio1/g;->f(Lio1/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_e

    return-object v2

    :cond_e
    :goto_0
    move-object v2, p1

    check-cast v2, Lio1/f;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lio1/a;->b(Lio1/a;Lio1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio1/a;

    move-result-object p1

    return-object p1

    :cond_f
    instance-of p1, p1, Lio1/e$a;

    if-eqz p1, :cond_10

    invoke-virtual {v1}, Lio1/a;->d()Lio1/f;

    move-result-object v2

    sget-object v3, Lio1/d$a;->a:Lio1/d$a;

    const/16 v9, 0x3e

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lio1/f;->b(Lio1/f;Lio1/d;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;ZZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio1/f;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lio1/a;->b(Lio1/a;Lio1/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio1/a;

    move-result-object p1

    return-object p1

    :cond_10
    return-object v1

    :cond_11
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
