.class final Loo1/g$t;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo1/g;->interact(Lec3/l;)Lec3/l;
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
        "Loo1/g$c;",
        "accumulator",
        "Loo1/g$d;",
        "action",
        "<anonymous>",
        "(Loo1/g$c;Loo1/g$d;)Loo1/g$c;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.MciOverviewInteractor$interact$3"
    f = "MciOverviewInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Loo1/g;


# direct methods
.method public constructor <init>(Loo1/g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo1/g;",
            "Lq83/d<",
            "-",
            "Loo1/g$t;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loo1/g$t;->z:Loo1/g;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Loo1/g$c;Loo1/g$d;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loo1/g$c;",
            "Loo1/g$d;",
            "Lq83/d<",
            "-",
            "Loo1/g$c;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Loo1/g$t;

    iget-object v1, p0, Loo1/g$t;->z:Loo1/g;

    invoke-direct {v0, v1, p3}, Loo1/g$t;-><init>(Loo1/g;Lq83/d;)V

    iput-object p1, v0, Loo1/g$t;->x:Ljava/lang/Object;

    iput-object p2, v0, Loo1/g$t;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Loo1/g$t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Loo1/g$c;

    check-cast p2, Loo1/g$d;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Loo1/g$t;->f(Loo1/g$c;Loo1/g$d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Loo1/g$t;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Loo1/g$c;

    iget-object v0, p0, Loo1/g$t;->y:Ljava/lang/Object;

    check-cast v0, Loo1/g$d;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Loo1/g$t;->w:I

    if-nez v2, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Loo1/g$d$a;

    if-eqz p1, :cond_0

    check-cast v0, Loo1/g$d$a;

    invoke-virtual {v0}, Loo1/g$d$a;->a()Loo1/f;

    move-result-object p1

    invoke-virtual {v1}, Loo1/g$c;->e()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v1}, Loo1/g$c;->c()I

    move-result v1

    new-instance v2, Loo1/g$c;

    invoke-direct {v2, v0, p1, v1}, Loo1/g$c;-><init>(Ljava/util/Map;Loo1/f;I)V

    return-object v2

    :cond_0
    instance-of p1, v0, Loo1/g$d$b;

    if-eqz p1, :cond_1

    move-object v2, v1

    iget-object v1, p0, Loo1/g$t;->z:Loo1/g;

    check-cast v0, Loo1/g$d$b;

    invoke-virtual {v0}, Loo1/g$d$b;->a()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;

    move-result-object v3

    invoke-virtual {v0}, Loo1/g$d$b;->c()Z

    move-result v4

    invoke-virtual {v0}, Loo1/g$d$b;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Loo1/g$d$b;->d()Z

    move-result v6

    invoke-static/range {v1 .. v6}, Loo1/g;->c(Loo1/g;Loo1/g$c;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;ZLjava/lang/String;Z)Loo1/g$c;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p1, v0, Loo1/g$d$e;

    if-eqz p1, :cond_2

    check-cast v0, Loo1/g$d$e;

    invoke-virtual {v0}, Loo1/g$d$e;->b()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0}, Loo1/g$d$e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Loo1/g$d$e;->c()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;

    move-result-object v0

    iget-object v3, p0, Loo1/g$t;->z:Loo1/g;

    invoke-static {v3, v1, p1, v0, v2}, Loo1/g;->r(Loo1/g;Loo1/g$c;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;Ljava/lang/String;)Loo1/g$c;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v0, Loo1/g$d$c;

    if-eqz p1, :cond_3

    invoke-virtual {v1}, Loo1/g$c;->d()Loo1/f;

    move-result-object p1

    instance-of p1, p1, Loo1/f$g;

    if-eqz p1, :cond_4

    invoke-virtual {v1}, Loo1/g$c;->d()Loo1/f;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Loo1/f$g;

    check-cast v0, Loo1/g$d$c;

    invoke-virtual {v0}, Loo1/g$d$c;->a()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;

    move-result-object v7

    const/16 v9, 0x2f

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Loo1/f$g;->b(Loo1/f$g;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;Lh91/b;Ljava/lang/String;ILcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;ZILjava/lang/Object;)Loo1/f$g;

    move-result-object v3

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Loo1/g$c;->b(Loo1/g$c;Ljava/util/Map;Loo1/f;IILjava/lang/Object;)Loo1/g$c;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, v0, Loo1/g$d$d;

    if-eqz p1, :cond_5

    invoke-virtual {v1}, Loo1/g$c;->d()Loo1/f;

    move-result-object p1

    instance-of p1, p1, Loo1/f$g;

    if-eqz p1, :cond_4

    invoke-virtual {v1}, Loo1/g$c;->d()Loo1/f;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Loo1/f$g;

    const/16 v9, 0x1f

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Loo1/f$g;->b(Loo1/f$g;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualCycleInsightsResponse;Lh91/b;Ljava/lang/String;ILcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;ZILjava/lang/Object;)Loo1/f$g;

    move-result-object v3

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Loo1/g$c;->b(Loo1/g$c;Ljava/util/Map;Loo1/f;IILjava/lang/Object;)Loo1/g$c;

    move-result-object p1

    return-object p1

    :cond_4
    return-object v1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
