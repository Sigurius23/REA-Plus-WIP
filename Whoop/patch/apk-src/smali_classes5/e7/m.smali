.class public final Le7/m;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Le7/r;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Le7/r;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    iput p4, p0, Le7/m;->w:I

    iput-object p1, p0, Le7/m;->y:Le7/r;

    iput-object p2, p0, Le7/m;->z:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4

    iget v0, p0, Le7/m;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Le7/m;

    iget-object v1, p0, Le7/m;->z:Ljava/lang/Object;

    check-cast v1, Lo7/b;

    const/4 v2, 0x1

    iget-object v3, p0, Le7/m;->y:Le7/r;

    invoke-direct {v0, v3, v1, p1, v2}, Le7/m;-><init>(Le7/r;Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Le7/m;

    iget-object v1, p0, Le7/m;->z:Ljava/lang/Object;

    check-cast v1, Lo7/a;

    const/4 v2, 0x0

    iget-object v3, p0, Le7/m;->y:Le7/r;

    invoke-direct {v0, v3, v1, p1, v2}, Le7/m;-><init>(Le7/r;Ljava/lang/Object;Lq83/d;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Le7/m;->w:I

    check-cast p1, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1}, Le7/m;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le7/m;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Le7/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1}, Le7/m;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Le7/m;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Le7/m;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Le7/m;->w:I

    const-string v1, "<this>"

    iget-object v2, p0, Le7/m;->z:Ljava/lang/Object;

    iget-object v3, p0, Le7/m;->y:Le7/r;

    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v5, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v6, p0, Le7/m;->x:I

    if-eqz v6, :cond_1

    if-ne v6, v5, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v2, Lo7/b;

    iput v5, p0, Le7/m;->x:I

    new-instance p1, Lbc3/m;

    invoke-static {p0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v4

    invoke-direct {p1, v5, v4}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {p1}, Lbc3/m;->s()V

    iget-object v4, v3, Le7/r;->d:Landroid/health/connect/HealthConnectManager;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/health/connect/ReadRecordsRequestUsingFilters$Builder;

    iget-object v1, v2, Lo7/b;->a:Lj93/d;

    invoke-static {v1}, Lb3/g1;->E(Lj93/d;)Ljava/lang/Class;

    move-result-object v1

    new-instance v6, Landroid/health/connect/ReadRecordsRequestUsingFilters$Builder;

    invoke-direct {v6, v1}, Landroid/health/connect/ReadRecordsRequestUsingFilters$Builder;-><init>(Ljava/lang/Class;)V

    iget-object v1, v2, Lo7/b;->b:Lq7/a;

    iget-object v7, v1, Lq7/a;->b:Ljava/time/Instant;

    iget-object v1, v1, Lq7/a;->a:Ljava/time/Instant;

    if-nez v1, :cond_3

    if-eqz v7, :cond_2

    goto :goto_0

    :cond_2
    new-instance v1, Landroid/health/connect/TimeInstantRangeFilter$Builder;

    invoke-direct {v1}, Landroid/health/connect/TimeInstantRangeFilter$Builder;-><init>()V

    sget-object v7, Ljava/time/Instant;->EPOCH:Ljava/time/Instant;

    invoke-virtual {v1, v7}, Landroid/health/connect/TimeInstantRangeFilter$Builder;->setStartTime(Ljava/time/Instant;)Landroid/health/connect/TimeInstantRangeFilter$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/health/connect/TimeInstantRangeFilter$Builder;->build()Landroid/health/connect/TimeInstantRangeFilter;

    move-result-object v1

    const-string v7, "{\n        // Platform do\u2026tant.EPOCH).build()\n    }"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    :goto_0
    new-instance v8, Landroid/health/connect/TimeInstantRangeFilter$Builder;

    invoke-direct {v8}, Landroid/health/connect/TimeInstantRangeFilter$Builder;-><init>()V

    invoke-virtual {v8, v1}, Landroid/health/connect/TimeInstantRangeFilter$Builder;->setStartTime(Ljava/time/Instant;)Landroid/health/connect/TimeInstantRangeFilter$Builder;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/health/connect/TimeInstantRangeFilter$Builder;->setEndTime(Ljava/time/Instant;)Landroid/health/connect/TimeInstantRangeFilter$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/health/connect/TimeInstantRangeFilter$Builder;->build()Landroid/health/connect/TimeInstantRangeFilter;

    move-result-object v1

    const-string v7, "{\n        TimeInstantRan\u2026me(endTime).build()\n    }"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v6, v1}, Landroid/health/connect/ReadRecordsRequestUsingFilters$Builder;->setTimeRangeFilter(Landroid/health/connect/TimeRangeFilter;)Landroid/health/connect/ReadRecordsRequestUsingFilters$Builder;

    move-result-object v1

    const/16 v6, 0x3e8

    invoke-virtual {v1, v6}, Landroid/health/connect/ReadRecordsRequestUsingFilters$Builder;->setPageSize(I)Landroid/health/connect/ReadRecordsRequestUsingFilters$Builder;

    move-result-object v1

    iget-object v2, v2, Lo7/b;->c:Ljava/util/Set;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ln7/a;

    invoke-static {v6}, Lb3/g1;->y(Ln7/a;)Landroid/health/connect/datatypes/DataOrigin;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/health/connect/ReadRecordsRequestUsingFilters$Builder;->addDataOrigins(Landroid/health/connect/datatypes/DataOrigin;)Landroid/health/connect/ReadRecordsRequestUsingFilters$Builder;

    goto :goto_2

    :cond_4
    invoke-virtual {v1, v5}, Landroid/health/connect/ReadRecordsRequestUsingFilters$Builder;->setAscending(Z)Landroid/health/connect/ReadRecordsRequestUsingFilters$Builder;

    invoke-virtual {v1}, Landroid/health/connect/ReadRecordsRequestUsingFilters$Builder;->build()Landroid/health/connect/ReadRecordsRequestUsingFilters;

    move-result-object v1

    const-string v2, "Builder(recordType.toPla\u2026       }\n        .build()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v3, Le7/r;->b:Ljava/util/concurrent/Executor;

    new-instance v3, Lb5/e;

    invoke-direct {v3, p1}, Lb5/e;-><init>(Lbc3/m;)V

    invoke-virtual {v4, v1, v2, v3}, Landroid/health/connect/HealthConnectManager;->readRecords(Landroid/health/connect/ReadRecordsRequest;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {p1}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_5

    move-object p1, v0

    :cond_5
    :goto_3
    return-object p1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v6, p0, Le7/m;->x:I

    if-eqz v6, :cond_7

    if-ne v6, v5, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v2, Lo7/a;

    iput v5, p0, Le7/m;->x:I

    new-instance p1, Lbc3/m;

    invoke-static {p0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v4

    invoke-direct {p1, v5, v4}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {p1}, Lbc3/m;->s()V

    iget-object v4, v3, Le7/r;->d:Landroid/health/connect/HealthConnectManager;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/health/connect/changelog/ChangeLogTokenRequest$Builder;

    invoke-direct {v1}, Landroid/health/connect/changelog/ChangeLogTokenRequest$Builder;-><init>()V

    iget-object v5, v2, Lo7/a;->b:Ljava/util/Set;

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ln7/a;

    invoke-static {v6}, Lb3/g1;->y(Ln7/a;)Landroid/health/connect/datatypes/DataOrigin;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/health/connect/changelog/ChangeLogTokenRequest$Builder;->addDataOriginFilter(Landroid/health/connect/datatypes/DataOrigin;)Landroid/health/connect/changelog/ChangeLogTokenRequest$Builder;

    goto :goto_4

    :cond_8
    iget-object v2, v2, Lo7/a;->a:Ljava/util/Set;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj93/d;

    invoke-static {v5}, Lb3/g1;->E(Lj93/d;)Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/health/connect/changelog/ChangeLogTokenRequest$Builder;->addRecordType(Ljava/lang/Class;)Landroid/health/connect/changelog/ChangeLogTokenRequest$Builder;

    goto :goto_5

    :cond_9
    invoke-virtual {v1}, Landroid/health/connect/changelog/ChangeLogTokenRequest$Builder;->build()Landroid/health/connect/changelog/ChangeLogTokenRequest;

    move-result-object v1

    const-string v2, "Builder()\n        .apply\u2026       }\n        .build()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v3, Le7/r;->b:Ljava/util/concurrent/Executor;

    new-instance v3, Lb5/e;

    invoke-direct {v3, p1}, Lb5/e;-><init>(Lbc3/m;)V

    invoke-virtual {v4, v1, v2, v3}, Landroid/health/connect/HealthConnectManager;->getChangeLogToken(Landroid/health/connect/changelog/ChangeLogTokenRequest;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {p1}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_a

    move-object p1, v0

    :cond_a
    :goto_6
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
