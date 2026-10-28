.class public final Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction;",
        "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ,\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J#\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00122\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;",
        "Lod1/g;",
        "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainAction;",
        "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;",
        "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;Ltr2/n;)V",
        "",
        "path",
        "startDate",
        "",
        "isLoadMore",
        "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;",
        "fetchPage",
        "(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;",
        "Ltr2/n;",
        "weightlifting_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final api:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;

.field private final logger:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;->api:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;

    .line 3
    iput-object p2, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;->logger:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "ExerciseRecordsInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;-><init>(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic access$fetchPage(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;->fetchPage(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getApi$p(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;)Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;->api:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;

    return-object p0
.end method

.method private final fetchPage(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$fetchPage$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$fetchPage$1;

    iget v1, v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$fetchPage$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$fetchPage$1;->label:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$fetchPage$1;

    invoke-direct {v0, p0, p4}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$fetchPage$1;-><init>(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p4, v6, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$fetchPage$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$fetchPage$1;->label:I

    const/4 v2, 0x1

    const/4 v7, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-boolean p3, v6, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$fetchPage$1;->Z$0:Z

    iget-object p1, v6, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$fetchPage$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v6, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$fetchPage$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p4, v2

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;->logger:Ltr2/n;

    const-string v3, "Failed to fetch exercise records for path "

    invoke-static {v3, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$fetchPage$apiResult$1;

    invoke-direct {v5, p0, p1, p2, v7}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$fetchPage$apiResult$1;-><init>(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v6, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$fetchPage$1;->L$0:Ljava/lang/Object;

    iput-object v7, v6, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$fetchPage$1;->L$1:Ljava/lang/Object;

    iput-boolean p3, v6, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$fetchPage$1;->Z$0:Z

    iput p4, v6, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$fetchPage$1;->label:I

    const/4 v3, 0x0

    invoke-virtual/range {v1 .. v6}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p4, Lu02/a;

    instance-of p2, p4, Lu02/a$c;

    if-eqz p2, :cond_9

    check-cast p4, Lu02/a$c;

    invoke-virtual {p4}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpg3/v0;

    iget-object p2, p2, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast p2, Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ExerciseRecordsResponse;

    if-eqz p2, :cond_7

    if-eqz p3, :cond_5

    new-instance p1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageAppended;

    invoke-virtual {p2}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ExerciseRecordsResponse;->getItems()Ljava/util/List;

    move-result-object p3

    invoke-virtual {p2}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ExerciseRecordsResponse;->getShowMore()Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ShowMoreContent;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ShowMoreContent;->getNextStartDate()Ljava/lang/String;

    move-result-object v7

    :cond_4
    invoke-direct {p1, p3, v7}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageAppended;-><init>(Ljava/util/List;Ljava/lang/String;)V

    return-object p1

    :cond_5
    new-instance p3, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageLoaded;

    invoke-virtual {p2}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ExerciseRecordsResponse;->getItems()Ljava/util/List;

    move-result-object p4

    invoke-virtual {p2}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ExerciseRecordsResponse;->getShowMore()Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ShowMoreContent;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ShowMoreContent;->getNextStartDate()Ljava/lang/String;

    move-result-object v7

    :cond_6
    invoke-virtual {p2}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ExerciseRecordsResponse;->getAnalyticsAction()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p1, p4, v7, p2}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageLoaded;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    return-object p3

    :cond_7
    if-eqz p3, :cond_8

    sget-object p1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageAppendError;->INSTANCE:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageAppendError;

    return-object p1

    :cond_8
    new-instance p2, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$RequestFailedError;

    invoke-direct {p2, p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$RequestFailedError;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_9
    instance-of p2, p4, Lu02/a$b;

    if-eqz p2, :cond_d

    if-eqz p3, :cond_a

    sget-object p1, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageAppendError;->INSTANCE:Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$PageAppendError;

    return-object p1

    :cond_a
    check-cast p4, Lu02/a$b;

    instance-of p2, p4, Lu02/a$b$b;

    if-eqz p2, :cond_b

    new-instance p2, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$OfflineError;

    invoke-direct {p2, p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$OfflineError;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_b
    instance-of p2, p4, Lu02/a$b$a;

    if-eqz p2, :cond_c

    new-instance p2, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$RequestFailedError;

    invoke-direct {p2, p1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInternalAction$RequestFailedError;-><init>(Ljava/lang/String;)V

    return-object p2

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_d
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static synthetic fetchPage$default(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;Ljava/lang/String;Ljava/lang/String;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;->fetchPage(Ljava/lang/String;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$$inlined$flatMapLatest$1;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v2, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;

    const/16 v9, 0x3e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainState;-><init>(Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsDomainDialogType;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$2;

    invoke-direct {v0, v1}, Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsInteractor$interact$2;-><init>(Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v2, p1, v0}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    const/4 p1, 0x1

    invoke-static {v1, p1}, Lec3/v;->v(Lec3/l;I)Lec3/h0;

    move-result-object p1

    return-object p1
.end method
