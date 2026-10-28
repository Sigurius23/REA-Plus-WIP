.class final Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$3$3;
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
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;",
        "currentState",
        "update",
        "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;"
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
    c = "com.whoop.profile.domain.edit.EditProfileInteractor$interact$3$3"
    f = "EditProfileInteractor.kt"
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
            "Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$3$3;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;",
            "Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$3$3;

    invoke-direct {v0, p3}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$3$3;-><init>(Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$3$3;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$3$3;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$3$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    check-cast p2, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$3$3;->invoke(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$3$3;->L$0:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    iget-object v1, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$3$3;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor$interact$3$3;->label:I

    if-nez v3, :cond_4

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$Loading;

    if-eqz v3, :cond_0

    const v22, 0x7fffd

    const/16 v23, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

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

    invoke-static/range {v2 .. v23}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v1

    return-object v1

    :cond_0
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$DataLoaded;

    if-eqz v3, :cond_2

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$DataLoaded;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$DataLoaded;->getPreserveFormState()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$DataLoaded;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v3

    const v22, 0x7fdfc

    const/16 v23, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

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

    invoke-static/range {v2 .. v23}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v1

    return-object v1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$DataLoaded;->getResponse()Lcom/whoop/profile/domain/edit/models/EditProfileResponse;

    move-result-object v3

    const v22, 0x7fffc

    const/16 v23, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

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

    invoke-static/range {v2 .. v23}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v1

    return-object v1

    :cond_2
    instance-of v3, v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;

    if-eqz v3, :cond_3

    check-cast v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$StateUpdate$ErrorOccurred;->getError()Lcom/whoop/profile/domain/edit/EditProfileDomainState;

    move-result-object v7

    const v22, 0x7ffed

    const/16 v23, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

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

    invoke-static/range {v2 .. v23}, Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;->copy$default(Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;Lcom/whoop/profile/domain/edit/models/EditProfileResponse;ZZZLcom/whoop/profile/domain/edit/EditProfileDomainState;Ljava/lang/String;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZZLjava/lang/String;[BZZLcom/whoop/profile/domain/edit/EditProfileDomainState$EmailValidationResult;Ljava/lang/String;ZLcom/whoop/profile/domain/edit/EditProfileDomainState$UsernameValidationResult;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/profile/domain/edit/EditProfileInteractor$InternalState;

    move-result-object v1

    return-object v1

    :cond_3
    return-object v2

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
