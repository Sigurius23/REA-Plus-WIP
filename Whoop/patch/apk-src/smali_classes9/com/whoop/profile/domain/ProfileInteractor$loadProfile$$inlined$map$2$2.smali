.class public final Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic $this_unsafeFlow:Lec3/m;


# direct methods
.method public constructor <init>(Lec3/m;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2;->$this_unsafeFlow:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2$1;

    iget v3, v2, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2$1;

    invoke-direct {v2, v0, v1}, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2$1;-><init>(Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2$1;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2$1;->L$3:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    iget-object v2, v2, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2$1;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2;->$this_unsafeFlow:Lec3/m;

    move-object/from16 v4, p1

    check-cast v4, Lcom/whoop/profile/domain/ProfileInteractor$InternalResult;

    new-instance v6, Lcom/whoop/profile/domain/ProfileInternalDomainAction$LoadData;

    instance-of v7, v4, Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Loading;

    if-eqz v7, :cond_3

    new-instance v8, Lcom/whoop/profile/domain/ProfileDomainState;

    sget-object v9, Lcom/whoop/profile/domain/ProfileDialogType$Loading;->INSTANCE:Lcom/whoop/profile/domain/ProfileDialogType$Loading;

    const/16 v18, 0x1fe

    const/16 v19, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v8 .. v19}, Lcom/whoop/profile/domain/ProfileDomainState;-><init>(Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_3
    instance-of v7, v4, Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Success;

    if-eqz v7, :cond_4

    new-instance v8, Lcom/whoop/profile/domain/ProfileDomainState;

    check-cast v4, Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Success;

    invoke-virtual {v4}, Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Success;->getResponse()Lcom/whoop/profile/domain/models/ProfileResponse;

    move-result-object v10

    const/16 v18, 0x1fd

    const/16 v19, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v8 .. v19}, Lcom/whoop/profile/domain/ProfileDomainState;-><init>(Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_4
    instance-of v7, v4, Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Updating;

    if-eqz v7, :cond_5

    new-instance v8, Lcom/whoop/profile/domain/ProfileDomainState;

    check-cast v4, Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Updating;

    invoke-virtual {v4}, Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Updating;->getResponse()Lcom/whoop/profile/domain/models/ProfileResponse;

    move-result-object v10

    invoke-virtual {v4}, Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Updating;->getManualRefresh()Z

    move-result v11

    const/16 v18, 0x1f1

    const/16 v19, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v8 .. v19}, Lcom/whoop/profile/domain/ProfileDomainState;-><init>(Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_5
    instance-of v7, v4, Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$ErrorWithData;

    if-eqz v7, :cond_6

    new-instance v8, Lcom/whoop/profile/domain/ProfileDomainState;

    check-cast v4, Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$ErrorWithData;

    invoke-virtual {v4}, Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$ErrorWithData;->getResponse()Lcom/whoop/profile/domain/models/ProfileResponse;

    move-result-object v10

    const/16 v18, 0x1fd

    const/16 v19, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v8 .. v19}, Lcom/whoop/profile/domain/ProfileDomainState;-><init>(Lcom/whoop/profile/domain/ProfileDialogType;Lcom/whoop/profile/domain/models/ProfileResponse;ZZLcom/whoop/design/models/modal/AnyModal;Lcom/whoop/profile/domain/ProfileNavigationEffect;Ljava/lang/String;Lcom/whoop/profile/domain/ProfileReportResult;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_6
    instance-of v7, v4, Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Error;

    if-eqz v7, :cond_8

    check-cast v4, Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Error;

    invoke-virtual {v4}, Lcom/whoop/profile/domain/ProfileInteractor$InternalResult$Error;->getErrorState()Lcom/whoop/profile/domain/ProfileDomainState;

    move-result-object v8

    :goto_1
    invoke-direct {v6, v8}, Lcom/whoop/profile/domain/ProfileInternalDomainAction$LoadData;-><init>(Lcom/whoop/profile/domain/ProfileDomainState;)V

    const/4 v4, 0x0

    iput-object v4, v2, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2$1;->L$0:Ljava/lang/Object;

    iput-object v4, v2, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2$1;->L$1:Ljava/lang/Object;

    iput-object v4, v2, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2$1;->L$2:Ljava/lang/Object;

    iput-object v4, v2, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2$1;->L$3:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v2, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2$1;->I$0:I

    iput v5, v2, Lcom/whoop/profile/domain/ProfileInteractor$loadProfile$$inlined$map$2$2$1;->label:I

    invoke-interface {v1, v6, v2}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    return-object v3

    :cond_7
    :goto_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
