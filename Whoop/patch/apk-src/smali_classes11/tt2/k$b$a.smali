.class public final Ltt2/k$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltt2/k$b;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lec3/m;

.field final synthetic x:Ltt2/k;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lec3/m;Ltt2/k;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ltt2/k$b$a;->w:Lec3/m;

    iput-object p2, p0, Ltt2/k$b$a;->x:Ltt2/k;

    iput-object p3, p0, Ltt2/k$b$a;->y:Ljava/lang/String;

    iput-object p4, p0, Ltt2/k$b$a;->z:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Ltt2/k$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ltt2/k$b$a$a;

    iget v1, v0, Ltt2/k$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ltt2/k$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Ltt2/k$b$a$a;

    invoke-direct {v0, p0, p2}, Ltt2/k$b$a$a;-><init>(Ltt2/k$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ltt2/k$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ltt2/k$b$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ltt2/k$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Ltt2/k$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Ltt2/k$b$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ltt2/k$b$a;->w:Lec3/m;

    check-cast p1, Lpm0/a;

    instance-of v2, p1, Lpm0/a$e;

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    sget-object p1, Ltt2/j$c;->a:Ltt2/j$c;

    goto/16 :goto_4

    :cond_3
    instance-of v2, p1, Lpm0/a$a$a;

    if-eqz v2, :cond_5

    iget-object v2, p0, Ltt2/k$b$a;->x:Ltt2/k;

    check-cast p1, Lpm0/a$a$a;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;

    iget-object v7, p0, Ltt2/k$b$a;->y:Ljava/lang/String;

    iget-object v8, p0, Ltt2/k$b$a;->z:Ljava/lang/String;

    invoke-static {v2, v6, v7, v8}, Ltt2/k;->e(Ltt2/k;Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ltt2/j$d;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;

    iget-object v7, p0, Ltt2/k$b$a;->y:Ljava/lang/String;

    invoke-virtual {p1}, Lpm0/a$a$a;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;->getMetadata()Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object p1

    goto :goto_1

    :cond_4
    move-object p1, v5

    :goto_1
    invoke-direct {v2, v6, v7, p1}, Ltt2/j$d;-><init>(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;Ljava/lang/String;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V

    :goto_2
    move-object p1, v2

    goto/16 :goto_4

    :cond_5
    instance-of v2, p1, Lpm0/a$a$b;

    if-eqz v2, :cond_7

    new-instance v2, Ltt2/j$e;

    check-cast p1, Lpm0/a$a$b;

    invoke-virtual {p1}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;

    const/4 v11, 0x5

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;->copy$default(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanModel;Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryState;Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;ILjava/lang/Object;)Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;

    move-result-object v6

    iget-object v7, p0, Ltt2/k$b$a;->y:Ljava/lang/String;

    invoke-virtual {p1}, Lpm0/a$a$b;->getData()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;->getMetadata()Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object p1

    goto :goto_3

    :cond_6
    move-object p1, v5

    :goto_3
    invoke-direct {v2, v6, v7, p1}, Ltt2/j$e;-><init>(Lcom/whoop/weeklyplan/weeklyplan/domain/models/WeeklyPlanResponse;Ljava/lang/String;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)V

    goto :goto_2

    :cond_7
    instance-of v2, p1, Lpm0/a$d;

    const-string v6, "Fetching weekly plan failed "

    if-eqz v2, :cond_8

    iget-object v2, p0, Ltt2/k$b$a;->x:Ltt2/k;

    invoke-static {v2}, Ltt2/k;->d(Ltt2/k;)Ltr2/n;

    move-result-object v2

    check-cast p1, Lpm0/a$d;

    invoke-virtual {p1}, Lpm0/a$d;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-array v7, v4, [Lqr2/a$a;

    invoke-interface {v2, v6, v7}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v2, Ltt2/j$b;

    invoke-virtual {p1}, Lpm0/a$d;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v6, p0, Ltt2/k$b$a;->y:Ljava/lang/String;

    invoke-direct {v2, p1, v6}, Ltt2/j$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_8
    instance-of v2, p1, Lpm0/a$c;

    if-eqz v2, :cond_9

    iget-object v2, p0, Ltt2/k$b$a;->x:Ltt2/k;

    invoke-static {v2}, Ltt2/k;->d(Ltt2/k;)Ltr2/n;

    move-result-object v2

    check-cast p1, Lpm0/a$c;

    invoke-virtual {p1}, Lpm0/a$c;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-array v7, v4, [Lqr2/a$a;

    invoke-interface {v2, v6, v7}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v2, Ltt2/j$b;

    invoke-virtual {p1}, Lpm0/a$c;->a()Ljava/lang/String;

    move-result-object p1

    iget-object v6, p0, Ltt2/k$b$a;->y:Ljava/lang/String;

    invoke-direct {v2, p1, v6}, Ltt2/j$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_9
    iget-object p1, p0, Ltt2/k$b$a;->x:Ltt2/k;

    invoke-static {p1}, Ltt2/k;->d(Ltt2/k;)Ltr2/n;

    move-result-object p1

    new-array v2, v4, [Lqr2/a$a;

    const-string v6, "Fetching weekly plan failed with unknown error"

    invoke-interface {p1, v6, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Ltt2/j$b;

    iget-object v2, p0, Ltt2/k$b$a;->y:Ljava/lang/String;

    invoke-direct {p1, v6, v2}, Ltt2/j$b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_4
    iput-object v5, v0, Ltt2/k$b$a$a;->y:Ljava/lang/Object;

    iput-object v5, v0, Ltt2/k$b$a$a;->E:Ljava/lang/Object;

    iput-object v5, v0, Ltt2/k$b$a$a;->F:Ljava/lang/Object;

    iput-object v5, v0, Ltt2/k$b$a$a;->G:Ljava/lang/Object;

    iput v4, v0, Ltt2/k$b$a$a;->H:I

    iput v3, v0, Ltt2/k$b$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    return-object v1

    :cond_a
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
