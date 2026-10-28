.class public final Le7/j;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lj93/d;

.field public w:Ljava/util/List;

.field public x:I

.field public final synthetic y:Le7/r;

.field public final synthetic z:Ljava/util/List;


# direct methods
.method public constructor <init>(Le7/r;Ljava/util/List;Lj93/d;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Le7/j;->y:Le7/r;

    iput-object p2, p0, Le7/j;->z:Ljava/util/List;

    iput-object p3, p0, Le7/j;->E:Lj93/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4

    new-instance v0, Le7/j;

    iget-object v1, p0, Le7/j;->z:Ljava/util/List;

    iget-object v2, p0, Le7/j;->E:Lj93/d;

    iget-object v3, p0, Le7/j;->y:Le7/r;

    invoke-direct {v0, v3, v1, v2, p1}, Le7/j;-><init>(Le7/r;Ljava/util/List;Lj93/d;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Le7/j;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le7/j;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Le7/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Le7/j;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Le7/j;->w:Ljava/util/List;

    check-cast v0, Ljava/util/List;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Le7/j;->z:Ljava/util/List;

    move-object v1, p1

    check-cast v1, Ljava/util/List;

    iput-object v1, p0, Le7/j;->w:Ljava/util/List;

    iput v2, p0, Le7/j;->x:I

    new-instance v1, Lbc3/m;

    invoke-static {p0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v1}, Lbc3/m;->s()V

    iget-object v2, p0, Le7/j;->y:Le7/r;

    iget-object v3, v2, Le7/r;->d:Landroid/health/connect/HealthConnectManager;

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object v4

    sget-object v5, Lm83/y;->w:Lm83/y;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    iget-object v7, p0, Le7/j;->E:Lj93/d;

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v7}, Lb3/g1;->E(Lj93/d;)Ljava/lang/Class;

    move-result-object v7

    invoke-static {v7, v6}, Landroid/health/connect/RecordIdFilter;->fromId(Ljava/lang/Class;Ljava/lang/String;)Landroid/health/connect/RecordIdFilter;

    move-result-object v6

    invoke-virtual {v4, v6}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v7}, Lb3/g1;->E(Lj93/d;)Ljava/lang/Class;

    move-result-object v6

    invoke-static {v6, v5}, Landroid/health/connect/RecordIdFilter;->fromClientRecordId(Ljava/lang/Class;Ljava/lang/String;)Landroid/health/connect/RecordIdFilter;

    move-result-object v5

    invoke-virtual {v4, v5}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {v4}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p1

    iget-object v2, v2, Le7/r;->b:Ljava/util/concurrent/Executor;

    new-instance v4, Lb5/e;

    invoke-direct {v4, v1}, Lb5/e;-><init>(Lbc3/m;)V

    invoke-virtual {v3, p1, v2, v4}, Landroid/health/connect/HealthConnectManager;->deleteRecords(Ljava/util/List;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {v1}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    return-object p1
.end method
