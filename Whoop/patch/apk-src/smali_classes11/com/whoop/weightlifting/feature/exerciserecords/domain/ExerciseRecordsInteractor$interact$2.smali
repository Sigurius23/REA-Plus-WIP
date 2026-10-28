.class final Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;",
        "state",
        "internalAction",
        "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.feature.exerciserecords.domain.ExerciseRecordsInteractor$interact$2"
    f = "ExerciseRecordsInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$2;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;",
            "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$2;

    invoke-direct {v0, p3}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$2;-><init>(Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$2;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$2;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;

    check-cast p2, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$2;->invoke(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$2;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$2;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$2;->label:I

    if-nez v2, :cond_9

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$Loading;

    if-eqz p1, :cond_0

    new-instance v2, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;

    sget-object v3, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$Loading;->INSTANCE:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$Loading;

    check-cast v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$Loading;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$Loading;->getPath()Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0x3a

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;-><init>(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_0
    sget-object p1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$LoadingMore;->INSTANCE:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$LoadingMore;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 v8, 0x37

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->copy$default(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object p1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$SkipPagination;->INSTANCE:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$SkipPagination;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return-object v1

    :cond_2
    instance-of p1, v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageLoaded;

    if-eqz p1, :cond_3

    check-cast v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageLoaded;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageLoaded;->getItems()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageLoaded;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageLoaded;->getNextStartDate()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageLoaded;->getAnalyticsActionFromApi()Ljava/lang/String;

    move-result-object v7

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v1 .. v7}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->copy(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;

    move-result-object p1

    return-object p1

    :cond_3
    instance-of p1, v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageAppended;

    if-eqz p1, :cond_5

    invoke-virtual {v1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->getResponse()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_4

    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_4
    check-cast p1, Ljava/util/Collection;

    check-cast v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageAppended;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageAppended;->getItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {p1, v2}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageAppended;->getNextStartDate()Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x24

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->copy$default(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of p1, v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$OfflineError;

    if-eqz p1, :cond_6

    sget-object v2, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$NetworkError;->INSTANCE:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$NetworkError;

    check-cast v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$OfflineError;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$OfflineError;->getPath()Ljava/lang/String;

    move-result-object v4

    const/16 v8, 0x32

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->copy$default(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of p1, v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$RequestFailedError;

    if-eqz p1, :cond_7

    new-instance v2, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$RequestFailed;

    check-cast v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$RequestFailedError;

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$RequestFailedError;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType$RequestFailed;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$RequestFailedError;->getPath()Ljava/lang/String;

    move-result-object v4

    const/16 v8, 0x32

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->copy$default(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;

    move-result-object p1

    return-object p1

    :cond_7
    sget-object p1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageAppendError;->INSTANCE:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageAppendError;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    const/16 v8, 0x37

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;->copy$default(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
