.class final Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->loadMoreData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.personalrecords.miniarch.domain.PersonalRecordsInteractor$loadMoreData$1"
    f = "PersonalRecordsInteractor.kt"
    l = {
        0x2d,
        0x31
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $endDate:Ljava/lang/String;

.field final synthetic $nextExerciseOffset:Ljava/lang/Integer;

.field final synthetic $startDate:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;


# direct methods
.method public constructor <init>(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->this$0:Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;

    iput-object p2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->$startDate:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->$endDate:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->$nextExerciseOffset:Ljava/lang/Integer;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;

    iget-object v1, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->this$0:Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;

    iget-object v2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->$startDate:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->$endDate:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->$nextExerciseOffset:Ljava/lang/Integer;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;-><init>(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

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

    new-instance v5, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;

    iget-object p1, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->this$0:Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;

    invoke-static {p1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->access$getAccumulatedResponse$p(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;)Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    move-result-object v7

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x1

    invoke-direct/range {v5 .. v10}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDomainState;-><init>(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsDialogType;Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->label:I

    invoke-interface {v0, v5, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto/16 :goto_1

    :cond_3
    :goto_0
    new-instance p1, Lcom/whoop/personalrecords/miniarch/domain/GetPersonalRecordsRequest;

    iget-object v2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->$startDate:Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v5, "startDate"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->$endDate:Ljava/lang/String;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    const-string v6, "endDate"

    invoke-direct {v5, v6, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->$nextExerciseOffset:Ljava/lang/Integer;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v6, Ll83/k;

    const-string v7, "offset"

    invoke-direct {v6, v7, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v5, v6}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v2

    const-string v4, "personal-records"

    invoke-direct {p1, v4, v2}, Lcom/whoop/personalrecords/miniarch/domain/GetPersonalRecordsRequest;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    new-instance v2, La6/u;

    const/4 v4, 0x1

    invoke-direct {v2, p1, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    iget-object p1, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->this$0:Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;

    invoke-static {p1}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;->access$getApiClient$p(Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;)Lu02/c;

    move-result-object p1

    const-class v4, Ll83/a0;

    invoke-static {v4}, Lkotlin/jvm/internal/h0;->b(Ljava/lang/Class;)Lj93/a0;

    move-result-object v5

    invoke-static {v5}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v6

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v4, v5, v6}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v4

    const-class v5, Lcom/whoop/personalrecords/miniarch/domain/models/PersonalRecordsModel;

    invoke-static {v5}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v6

    invoke-static {v6}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-virtual {v7, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v5, v6, v8}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v5

    invoke-static {v2, p1, v4, v5}, Lu02/f;->b(Lec3/l;Lu02/c;Ls63/a;Ls63/a;)Lec3/l;

    move-result-object p1

    iget-object v2, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->this$0:Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;

    new-instance v4, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1$invokeSuspend$$inlined$map$1;

    invoke-direct {v4, p1, v2}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1$invokeSuspend$$inlined$map$1;-><init>(Lec3/l;Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor;)V

    new-instance p1, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1$2;

    invoke-direct {p1, v0}, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1$2;-><init>(Lec3/m;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->L$0:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/personalrecords/miniarch/domain/PersonalRecordsInteractor$loadMoreData$1;->label:I

    invoke-interface {v4, p1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
