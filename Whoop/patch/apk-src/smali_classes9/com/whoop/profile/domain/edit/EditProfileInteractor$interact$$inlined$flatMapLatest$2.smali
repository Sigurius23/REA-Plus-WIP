.class public final Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/domain/edit/EditProfileInteractor;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.profile.domain.edit.EditProfileInteractor$interact$$inlined$flatMapLatest$2"
    f = "EditProfileInteractor.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;


# direct methods
.method public constructor <init>(Lq83/d;Lcom/whoop/profile/domain/edit/EditProfileInteractor;)V
    .locals 0

    iput-object p2, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;

    iget-object v1, p0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-direct {v0, p3, v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;-><init>(Lq83/d;Lcom/whoop/profile/domain/edit/EditProfileInteractor;)V

    iput-object p1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;->L$0:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;->L$1:Ljava/lang/Object;

    move-object v5, v4

    check-cast v5, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    invoke-virtual {v5}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->getPendingSaveRequest()Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v4

    const/4 v6, 0x0

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-virtual {v5}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->getPendingSaveRequest()Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v7

    invoke-virtual {v5}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v8

    invoke-static {v4, v7, v8}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->access$createUpdateRequestFromFormState(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;

    move-result-object v4

    iget-object v7, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-virtual {v5}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v8

    invoke-static {v7, v4, v8}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->access$handleSave(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lcom/whoop/profile/domain/edit/models/UpdateProfileRequest;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;)Lec3/l;

    move-result-object v4

    const v25, 0x7ff93

    const/16 v26, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x1

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v27, v24

    const/16 v24, 0x0

    move-object/from16 v3, v27

    invoke-static/range {v5 .. v26}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v5

    new-instance v6, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$3$1;

    invoke-direct {v6, v3}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$3$1;-><init>(Lq83/d;)V

    new-instance v7, Lec3/l1;

    invoke-direct {v7, v5, v4, v6}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance v4, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$lambda$1$$inlined$map$1;

    invoke-direct {v4, v7}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$lambda$1$$inlined$map$1;-><init>(Lec3/l;)V

    goto :goto_0

    :cond_2
    move-object v3, v6

    invoke-virtual {v5}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->getAvatarRefreshNeeded()Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;->this$0:Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    const/4 v6, 0x1

    invoke-static {v4, v6}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;->access$handleRefresh(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Z)Lec3/l;

    move-result-object v4

    const v25, 0x7efff

    const/16 v26, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v5 .. v26}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v5

    new-instance v6, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$3$3;

    invoke-direct {v6, v3}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$3$3;-><init>(Lq83/d;)V

    new-instance v7, Lec3/l1;

    invoke-direct {v7, v5, v4, v6}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance v4, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$lambda$1$$inlined$map$2;

    invoke-direct {v4, v7}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$lambda$1$$inlined$map$2;-><init>(Lec3/l;)V

    goto :goto_0

    :cond_3
    invoke-virtual {v5}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->toDomainState()Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    move-result-object v4

    new-instance v5, La6/u;

    const/4 v6, 0x1

    invoke-direct {v5, v4, v6}, La6/u;-><init>(Ljava/lang/Object;I)V

    move-object v4, v5

    :goto_0
    iput-object v3, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;->L$0:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;->L$1:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$$inlined$flatMapLatest$2;->label:I

    invoke-static {v2, v4, v0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
